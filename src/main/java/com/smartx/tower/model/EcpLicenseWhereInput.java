package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** EcpLicenseWhereInput */
@javax.annotation.Generated(value = "JavaCloudTowerClientCodegen")
public class EcpLicenseWhereInput
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<EcpLicenseWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<EcpLicenseWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<EcpLicenseWhereInput> OR = null;

    public static final String SERIALIZED_NAME_ASYNC_REPLICATION = "async_replication";

    @SerializedName(SERIALIZED_NAME_ASYNC_REPLICATION)
    private String asyncReplication;

    public static final String SERIALIZED_NAME_ASYNC_REPLICATION_CONTAINS =
            "async_replication_contains";

    @SerializedName(SERIALIZED_NAME_ASYNC_REPLICATION_CONTAINS)
    private String asyncReplicationContains;

    public static final String SERIALIZED_NAME_ASYNC_REPLICATION_ENDS_WITH =
            "async_replication_ends_with";

    @SerializedName(SERIALIZED_NAME_ASYNC_REPLICATION_ENDS_WITH)
    private String asyncReplicationEndsWith;

    public static final String SERIALIZED_NAME_ASYNC_REPLICATION_GT = "async_replication_gt";

    @SerializedName(SERIALIZED_NAME_ASYNC_REPLICATION_GT)
    private String asyncReplicationGt;

    public static final String SERIALIZED_NAME_ASYNC_REPLICATION_GTE = "async_replication_gte";

    @SerializedName(SERIALIZED_NAME_ASYNC_REPLICATION_GTE)
    private String asyncReplicationGte;

    public static final String SERIALIZED_NAME_ASYNC_REPLICATION_IN = "async_replication_in";

    @SerializedName(SERIALIZED_NAME_ASYNC_REPLICATION_IN)
    private List<String> asyncReplicationIn = null;

    public static final String SERIALIZED_NAME_ASYNC_REPLICATION_LT = "async_replication_lt";

    @SerializedName(SERIALIZED_NAME_ASYNC_REPLICATION_LT)
    private String asyncReplicationLt;

    public static final String SERIALIZED_NAME_ASYNC_REPLICATION_LTE = "async_replication_lte";

    @SerializedName(SERIALIZED_NAME_ASYNC_REPLICATION_LTE)
    private String asyncReplicationLte;

    public static final String SERIALIZED_NAME_ASYNC_REPLICATION_NOT = "async_replication_not";

    @SerializedName(SERIALIZED_NAME_ASYNC_REPLICATION_NOT)
    private String asyncReplicationNot;

    public static final String SERIALIZED_NAME_ASYNC_REPLICATION_NOT_CONTAINS =
            "async_replication_not_contains";

    @SerializedName(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_CONTAINS)
    private String asyncReplicationNotContains;

    public static final String SERIALIZED_NAME_ASYNC_REPLICATION_NOT_ENDS_WITH =
            "async_replication_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_ENDS_WITH)
    private String asyncReplicationNotEndsWith;

    public static final String SERIALIZED_NAME_ASYNC_REPLICATION_NOT_IN =
            "async_replication_not_in";

    @SerializedName(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_IN)
    private List<String> asyncReplicationNotIn = null;

    public static final String SERIALIZED_NAME_ASYNC_REPLICATION_NOT_STARTS_WITH =
            "async_replication_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_STARTS_WITH)
    private String asyncReplicationNotStartsWith;

    public static final String SERIALIZED_NAME_ASYNC_REPLICATION_STARTS_WITH =
            "async_replication_starts_with";

    @SerializedName(SERIALIZED_NAME_ASYNC_REPLICATION_STARTS_WITH)
    private String asyncReplicationStartsWith;

    public static final String SERIALIZED_NAME_BACKUP = "backup";

    @SerializedName(SERIALIZED_NAME_BACKUP)
    private String backup;

    public static final String SERIALIZED_NAME_BACKUP_CONTAINS = "backup_contains";

    @SerializedName(SERIALIZED_NAME_BACKUP_CONTAINS)
    private String backupContains;

    public static final String SERIALIZED_NAME_BACKUP_ENDS_WITH = "backup_ends_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_ENDS_WITH)
    private String backupEndsWith;

    public static final String SERIALIZED_NAME_BACKUP_GT = "backup_gt";

    @SerializedName(SERIALIZED_NAME_BACKUP_GT)
    private String backupGt;

    public static final String SERIALIZED_NAME_BACKUP_GTE = "backup_gte";

    @SerializedName(SERIALIZED_NAME_BACKUP_GTE)
    private String backupGte;

    public static final String SERIALIZED_NAME_BACKUP_IN = "backup_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_IN)
    private List<String> backupIn = null;

    public static final String SERIALIZED_NAME_BACKUP_LT = "backup_lt";

    @SerializedName(SERIALIZED_NAME_BACKUP_LT)
    private String backupLt;

    public static final String SERIALIZED_NAME_BACKUP_LTE = "backup_lte";

    @SerializedName(SERIALIZED_NAME_BACKUP_LTE)
    private String backupLte;

    public static final String SERIALIZED_NAME_BACKUP_NOT = "backup_not";

    @SerializedName(SERIALIZED_NAME_BACKUP_NOT)
    private String backupNot;

    public static final String SERIALIZED_NAME_BACKUP_NOT_CONTAINS = "backup_not_contains";

    @SerializedName(SERIALIZED_NAME_BACKUP_NOT_CONTAINS)
    private String backupNotContains;

    public static final String SERIALIZED_NAME_BACKUP_NOT_ENDS_WITH = "backup_not_ends_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_NOT_ENDS_WITH)
    private String backupNotEndsWith;

    public static final String SERIALIZED_NAME_BACKUP_NOT_IN = "backup_not_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_NOT_IN)
    private List<String> backupNotIn = null;

    public static final String SERIALIZED_NAME_BACKUP_NOT_STARTS_WITH = "backup_not_starts_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_NOT_STARTS_WITH)
    private String backupNotStartsWith;

    public static final String SERIALIZED_NAME_BACKUP_STARTS_WITH = "backup_starts_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_STARTS_WITH)
    private String backupStartsWith;

    public static final String SERIALIZED_NAME_BRAND = "brand";

    @SerializedName(SERIALIZED_NAME_BRAND)
    private String brand;

    public static final String SERIALIZED_NAME_BRAND_CONTAINS = "brand_contains";

    @SerializedName(SERIALIZED_NAME_BRAND_CONTAINS)
    private String brandContains;

    public static final String SERIALIZED_NAME_BRAND_ENDS_WITH = "brand_ends_with";

    @SerializedName(SERIALIZED_NAME_BRAND_ENDS_WITH)
    private String brandEndsWith;

    public static final String SERIALIZED_NAME_BRAND_GT = "brand_gt";

    @SerializedName(SERIALIZED_NAME_BRAND_GT)
    private String brandGt;

    public static final String SERIALIZED_NAME_BRAND_GTE = "brand_gte";

    @SerializedName(SERIALIZED_NAME_BRAND_GTE)
    private String brandGte;

    public static final String SERIALIZED_NAME_BRAND_IN = "brand_in";

    @SerializedName(SERIALIZED_NAME_BRAND_IN)
    private List<String> brandIn = null;

    public static final String SERIALIZED_NAME_BRAND_LT = "brand_lt";

    @SerializedName(SERIALIZED_NAME_BRAND_LT)
    private String brandLt;

    public static final String SERIALIZED_NAME_BRAND_LTE = "brand_lte";

    @SerializedName(SERIALIZED_NAME_BRAND_LTE)
    private String brandLte;

    public static final String SERIALIZED_NAME_BRAND_NOT = "brand_not";

    @SerializedName(SERIALIZED_NAME_BRAND_NOT)
    private String brandNot;

    public static final String SERIALIZED_NAME_BRAND_NOT_CONTAINS = "brand_not_contains";

    @SerializedName(SERIALIZED_NAME_BRAND_NOT_CONTAINS)
    private String brandNotContains;

    public static final String SERIALIZED_NAME_BRAND_NOT_ENDS_WITH = "brand_not_ends_with";

    @SerializedName(SERIALIZED_NAME_BRAND_NOT_ENDS_WITH)
    private String brandNotEndsWith;

    public static final String SERIALIZED_NAME_BRAND_NOT_IN = "brand_not_in";

    @SerializedName(SERIALIZED_NAME_BRAND_NOT_IN)
    private List<String> brandNotIn = null;

    public static final String SERIALIZED_NAME_BRAND_NOT_STARTS_WITH = "brand_not_starts_with";

    @SerializedName(SERIALIZED_NAME_BRAND_NOT_STARTS_WITH)
    private String brandNotStartsWith;

    public static final String SERIALIZED_NAME_BRAND_STARTS_WITH = "brand_starts_with";

    @SerializedName(SERIALIZED_NAME_BRAND_STARTS_WITH)
    private String brandStartsWith;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID = "cluster_local_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID)
    private String clusterLocalId;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS =
            "cluster_local_id_contains";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS)
    private String clusterLocalIdContains;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH =
            "cluster_local_id_ends_with";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH)
    private String clusterLocalIdEndsWith;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT = "cluster_local_id_gt";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT)
    private String clusterLocalIdGt;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE = "cluster_local_id_gte";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE)
    private String clusterLocalIdGte;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN = "cluster_local_id_in";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN)
    private List<String> clusterLocalIdIn = null;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT = "cluster_local_id_lt";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT)
    private String clusterLocalIdLt;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE = "cluster_local_id_lte";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE)
    private String clusterLocalIdLte;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT = "cluster_local_id_not";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT)
    private String clusterLocalIdNot;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS =
            "cluster_local_id_not_contains";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS)
    private String clusterLocalIdNotContains;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH =
            "cluster_local_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH)
    private String clusterLocalIdNotEndsWith;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN = "cluster_local_id_not_in";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN)
    private List<String> clusterLocalIdNotIn = null;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH =
            "cluster_local_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH)
    private String clusterLocalIdNotStartsWith;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH =
            "cluster_local_id_starts_with";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH)
    private String clusterLocalIdStartsWith;

    public static final String SERIALIZED_NAME_DFW = "dfw";

    @SerializedName(SERIALIZED_NAME_DFW)
    private String dfw;

    public static final String SERIALIZED_NAME_DFW_CONTAINS = "dfw_contains";

    @SerializedName(SERIALIZED_NAME_DFW_CONTAINS)
    private String dfwContains;

    public static final String SERIALIZED_NAME_DFW_ENDS_WITH = "dfw_ends_with";

    @SerializedName(SERIALIZED_NAME_DFW_ENDS_WITH)
    private String dfwEndsWith;

    public static final String SERIALIZED_NAME_DFW_GT = "dfw_gt";

    @SerializedName(SERIALIZED_NAME_DFW_GT)
    private String dfwGt;

    public static final String SERIALIZED_NAME_DFW_GTE = "dfw_gte";

    @SerializedName(SERIALIZED_NAME_DFW_GTE)
    private String dfwGte;

    public static final String SERIALIZED_NAME_DFW_IN = "dfw_in";

    @SerializedName(SERIALIZED_NAME_DFW_IN)
    private List<String> dfwIn = null;

    public static final String SERIALIZED_NAME_DFW_LT = "dfw_lt";

    @SerializedName(SERIALIZED_NAME_DFW_LT)
    private String dfwLt;

    public static final String SERIALIZED_NAME_DFW_LTE = "dfw_lte";

    @SerializedName(SERIALIZED_NAME_DFW_LTE)
    private String dfwLte;

    public static final String SERIALIZED_NAME_DFW_NOT = "dfw_not";

    @SerializedName(SERIALIZED_NAME_DFW_NOT)
    private String dfwNot;

    public static final String SERIALIZED_NAME_DFW_NOT_CONTAINS = "dfw_not_contains";

    @SerializedName(SERIALIZED_NAME_DFW_NOT_CONTAINS)
    private String dfwNotContains;

    public static final String SERIALIZED_NAME_DFW_NOT_ENDS_WITH = "dfw_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DFW_NOT_ENDS_WITH)
    private String dfwNotEndsWith;

    public static final String SERIALIZED_NAME_DFW_NOT_IN = "dfw_not_in";

    @SerializedName(SERIALIZED_NAME_DFW_NOT_IN)
    private List<String> dfwNotIn = null;

    public static final String SERIALIZED_NAME_DFW_NOT_STARTS_WITH = "dfw_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DFW_NOT_STARTS_WITH)
    private String dfwNotStartsWith;

    public static final String SERIALIZED_NAME_DFW_STARTS_WITH = "dfw_starts_with";

    @SerializedName(SERIALIZED_NAME_DFW_STARTS_WITH)
    private String dfwStartsWith;

    public static final String SERIALIZED_NAME_ECP_EDITION = "ecp_edition";

    @SerializedName(SERIALIZED_NAME_ECP_EDITION)
    private EcpEdition ecpEdition;

    public static final String SERIALIZED_NAME_ECP_EDITION_IN = "ecp_edition_in";

    @SerializedName(SERIALIZED_NAME_ECP_EDITION_IN)
    private List<EcpEdition> ecpEditionIn = null;

    public static final String SERIALIZED_NAME_ECP_EDITION_NOT = "ecp_edition_not";

    @SerializedName(SERIALIZED_NAME_ECP_EDITION_NOT)
    private EcpEdition ecpEditionNot;

    public static final String SERIALIZED_NAME_ECP_EDITION_NOT_IN = "ecp_edition_not_in";

    @SerializedName(SERIALIZED_NAME_ECP_EDITION_NOT_IN)
    private List<EcpEdition> ecpEditionNotIn = null;

    public static final String SERIALIZED_NAME_EXPIRE_DATE = "expire_date";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE)
    private String expireDate;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_GT = "expire_date_gt";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_GT)
    private String expireDateGt;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_GTE = "expire_date_gte";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_GTE)
    private String expireDateGte;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_IN = "expire_date_in";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_IN)
    private List<String> expireDateIn = null;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_LT = "expire_date_lt";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_LT)
    private String expireDateLt;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_LTE = "expire_date_lte";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_LTE)
    private String expireDateLte;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_NOT = "expire_date_not";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_NOT)
    private String expireDateNot;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_NOT_IN = "expire_date_not_in";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_NOT_IN)
    private List<String> expireDateNotIn = null;

    public static final String SERIALIZED_NAME_EXTERNAL_STORAGE = "external_storage";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_STORAGE)
    private Boolean externalStorage;

    public static final String SERIALIZED_NAME_EXTERNAL_STORAGE_NOT = "external_storage_not";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_STORAGE_NOT)
    private Boolean externalStorageNot;

    public static final String SERIALIZED_NAME_FILE_STORAGE = "file_storage";

    @SerializedName(SERIALIZED_NAME_FILE_STORAGE)
    private String fileStorage;

    public static final String SERIALIZED_NAME_FILE_STORAGE_CONTAINS = "file_storage_contains";

    @SerializedName(SERIALIZED_NAME_FILE_STORAGE_CONTAINS)
    private String fileStorageContains;

    public static final String SERIALIZED_NAME_FILE_STORAGE_ENDS_WITH = "file_storage_ends_with";

    @SerializedName(SERIALIZED_NAME_FILE_STORAGE_ENDS_WITH)
    private String fileStorageEndsWith;

    public static final String SERIALIZED_NAME_FILE_STORAGE_GT = "file_storage_gt";

    @SerializedName(SERIALIZED_NAME_FILE_STORAGE_GT)
    private String fileStorageGt;

    public static final String SERIALIZED_NAME_FILE_STORAGE_GTE = "file_storage_gte";

    @SerializedName(SERIALIZED_NAME_FILE_STORAGE_GTE)
    private String fileStorageGte;

    public static final String SERIALIZED_NAME_FILE_STORAGE_IN = "file_storage_in";

    @SerializedName(SERIALIZED_NAME_FILE_STORAGE_IN)
    private List<String> fileStorageIn = null;

    public static final String SERIALIZED_NAME_FILE_STORAGE_LT = "file_storage_lt";

    @SerializedName(SERIALIZED_NAME_FILE_STORAGE_LT)
    private String fileStorageLt;

    public static final String SERIALIZED_NAME_FILE_STORAGE_LTE = "file_storage_lte";

    @SerializedName(SERIALIZED_NAME_FILE_STORAGE_LTE)
    private String fileStorageLte;

    public static final String SERIALIZED_NAME_FILE_STORAGE_NOT = "file_storage_not";

    @SerializedName(SERIALIZED_NAME_FILE_STORAGE_NOT)
    private String fileStorageNot;

    public static final String SERIALIZED_NAME_FILE_STORAGE_NOT_CONTAINS =
            "file_storage_not_contains";

    @SerializedName(SERIALIZED_NAME_FILE_STORAGE_NOT_CONTAINS)
    private String fileStorageNotContains;

    public static final String SERIALIZED_NAME_FILE_STORAGE_NOT_ENDS_WITH =
            "file_storage_not_ends_with";

    @SerializedName(SERIALIZED_NAME_FILE_STORAGE_NOT_ENDS_WITH)
    private String fileStorageNotEndsWith;

    public static final String SERIALIZED_NAME_FILE_STORAGE_NOT_IN = "file_storage_not_in";

    @SerializedName(SERIALIZED_NAME_FILE_STORAGE_NOT_IN)
    private List<String> fileStorageNotIn = null;

    public static final String SERIALIZED_NAME_FILE_STORAGE_NOT_STARTS_WITH =
            "file_storage_not_starts_with";

    @SerializedName(SERIALIZED_NAME_FILE_STORAGE_NOT_STARTS_WITH)
    private String fileStorageNotStartsWith;

    public static final String SERIALIZED_NAME_FILE_STORAGE_STARTS_WITH =
            "file_storage_starts_with";

    @SerializedName(SERIALIZED_NAME_FILE_STORAGE_STARTS_WITH)
    private String fileStorageStartsWith;

    public static final String SERIALIZED_NAME_HAS_METROX = "has_metrox";

    @SerializedName(SERIALIZED_NAME_HAS_METROX)
    private Boolean hasMetrox;

    public static final String SERIALIZED_NAME_HAS_METROX_NOT = "has_metrox_not";

    @SerializedName(SERIALIZED_NAME_HAS_METROX_NOT)
    private Boolean hasMetroxNot;

    public static final String SERIALIZED_NAME_HAS_REMOTE_BACKUP = "has_remote_backup";

    @SerializedName(SERIALIZED_NAME_HAS_REMOTE_BACKUP)
    private Boolean hasRemoteBackup;

    public static final String SERIALIZED_NAME_HAS_REMOTE_BACKUP_NOT = "has_remote_backup_not";

    @SerializedName(SERIALIZED_NAME_HAS_REMOTE_BACKUP_NOT)
    private Boolean hasRemoteBackupNot;

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

    public static final String SERIALIZED_NAME_K8S_BARE_METAL = "k8s_bare_metal";

    @SerializedName(SERIALIZED_NAME_K8S_BARE_METAL)
    private String k8sBareMetal;

    public static final String SERIALIZED_NAME_K8S_BARE_METAL_CONTAINS = "k8s_bare_metal_contains";

    @SerializedName(SERIALIZED_NAME_K8S_BARE_METAL_CONTAINS)
    private String k8sBareMetalContains;

    public static final String SERIALIZED_NAME_K8S_BARE_METAL_ENDS_WITH =
            "k8s_bare_metal_ends_with";

    @SerializedName(SERIALIZED_NAME_K8S_BARE_METAL_ENDS_WITH)
    private String k8sBareMetalEndsWith;

    public static final String SERIALIZED_NAME_K8S_BARE_METAL_GT = "k8s_bare_metal_gt";

    @SerializedName(SERIALIZED_NAME_K8S_BARE_METAL_GT)
    private String k8sBareMetalGt;

    public static final String SERIALIZED_NAME_K8S_BARE_METAL_GTE = "k8s_bare_metal_gte";

    @SerializedName(SERIALIZED_NAME_K8S_BARE_METAL_GTE)
    private String k8sBareMetalGte;

    public static final String SERIALIZED_NAME_K8S_BARE_METAL_IN = "k8s_bare_metal_in";

    @SerializedName(SERIALIZED_NAME_K8S_BARE_METAL_IN)
    private List<String> k8sBareMetalIn = null;

    public static final String SERIALIZED_NAME_K8S_BARE_METAL_LT = "k8s_bare_metal_lt";

    @SerializedName(SERIALIZED_NAME_K8S_BARE_METAL_LT)
    private String k8sBareMetalLt;

    public static final String SERIALIZED_NAME_K8S_BARE_METAL_LTE = "k8s_bare_metal_lte";

    @SerializedName(SERIALIZED_NAME_K8S_BARE_METAL_LTE)
    private String k8sBareMetalLte;

    public static final String SERIALIZED_NAME_K8S_BARE_METAL_NOT = "k8s_bare_metal_not";

    @SerializedName(SERIALIZED_NAME_K8S_BARE_METAL_NOT)
    private String k8sBareMetalNot;

    public static final String SERIALIZED_NAME_K8S_BARE_METAL_NOT_CONTAINS =
            "k8s_bare_metal_not_contains";

    @SerializedName(SERIALIZED_NAME_K8S_BARE_METAL_NOT_CONTAINS)
    private String k8sBareMetalNotContains;

    public static final String SERIALIZED_NAME_K8S_BARE_METAL_NOT_ENDS_WITH =
            "k8s_bare_metal_not_ends_with";

    @SerializedName(SERIALIZED_NAME_K8S_BARE_METAL_NOT_ENDS_WITH)
    private String k8sBareMetalNotEndsWith;

    public static final String SERIALIZED_NAME_K8S_BARE_METAL_NOT_IN = "k8s_bare_metal_not_in";

    @SerializedName(SERIALIZED_NAME_K8S_BARE_METAL_NOT_IN)
    private List<String> k8sBareMetalNotIn = null;

    public static final String SERIALIZED_NAME_K8S_BARE_METAL_NOT_STARTS_WITH =
            "k8s_bare_metal_not_starts_with";

    @SerializedName(SERIALIZED_NAME_K8S_BARE_METAL_NOT_STARTS_WITH)
    private String k8sBareMetalNotStartsWith;

    public static final String SERIALIZED_NAME_K8S_BARE_METAL_STARTS_WITH =
            "k8s_bare_metal_starts_with";

    @SerializedName(SERIALIZED_NAME_K8S_BARE_METAL_STARTS_WITH)
    private String k8sBareMetalStartsWith;

    public static final String SERIALIZED_NAME_K8S_SERVICE = "k8s_service";

    @SerializedName(SERIALIZED_NAME_K8S_SERVICE)
    private String k8sService;

    public static final String SERIALIZED_NAME_K8S_SERVICE_CONTAINS = "k8s_service_contains";

    @SerializedName(SERIALIZED_NAME_K8S_SERVICE_CONTAINS)
    private String k8sServiceContains;

    public static final String SERIALIZED_NAME_K8S_SERVICE_ENDS_WITH = "k8s_service_ends_with";

    @SerializedName(SERIALIZED_NAME_K8S_SERVICE_ENDS_WITH)
    private String k8sServiceEndsWith;

    public static final String SERIALIZED_NAME_K8S_SERVICE_GT = "k8s_service_gt";

    @SerializedName(SERIALIZED_NAME_K8S_SERVICE_GT)
    private String k8sServiceGt;

    public static final String SERIALIZED_NAME_K8S_SERVICE_GTE = "k8s_service_gte";

    @SerializedName(SERIALIZED_NAME_K8S_SERVICE_GTE)
    private String k8sServiceGte;

    public static final String SERIALIZED_NAME_K8S_SERVICE_IN = "k8s_service_in";

    @SerializedName(SERIALIZED_NAME_K8S_SERVICE_IN)
    private List<String> k8sServiceIn = null;

    public static final String SERIALIZED_NAME_K8S_SERVICE_LT = "k8s_service_lt";

    @SerializedName(SERIALIZED_NAME_K8S_SERVICE_LT)
    private String k8sServiceLt;

    public static final String SERIALIZED_NAME_K8S_SERVICE_LTE = "k8s_service_lte";

    @SerializedName(SERIALIZED_NAME_K8S_SERVICE_LTE)
    private String k8sServiceLte;

    public static final String SERIALIZED_NAME_K8S_SERVICE_NOT = "k8s_service_not";

    @SerializedName(SERIALIZED_NAME_K8S_SERVICE_NOT)
    private String k8sServiceNot;

    public static final String SERIALIZED_NAME_K8S_SERVICE_NOT_CONTAINS =
            "k8s_service_not_contains";

    @SerializedName(SERIALIZED_NAME_K8S_SERVICE_NOT_CONTAINS)
    private String k8sServiceNotContains;

    public static final String SERIALIZED_NAME_K8S_SERVICE_NOT_ENDS_WITH =
            "k8s_service_not_ends_with";

    @SerializedName(SERIALIZED_NAME_K8S_SERVICE_NOT_ENDS_WITH)
    private String k8sServiceNotEndsWith;

    public static final String SERIALIZED_NAME_K8S_SERVICE_NOT_IN = "k8s_service_not_in";

    @SerializedName(SERIALIZED_NAME_K8S_SERVICE_NOT_IN)
    private List<String> k8sServiceNotIn = null;

    public static final String SERIALIZED_NAME_K8S_SERVICE_NOT_STARTS_WITH =
            "k8s_service_not_starts_with";

    @SerializedName(SERIALIZED_NAME_K8S_SERVICE_NOT_STARTS_WITH)
    private String k8sServiceNotStartsWith;

    public static final String SERIALIZED_NAME_K8S_SERVICE_STARTS_WITH = "k8s_service_starts_with";

    @SerializedName(SERIALIZED_NAME_K8S_SERVICE_STARTS_WITH)
    private String k8sServiceStartsWith;

    public static final String SERIALIZED_NAME_LB = "lb";

    @SerializedName(SERIALIZED_NAME_LB)
    private String lb;

    public static final String SERIALIZED_NAME_LB_CONTAINS = "lb_contains";

    @SerializedName(SERIALIZED_NAME_LB_CONTAINS)
    private String lbContains;

    public static final String SERIALIZED_NAME_LB_ENDS_WITH = "lb_ends_with";

    @SerializedName(SERIALIZED_NAME_LB_ENDS_WITH)
    private String lbEndsWith;

    public static final String SERIALIZED_NAME_LB_GT = "lb_gt";

    @SerializedName(SERIALIZED_NAME_LB_GT)
    private String lbGt;

    public static final String SERIALIZED_NAME_LB_GTE = "lb_gte";

    @SerializedName(SERIALIZED_NAME_LB_GTE)
    private String lbGte;

    public static final String SERIALIZED_NAME_LB_IN = "lb_in";

    @SerializedName(SERIALIZED_NAME_LB_IN)
    private List<String> lbIn = null;

    public static final String SERIALIZED_NAME_LB_LT = "lb_lt";

    @SerializedName(SERIALIZED_NAME_LB_LT)
    private String lbLt;

    public static final String SERIALIZED_NAME_LB_LTE = "lb_lte";

    @SerializedName(SERIALIZED_NAME_LB_LTE)
    private String lbLte;

    public static final String SERIALIZED_NAME_LB_NOT = "lb_not";

    @SerializedName(SERIALIZED_NAME_LB_NOT)
    private String lbNot;

    public static final String SERIALIZED_NAME_LB_NOT_CONTAINS = "lb_not_contains";

    @SerializedName(SERIALIZED_NAME_LB_NOT_CONTAINS)
    private String lbNotContains;

    public static final String SERIALIZED_NAME_LB_NOT_ENDS_WITH = "lb_not_ends_with";

    @SerializedName(SERIALIZED_NAME_LB_NOT_ENDS_WITH)
    private String lbNotEndsWith;

    public static final String SERIALIZED_NAME_LB_NOT_IN = "lb_not_in";

    @SerializedName(SERIALIZED_NAME_LB_NOT_IN)
    private List<String> lbNotIn = null;

    public static final String SERIALIZED_NAME_LB_NOT_STARTS_WITH = "lb_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LB_NOT_STARTS_WITH)
    private String lbNotStartsWith;

    public static final String SERIALIZED_NAME_LB_STARTS_WITH = "lb_starts_with";

    @SerializedName(SERIALIZED_NAME_LB_STARTS_WITH)
    private String lbStartsWith;

    public static final String SERIALIZED_NAME_LICENSE_PAYLOAD = "license_payload";

    @SerializedName(SERIALIZED_NAME_LICENSE_PAYLOAD)
    private String licensePayload;

    public static final String SERIALIZED_NAME_LICENSE_PAYLOAD_CONTAINS =
            "license_payload_contains";

    @SerializedName(SERIALIZED_NAME_LICENSE_PAYLOAD_CONTAINS)
    private String licensePayloadContains;

    public static final String SERIALIZED_NAME_LICENSE_PAYLOAD_ENDS_WITH =
            "license_payload_ends_with";

    @SerializedName(SERIALIZED_NAME_LICENSE_PAYLOAD_ENDS_WITH)
    private String licensePayloadEndsWith;

    public static final String SERIALIZED_NAME_LICENSE_PAYLOAD_GT = "license_payload_gt";

    @SerializedName(SERIALIZED_NAME_LICENSE_PAYLOAD_GT)
    private String licensePayloadGt;

    public static final String SERIALIZED_NAME_LICENSE_PAYLOAD_GTE = "license_payload_gte";

    @SerializedName(SERIALIZED_NAME_LICENSE_PAYLOAD_GTE)
    private String licensePayloadGte;

    public static final String SERIALIZED_NAME_LICENSE_PAYLOAD_IN = "license_payload_in";

    @SerializedName(SERIALIZED_NAME_LICENSE_PAYLOAD_IN)
    private List<String> licensePayloadIn = null;

    public static final String SERIALIZED_NAME_LICENSE_PAYLOAD_LT = "license_payload_lt";

    @SerializedName(SERIALIZED_NAME_LICENSE_PAYLOAD_LT)
    private String licensePayloadLt;

    public static final String SERIALIZED_NAME_LICENSE_PAYLOAD_LTE = "license_payload_lte";

    @SerializedName(SERIALIZED_NAME_LICENSE_PAYLOAD_LTE)
    private String licensePayloadLte;

    public static final String SERIALIZED_NAME_LICENSE_PAYLOAD_NOT = "license_payload_not";

    @SerializedName(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT)
    private String licensePayloadNot;

    public static final String SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_CONTAINS =
            "license_payload_not_contains";

    @SerializedName(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_CONTAINS)
    private String licensePayloadNotContains;

    public static final String SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_ENDS_WITH =
            "license_payload_not_ends_with";

    @SerializedName(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_ENDS_WITH)
    private String licensePayloadNotEndsWith;

    public static final String SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_IN = "license_payload_not_in";

    @SerializedName(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_IN)
    private List<String> licensePayloadNotIn = null;

    public static final String SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_STARTS_WITH =
            "license_payload_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_STARTS_WITH)
    private String licensePayloadNotStartsWith;

    public static final String SERIALIZED_NAME_LICENSE_PAYLOAD_STARTS_WITH =
            "license_payload_starts_with";

    @SerializedName(SERIALIZED_NAME_LICENSE_PAYLOAD_STARTS_WITH)
    private String licensePayloadStartsWith;

    public static final String SERIALIZED_NAME_LICENSE_SIGNATURE = "license_signature";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGNATURE)
    private String licenseSignature;

    public static final String SERIALIZED_NAME_LICENSE_SIGNATURE_CONTAINS =
            "license_signature_contains";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGNATURE_CONTAINS)
    private String licenseSignatureContains;

    public static final String SERIALIZED_NAME_LICENSE_SIGNATURE_ENDS_WITH =
            "license_signature_ends_with";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGNATURE_ENDS_WITH)
    private String licenseSignatureEndsWith;

    public static final String SERIALIZED_NAME_LICENSE_SIGNATURE_GT = "license_signature_gt";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGNATURE_GT)
    private String licenseSignatureGt;

    public static final String SERIALIZED_NAME_LICENSE_SIGNATURE_GTE = "license_signature_gte";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGNATURE_GTE)
    private String licenseSignatureGte;

    public static final String SERIALIZED_NAME_LICENSE_SIGNATURE_IN = "license_signature_in";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGNATURE_IN)
    private List<String> licenseSignatureIn = null;

    public static final String SERIALIZED_NAME_LICENSE_SIGNATURE_LT = "license_signature_lt";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGNATURE_LT)
    private String licenseSignatureLt;

    public static final String SERIALIZED_NAME_LICENSE_SIGNATURE_LTE = "license_signature_lte";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGNATURE_LTE)
    private String licenseSignatureLte;

    public static final String SERIALIZED_NAME_LICENSE_SIGNATURE_NOT = "license_signature_not";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT)
    private String licenseSignatureNot;

    public static final String SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_CONTAINS =
            "license_signature_not_contains";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_CONTAINS)
    private String licenseSignatureNotContains;

    public static final String SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_ENDS_WITH =
            "license_signature_not_ends_with";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_ENDS_WITH)
    private String licenseSignatureNotEndsWith;

    public static final String SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_IN =
            "license_signature_not_in";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_IN)
    private List<String> licenseSignatureNotIn = null;

    public static final String SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_STARTS_WITH =
            "license_signature_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_STARTS_WITH)
    private String licenseSignatureNotStartsWith;

    public static final String SERIALIZED_NAME_LICENSE_SIGNATURE_STARTS_WITH =
            "license_signature_starts_with";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGNATURE_STARTS_WITH)
    private String licenseSignatureStartsWith;

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

    public static final String SERIALIZED_NAME_MAX_CORE_NUM = "max_core_num";

    @SerializedName(SERIALIZED_NAME_MAX_CORE_NUM)
    private Integer maxCoreNum;

    public static final String SERIALIZED_NAME_MAX_CORE_NUM_GT = "max_core_num_gt";

    @SerializedName(SERIALIZED_NAME_MAX_CORE_NUM_GT)
    private Integer maxCoreNumGt;

    public static final String SERIALIZED_NAME_MAX_CORE_NUM_GTE = "max_core_num_gte";

    @SerializedName(SERIALIZED_NAME_MAX_CORE_NUM_GTE)
    private Integer maxCoreNumGte;

    public static final String SERIALIZED_NAME_MAX_CORE_NUM_IN = "max_core_num_in";

    @SerializedName(SERIALIZED_NAME_MAX_CORE_NUM_IN)
    private List<Integer> maxCoreNumIn = null;

    public static final String SERIALIZED_NAME_MAX_CORE_NUM_LT = "max_core_num_lt";

    @SerializedName(SERIALIZED_NAME_MAX_CORE_NUM_LT)
    private Integer maxCoreNumLt;

    public static final String SERIALIZED_NAME_MAX_CORE_NUM_LTE = "max_core_num_lte";

    @SerializedName(SERIALIZED_NAME_MAX_CORE_NUM_LTE)
    private Integer maxCoreNumLte;

    public static final String SERIALIZED_NAME_MAX_CORE_NUM_NOT = "max_core_num_not";

    @SerializedName(SERIALIZED_NAME_MAX_CORE_NUM_NOT)
    private Integer maxCoreNumNot;

    public static final String SERIALIZED_NAME_MAX_CORE_NUM_NOT_IN = "max_core_num_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_CORE_NUM_NOT_IN)
    private List<Integer> maxCoreNumNotIn = null;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY =
            "max_physical_data_capacity";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY)
    private Double maxPhysicalDataCapacity;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GT =
            "max_physical_data_capacity_gt";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GT)
    private Double maxPhysicalDataCapacityGt;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GTE =
            "max_physical_data_capacity_gte";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GTE)
    private Double maxPhysicalDataCapacityGte;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_IN =
            "max_physical_data_capacity_in";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_IN)
    private List<Double> maxPhysicalDataCapacityIn = null;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LT =
            "max_physical_data_capacity_lt";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LT)
    private Double maxPhysicalDataCapacityLt;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LTE =
            "max_physical_data_capacity_lte";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LTE)
    private Double maxPhysicalDataCapacityLte;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT =
            "max_physical_data_capacity_not";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT)
    private Double maxPhysicalDataCapacityNot;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT_IN =
            "max_physical_data_capacity_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT_IN)
    private List<Double> maxPhysicalDataCapacityNotIn = null;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE = "original_code";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE)
    private String originalCode;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_CONTAINS = "original_code_contains";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_CONTAINS)
    private String originalCodeContains;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_ENDS_WITH = "original_code_ends_with";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_ENDS_WITH)
    private String originalCodeEndsWith;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_GT = "original_code_gt";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_GT)
    private String originalCodeGt;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_GTE = "original_code_gte";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_GTE)
    private String originalCodeGte;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_IN = "original_code_in";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_IN)
    private List<String> originalCodeIn = null;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_LT = "original_code_lt";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_LT)
    private String originalCodeLt;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_LTE = "original_code_lte";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_LTE)
    private String originalCodeLte;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_NOT = "original_code_not";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_NOT)
    private String originalCodeNot;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_NOT_CONTAINS =
            "original_code_not_contains";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_NOT_CONTAINS)
    private String originalCodeNotContains;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_NOT_ENDS_WITH =
            "original_code_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_NOT_ENDS_WITH)
    private String originalCodeNotEndsWith;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_NOT_IN = "original_code_not_in";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_NOT_IN)
    private List<String> originalCodeNotIn = null;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_NOT_STARTS_WITH =
            "original_code_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_NOT_STARTS_WITH)
    private String originalCodeNotStartsWith;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_STARTS_WITH =
            "original_code_starts_with";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_STARTS_WITH)
    private String originalCodeStartsWith;

    public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
    private String productName;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_CONTAINS = "product_name_contains";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_CONTAINS)
    private String productNameContains;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_ENDS_WITH = "product_name_ends_with";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_ENDS_WITH)
    private String productNameEndsWith;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_GT = "product_name_gt";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_GT)
    private String productNameGt;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_GTE = "product_name_gte";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_GTE)
    private String productNameGte;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_IN = "product_name_in";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_IN)
    private List<String> productNameIn = null;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_LT = "product_name_lt";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_LT)
    private String productNameLt;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_LTE = "product_name_lte";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_LTE)
    private String productNameLte;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_NOT = "product_name_not";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_NOT)
    private String productNameNot;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_NOT_CONTAINS =
            "product_name_not_contains";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_NOT_CONTAINS)
    private String productNameNotContains;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_NOT_ENDS_WITH =
            "product_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_NOT_ENDS_WITH)
    private String productNameNotEndsWith;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_NOT_IN = "product_name_not_in";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_NOT_IN)
    private List<String> productNameNotIn = null;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_NOT_STARTS_WITH =
            "product_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_NOT_STARTS_WITH)
    private String productNameNotStartsWith;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_STARTS_WITH =
            "product_name_starts_with";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_STARTS_WITH)
    private String productNameStartsWith;

    public static final String SERIALIZED_NAME_SERIAL = "serial";

    @SerializedName(SERIALIZED_NAME_SERIAL)
    private String serial;

    public static final String SERIALIZED_NAME_SERIAL_CONTAINS = "serial_contains";

    @SerializedName(SERIALIZED_NAME_SERIAL_CONTAINS)
    private String serialContains;

    public static final String SERIALIZED_NAME_SERIAL_ENDS_WITH = "serial_ends_with";

    @SerializedName(SERIALIZED_NAME_SERIAL_ENDS_WITH)
    private String serialEndsWith;

    public static final String SERIALIZED_NAME_SERIAL_GT = "serial_gt";

    @SerializedName(SERIALIZED_NAME_SERIAL_GT)
    private String serialGt;

    public static final String SERIALIZED_NAME_SERIAL_GTE = "serial_gte";

    @SerializedName(SERIALIZED_NAME_SERIAL_GTE)
    private String serialGte;

    public static final String SERIALIZED_NAME_SERIAL_IN = "serial_in";

    @SerializedName(SERIALIZED_NAME_SERIAL_IN)
    private List<String> serialIn = null;

    public static final String SERIALIZED_NAME_SERIAL_LT = "serial_lt";

    @SerializedName(SERIALIZED_NAME_SERIAL_LT)
    private String serialLt;

    public static final String SERIALIZED_NAME_SERIAL_LTE = "serial_lte";

    @SerializedName(SERIALIZED_NAME_SERIAL_LTE)
    private String serialLte;

    public static final String SERIALIZED_NAME_SERIAL_NOT = "serial_not";

    @SerializedName(SERIALIZED_NAME_SERIAL_NOT)
    private String serialNot;

    public static final String SERIALIZED_NAME_SERIAL_NOT_CONTAINS = "serial_not_contains";

    @SerializedName(SERIALIZED_NAME_SERIAL_NOT_CONTAINS)
    private String serialNotContains;

    public static final String SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH = "serial_not_ends_with";

    @SerializedName(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH)
    private String serialNotEndsWith;

    public static final String SERIALIZED_NAME_SERIAL_NOT_IN = "serial_not_in";

    @SerializedName(SERIALIZED_NAME_SERIAL_NOT_IN)
    private List<String> serialNotIn = null;

    public static final String SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH = "serial_not_starts_with";

    @SerializedName(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH)
    private String serialNotStartsWith;

    public static final String SERIALIZED_NAME_SERIAL_STARTS_WITH = "serial_starts_with";

    @SerializedName(SERIALIZED_NAME_SERIAL_STARTS_WITH)
    private String serialStartsWith;

    public static final String SERIALIZED_NAME_SIGN_DATE = "sign_date";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE)
    private String signDate;

    public static final String SERIALIZED_NAME_SIGN_DATE_GT = "sign_date_gt";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_GT)
    private String signDateGt;

    public static final String SERIALIZED_NAME_SIGN_DATE_GTE = "sign_date_gte";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_GTE)
    private String signDateGte;

    public static final String SERIALIZED_NAME_SIGN_DATE_IN = "sign_date_in";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_IN)
    private List<String> signDateIn = null;

    public static final String SERIALIZED_NAME_SIGN_DATE_LT = "sign_date_lt";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_LT)
    private String signDateLt;

    public static final String SERIALIZED_NAME_SIGN_DATE_LTE = "sign_date_lte";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_LTE)
    private String signDateLte;

    public static final String SERIALIZED_NAME_SIGN_DATE_NOT = "sign_date_not";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_NOT)
    private String signDateNot;

    public static final String SERIALIZED_NAME_SIGN_DATE_NOT_IN = "sign_date_not_in";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_NOT_IN)
    private List<String> signDateNotIn = null;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE =
            "subscription_expire_date";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE)
    private String subscriptionExpireDate;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GT =
            "subscription_expire_date_gt";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GT)
    private String subscriptionExpireDateGt;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GTE =
            "subscription_expire_date_gte";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GTE)
    private String subscriptionExpireDateGte;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_IN =
            "subscription_expire_date_in";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_IN)
    private List<String> subscriptionExpireDateIn = null;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LT =
            "subscription_expire_date_lt";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LT)
    private String subscriptionExpireDateLt;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LTE =
            "subscription_expire_date_lte";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LTE)
    private String subscriptionExpireDateLte;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT =
            "subscription_expire_date_not";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT)
    private String subscriptionExpireDateNot;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT_IN =
            "subscription_expire_date_not_in";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT_IN)
    private List<String> subscriptionExpireDateNotIn = null;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_START_DATE = "subscription_start_date";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_START_DATE)
    private String subscriptionStartDate;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GT =
            "subscription_start_date_gt";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GT)
    private String subscriptionStartDateGt;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GTE =
            "subscription_start_date_gte";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GTE)
    private String subscriptionStartDateGte;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_START_DATE_IN =
            "subscription_start_date_in";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_IN)
    private List<String> subscriptionStartDateIn = null;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LT =
            "subscription_start_date_lt";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LT)
    private String subscriptionStartDateLt;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LTE =
            "subscription_start_date_lte";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LTE)
    private String subscriptionStartDateLte;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT =
            "subscription_start_date_not";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT)
    private String subscriptionStartDateNot;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT_IN =
            "subscription_start_date_not_in";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT_IN)
    private List<String> subscriptionStartDateNotIn = null;

    public static final String SERIALIZED_NAME_SYNC_REPLICATION = "sync_replication";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION)
    private String syncReplication;

    public static final String SERIALIZED_NAME_SYNC_REPLICATION_CONTAINS =
            "sync_replication_contains";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION_CONTAINS)
    private String syncReplicationContains;

    public static final String SERIALIZED_NAME_SYNC_REPLICATION_ENDS_WITH =
            "sync_replication_ends_with";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION_ENDS_WITH)
    private String syncReplicationEndsWith;

    public static final String SERIALIZED_NAME_SYNC_REPLICATION_GT = "sync_replication_gt";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION_GT)
    private String syncReplicationGt;

    public static final String SERIALIZED_NAME_SYNC_REPLICATION_GTE = "sync_replication_gte";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION_GTE)
    private String syncReplicationGte;

    public static final String SERIALIZED_NAME_SYNC_REPLICATION_IN = "sync_replication_in";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION_IN)
    private List<String> syncReplicationIn = null;

    public static final String SERIALIZED_NAME_SYNC_REPLICATION_LT = "sync_replication_lt";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION_LT)
    private String syncReplicationLt;

    public static final String SERIALIZED_NAME_SYNC_REPLICATION_LTE = "sync_replication_lte";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION_LTE)
    private String syncReplicationLte;

    public static final String SERIALIZED_NAME_SYNC_REPLICATION_NOT = "sync_replication_not";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION_NOT)
    private String syncReplicationNot;

    public static final String SERIALIZED_NAME_SYNC_REPLICATION_NOT_CONTAINS =
            "sync_replication_not_contains";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION_NOT_CONTAINS)
    private String syncReplicationNotContains;

    public static final String SERIALIZED_NAME_SYNC_REPLICATION_NOT_ENDS_WITH =
            "sync_replication_not_ends_with";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION_NOT_ENDS_WITH)
    private String syncReplicationNotEndsWith;

    public static final String SERIALIZED_NAME_SYNC_REPLICATION_NOT_IN = "sync_replication_not_in";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION_NOT_IN)
    private List<String> syncReplicationNotIn = null;

    public static final String SERIALIZED_NAME_SYNC_REPLICATION_NOT_STARTS_WITH =
            "sync_replication_not_starts_with";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION_NOT_STARTS_WITH)
    private String syncReplicationNotStartsWith;

    public static final String SERIALIZED_NAME_SYNC_REPLICATION_STARTS_WITH =
            "sync_replication_starts_with";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION_STARTS_WITH)
    private String syncReplicationStartsWith;

    public static final String SERIALIZED_NAME_TRAFFIC_VISUALIZATION = "traffic_visualization";

    @SerializedName(SERIALIZED_NAME_TRAFFIC_VISUALIZATION)
    private String trafficVisualization;

    public static final String SERIALIZED_NAME_TRAFFIC_VISUALIZATION_CONTAINS =
            "traffic_visualization_contains";

    @SerializedName(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_CONTAINS)
    private String trafficVisualizationContains;

    public static final String SERIALIZED_NAME_TRAFFIC_VISUALIZATION_ENDS_WITH =
            "traffic_visualization_ends_with";

    @SerializedName(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_ENDS_WITH)
    private String trafficVisualizationEndsWith;

    public static final String SERIALIZED_NAME_TRAFFIC_VISUALIZATION_GT =
            "traffic_visualization_gt";

    @SerializedName(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_GT)
    private String trafficVisualizationGt;

    public static final String SERIALIZED_NAME_TRAFFIC_VISUALIZATION_GTE =
            "traffic_visualization_gte";

    @SerializedName(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_GTE)
    private String trafficVisualizationGte;

    public static final String SERIALIZED_NAME_TRAFFIC_VISUALIZATION_IN =
            "traffic_visualization_in";

    @SerializedName(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_IN)
    private List<String> trafficVisualizationIn = null;

    public static final String SERIALIZED_NAME_TRAFFIC_VISUALIZATION_LT =
            "traffic_visualization_lt";

    @SerializedName(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_LT)
    private String trafficVisualizationLt;

    public static final String SERIALIZED_NAME_TRAFFIC_VISUALIZATION_LTE =
            "traffic_visualization_lte";

    @SerializedName(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_LTE)
    private String trafficVisualizationLte;

    public static final String SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT =
            "traffic_visualization_not";

    @SerializedName(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT)
    private String trafficVisualizationNot;

    public static final String SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_CONTAINS =
            "traffic_visualization_not_contains";

    @SerializedName(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_CONTAINS)
    private String trafficVisualizationNotContains;

    public static final String SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_ENDS_WITH =
            "traffic_visualization_not_ends_with";

    @SerializedName(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_ENDS_WITH)
    private String trafficVisualizationNotEndsWith;

    public static final String SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_IN =
            "traffic_visualization_not_in";

    @SerializedName(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_IN)
    private List<String> trafficVisualizationNotIn = null;

    public static final String SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_STARTS_WITH =
            "traffic_visualization_not_starts_with";

    @SerializedName(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_STARTS_WITH)
    private String trafficVisualizationNotStartsWith;

    public static final String SERIALIZED_NAME_TRAFFIC_VISUALIZATION_STARTS_WITH =
            "traffic_visualization_starts_with";

    @SerializedName(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_STARTS_WITH)
    private String trafficVisualizationStartsWith;

    public static final String SERIALIZED_NAME_VENDOR = "vendor";

    @SerializedName(SERIALIZED_NAME_VENDOR)
    private String vendor;

    public static final String SERIALIZED_NAME_VENDOR_CONTAINS = "vendor_contains";

    @SerializedName(SERIALIZED_NAME_VENDOR_CONTAINS)
    private String vendorContains;

    public static final String SERIALIZED_NAME_VENDOR_ENDS_WITH = "vendor_ends_with";

    @SerializedName(SERIALIZED_NAME_VENDOR_ENDS_WITH)
    private String vendorEndsWith;

    public static final String SERIALIZED_NAME_VENDOR_GT = "vendor_gt";

    @SerializedName(SERIALIZED_NAME_VENDOR_GT)
    private String vendorGt;

    public static final String SERIALIZED_NAME_VENDOR_GTE = "vendor_gte";

    @SerializedName(SERIALIZED_NAME_VENDOR_GTE)
    private String vendorGte;

    public static final String SERIALIZED_NAME_VENDOR_IN = "vendor_in";

    @SerializedName(SERIALIZED_NAME_VENDOR_IN)
    private List<String> vendorIn = null;

    public static final String SERIALIZED_NAME_VENDOR_LT = "vendor_lt";

    @SerializedName(SERIALIZED_NAME_VENDOR_LT)
    private String vendorLt;

    public static final String SERIALIZED_NAME_VENDOR_LTE = "vendor_lte";

    @SerializedName(SERIALIZED_NAME_VENDOR_LTE)
    private String vendorLte;

    public static final String SERIALIZED_NAME_VENDOR_NOT = "vendor_not";

    @SerializedName(SERIALIZED_NAME_VENDOR_NOT)
    private String vendorNot;

    public static final String SERIALIZED_NAME_VENDOR_NOT_CONTAINS = "vendor_not_contains";

    @SerializedName(SERIALIZED_NAME_VENDOR_NOT_CONTAINS)
    private String vendorNotContains;

    public static final String SERIALIZED_NAME_VENDOR_NOT_ENDS_WITH = "vendor_not_ends_with";

    @SerializedName(SERIALIZED_NAME_VENDOR_NOT_ENDS_WITH)
    private String vendorNotEndsWith;

    public static final String SERIALIZED_NAME_VENDOR_NOT_IN = "vendor_not_in";

    @SerializedName(SERIALIZED_NAME_VENDOR_NOT_IN)
    private List<String> vendorNotIn = null;

    public static final String SERIALIZED_NAME_VENDOR_NOT_STARTS_WITH = "vendor_not_starts_with";

    @SerializedName(SERIALIZED_NAME_VENDOR_NOT_STARTS_WITH)
    private String vendorNotStartsWith;

    public static final String SERIALIZED_NAME_VENDOR_STARTS_WITH = "vendor_starts_with";

    @SerializedName(SERIALIZED_NAME_VENDOR_STARTS_WITH)
    private String vendorStartsWith;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private Integer version;

    public static final String SERIALIZED_NAME_VERSION_GT = "version_gt";

    @SerializedName(SERIALIZED_NAME_VERSION_GT)
    private Integer versionGt;

    public static final String SERIALIZED_NAME_VERSION_GTE = "version_gte";

    @SerializedName(SERIALIZED_NAME_VERSION_GTE)
    private Integer versionGte;

    public static final String SERIALIZED_NAME_VERSION_IN = "version_in";

    @SerializedName(SERIALIZED_NAME_VERSION_IN)
    private List<Integer> versionIn = null;

    public static final String SERIALIZED_NAME_VERSION_LT = "version_lt";

    @SerializedName(SERIALIZED_NAME_VERSION_LT)
    private Integer versionLt;

    public static final String SERIALIZED_NAME_VERSION_LTE = "version_lte";

    @SerializedName(SERIALIZED_NAME_VERSION_LTE)
    private Integer versionLte;

    public static final String SERIALIZED_NAME_VERSION_NOT = "version_not";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT)
    private Integer versionNot;

    public static final String SERIALIZED_NAME_VERSION_NOT_IN = "version_not_in";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT_IN)
    private List<Integer> versionNotIn = null;

    public static final String SERIALIZED_NAME_VPC = "vpc";

    @SerializedName(SERIALIZED_NAME_VPC)
    private String vpc;

    public static final String SERIALIZED_NAME_VPC_CONTAINS = "vpc_contains";

    @SerializedName(SERIALIZED_NAME_VPC_CONTAINS)
    private String vpcContains;

    public static final String SERIALIZED_NAME_VPC_ENDS_WITH = "vpc_ends_with";

    @SerializedName(SERIALIZED_NAME_VPC_ENDS_WITH)
    private String vpcEndsWith;

    public static final String SERIALIZED_NAME_VPC_GT = "vpc_gt";

    @SerializedName(SERIALIZED_NAME_VPC_GT)
    private String vpcGt;

    public static final String SERIALIZED_NAME_VPC_GTE = "vpc_gte";

    @SerializedName(SERIALIZED_NAME_VPC_GTE)
    private String vpcGte;

    public static final String SERIALIZED_NAME_VPC_IN = "vpc_in";

    @SerializedName(SERIALIZED_NAME_VPC_IN)
    private List<String> vpcIn = null;

    public static final String SERIALIZED_NAME_VPC_LT = "vpc_lt";

    @SerializedName(SERIALIZED_NAME_VPC_LT)
    private String vpcLt;

    public static final String SERIALIZED_NAME_VPC_LTE = "vpc_lte";

    @SerializedName(SERIALIZED_NAME_VPC_LTE)
    private String vpcLte;

    public static final String SERIALIZED_NAME_VPC_NOT = "vpc_not";

    @SerializedName(SERIALIZED_NAME_VPC_NOT)
    private String vpcNot;

    public static final String SERIALIZED_NAME_VPC_NOT_CONTAINS = "vpc_not_contains";

    @SerializedName(SERIALIZED_NAME_VPC_NOT_CONTAINS)
    private String vpcNotContains;

    public static final String SERIALIZED_NAME_VPC_NOT_ENDS_WITH = "vpc_not_ends_with";

    @SerializedName(SERIALIZED_NAME_VPC_NOT_ENDS_WITH)
    private String vpcNotEndsWith;

    public static final String SERIALIZED_NAME_VPC_NOT_IN = "vpc_not_in";

    @SerializedName(SERIALIZED_NAME_VPC_NOT_IN)
    private List<String> vpcNotIn = null;

    public static final String SERIALIZED_NAME_VPC_NOT_STARTS_WITH = "vpc_not_starts_with";

    @SerializedName(SERIALIZED_NAME_VPC_NOT_STARTS_WITH)
    private String vpcNotStartsWith;

    public static final String SERIALIZED_NAME_VPC_STARTS_WITH = "vpc_starts_with";

    @SerializedName(SERIALIZED_NAME_VPC_STARTS_WITH)
    private String vpcStartsWith;

    public EcpLicenseWhereInput() {}

    public EcpLicenseWhereInput AND(List<EcpLicenseWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public EcpLicenseWhereInput addANDItem(EcpLicenseWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<EcpLicenseWhereInput>();
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
    public List<EcpLicenseWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<EcpLicenseWhereInput> AND) {
        this.AND = AND;
    }

    public EcpLicenseWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public EcpLicenseWhereInput AND_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput NOT(List<EcpLicenseWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public EcpLicenseWhereInput addNOTItem(EcpLicenseWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<EcpLicenseWhereInput>();
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
    public List<EcpLicenseWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<EcpLicenseWhereInput> NOT) {
        this.NOT = NOT;
    }

    public EcpLicenseWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public EcpLicenseWhereInput NOT_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput OR(List<EcpLicenseWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public EcpLicenseWhereInput addORItem(EcpLicenseWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<EcpLicenseWhereInput>();
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
    public List<EcpLicenseWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<EcpLicenseWhereInput> OR) {
        this.OR = OR;
    }

    public EcpLicenseWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public EcpLicenseWhereInput OR_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput asyncReplication(String asyncReplication) {

        this.asyncReplication = asyncReplication;
        return this;
    }

    /**
     * Get asyncReplication
     *
     * @return asyncReplication
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAsyncReplication() {
        return asyncReplication;
    }

    public void setAsyncReplication(String asyncReplication) {
        this.asyncReplication = asyncReplication;
    }

    public EcpLicenseWhereInput asyncReplication_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION);
        return this;
    }

    public EcpLicenseWhereInput asyncReplication_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION);
        return this;
    }

    public void setAsyncReplication_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION);
        }
    }

    public boolean getAsyncReplication_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASYNC_REPLICATION);
    }

    public EcpLicenseWhereInput asyncReplicationContains(String asyncReplicationContains) {

        this.asyncReplicationContains = asyncReplicationContains;
        return this;
    }

    /**
     * Get asyncReplicationContains
     *
     * @return asyncReplicationContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAsyncReplicationContains() {
        return asyncReplicationContains;
    }

    public void setAsyncReplicationContains(String asyncReplicationContains) {
        this.asyncReplicationContains = asyncReplicationContains;
    }

    public EcpLicenseWhereInput asyncReplicationContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput asyncReplicationContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_CONTAINS);
        return this;
    }

    public void setAsyncReplicationContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_CONTAINS);
        }
    }

    public boolean getAsyncReplicationContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASYNC_REPLICATION_CONTAINS);
    }

    public EcpLicenseWhereInput asyncReplicationEndsWith(String asyncReplicationEndsWith) {

        this.asyncReplicationEndsWith = asyncReplicationEndsWith;
        return this;
    }

    /**
     * Get asyncReplicationEndsWith
     *
     * @return asyncReplicationEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAsyncReplicationEndsWith() {
        return asyncReplicationEndsWith;
    }

    public void setAsyncReplicationEndsWith(String asyncReplicationEndsWith) {
        this.asyncReplicationEndsWith = asyncReplicationEndsWith;
    }

    public EcpLicenseWhereInput asyncReplicationEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput asyncReplicationEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_ENDS_WITH);
        return this;
    }

    public void setAsyncReplicationEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_ENDS_WITH);
        }
    }

    public boolean getAsyncReplicationEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASYNC_REPLICATION_ENDS_WITH);
    }

    public EcpLicenseWhereInput asyncReplicationGt(String asyncReplicationGt) {

        this.asyncReplicationGt = asyncReplicationGt;
        return this;
    }

    /**
     * Get asyncReplicationGt
     *
     * @return asyncReplicationGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAsyncReplicationGt() {
        return asyncReplicationGt;
    }

    public void setAsyncReplicationGt(String asyncReplicationGt) {
        this.asyncReplicationGt = asyncReplicationGt;
    }

    public EcpLicenseWhereInput asyncReplicationGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_GT);
        return this;
    }

    public EcpLicenseWhereInput asyncReplicationGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_GT);
        return this;
    }

    public void setAsyncReplicationGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_GT);
        }
    }

    public boolean getAsyncReplicationGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASYNC_REPLICATION_GT);
    }

    public EcpLicenseWhereInput asyncReplicationGte(String asyncReplicationGte) {

        this.asyncReplicationGte = asyncReplicationGte;
        return this;
    }

    /**
     * Get asyncReplicationGte
     *
     * @return asyncReplicationGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAsyncReplicationGte() {
        return asyncReplicationGte;
    }

    public void setAsyncReplicationGte(String asyncReplicationGte) {
        this.asyncReplicationGte = asyncReplicationGte;
    }

    public EcpLicenseWhereInput asyncReplicationGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_GTE);
        return this;
    }

    public EcpLicenseWhereInput asyncReplicationGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_GTE);
        return this;
    }

    public void setAsyncReplicationGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_GTE);
        }
    }

    public boolean getAsyncReplicationGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASYNC_REPLICATION_GTE);
    }

    public EcpLicenseWhereInput asyncReplicationIn(List<String> asyncReplicationIn) {

        this.asyncReplicationIn = asyncReplicationIn;
        return this;
    }

    public EcpLicenseWhereInput addAsyncReplicationInItem(String asyncReplicationInItem) {
        if (this.asyncReplicationIn == null) {
            this.asyncReplicationIn = new ArrayList<String>();
        }
        this.asyncReplicationIn.add(asyncReplicationInItem);
        return this;
    }

    /**
     * Get asyncReplicationIn
     *
     * @return asyncReplicationIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getAsyncReplicationIn() {
        return asyncReplicationIn;
    }

    public void setAsyncReplicationIn(List<String> asyncReplicationIn) {
        this.asyncReplicationIn = asyncReplicationIn;
    }

    public EcpLicenseWhereInput asyncReplicationIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_IN);
        return this;
    }

    public EcpLicenseWhereInput asyncReplicationIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_IN);
        return this;
    }

    public void setAsyncReplicationIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_IN);
        }
    }

    public boolean getAsyncReplicationIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASYNC_REPLICATION_IN);
    }

    public EcpLicenseWhereInput asyncReplicationLt(String asyncReplicationLt) {

        this.asyncReplicationLt = asyncReplicationLt;
        return this;
    }

    /**
     * Get asyncReplicationLt
     *
     * @return asyncReplicationLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAsyncReplicationLt() {
        return asyncReplicationLt;
    }

    public void setAsyncReplicationLt(String asyncReplicationLt) {
        this.asyncReplicationLt = asyncReplicationLt;
    }

    public EcpLicenseWhereInput asyncReplicationLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_LT);
        return this;
    }

    public EcpLicenseWhereInput asyncReplicationLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_LT);
        return this;
    }

    public void setAsyncReplicationLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_LT);
        }
    }

    public boolean getAsyncReplicationLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASYNC_REPLICATION_LT);
    }

    public EcpLicenseWhereInput asyncReplicationLte(String asyncReplicationLte) {

        this.asyncReplicationLte = asyncReplicationLte;
        return this;
    }

    /**
     * Get asyncReplicationLte
     *
     * @return asyncReplicationLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAsyncReplicationLte() {
        return asyncReplicationLte;
    }

    public void setAsyncReplicationLte(String asyncReplicationLte) {
        this.asyncReplicationLte = asyncReplicationLte;
    }

    public EcpLicenseWhereInput asyncReplicationLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_LTE);
        return this;
    }

    public EcpLicenseWhereInput asyncReplicationLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_LTE);
        return this;
    }

    public void setAsyncReplicationLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_LTE);
        }
    }

    public boolean getAsyncReplicationLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASYNC_REPLICATION_LTE);
    }

    public EcpLicenseWhereInput asyncReplicationNot(String asyncReplicationNot) {

        this.asyncReplicationNot = asyncReplicationNot;
        return this;
    }

    /**
     * Get asyncReplicationNot
     *
     * @return asyncReplicationNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAsyncReplicationNot() {
        return asyncReplicationNot;
    }

    public void setAsyncReplicationNot(String asyncReplicationNot) {
        this.asyncReplicationNot = asyncReplicationNot;
    }

    public EcpLicenseWhereInput asyncReplicationNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_NOT);
        return this;
    }

    public EcpLicenseWhereInput asyncReplicationNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_NOT);
        return this;
    }

    public void setAsyncReplicationNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_NOT);
        }
    }

    public boolean getAsyncReplicationNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASYNC_REPLICATION_NOT);
    }

    public EcpLicenseWhereInput asyncReplicationNotContains(String asyncReplicationNotContains) {

        this.asyncReplicationNotContains = asyncReplicationNotContains;
        return this;
    }

    /**
     * Get asyncReplicationNotContains
     *
     * @return asyncReplicationNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAsyncReplicationNotContains() {
        return asyncReplicationNotContains;
    }

    public void setAsyncReplicationNotContains(String asyncReplicationNotContains) {
        this.asyncReplicationNotContains = asyncReplicationNotContains;
    }

    public EcpLicenseWhereInput asyncReplicationNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput asyncReplicationNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_CONTAINS);
        return this;
    }

    public void setAsyncReplicationNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_CONTAINS);
        }
    }

    public boolean getAsyncReplicationNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput asyncReplicationNotEndsWith(String asyncReplicationNotEndsWith) {

        this.asyncReplicationNotEndsWith = asyncReplicationNotEndsWith;
        return this;
    }

    /**
     * Get asyncReplicationNotEndsWith
     *
     * @return asyncReplicationNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAsyncReplicationNotEndsWith() {
        return asyncReplicationNotEndsWith;
    }

    public void setAsyncReplicationNotEndsWith(String asyncReplicationNotEndsWith) {
        this.asyncReplicationNotEndsWith = asyncReplicationNotEndsWith;
    }

    public EcpLicenseWhereInput asyncReplicationNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput asyncReplicationNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_ENDS_WITH);
        return this;
    }

    public void setAsyncReplicationNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_ENDS_WITH);
        }
    }

    public boolean getAsyncReplicationNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput asyncReplicationNotIn(List<String> asyncReplicationNotIn) {

        this.asyncReplicationNotIn = asyncReplicationNotIn;
        return this;
    }

    public EcpLicenseWhereInput addAsyncReplicationNotInItem(String asyncReplicationNotInItem) {
        if (this.asyncReplicationNotIn == null) {
            this.asyncReplicationNotIn = new ArrayList<String>();
        }
        this.asyncReplicationNotIn.add(asyncReplicationNotInItem);
        return this;
    }

    /**
     * Get asyncReplicationNotIn
     *
     * @return asyncReplicationNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getAsyncReplicationNotIn() {
        return asyncReplicationNotIn;
    }

    public void setAsyncReplicationNotIn(List<String> asyncReplicationNotIn) {
        this.asyncReplicationNotIn = asyncReplicationNotIn;
    }

    public EcpLicenseWhereInput asyncReplicationNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput asyncReplicationNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_IN);
        return this;
    }

    public void setAsyncReplicationNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_IN);
        }
    }

    public boolean getAsyncReplicationNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_IN);
    }

    public EcpLicenseWhereInput asyncReplicationNotStartsWith(
            String asyncReplicationNotStartsWith) {

        this.asyncReplicationNotStartsWith = asyncReplicationNotStartsWith;
        return this;
    }

    /**
     * Get asyncReplicationNotStartsWith
     *
     * @return asyncReplicationNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAsyncReplicationNotStartsWith() {
        return asyncReplicationNotStartsWith;
    }

    public void setAsyncReplicationNotStartsWith(String asyncReplicationNotStartsWith) {
        this.asyncReplicationNotStartsWith = asyncReplicationNotStartsWith;
    }

    public EcpLicenseWhereInput asyncReplicationNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput asyncReplicationNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_STARTS_WITH);
        return this;
    }

    public void setAsyncReplicationNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_STARTS_WITH);
        }
    }

    public boolean getAsyncReplicationNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASYNC_REPLICATION_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput asyncReplicationStartsWith(String asyncReplicationStartsWith) {

        this.asyncReplicationStartsWith = asyncReplicationStartsWith;
        return this;
    }

    /**
     * Get asyncReplicationStartsWith
     *
     * @return asyncReplicationStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAsyncReplicationStartsWith() {
        return asyncReplicationStartsWith;
    }

    public void setAsyncReplicationStartsWith(String asyncReplicationStartsWith) {
        this.asyncReplicationStartsWith = asyncReplicationStartsWith;
    }

    public EcpLicenseWhereInput asyncReplicationStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput asyncReplicationStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_STARTS_WITH);
        return this;
    }

    public void setAsyncReplicationStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASYNC_REPLICATION_STARTS_WITH);
        }
    }

    public boolean getAsyncReplicationStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASYNC_REPLICATION_STARTS_WITH);
    }

    public EcpLicenseWhereInput backup(String backup) {

        this.backup = backup;
        return this;
    }

    /**
     * Get backup
     *
     * @return backup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackup() {
        return backup;
    }

    public void setBackup(String backup) {
        this.backup = backup;
    }

    public EcpLicenseWhereInput backup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP);
        return this;
    }

    public EcpLicenseWhereInput backup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP);
        return this;
    }

    public void setBackup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP);
        }
    }

    public boolean getBackup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP);
    }

    public EcpLicenseWhereInput backupContains(String backupContains) {

        this.backupContains = backupContains;
        return this;
    }

    /**
     * Get backupContains
     *
     * @return backupContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupContains() {
        return backupContains;
    }

    public void setBackupContains(String backupContains) {
        this.backupContains = backupContains;
    }

    public EcpLicenseWhereInput backupContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput backupContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_CONTAINS);
        return this;
    }

    public void setBackupContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_CONTAINS);
        }
    }

    public boolean getBackupContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_CONTAINS);
    }

    public EcpLicenseWhereInput backupEndsWith(String backupEndsWith) {

        this.backupEndsWith = backupEndsWith;
        return this;
    }

    /**
     * Get backupEndsWith
     *
     * @return backupEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupEndsWith() {
        return backupEndsWith;
    }

    public void setBackupEndsWith(String backupEndsWith) {
        this.backupEndsWith = backupEndsWith;
    }

    public EcpLicenseWhereInput backupEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput backupEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_ENDS_WITH);
        return this;
    }

    public void setBackupEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_ENDS_WITH);
        }
    }

    public boolean getBackupEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_ENDS_WITH);
    }

    public EcpLicenseWhereInput backupGt(String backupGt) {

        this.backupGt = backupGt;
        return this;
    }

    /**
     * Get backupGt
     *
     * @return backupGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupGt() {
        return backupGt;
    }

    public void setBackupGt(String backupGt) {
        this.backupGt = backupGt;
    }

    public EcpLicenseWhereInput backupGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_GT);
        return this;
    }

    public EcpLicenseWhereInput backupGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GT);
        return this;
    }

    public void setBackupGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GT);
        }
    }

    public boolean getBackupGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_GT);
    }

    public EcpLicenseWhereInput backupGte(String backupGte) {

        this.backupGte = backupGte;
        return this;
    }

    /**
     * Get backupGte
     *
     * @return backupGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupGte() {
        return backupGte;
    }

    public void setBackupGte(String backupGte) {
        this.backupGte = backupGte;
    }

    public EcpLicenseWhereInput backupGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_GTE);
        return this;
    }

    public EcpLicenseWhereInput backupGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GTE);
        return this;
    }

    public void setBackupGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GTE);
        }
    }

    public boolean getBackupGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_GTE);
    }

    public EcpLicenseWhereInput backupIn(List<String> backupIn) {

        this.backupIn = backupIn;
        return this;
    }

    public EcpLicenseWhereInput addBackupInItem(String backupInItem) {
        if (this.backupIn == null) {
            this.backupIn = new ArrayList<String>();
        }
        this.backupIn.add(backupInItem);
        return this;
    }

    /**
     * Get backupIn
     *
     * @return backupIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getBackupIn() {
        return backupIn;
    }

    public void setBackupIn(List<String> backupIn) {
        this.backupIn = backupIn;
    }

    public EcpLicenseWhereInput backupIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_IN);
        return this;
    }

    public EcpLicenseWhereInput backupIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_IN);
        return this;
    }

    public void setBackupIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_IN);
        }
    }

    public boolean getBackupIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_IN);
    }

    public EcpLicenseWhereInput backupLt(String backupLt) {

        this.backupLt = backupLt;
        return this;
    }

    /**
     * Get backupLt
     *
     * @return backupLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupLt() {
        return backupLt;
    }

    public void setBackupLt(String backupLt) {
        this.backupLt = backupLt;
    }

    public EcpLicenseWhereInput backupLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_LT);
        return this;
    }

    public EcpLicenseWhereInput backupLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_LT);
        return this;
    }

    public void setBackupLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_LT);
        }
    }

    public boolean getBackupLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_LT);
    }

    public EcpLicenseWhereInput backupLte(String backupLte) {

        this.backupLte = backupLte;
        return this;
    }

    /**
     * Get backupLte
     *
     * @return backupLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupLte() {
        return backupLte;
    }

    public void setBackupLte(String backupLte) {
        this.backupLte = backupLte;
    }

    public EcpLicenseWhereInput backupLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_LTE);
        return this;
    }

    public EcpLicenseWhereInput backupLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_LTE);
        return this;
    }

    public void setBackupLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_LTE);
        }
    }

    public boolean getBackupLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_LTE);
    }

    public EcpLicenseWhereInput backupNot(String backupNot) {

        this.backupNot = backupNot;
        return this;
    }

    /**
     * Get backupNot
     *
     * @return backupNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNot() {
        return backupNot;
    }

    public void setBackupNot(String backupNot) {
        this.backupNot = backupNot;
    }

    public EcpLicenseWhereInput backupNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NOT);
        return this;
    }

    public EcpLicenseWhereInput backupNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NOT);
        return this;
    }

    public void setBackupNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NOT);
        }
    }

    public boolean getBackupNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NOT);
    }

    public EcpLicenseWhereInput backupNotContains(String backupNotContains) {

        this.backupNotContains = backupNotContains;
        return this;
    }

    /**
     * Get backupNotContains
     *
     * @return backupNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNotContains() {
        return backupNotContains;
    }

    public void setBackupNotContains(String backupNotContains) {
        this.backupNotContains = backupNotContains;
    }

    public EcpLicenseWhereInput backupNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput backupNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NOT_CONTAINS);
        return this;
    }

    public void setBackupNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NOT_CONTAINS);
        }
    }

    public boolean getBackupNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput backupNotEndsWith(String backupNotEndsWith) {

        this.backupNotEndsWith = backupNotEndsWith;
        return this;
    }

    /**
     * Get backupNotEndsWith
     *
     * @return backupNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNotEndsWith() {
        return backupNotEndsWith;
    }

    public void setBackupNotEndsWith(String backupNotEndsWith) {
        this.backupNotEndsWith = backupNotEndsWith;
    }

    public EcpLicenseWhereInput backupNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput backupNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NOT_ENDS_WITH);
        return this;
    }

    public void setBackupNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NOT_ENDS_WITH);
        }
    }

    public boolean getBackupNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput backupNotIn(List<String> backupNotIn) {

        this.backupNotIn = backupNotIn;
        return this;
    }

    public EcpLicenseWhereInput addBackupNotInItem(String backupNotInItem) {
        if (this.backupNotIn == null) {
            this.backupNotIn = new ArrayList<String>();
        }
        this.backupNotIn.add(backupNotInItem);
        return this;
    }

    /**
     * Get backupNotIn
     *
     * @return backupNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getBackupNotIn() {
        return backupNotIn;
    }

    public void setBackupNotIn(List<String> backupNotIn) {
        this.backupNotIn = backupNotIn;
    }

    public EcpLicenseWhereInput backupNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput backupNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NOT_IN);
        return this;
    }

    public void setBackupNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NOT_IN);
        }
    }

    public boolean getBackupNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NOT_IN);
    }

    public EcpLicenseWhereInput backupNotStartsWith(String backupNotStartsWith) {

        this.backupNotStartsWith = backupNotStartsWith;
        return this;
    }

    /**
     * Get backupNotStartsWith
     *
     * @return backupNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNotStartsWith() {
        return backupNotStartsWith;
    }

    public void setBackupNotStartsWith(String backupNotStartsWith) {
        this.backupNotStartsWith = backupNotStartsWith;
    }

    public EcpLicenseWhereInput backupNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput backupNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NOT_STARTS_WITH);
        return this;
    }

    public void setBackupNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NOT_STARTS_WITH);
        }
    }

    public boolean getBackupNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput backupStartsWith(String backupStartsWith) {

        this.backupStartsWith = backupStartsWith;
        return this;
    }

    /**
     * Get backupStartsWith
     *
     * @return backupStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupStartsWith() {
        return backupStartsWith;
    }

    public void setBackupStartsWith(String backupStartsWith) {
        this.backupStartsWith = backupStartsWith;
    }

    public EcpLicenseWhereInput backupStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput backupStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_STARTS_WITH);
        return this;
    }

    public void setBackupStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_STARTS_WITH);
        }
    }

    public boolean getBackupStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_STARTS_WITH);
    }

    public EcpLicenseWhereInput brand(String brand) {

        this.brand = brand;
        return this;
    }

    /**
     * Get brand
     *
     * @return brand
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public EcpLicenseWhereInput brand_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRAND);
        return this;
    }

    public EcpLicenseWhereInput brand_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BRAND);
        return this;
    }

    public void setBrand_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BRAND);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BRAND);
        }
    }

    public boolean getBrand_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BRAND);
    }

    public EcpLicenseWhereInput brandContains(String brandContains) {

        this.brandContains = brandContains;
        return this;
    }

    /**
     * Get brandContains
     *
     * @return brandContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBrandContains() {
        return brandContains;
    }

    public void setBrandContains(String brandContains) {
        this.brandContains = brandContains;
    }

    public EcpLicenseWhereInput brandContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRAND_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput brandContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BRAND_CONTAINS);
        return this;
    }

    public void setBrandContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BRAND_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BRAND_CONTAINS);
        }
    }

    public boolean getBrandContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BRAND_CONTAINS);
    }

    public EcpLicenseWhereInput brandEndsWith(String brandEndsWith) {

        this.brandEndsWith = brandEndsWith;
        return this;
    }

    /**
     * Get brandEndsWith
     *
     * @return brandEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBrandEndsWith() {
        return brandEndsWith;
    }

    public void setBrandEndsWith(String brandEndsWith) {
        this.brandEndsWith = brandEndsWith;
    }

    public EcpLicenseWhereInput brandEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRAND_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput brandEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BRAND_ENDS_WITH);
        return this;
    }

    public void setBrandEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BRAND_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BRAND_ENDS_WITH);
        }
    }

    public boolean getBrandEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BRAND_ENDS_WITH);
    }

    public EcpLicenseWhereInput brandGt(String brandGt) {

        this.brandGt = brandGt;
        return this;
    }

    /**
     * Get brandGt
     *
     * @return brandGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBrandGt() {
        return brandGt;
    }

    public void setBrandGt(String brandGt) {
        this.brandGt = brandGt;
    }

    public EcpLicenseWhereInput brandGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRAND_GT);
        return this;
    }

    public EcpLicenseWhereInput brandGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BRAND_GT);
        return this;
    }

    public void setBrandGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BRAND_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BRAND_GT);
        }
    }

    public boolean getBrandGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BRAND_GT);
    }

    public EcpLicenseWhereInput brandGte(String brandGte) {

        this.brandGte = brandGte;
        return this;
    }

    /**
     * Get brandGte
     *
     * @return brandGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBrandGte() {
        return brandGte;
    }

    public void setBrandGte(String brandGte) {
        this.brandGte = brandGte;
    }

    public EcpLicenseWhereInput brandGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRAND_GTE);
        return this;
    }

    public EcpLicenseWhereInput brandGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BRAND_GTE);
        return this;
    }

    public void setBrandGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BRAND_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BRAND_GTE);
        }
    }

    public boolean getBrandGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BRAND_GTE);
    }

    public EcpLicenseWhereInput brandIn(List<String> brandIn) {

        this.brandIn = brandIn;
        return this;
    }

    public EcpLicenseWhereInput addBrandInItem(String brandInItem) {
        if (this.brandIn == null) {
            this.brandIn = new ArrayList<String>();
        }
        this.brandIn.add(brandInItem);
        return this;
    }

    /**
     * Get brandIn
     *
     * @return brandIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getBrandIn() {
        return brandIn;
    }

    public void setBrandIn(List<String> brandIn) {
        this.brandIn = brandIn;
    }

    public EcpLicenseWhereInput brandIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRAND_IN);
        return this;
    }

    public EcpLicenseWhereInput brandIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BRAND_IN);
        return this;
    }

    public void setBrandIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BRAND_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BRAND_IN);
        }
    }

    public boolean getBrandIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BRAND_IN);
    }

    public EcpLicenseWhereInput brandLt(String brandLt) {

        this.brandLt = brandLt;
        return this;
    }

    /**
     * Get brandLt
     *
     * @return brandLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBrandLt() {
        return brandLt;
    }

    public void setBrandLt(String brandLt) {
        this.brandLt = brandLt;
    }

    public EcpLicenseWhereInput brandLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRAND_LT);
        return this;
    }

    public EcpLicenseWhereInput brandLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BRAND_LT);
        return this;
    }

    public void setBrandLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BRAND_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BRAND_LT);
        }
    }

    public boolean getBrandLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BRAND_LT);
    }

    public EcpLicenseWhereInput brandLte(String brandLte) {

        this.brandLte = brandLte;
        return this;
    }

    /**
     * Get brandLte
     *
     * @return brandLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBrandLte() {
        return brandLte;
    }

    public void setBrandLte(String brandLte) {
        this.brandLte = brandLte;
    }

    public EcpLicenseWhereInput brandLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRAND_LTE);
        return this;
    }

    public EcpLicenseWhereInput brandLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BRAND_LTE);
        return this;
    }

    public void setBrandLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BRAND_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BRAND_LTE);
        }
    }

    public boolean getBrandLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BRAND_LTE);
    }

    public EcpLicenseWhereInput brandNot(String brandNot) {

        this.brandNot = brandNot;
        return this;
    }

    /**
     * Get brandNot
     *
     * @return brandNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBrandNot() {
        return brandNot;
    }

    public void setBrandNot(String brandNot) {
        this.brandNot = brandNot;
    }

    public EcpLicenseWhereInput brandNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRAND_NOT);
        return this;
    }

    public EcpLicenseWhereInput brandNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BRAND_NOT);
        return this;
    }

    public void setBrandNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BRAND_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BRAND_NOT);
        }
    }

    public boolean getBrandNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BRAND_NOT);
    }

    public EcpLicenseWhereInput brandNotContains(String brandNotContains) {

        this.brandNotContains = brandNotContains;
        return this;
    }

    /**
     * Get brandNotContains
     *
     * @return brandNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBrandNotContains() {
        return brandNotContains;
    }

    public void setBrandNotContains(String brandNotContains) {
        this.brandNotContains = brandNotContains;
    }

    public EcpLicenseWhereInput brandNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRAND_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput brandNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BRAND_NOT_CONTAINS);
        return this;
    }

    public void setBrandNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BRAND_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BRAND_NOT_CONTAINS);
        }
    }

    public boolean getBrandNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BRAND_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput brandNotEndsWith(String brandNotEndsWith) {

        this.brandNotEndsWith = brandNotEndsWith;
        return this;
    }

    /**
     * Get brandNotEndsWith
     *
     * @return brandNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBrandNotEndsWith() {
        return brandNotEndsWith;
    }

    public void setBrandNotEndsWith(String brandNotEndsWith) {
        this.brandNotEndsWith = brandNotEndsWith;
    }

    public EcpLicenseWhereInput brandNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRAND_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput brandNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BRAND_NOT_ENDS_WITH);
        return this;
    }

    public void setBrandNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BRAND_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BRAND_NOT_ENDS_WITH);
        }
    }

    public boolean getBrandNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BRAND_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput brandNotIn(List<String> brandNotIn) {

        this.brandNotIn = brandNotIn;
        return this;
    }

    public EcpLicenseWhereInput addBrandNotInItem(String brandNotInItem) {
        if (this.brandNotIn == null) {
            this.brandNotIn = new ArrayList<String>();
        }
        this.brandNotIn.add(brandNotInItem);
        return this;
    }

    /**
     * Get brandNotIn
     *
     * @return brandNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getBrandNotIn() {
        return brandNotIn;
    }

    public void setBrandNotIn(List<String> brandNotIn) {
        this.brandNotIn = brandNotIn;
    }

    public EcpLicenseWhereInput brandNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRAND_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput brandNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BRAND_NOT_IN);
        return this;
    }

    public void setBrandNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BRAND_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BRAND_NOT_IN);
        }
    }

    public boolean getBrandNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BRAND_NOT_IN);
    }

    public EcpLicenseWhereInput brandNotStartsWith(String brandNotStartsWith) {

        this.brandNotStartsWith = brandNotStartsWith;
        return this;
    }

    /**
     * Get brandNotStartsWith
     *
     * @return brandNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBrandNotStartsWith() {
        return brandNotStartsWith;
    }

    public void setBrandNotStartsWith(String brandNotStartsWith) {
        this.brandNotStartsWith = brandNotStartsWith;
    }

    public EcpLicenseWhereInput brandNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRAND_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput brandNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BRAND_NOT_STARTS_WITH);
        return this;
    }

    public void setBrandNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BRAND_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BRAND_NOT_STARTS_WITH);
        }
    }

    public boolean getBrandNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BRAND_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput brandStartsWith(String brandStartsWith) {

        this.brandStartsWith = brandStartsWith;
        return this;
    }

    /**
     * Get brandStartsWith
     *
     * @return brandStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBrandStartsWith() {
        return brandStartsWith;
    }

    public void setBrandStartsWith(String brandStartsWith) {
        this.brandStartsWith = brandStartsWith;
    }

    public EcpLicenseWhereInput brandStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRAND_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput brandStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BRAND_STARTS_WITH);
        return this;
    }

    public void setBrandStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BRAND_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BRAND_STARTS_WITH);
        }
    }

    public boolean getBrandStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BRAND_STARTS_WITH);
    }

    public EcpLicenseWhereInput cluster(ClusterWhereInput cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getCluster() {
        return cluster;
    }

    public void setCluster(ClusterWhereInput cluster) {
        this.cluster = cluster;
    }

    public EcpLicenseWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public EcpLicenseWhereInput cluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public void setCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        }
    }

    public boolean getCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER);
    }

    public EcpLicenseWhereInput clusterLocalId(String clusterLocalId) {

        this.clusterLocalId = clusterLocalId;
        return this;
    }

    /**
     * Get clusterLocalId
     *
     * @return clusterLocalId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalId() {
        return clusterLocalId;
    }

    public void setClusterLocalId(String clusterLocalId) {
        this.clusterLocalId = clusterLocalId;
    }

    public EcpLicenseWhereInput clusterLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        return this;
    }

    public void setClusterLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        }
    }

    public boolean getClusterLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
    }

    public EcpLicenseWhereInput clusterLocalIdContains(String clusterLocalIdContains) {

        this.clusterLocalIdContains = clusterLocalIdContains;
        return this;
    }

    /**
     * Get clusterLocalIdContains
     *
     * @return clusterLocalIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdContains() {
        return clusterLocalIdContains;
    }

    public void setClusterLocalIdContains(String clusterLocalIdContains) {
        this.clusterLocalIdContains = clusterLocalIdContains;
    }

    public EcpLicenseWhereInput clusterLocalIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
        return this;
    }

    public void setClusterLocalIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
        }
    }

    public boolean getClusterLocalIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
    }

    public EcpLicenseWhereInput clusterLocalIdEndsWith(String clusterLocalIdEndsWith) {

        this.clusterLocalIdEndsWith = clusterLocalIdEndsWith;
        return this;
    }

    /**
     * Get clusterLocalIdEndsWith
     *
     * @return clusterLocalIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdEndsWith() {
        return clusterLocalIdEndsWith;
    }

    public void setClusterLocalIdEndsWith(String clusterLocalIdEndsWith) {
        this.clusterLocalIdEndsWith = clusterLocalIdEndsWith;
    }

    public EcpLicenseWhereInput clusterLocalIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public void setClusterLocalIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
        }
    }

    public boolean getClusterLocalIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
    }

    public EcpLicenseWhereInput clusterLocalIdGt(String clusterLocalIdGt) {

        this.clusterLocalIdGt = clusterLocalIdGt;
        return this;
    }

    /**
     * Get clusterLocalIdGt
     *
     * @return clusterLocalIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdGt() {
        return clusterLocalIdGt;
    }

    public void setClusterLocalIdGt(String clusterLocalIdGt) {
        this.clusterLocalIdGt = clusterLocalIdGt;
    }

    public EcpLicenseWhereInput clusterLocalIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
        return this;
    }

    public void setClusterLocalIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
        }
    }

    public boolean getClusterLocalIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
    }

    public EcpLicenseWhereInput clusterLocalIdGte(String clusterLocalIdGte) {

        this.clusterLocalIdGte = clusterLocalIdGte;
        return this;
    }

    /**
     * Get clusterLocalIdGte
     *
     * @return clusterLocalIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdGte() {
        return clusterLocalIdGte;
    }

    public void setClusterLocalIdGte(String clusterLocalIdGte) {
        this.clusterLocalIdGte = clusterLocalIdGte;
    }

    public EcpLicenseWhereInput clusterLocalIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
        return this;
    }

    public void setClusterLocalIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
        }
    }

    public boolean getClusterLocalIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
    }

    public EcpLicenseWhereInput clusterLocalIdIn(List<String> clusterLocalIdIn) {

        this.clusterLocalIdIn = clusterLocalIdIn;
        return this;
    }

    public EcpLicenseWhereInput addClusterLocalIdInItem(String clusterLocalIdInItem) {
        if (this.clusterLocalIdIn == null) {
            this.clusterLocalIdIn = new ArrayList<String>();
        }
        this.clusterLocalIdIn.add(clusterLocalIdInItem);
        return this;
    }

    /**
     * Get clusterLocalIdIn
     *
     * @return clusterLocalIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getClusterLocalIdIn() {
        return clusterLocalIdIn;
    }

    public void setClusterLocalIdIn(List<String> clusterLocalIdIn) {
        this.clusterLocalIdIn = clusterLocalIdIn;
    }

    public EcpLicenseWhereInput clusterLocalIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
        return this;
    }

    public void setClusterLocalIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
        }
    }

    public boolean getClusterLocalIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
    }

    public EcpLicenseWhereInput clusterLocalIdLt(String clusterLocalIdLt) {

        this.clusterLocalIdLt = clusterLocalIdLt;
        return this;
    }

    /**
     * Get clusterLocalIdLt
     *
     * @return clusterLocalIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdLt() {
        return clusterLocalIdLt;
    }

    public void setClusterLocalIdLt(String clusterLocalIdLt) {
        this.clusterLocalIdLt = clusterLocalIdLt;
    }

    public EcpLicenseWhereInput clusterLocalIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
        return this;
    }

    public void setClusterLocalIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
        }
    }

    public boolean getClusterLocalIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
    }

    public EcpLicenseWhereInput clusterLocalIdLte(String clusterLocalIdLte) {

        this.clusterLocalIdLte = clusterLocalIdLte;
        return this;
    }

    /**
     * Get clusterLocalIdLte
     *
     * @return clusterLocalIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdLte() {
        return clusterLocalIdLte;
    }

    public void setClusterLocalIdLte(String clusterLocalIdLte) {
        this.clusterLocalIdLte = clusterLocalIdLte;
    }

    public EcpLicenseWhereInput clusterLocalIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
        return this;
    }

    public void setClusterLocalIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
        }
    }

    public boolean getClusterLocalIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
    }

    public EcpLicenseWhereInput clusterLocalIdNot(String clusterLocalIdNot) {

        this.clusterLocalIdNot = clusterLocalIdNot;
        return this;
    }

    /**
     * Get clusterLocalIdNot
     *
     * @return clusterLocalIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdNot() {
        return clusterLocalIdNot;
    }

    public void setClusterLocalIdNot(String clusterLocalIdNot) {
        this.clusterLocalIdNot = clusterLocalIdNot;
    }

    public EcpLicenseWhereInput clusterLocalIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
        return this;
    }

    public void setClusterLocalIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
        }
    }

    public boolean getClusterLocalIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
    }

    public EcpLicenseWhereInput clusterLocalIdNotContains(String clusterLocalIdNotContains) {

        this.clusterLocalIdNotContains = clusterLocalIdNotContains;
        return this;
    }

    /**
     * Get clusterLocalIdNotContains
     *
     * @return clusterLocalIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdNotContains() {
        return clusterLocalIdNotContains;
    }

    public void setClusterLocalIdNotContains(String clusterLocalIdNotContains) {
        this.clusterLocalIdNotContains = clusterLocalIdNotContains;
    }

    public EcpLicenseWhereInput clusterLocalIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public void setClusterLocalIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        }
    }

    public boolean getClusterLocalIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput clusterLocalIdNotEndsWith(String clusterLocalIdNotEndsWith) {

        this.clusterLocalIdNotEndsWith = clusterLocalIdNotEndsWith;
        return this;
    }

    /**
     * Get clusterLocalIdNotEndsWith
     *
     * @return clusterLocalIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdNotEndsWith() {
        return clusterLocalIdNotEndsWith;
    }

    public void setClusterLocalIdNotEndsWith(String clusterLocalIdNotEndsWith) {
        this.clusterLocalIdNotEndsWith = clusterLocalIdNotEndsWith;
    }

    public EcpLicenseWhereInput clusterLocalIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setClusterLocalIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getClusterLocalIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput clusterLocalIdNotIn(List<String> clusterLocalIdNotIn) {

        this.clusterLocalIdNotIn = clusterLocalIdNotIn;
        return this;
    }

    public EcpLicenseWhereInput addClusterLocalIdNotInItem(String clusterLocalIdNotInItem) {
        if (this.clusterLocalIdNotIn == null) {
            this.clusterLocalIdNotIn = new ArrayList<String>();
        }
        this.clusterLocalIdNotIn.add(clusterLocalIdNotInItem);
        return this;
    }

    /**
     * Get clusterLocalIdNotIn
     *
     * @return clusterLocalIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getClusterLocalIdNotIn() {
        return clusterLocalIdNotIn;
    }

    public void setClusterLocalIdNotIn(List<String> clusterLocalIdNotIn) {
        this.clusterLocalIdNotIn = clusterLocalIdNotIn;
    }

    public EcpLicenseWhereInput clusterLocalIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
        return this;
    }

    public void setClusterLocalIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
        }
    }

    public boolean getClusterLocalIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
    }

    public EcpLicenseWhereInput clusterLocalIdNotStartsWith(String clusterLocalIdNotStartsWith) {

        this.clusterLocalIdNotStartsWith = clusterLocalIdNotStartsWith;
        return this;
    }

    /**
     * Get clusterLocalIdNotStartsWith
     *
     * @return clusterLocalIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdNotStartsWith() {
        return clusterLocalIdNotStartsWith;
    }

    public void setClusterLocalIdNotStartsWith(String clusterLocalIdNotStartsWith) {
        this.clusterLocalIdNotStartsWith = clusterLocalIdNotStartsWith;
    }

    public EcpLicenseWhereInput clusterLocalIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setClusterLocalIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getClusterLocalIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput clusterLocalIdStartsWith(String clusterLocalIdStartsWith) {

        this.clusterLocalIdStartsWith = clusterLocalIdStartsWith;
        return this;
    }

    /**
     * Get clusterLocalIdStartsWith
     *
     * @return clusterLocalIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdStartsWith() {
        return clusterLocalIdStartsWith;
    }

    public void setClusterLocalIdStartsWith(String clusterLocalIdStartsWith) {
        this.clusterLocalIdStartsWith = clusterLocalIdStartsWith;
    }

    public EcpLicenseWhereInput clusterLocalIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public void setClusterLocalIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
        }
    }

    public boolean getClusterLocalIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
    }

    public EcpLicenseWhereInput dfw(String dfw) {

        this.dfw = dfw;
        return this;
    }

    /**
     * Get dfw
     *
     * @return dfw
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDfw() {
        return dfw;
    }

    public void setDfw(String dfw) {
        this.dfw = dfw;
    }

    public EcpLicenseWhereInput dfw_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DFW);
        return this;
    }

    public EcpLicenseWhereInput dfw_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DFW);
        return this;
    }

    public void setDfw_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DFW);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DFW);
        }
    }

    public boolean getDfw_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DFW);
    }

    public EcpLicenseWhereInput dfwContains(String dfwContains) {

        this.dfwContains = dfwContains;
        return this;
    }

    /**
     * Get dfwContains
     *
     * @return dfwContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDfwContains() {
        return dfwContains;
    }

    public void setDfwContains(String dfwContains) {
        this.dfwContains = dfwContains;
    }

    public EcpLicenseWhereInput dfwContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DFW_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput dfwContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DFW_CONTAINS);
        return this;
    }

    public void setDfwContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DFW_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DFW_CONTAINS);
        }
    }

    public boolean getDfwContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DFW_CONTAINS);
    }

    public EcpLicenseWhereInput dfwEndsWith(String dfwEndsWith) {

        this.dfwEndsWith = dfwEndsWith;
        return this;
    }

    /**
     * Get dfwEndsWith
     *
     * @return dfwEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDfwEndsWith() {
        return dfwEndsWith;
    }

    public void setDfwEndsWith(String dfwEndsWith) {
        this.dfwEndsWith = dfwEndsWith;
    }

    public EcpLicenseWhereInput dfwEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DFW_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput dfwEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DFW_ENDS_WITH);
        return this;
    }

    public void setDfwEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DFW_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DFW_ENDS_WITH);
        }
    }

    public boolean getDfwEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DFW_ENDS_WITH);
    }

    public EcpLicenseWhereInput dfwGt(String dfwGt) {

        this.dfwGt = dfwGt;
        return this;
    }

    /**
     * Get dfwGt
     *
     * @return dfwGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDfwGt() {
        return dfwGt;
    }

    public void setDfwGt(String dfwGt) {
        this.dfwGt = dfwGt;
    }

    public EcpLicenseWhereInput dfwGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DFW_GT);
        return this;
    }

    public EcpLicenseWhereInput dfwGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DFW_GT);
        return this;
    }

    public void setDfwGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DFW_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DFW_GT);
        }
    }

    public boolean getDfwGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DFW_GT);
    }

    public EcpLicenseWhereInput dfwGte(String dfwGte) {

        this.dfwGte = dfwGte;
        return this;
    }

    /**
     * Get dfwGte
     *
     * @return dfwGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDfwGte() {
        return dfwGte;
    }

    public void setDfwGte(String dfwGte) {
        this.dfwGte = dfwGte;
    }

    public EcpLicenseWhereInput dfwGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DFW_GTE);
        return this;
    }

    public EcpLicenseWhereInput dfwGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DFW_GTE);
        return this;
    }

    public void setDfwGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DFW_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DFW_GTE);
        }
    }

    public boolean getDfwGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DFW_GTE);
    }

    public EcpLicenseWhereInput dfwIn(List<String> dfwIn) {

        this.dfwIn = dfwIn;
        return this;
    }

    public EcpLicenseWhereInput addDfwInItem(String dfwInItem) {
        if (this.dfwIn == null) {
            this.dfwIn = new ArrayList<String>();
        }
        this.dfwIn.add(dfwInItem);
        return this;
    }

    /**
     * Get dfwIn
     *
     * @return dfwIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDfwIn() {
        return dfwIn;
    }

    public void setDfwIn(List<String> dfwIn) {
        this.dfwIn = dfwIn;
    }

    public EcpLicenseWhereInput dfwIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DFW_IN);
        return this;
    }

    public EcpLicenseWhereInput dfwIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DFW_IN);
        return this;
    }

    public void setDfwIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DFW_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DFW_IN);
        }
    }

    public boolean getDfwIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DFW_IN);
    }

    public EcpLicenseWhereInput dfwLt(String dfwLt) {

        this.dfwLt = dfwLt;
        return this;
    }

    /**
     * Get dfwLt
     *
     * @return dfwLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDfwLt() {
        return dfwLt;
    }

    public void setDfwLt(String dfwLt) {
        this.dfwLt = dfwLt;
    }

    public EcpLicenseWhereInput dfwLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DFW_LT);
        return this;
    }

    public EcpLicenseWhereInput dfwLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DFW_LT);
        return this;
    }

    public void setDfwLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DFW_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DFW_LT);
        }
    }

    public boolean getDfwLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DFW_LT);
    }

    public EcpLicenseWhereInput dfwLte(String dfwLte) {

        this.dfwLte = dfwLte;
        return this;
    }

    /**
     * Get dfwLte
     *
     * @return dfwLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDfwLte() {
        return dfwLte;
    }

    public void setDfwLte(String dfwLte) {
        this.dfwLte = dfwLte;
    }

    public EcpLicenseWhereInput dfwLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DFW_LTE);
        return this;
    }

    public EcpLicenseWhereInput dfwLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DFW_LTE);
        return this;
    }

    public void setDfwLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DFW_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DFW_LTE);
        }
    }

    public boolean getDfwLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DFW_LTE);
    }

    public EcpLicenseWhereInput dfwNot(String dfwNot) {

        this.dfwNot = dfwNot;
        return this;
    }

    /**
     * Get dfwNot
     *
     * @return dfwNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDfwNot() {
        return dfwNot;
    }

    public void setDfwNot(String dfwNot) {
        this.dfwNot = dfwNot;
    }

    public EcpLicenseWhereInput dfwNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DFW_NOT);
        return this;
    }

    public EcpLicenseWhereInput dfwNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DFW_NOT);
        return this;
    }

    public void setDfwNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DFW_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DFW_NOT);
        }
    }

    public boolean getDfwNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DFW_NOT);
    }

    public EcpLicenseWhereInput dfwNotContains(String dfwNotContains) {

        this.dfwNotContains = dfwNotContains;
        return this;
    }

    /**
     * Get dfwNotContains
     *
     * @return dfwNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDfwNotContains() {
        return dfwNotContains;
    }

    public void setDfwNotContains(String dfwNotContains) {
        this.dfwNotContains = dfwNotContains;
    }

    public EcpLicenseWhereInput dfwNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DFW_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput dfwNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DFW_NOT_CONTAINS);
        return this;
    }

    public void setDfwNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DFW_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DFW_NOT_CONTAINS);
        }
    }

    public boolean getDfwNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DFW_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput dfwNotEndsWith(String dfwNotEndsWith) {

        this.dfwNotEndsWith = dfwNotEndsWith;
        return this;
    }

    /**
     * Get dfwNotEndsWith
     *
     * @return dfwNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDfwNotEndsWith() {
        return dfwNotEndsWith;
    }

    public void setDfwNotEndsWith(String dfwNotEndsWith) {
        this.dfwNotEndsWith = dfwNotEndsWith;
    }

    public EcpLicenseWhereInput dfwNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DFW_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput dfwNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DFW_NOT_ENDS_WITH);
        return this;
    }

    public void setDfwNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DFW_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DFW_NOT_ENDS_WITH);
        }
    }

    public boolean getDfwNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DFW_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput dfwNotIn(List<String> dfwNotIn) {

        this.dfwNotIn = dfwNotIn;
        return this;
    }

    public EcpLicenseWhereInput addDfwNotInItem(String dfwNotInItem) {
        if (this.dfwNotIn == null) {
            this.dfwNotIn = new ArrayList<String>();
        }
        this.dfwNotIn.add(dfwNotInItem);
        return this;
    }

    /**
     * Get dfwNotIn
     *
     * @return dfwNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDfwNotIn() {
        return dfwNotIn;
    }

    public void setDfwNotIn(List<String> dfwNotIn) {
        this.dfwNotIn = dfwNotIn;
    }

    public EcpLicenseWhereInput dfwNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DFW_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput dfwNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DFW_NOT_IN);
        return this;
    }

    public void setDfwNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DFW_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DFW_NOT_IN);
        }
    }

    public boolean getDfwNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DFW_NOT_IN);
    }

    public EcpLicenseWhereInput dfwNotStartsWith(String dfwNotStartsWith) {

        this.dfwNotStartsWith = dfwNotStartsWith;
        return this;
    }

    /**
     * Get dfwNotStartsWith
     *
     * @return dfwNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDfwNotStartsWith() {
        return dfwNotStartsWith;
    }

    public void setDfwNotStartsWith(String dfwNotStartsWith) {
        this.dfwNotStartsWith = dfwNotStartsWith;
    }

    public EcpLicenseWhereInput dfwNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DFW_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput dfwNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DFW_NOT_STARTS_WITH);
        return this;
    }

    public void setDfwNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DFW_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DFW_NOT_STARTS_WITH);
        }
    }

    public boolean getDfwNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DFW_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput dfwStartsWith(String dfwStartsWith) {

        this.dfwStartsWith = dfwStartsWith;
        return this;
    }

    /**
     * Get dfwStartsWith
     *
     * @return dfwStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDfwStartsWith() {
        return dfwStartsWith;
    }

    public void setDfwStartsWith(String dfwStartsWith) {
        this.dfwStartsWith = dfwStartsWith;
    }

    public EcpLicenseWhereInput dfwStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DFW_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput dfwStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DFW_STARTS_WITH);
        return this;
    }

    public void setDfwStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DFW_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DFW_STARTS_WITH);
        }
    }

    public boolean getDfwStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DFW_STARTS_WITH);
    }

    public EcpLicenseWhereInput ecpEdition(EcpEdition ecpEdition) {

        this.ecpEdition = ecpEdition;
        return this;
    }

    /**
     * Get ecpEdition
     *
     * @return ecpEdition
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EcpEdition getEcpEdition() {
        return ecpEdition;
    }

    public void setEcpEdition(EcpEdition ecpEdition) {
        this.ecpEdition = ecpEdition;
    }

    public EcpLicenseWhereInput ecpEdition_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ECP_EDITION);
        return this;
    }

    public EcpLicenseWhereInput ecpEdition_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ECP_EDITION);
        return this;
    }

    public void setEcpEdition_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ECP_EDITION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ECP_EDITION);
        }
    }

    public boolean getEcpEdition_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ECP_EDITION);
    }

    public EcpLicenseWhereInput ecpEditionIn(List<EcpEdition> ecpEditionIn) {

        this.ecpEditionIn = ecpEditionIn;
        return this;
    }

    public EcpLicenseWhereInput addEcpEditionInItem(EcpEdition ecpEditionInItem) {
        if (this.ecpEditionIn == null) {
            this.ecpEditionIn = new ArrayList<EcpEdition>();
        }
        this.ecpEditionIn.add(ecpEditionInItem);
        return this;
    }

    /**
     * Get ecpEditionIn
     *
     * @return ecpEditionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EcpEdition> getEcpEditionIn() {
        return ecpEditionIn;
    }

    public void setEcpEditionIn(List<EcpEdition> ecpEditionIn) {
        this.ecpEditionIn = ecpEditionIn;
    }

    public EcpLicenseWhereInput ecpEditionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ECP_EDITION_IN);
        return this;
    }

    public EcpLicenseWhereInput ecpEditionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ECP_EDITION_IN);
        return this;
    }

    public void setEcpEditionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ECP_EDITION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ECP_EDITION_IN);
        }
    }

    public boolean getEcpEditionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ECP_EDITION_IN);
    }

    public EcpLicenseWhereInput ecpEditionNot(EcpEdition ecpEditionNot) {

        this.ecpEditionNot = ecpEditionNot;
        return this;
    }

    /**
     * Get ecpEditionNot
     *
     * @return ecpEditionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EcpEdition getEcpEditionNot() {
        return ecpEditionNot;
    }

    public void setEcpEditionNot(EcpEdition ecpEditionNot) {
        this.ecpEditionNot = ecpEditionNot;
    }

    public EcpLicenseWhereInput ecpEditionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ECP_EDITION_NOT);
        return this;
    }

    public EcpLicenseWhereInput ecpEditionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ECP_EDITION_NOT);
        return this;
    }

    public void setEcpEditionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ECP_EDITION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ECP_EDITION_NOT);
        }
    }

    public boolean getEcpEditionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ECP_EDITION_NOT);
    }

    public EcpLicenseWhereInput ecpEditionNotIn(List<EcpEdition> ecpEditionNotIn) {

        this.ecpEditionNotIn = ecpEditionNotIn;
        return this;
    }

    public EcpLicenseWhereInput addEcpEditionNotInItem(EcpEdition ecpEditionNotInItem) {
        if (this.ecpEditionNotIn == null) {
            this.ecpEditionNotIn = new ArrayList<EcpEdition>();
        }
        this.ecpEditionNotIn.add(ecpEditionNotInItem);
        return this;
    }

    /**
     * Get ecpEditionNotIn
     *
     * @return ecpEditionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EcpEdition> getEcpEditionNotIn() {
        return ecpEditionNotIn;
    }

    public void setEcpEditionNotIn(List<EcpEdition> ecpEditionNotIn) {
        this.ecpEditionNotIn = ecpEditionNotIn;
    }

    public EcpLicenseWhereInput ecpEditionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ECP_EDITION_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput ecpEditionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ECP_EDITION_NOT_IN);
        return this;
    }

    public void setEcpEditionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ECP_EDITION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ECP_EDITION_NOT_IN);
        }
    }

    public boolean getEcpEditionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ECP_EDITION_NOT_IN);
    }

    public EcpLicenseWhereInput expireDate(String expireDate) {

        this.expireDate = expireDate;
        return this;
    }

    /**
     * Get expireDate
     *
     * @return expireDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public EcpLicenseWhereInput expireDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE);
        return this;
    }

    public EcpLicenseWhereInput expireDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE);
        return this;
    }

    public void setExpireDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE);
        }
    }

    public boolean getExpireDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE);
    }

    public EcpLicenseWhereInput expireDateGt(String expireDateGt) {

        this.expireDateGt = expireDateGt;
        return this;
    }

    /**
     * Get expireDateGt
     *
     * @return expireDateGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExpireDateGt() {
        return expireDateGt;
    }

    public void setExpireDateGt(String expireDateGt) {
        this.expireDateGt = expireDateGt;
    }

    public EcpLicenseWhereInput expireDateGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_GT);
        return this;
    }

    public EcpLicenseWhereInput expireDateGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_GT);
        return this;
    }

    public void setExpireDateGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_GT);
        }
    }

    public boolean getExpireDateGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_GT);
    }

    public EcpLicenseWhereInput expireDateGte(String expireDateGte) {

        this.expireDateGte = expireDateGte;
        return this;
    }

    /**
     * Get expireDateGte
     *
     * @return expireDateGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExpireDateGte() {
        return expireDateGte;
    }

    public void setExpireDateGte(String expireDateGte) {
        this.expireDateGte = expireDateGte;
    }

    public EcpLicenseWhereInput expireDateGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_GTE);
        return this;
    }

    public EcpLicenseWhereInput expireDateGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_GTE);
        return this;
    }

    public void setExpireDateGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_GTE);
        }
    }

    public boolean getExpireDateGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_GTE);
    }

    public EcpLicenseWhereInput expireDateIn(List<String> expireDateIn) {

        this.expireDateIn = expireDateIn;
        return this;
    }

    public EcpLicenseWhereInput addExpireDateInItem(String expireDateInItem) {
        if (this.expireDateIn == null) {
            this.expireDateIn = new ArrayList<String>();
        }
        this.expireDateIn.add(expireDateInItem);
        return this;
    }

    /**
     * Get expireDateIn
     *
     * @return expireDateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getExpireDateIn() {
        return expireDateIn;
    }

    public void setExpireDateIn(List<String> expireDateIn) {
        this.expireDateIn = expireDateIn;
    }

    public EcpLicenseWhereInput expireDateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_IN);
        return this;
    }

    public EcpLicenseWhereInput expireDateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_IN);
        return this;
    }

    public void setExpireDateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_IN);
        }
    }

    public boolean getExpireDateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_IN);
    }

    public EcpLicenseWhereInput expireDateLt(String expireDateLt) {

        this.expireDateLt = expireDateLt;
        return this;
    }

    /**
     * Get expireDateLt
     *
     * @return expireDateLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExpireDateLt() {
        return expireDateLt;
    }

    public void setExpireDateLt(String expireDateLt) {
        this.expireDateLt = expireDateLt;
    }

    public EcpLicenseWhereInput expireDateLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_LT);
        return this;
    }

    public EcpLicenseWhereInput expireDateLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_LT);
        return this;
    }

    public void setExpireDateLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_LT);
        }
    }

    public boolean getExpireDateLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_LT);
    }

    public EcpLicenseWhereInput expireDateLte(String expireDateLte) {

        this.expireDateLte = expireDateLte;
        return this;
    }

    /**
     * Get expireDateLte
     *
     * @return expireDateLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExpireDateLte() {
        return expireDateLte;
    }

    public void setExpireDateLte(String expireDateLte) {
        this.expireDateLte = expireDateLte;
    }

    public EcpLicenseWhereInput expireDateLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_LTE);
        return this;
    }

    public EcpLicenseWhereInput expireDateLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_LTE);
        return this;
    }

    public void setExpireDateLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_LTE);
        }
    }

    public boolean getExpireDateLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_LTE);
    }

    public EcpLicenseWhereInput expireDateNot(String expireDateNot) {

        this.expireDateNot = expireDateNot;
        return this;
    }

    /**
     * Get expireDateNot
     *
     * @return expireDateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExpireDateNot() {
        return expireDateNot;
    }

    public void setExpireDateNot(String expireDateNot) {
        this.expireDateNot = expireDateNot;
    }

    public EcpLicenseWhereInput expireDateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_NOT);
        return this;
    }

    public EcpLicenseWhereInput expireDateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_NOT);
        return this;
    }

    public void setExpireDateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_NOT);
        }
    }

    public boolean getExpireDateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_NOT);
    }

    public EcpLicenseWhereInput expireDateNotIn(List<String> expireDateNotIn) {

        this.expireDateNotIn = expireDateNotIn;
        return this;
    }

    public EcpLicenseWhereInput addExpireDateNotInItem(String expireDateNotInItem) {
        if (this.expireDateNotIn == null) {
            this.expireDateNotIn = new ArrayList<String>();
        }
        this.expireDateNotIn.add(expireDateNotInItem);
        return this;
    }

    /**
     * Get expireDateNotIn
     *
     * @return expireDateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getExpireDateNotIn() {
        return expireDateNotIn;
    }

    public void setExpireDateNotIn(List<String> expireDateNotIn) {
        this.expireDateNotIn = expireDateNotIn;
    }

    public EcpLicenseWhereInput expireDateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput expireDateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_NOT_IN);
        return this;
    }

    public void setExpireDateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_NOT_IN);
        }
    }

    public boolean getExpireDateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_NOT_IN);
    }

    public EcpLicenseWhereInput externalStorage(Boolean externalStorage) {

        this.externalStorage = externalStorage;
        return this;
    }

    /**
     * Get externalStorage
     *
     * @return externalStorage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getExternalStorage() {
        return externalStorage;
    }

    public void setExternalStorage(Boolean externalStorage) {
        this.externalStorage = externalStorage;
    }

    public EcpLicenseWhereInput externalStorage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_STORAGE);
        return this;
    }

    public EcpLicenseWhereInput externalStorage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_STORAGE);
        return this;
    }

    public void setExternalStorage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_STORAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_STORAGE);
        }
    }

    public boolean getExternalStorage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_STORAGE);
    }

    public EcpLicenseWhereInput externalStorageNot(Boolean externalStorageNot) {

        this.externalStorageNot = externalStorageNot;
        return this;
    }

    /**
     * Get externalStorageNot
     *
     * @return externalStorageNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getExternalStorageNot() {
        return externalStorageNot;
    }

    public void setExternalStorageNot(Boolean externalStorageNot) {
        this.externalStorageNot = externalStorageNot;
    }

    public EcpLicenseWhereInput externalStorageNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_STORAGE_NOT);
        return this;
    }

    public EcpLicenseWhereInput externalStorageNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_STORAGE_NOT);
        return this;
    }

    public void setExternalStorageNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_STORAGE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_STORAGE_NOT);
        }
    }

    public boolean getExternalStorageNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_STORAGE_NOT);
    }

    public EcpLicenseWhereInput fileStorage(String fileStorage) {

        this.fileStorage = fileStorage;
        return this;
    }

    /**
     * Get fileStorage
     *
     * @return fileStorage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFileStorage() {
        return fileStorage;
    }

    public void setFileStorage(String fileStorage) {
        this.fileStorage = fileStorage;
    }

    public EcpLicenseWhereInput fileStorage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE);
        return this;
    }

    public EcpLicenseWhereInput fileStorage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE);
        return this;
    }

    public void setFileStorage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE);
        }
    }

    public boolean getFileStorage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE_STORAGE);
    }

    public EcpLicenseWhereInput fileStorageContains(String fileStorageContains) {

        this.fileStorageContains = fileStorageContains;
        return this;
    }

    /**
     * Get fileStorageContains
     *
     * @return fileStorageContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFileStorageContains() {
        return fileStorageContains;
    }

    public void setFileStorageContains(String fileStorageContains) {
        this.fileStorageContains = fileStorageContains;
    }

    public EcpLicenseWhereInput fileStorageContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput fileStorageContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_CONTAINS);
        return this;
    }

    public void setFileStorageContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_CONTAINS);
        }
    }

    public boolean getFileStorageContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE_STORAGE_CONTAINS);
    }

    public EcpLicenseWhereInput fileStorageEndsWith(String fileStorageEndsWith) {

        this.fileStorageEndsWith = fileStorageEndsWith;
        return this;
    }

    /**
     * Get fileStorageEndsWith
     *
     * @return fileStorageEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFileStorageEndsWith() {
        return fileStorageEndsWith;
    }

    public void setFileStorageEndsWith(String fileStorageEndsWith) {
        this.fileStorageEndsWith = fileStorageEndsWith;
    }

    public EcpLicenseWhereInput fileStorageEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput fileStorageEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_ENDS_WITH);
        return this;
    }

    public void setFileStorageEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_ENDS_WITH);
        }
    }

    public boolean getFileStorageEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE_STORAGE_ENDS_WITH);
    }

    public EcpLicenseWhereInput fileStorageGt(String fileStorageGt) {

        this.fileStorageGt = fileStorageGt;
        return this;
    }

    /**
     * Get fileStorageGt
     *
     * @return fileStorageGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFileStorageGt() {
        return fileStorageGt;
    }

    public void setFileStorageGt(String fileStorageGt) {
        this.fileStorageGt = fileStorageGt;
    }

    public EcpLicenseWhereInput fileStorageGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_GT);
        return this;
    }

    public EcpLicenseWhereInput fileStorageGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_GT);
        return this;
    }

    public void setFileStorageGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_GT);
        }
    }

    public boolean getFileStorageGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE_STORAGE_GT);
    }

    public EcpLicenseWhereInput fileStorageGte(String fileStorageGte) {

        this.fileStorageGte = fileStorageGte;
        return this;
    }

    /**
     * Get fileStorageGte
     *
     * @return fileStorageGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFileStorageGte() {
        return fileStorageGte;
    }

    public void setFileStorageGte(String fileStorageGte) {
        this.fileStorageGte = fileStorageGte;
    }

    public EcpLicenseWhereInput fileStorageGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_GTE);
        return this;
    }

    public EcpLicenseWhereInput fileStorageGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_GTE);
        return this;
    }

    public void setFileStorageGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_GTE);
        }
    }

    public boolean getFileStorageGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE_STORAGE_GTE);
    }

    public EcpLicenseWhereInput fileStorageIn(List<String> fileStorageIn) {

        this.fileStorageIn = fileStorageIn;
        return this;
    }

    public EcpLicenseWhereInput addFileStorageInItem(String fileStorageInItem) {
        if (this.fileStorageIn == null) {
            this.fileStorageIn = new ArrayList<String>();
        }
        this.fileStorageIn.add(fileStorageInItem);
        return this;
    }

    /**
     * Get fileStorageIn
     *
     * @return fileStorageIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getFileStorageIn() {
        return fileStorageIn;
    }

    public void setFileStorageIn(List<String> fileStorageIn) {
        this.fileStorageIn = fileStorageIn;
    }

    public EcpLicenseWhereInput fileStorageIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_IN);
        return this;
    }

    public EcpLicenseWhereInput fileStorageIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_IN);
        return this;
    }

    public void setFileStorageIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_IN);
        }
    }

    public boolean getFileStorageIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE_STORAGE_IN);
    }

    public EcpLicenseWhereInput fileStorageLt(String fileStorageLt) {

        this.fileStorageLt = fileStorageLt;
        return this;
    }

    /**
     * Get fileStorageLt
     *
     * @return fileStorageLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFileStorageLt() {
        return fileStorageLt;
    }

    public void setFileStorageLt(String fileStorageLt) {
        this.fileStorageLt = fileStorageLt;
    }

    public EcpLicenseWhereInput fileStorageLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_LT);
        return this;
    }

    public EcpLicenseWhereInput fileStorageLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_LT);
        return this;
    }

    public void setFileStorageLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_LT);
        }
    }

    public boolean getFileStorageLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE_STORAGE_LT);
    }

    public EcpLicenseWhereInput fileStorageLte(String fileStorageLte) {

        this.fileStorageLte = fileStorageLte;
        return this;
    }

    /**
     * Get fileStorageLte
     *
     * @return fileStorageLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFileStorageLte() {
        return fileStorageLte;
    }

    public void setFileStorageLte(String fileStorageLte) {
        this.fileStorageLte = fileStorageLte;
    }

    public EcpLicenseWhereInput fileStorageLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_LTE);
        return this;
    }

    public EcpLicenseWhereInput fileStorageLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_LTE);
        return this;
    }

    public void setFileStorageLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_LTE);
        }
    }

    public boolean getFileStorageLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE_STORAGE_LTE);
    }

    public EcpLicenseWhereInput fileStorageNot(String fileStorageNot) {

        this.fileStorageNot = fileStorageNot;
        return this;
    }

    /**
     * Get fileStorageNot
     *
     * @return fileStorageNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFileStorageNot() {
        return fileStorageNot;
    }

    public void setFileStorageNot(String fileStorageNot) {
        this.fileStorageNot = fileStorageNot;
    }

    public EcpLicenseWhereInput fileStorageNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_NOT);
        return this;
    }

    public EcpLicenseWhereInput fileStorageNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_NOT);
        return this;
    }

    public void setFileStorageNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_NOT);
        }
    }

    public boolean getFileStorageNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE_STORAGE_NOT);
    }

    public EcpLicenseWhereInput fileStorageNotContains(String fileStorageNotContains) {

        this.fileStorageNotContains = fileStorageNotContains;
        return this;
    }

    /**
     * Get fileStorageNotContains
     *
     * @return fileStorageNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFileStorageNotContains() {
        return fileStorageNotContains;
    }

    public void setFileStorageNotContains(String fileStorageNotContains) {
        this.fileStorageNotContains = fileStorageNotContains;
    }

    public EcpLicenseWhereInput fileStorageNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput fileStorageNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_NOT_CONTAINS);
        return this;
    }

    public void setFileStorageNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_NOT_CONTAINS);
        }
    }

    public boolean getFileStorageNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE_STORAGE_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput fileStorageNotEndsWith(String fileStorageNotEndsWith) {

        this.fileStorageNotEndsWith = fileStorageNotEndsWith;
        return this;
    }

    /**
     * Get fileStorageNotEndsWith
     *
     * @return fileStorageNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFileStorageNotEndsWith() {
        return fileStorageNotEndsWith;
    }

    public void setFileStorageNotEndsWith(String fileStorageNotEndsWith) {
        this.fileStorageNotEndsWith = fileStorageNotEndsWith;
    }

    public EcpLicenseWhereInput fileStorageNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput fileStorageNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_NOT_ENDS_WITH);
        return this;
    }

    public void setFileStorageNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_NOT_ENDS_WITH);
        }
    }

    public boolean getFileStorageNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE_STORAGE_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput fileStorageNotIn(List<String> fileStorageNotIn) {

        this.fileStorageNotIn = fileStorageNotIn;
        return this;
    }

    public EcpLicenseWhereInput addFileStorageNotInItem(String fileStorageNotInItem) {
        if (this.fileStorageNotIn == null) {
            this.fileStorageNotIn = new ArrayList<String>();
        }
        this.fileStorageNotIn.add(fileStorageNotInItem);
        return this;
    }

    /**
     * Get fileStorageNotIn
     *
     * @return fileStorageNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getFileStorageNotIn() {
        return fileStorageNotIn;
    }

    public void setFileStorageNotIn(List<String> fileStorageNotIn) {
        this.fileStorageNotIn = fileStorageNotIn;
    }

    public EcpLicenseWhereInput fileStorageNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput fileStorageNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_NOT_IN);
        return this;
    }

    public void setFileStorageNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_NOT_IN);
        }
    }

    public boolean getFileStorageNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE_STORAGE_NOT_IN);
    }

    public EcpLicenseWhereInput fileStorageNotStartsWith(String fileStorageNotStartsWith) {

        this.fileStorageNotStartsWith = fileStorageNotStartsWith;
        return this;
    }

    /**
     * Get fileStorageNotStartsWith
     *
     * @return fileStorageNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFileStorageNotStartsWith() {
        return fileStorageNotStartsWith;
    }

    public void setFileStorageNotStartsWith(String fileStorageNotStartsWith) {
        this.fileStorageNotStartsWith = fileStorageNotStartsWith;
    }

    public EcpLicenseWhereInput fileStorageNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput fileStorageNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_NOT_STARTS_WITH);
        return this;
    }

    public void setFileStorageNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_NOT_STARTS_WITH);
        }
    }

    public boolean getFileStorageNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE_STORAGE_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput fileStorageStartsWith(String fileStorageStartsWith) {

        this.fileStorageStartsWith = fileStorageStartsWith;
        return this;
    }

    /**
     * Get fileStorageStartsWith
     *
     * @return fileStorageStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFileStorageStartsWith() {
        return fileStorageStartsWith;
    }

    public void setFileStorageStartsWith(String fileStorageStartsWith) {
        this.fileStorageStartsWith = fileStorageStartsWith;
    }

    public EcpLicenseWhereInput fileStorageStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput fileStorageStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_STARTS_WITH);
        return this;
    }

    public void setFileStorageStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE_STORAGE_STARTS_WITH);
        }
    }

    public boolean getFileStorageStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE_STORAGE_STARTS_WITH);
    }

    public EcpLicenseWhereInput hasMetrox(Boolean hasMetrox) {

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

    public EcpLicenseWhereInput hasMetrox_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HAS_METROX);
        return this;
    }

    public EcpLicenseWhereInput hasMetrox_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput hasMetroxNot(Boolean hasMetroxNot) {

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

    public EcpLicenseWhereInput hasMetroxNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HAS_METROX_NOT);
        return this;
    }

    public EcpLicenseWhereInput hasMetroxNot_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput hasRemoteBackup(Boolean hasRemoteBackup) {

        this.hasRemoteBackup = hasRemoteBackup;
        return this;
    }

    /**
     * Get hasRemoteBackup
     *
     * @return hasRemoteBackup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getHasRemoteBackup() {
        return hasRemoteBackup;
    }

    public void setHasRemoteBackup(Boolean hasRemoteBackup) {
        this.hasRemoteBackup = hasRemoteBackup;
    }

    public EcpLicenseWhereInput hasRemoteBackup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HAS_REMOTE_BACKUP);
        return this;
    }

    public EcpLicenseWhereInput hasRemoteBackup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HAS_REMOTE_BACKUP);
        return this;
    }

    public void setHasRemoteBackup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HAS_REMOTE_BACKUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HAS_REMOTE_BACKUP);
        }
    }

    public boolean getHasRemoteBackup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HAS_REMOTE_BACKUP);
    }

    public EcpLicenseWhereInput hasRemoteBackupNot(Boolean hasRemoteBackupNot) {

        this.hasRemoteBackupNot = hasRemoteBackupNot;
        return this;
    }

    /**
     * Get hasRemoteBackupNot
     *
     * @return hasRemoteBackupNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getHasRemoteBackupNot() {
        return hasRemoteBackupNot;
    }

    public void setHasRemoteBackupNot(Boolean hasRemoteBackupNot) {
        this.hasRemoteBackupNot = hasRemoteBackupNot;
    }

    public EcpLicenseWhereInput hasRemoteBackupNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HAS_REMOTE_BACKUP_NOT);
        return this;
    }

    public EcpLicenseWhereInput hasRemoteBackupNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HAS_REMOTE_BACKUP_NOT);
        return this;
    }

    public void setHasRemoteBackupNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HAS_REMOTE_BACKUP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HAS_REMOTE_BACKUP_NOT);
        }
    }

    public boolean getHasRemoteBackupNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HAS_REMOTE_BACKUP_NOT);
    }

    public EcpLicenseWhereInput id(String id) {

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

    public EcpLicenseWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public EcpLicenseWhereInput id_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idContains(String idContains) {

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

    public EcpLicenseWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput idContains_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idEndsWith(String idEndsWith) {

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

    public EcpLicenseWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput idEndsWith_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idGt(String idGt) {

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

    public EcpLicenseWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public EcpLicenseWhereInput idGt_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idGte(String idGte) {

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

    public EcpLicenseWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public EcpLicenseWhereInput idGte_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public EcpLicenseWhereInput addIdInItem(String idInItem) {
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

    public EcpLicenseWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public EcpLicenseWhereInput idIn_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idLt(String idLt) {

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

    public EcpLicenseWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public EcpLicenseWhereInput idLt_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idLte(String idLte) {

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

    public EcpLicenseWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public EcpLicenseWhereInput idLte_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idNot(String idNot) {

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

    public EcpLicenseWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public EcpLicenseWhereInput idNot_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idNotContains(String idNotContains) {

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

    public EcpLicenseWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput idNotContains_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public EcpLicenseWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public EcpLicenseWhereInput addIdNotInItem(String idNotInItem) {
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

    public EcpLicenseWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput idNotIn_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public EcpLicenseWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idStartsWith(String idStartsWith) {

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

    public EcpLicenseWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput idStartsWith_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput k8sBareMetal(String k8sBareMetal) {

        this.k8sBareMetal = k8sBareMetal;
        return this;
    }

    /**
     * Get k8sBareMetal
     *
     * @return k8sBareMetal
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sBareMetal() {
        return k8sBareMetal;
    }

    public void setK8sBareMetal(String k8sBareMetal) {
        this.k8sBareMetal = k8sBareMetal;
    }

    public EcpLicenseWhereInput k8sBareMetal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL);
        return this;
    }

    public EcpLicenseWhereInput k8sBareMetal_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL);
        return this;
    }

    public void setK8sBareMetal_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL);
        }
    }

    public boolean getK8sBareMetal_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_BARE_METAL);
    }

    public EcpLicenseWhereInput k8sBareMetalContains(String k8sBareMetalContains) {

        this.k8sBareMetalContains = k8sBareMetalContains;
        return this;
    }

    /**
     * Get k8sBareMetalContains
     *
     * @return k8sBareMetalContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sBareMetalContains() {
        return k8sBareMetalContains;
    }

    public void setK8sBareMetalContains(String k8sBareMetalContains) {
        this.k8sBareMetalContains = k8sBareMetalContains;
    }

    public EcpLicenseWhereInput k8sBareMetalContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput k8sBareMetalContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_CONTAINS);
        return this;
    }

    public void setK8sBareMetalContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_CONTAINS);
        }
    }

    public boolean getK8sBareMetalContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_BARE_METAL_CONTAINS);
    }

    public EcpLicenseWhereInput k8sBareMetalEndsWith(String k8sBareMetalEndsWith) {

        this.k8sBareMetalEndsWith = k8sBareMetalEndsWith;
        return this;
    }

    /**
     * Get k8sBareMetalEndsWith
     *
     * @return k8sBareMetalEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sBareMetalEndsWith() {
        return k8sBareMetalEndsWith;
    }

    public void setK8sBareMetalEndsWith(String k8sBareMetalEndsWith) {
        this.k8sBareMetalEndsWith = k8sBareMetalEndsWith;
    }

    public EcpLicenseWhereInput k8sBareMetalEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput k8sBareMetalEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_ENDS_WITH);
        return this;
    }

    public void setK8sBareMetalEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_ENDS_WITH);
        }
    }

    public boolean getK8sBareMetalEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_BARE_METAL_ENDS_WITH);
    }

    public EcpLicenseWhereInput k8sBareMetalGt(String k8sBareMetalGt) {

        this.k8sBareMetalGt = k8sBareMetalGt;
        return this;
    }

    /**
     * Get k8sBareMetalGt
     *
     * @return k8sBareMetalGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sBareMetalGt() {
        return k8sBareMetalGt;
    }

    public void setK8sBareMetalGt(String k8sBareMetalGt) {
        this.k8sBareMetalGt = k8sBareMetalGt;
    }

    public EcpLicenseWhereInput k8sBareMetalGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_GT);
        return this;
    }

    public EcpLicenseWhereInput k8sBareMetalGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_GT);
        return this;
    }

    public void setK8sBareMetalGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_GT);
        }
    }

    public boolean getK8sBareMetalGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_BARE_METAL_GT);
    }

    public EcpLicenseWhereInput k8sBareMetalGte(String k8sBareMetalGte) {

        this.k8sBareMetalGte = k8sBareMetalGte;
        return this;
    }

    /**
     * Get k8sBareMetalGte
     *
     * @return k8sBareMetalGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sBareMetalGte() {
        return k8sBareMetalGte;
    }

    public void setK8sBareMetalGte(String k8sBareMetalGte) {
        this.k8sBareMetalGte = k8sBareMetalGte;
    }

    public EcpLicenseWhereInput k8sBareMetalGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_GTE);
        return this;
    }

    public EcpLicenseWhereInput k8sBareMetalGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_GTE);
        return this;
    }

    public void setK8sBareMetalGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_GTE);
        }
    }

    public boolean getK8sBareMetalGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_BARE_METAL_GTE);
    }

    public EcpLicenseWhereInput k8sBareMetalIn(List<String> k8sBareMetalIn) {

        this.k8sBareMetalIn = k8sBareMetalIn;
        return this;
    }

    public EcpLicenseWhereInput addK8sBareMetalInItem(String k8sBareMetalInItem) {
        if (this.k8sBareMetalIn == null) {
            this.k8sBareMetalIn = new ArrayList<String>();
        }
        this.k8sBareMetalIn.add(k8sBareMetalInItem);
        return this;
    }

    /**
     * Get k8sBareMetalIn
     *
     * @return k8sBareMetalIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getK8sBareMetalIn() {
        return k8sBareMetalIn;
    }

    public void setK8sBareMetalIn(List<String> k8sBareMetalIn) {
        this.k8sBareMetalIn = k8sBareMetalIn;
    }

    public EcpLicenseWhereInput k8sBareMetalIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_IN);
        return this;
    }

    public EcpLicenseWhereInput k8sBareMetalIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_IN);
        return this;
    }

    public void setK8sBareMetalIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_IN);
        }
    }

    public boolean getK8sBareMetalIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_BARE_METAL_IN);
    }

    public EcpLicenseWhereInput k8sBareMetalLt(String k8sBareMetalLt) {

        this.k8sBareMetalLt = k8sBareMetalLt;
        return this;
    }

    /**
     * Get k8sBareMetalLt
     *
     * @return k8sBareMetalLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sBareMetalLt() {
        return k8sBareMetalLt;
    }

    public void setK8sBareMetalLt(String k8sBareMetalLt) {
        this.k8sBareMetalLt = k8sBareMetalLt;
    }

    public EcpLicenseWhereInput k8sBareMetalLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_LT);
        return this;
    }

    public EcpLicenseWhereInput k8sBareMetalLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_LT);
        return this;
    }

    public void setK8sBareMetalLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_LT);
        }
    }

    public boolean getK8sBareMetalLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_BARE_METAL_LT);
    }

    public EcpLicenseWhereInput k8sBareMetalLte(String k8sBareMetalLte) {

        this.k8sBareMetalLte = k8sBareMetalLte;
        return this;
    }

    /**
     * Get k8sBareMetalLte
     *
     * @return k8sBareMetalLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sBareMetalLte() {
        return k8sBareMetalLte;
    }

    public void setK8sBareMetalLte(String k8sBareMetalLte) {
        this.k8sBareMetalLte = k8sBareMetalLte;
    }

    public EcpLicenseWhereInput k8sBareMetalLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_LTE);
        return this;
    }

    public EcpLicenseWhereInput k8sBareMetalLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_LTE);
        return this;
    }

    public void setK8sBareMetalLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_LTE);
        }
    }

    public boolean getK8sBareMetalLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_BARE_METAL_LTE);
    }

    public EcpLicenseWhereInput k8sBareMetalNot(String k8sBareMetalNot) {

        this.k8sBareMetalNot = k8sBareMetalNot;
        return this;
    }

    /**
     * Get k8sBareMetalNot
     *
     * @return k8sBareMetalNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sBareMetalNot() {
        return k8sBareMetalNot;
    }

    public void setK8sBareMetalNot(String k8sBareMetalNot) {
        this.k8sBareMetalNot = k8sBareMetalNot;
    }

    public EcpLicenseWhereInput k8sBareMetalNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_NOT);
        return this;
    }

    public EcpLicenseWhereInput k8sBareMetalNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_NOT);
        return this;
    }

    public void setK8sBareMetalNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_NOT);
        }
    }

    public boolean getK8sBareMetalNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_BARE_METAL_NOT);
    }

    public EcpLicenseWhereInput k8sBareMetalNotContains(String k8sBareMetalNotContains) {

        this.k8sBareMetalNotContains = k8sBareMetalNotContains;
        return this;
    }

    /**
     * Get k8sBareMetalNotContains
     *
     * @return k8sBareMetalNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sBareMetalNotContains() {
        return k8sBareMetalNotContains;
    }

    public void setK8sBareMetalNotContains(String k8sBareMetalNotContains) {
        this.k8sBareMetalNotContains = k8sBareMetalNotContains;
    }

    public EcpLicenseWhereInput k8sBareMetalNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput k8sBareMetalNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_NOT_CONTAINS);
        return this;
    }

    public void setK8sBareMetalNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_NOT_CONTAINS);
        }
    }

    public boolean getK8sBareMetalNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_BARE_METAL_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput k8sBareMetalNotEndsWith(String k8sBareMetalNotEndsWith) {

        this.k8sBareMetalNotEndsWith = k8sBareMetalNotEndsWith;
        return this;
    }

    /**
     * Get k8sBareMetalNotEndsWith
     *
     * @return k8sBareMetalNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sBareMetalNotEndsWith() {
        return k8sBareMetalNotEndsWith;
    }

    public void setK8sBareMetalNotEndsWith(String k8sBareMetalNotEndsWith) {
        this.k8sBareMetalNotEndsWith = k8sBareMetalNotEndsWith;
    }

    public EcpLicenseWhereInput k8sBareMetalNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput k8sBareMetalNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_NOT_ENDS_WITH);
        return this;
    }

    public void setK8sBareMetalNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_NOT_ENDS_WITH);
        }
    }

    public boolean getK8sBareMetalNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_BARE_METAL_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput k8sBareMetalNotIn(List<String> k8sBareMetalNotIn) {

        this.k8sBareMetalNotIn = k8sBareMetalNotIn;
        return this;
    }

    public EcpLicenseWhereInput addK8sBareMetalNotInItem(String k8sBareMetalNotInItem) {
        if (this.k8sBareMetalNotIn == null) {
            this.k8sBareMetalNotIn = new ArrayList<String>();
        }
        this.k8sBareMetalNotIn.add(k8sBareMetalNotInItem);
        return this;
    }

    /**
     * Get k8sBareMetalNotIn
     *
     * @return k8sBareMetalNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getK8sBareMetalNotIn() {
        return k8sBareMetalNotIn;
    }

    public void setK8sBareMetalNotIn(List<String> k8sBareMetalNotIn) {
        this.k8sBareMetalNotIn = k8sBareMetalNotIn;
    }

    public EcpLicenseWhereInput k8sBareMetalNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput k8sBareMetalNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_NOT_IN);
        return this;
    }

    public void setK8sBareMetalNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_NOT_IN);
        }
    }

    public boolean getK8sBareMetalNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_BARE_METAL_NOT_IN);
    }

    public EcpLicenseWhereInput k8sBareMetalNotStartsWith(String k8sBareMetalNotStartsWith) {

        this.k8sBareMetalNotStartsWith = k8sBareMetalNotStartsWith;
        return this;
    }

    /**
     * Get k8sBareMetalNotStartsWith
     *
     * @return k8sBareMetalNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sBareMetalNotStartsWith() {
        return k8sBareMetalNotStartsWith;
    }

    public void setK8sBareMetalNotStartsWith(String k8sBareMetalNotStartsWith) {
        this.k8sBareMetalNotStartsWith = k8sBareMetalNotStartsWith;
    }

    public EcpLicenseWhereInput k8sBareMetalNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput k8sBareMetalNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_NOT_STARTS_WITH);
        return this;
    }

    public void setK8sBareMetalNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_NOT_STARTS_WITH);
        }
    }

    public boolean getK8sBareMetalNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_BARE_METAL_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput k8sBareMetalStartsWith(String k8sBareMetalStartsWith) {

        this.k8sBareMetalStartsWith = k8sBareMetalStartsWith;
        return this;
    }

    /**
     * Get k8sBareMetalStartsWith
     *
     * @return k8sBareMetalStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sBareMetalStartsWith() {
        return k8sBareMetalStartsWith;
    }

    public void setK8sBareMetalStartsWith(String k8sBareMetalStartsWith) {
        this.k8sBareMetalStartsWith = k8sBareMetalStartsWith;
    }

    public EcpLicenseWhereInput k8sBareMetalStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput k8sBareMetalStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_STARTS_WITH);
        return this;
    }

    public void setK8sBareMetalStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_BARE_METAL_STARTS_WITH);
        }
    }

    public boolean getK8sBareMetalStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_BARE_METAL_STARTS_WITH);
    }

    public EcpLicenseWhereInput k8sService(String k8sService) {

        this.k8sService = k8sService;
        return this;
    }

    /**
     * Get k8sService
     *
     * @return k8sService
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sService() {
        return k8sService;
    }

    public void setK8sService(String k8sService) {
        this.k8sService = k8sService;
    }

    public EcpLicenseWhereInput k8sService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE);
        return this;
    }

    public EcpLicenseWhereInput k8sService_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE);
        return this;
    }

    public void setK8sService_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE);
        }
    }

    public boolean getK8sService_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_SERVICE);
    }

    public EcpLicenseWhereInput k8sServiceContains(String k8sServiceContains) {

        this.k8sServiceContains = k8sServiceContains;
        return this;
    }

    /**
     * Get k8sServiceContains
     *
     * @return k8sServiceContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sServiceContains() {
        return k8sServiceContains;
    }

    public void setK8sServiceContains(String k8sServiceContains) {
        this.k8sServiceContains = k8sServiceContains;
    }

    public EcpLicenseWhereInput k8sServiceContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput k8sServiceContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_CONTAINS);
        return this;
    }

    public void setK8sServiceContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_CONTAINS);
        }
    }

    public boolean getK8sServiceContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_SERVICE_CONTAINS);
    }

    public EcpLicenseWhereInput k8sServiceEndsWith(String k8sServiceEndsWith) {

        this.k8sServiceEndsWith = k8sServiceEndsWith;
        return this;
    }

    /**
     * Get k8sServiceEndsWith
     *
     * @return k8sServiceEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sServiceEndsWith() {
        return k8sServiceEndsWith;
    }

    public void setK8sServiceEndsWith(String k8sServiceEndsWith) {
        this.k8sServiceEndsWith = k8sServiceEndsWith;
    }

    public EcpLicenseWhereInput k8sServiceEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput k8sServiceEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_ENDS_WITH);
        return this;
    }

    public void setK8sServiceEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_ENDS_WITH);
        }
    }

    public boolean getK8sServiceEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_SERVICE_ENDS_WITH);
    }

    public EcpLicenseWhereInput k8sServiceGt(String k8sServiceGt) {

        this.k8sServiceGt = k8sServiceGt;
        return this;
    }

    /**
     * Get k8sServiceGt
     *
     * @return k8sServiceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sServiceGt() {
        return k8sServiceGt;
    }

    public void setK8sServiceGt(String k8sServiceGt) {
        this.k8sServiceGt = k8sServiceGt;
    }

    public EcpLicenseWhereInput k8sServiceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_GT);
        return this;
    }

    public EcpLicenseWhereInput k8sServiceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_GT);
        return this;
    }

    public void setK8sServiceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_GT);
        }
    }

    public boolean getK8sServiceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_SERVICE_GT);
    }

    public EcpLicenseWhereInput k8sServiceGte(String k8sServiceGte) {

        this.k8sServiceGte = k8sServiceGte;
        return this;
    }

    /**
     * Get k8sServiceGte
     *
     * @return k8sServiceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sServiceGte() {
        return k8sServiceGte;
    }

    public void setK8sServiceGte(String k8sServiceGte) {
        this.k8sServiceGte = k8sServiceGte;
    }

    public EcpLicenseWhereInput k8sServiceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_GTE);
        return this;
    }

    public EcpLicenseWhereInput k8sServiceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_GTE);
        return this;
    }

    public void setK8sServiceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_GTE);
        }
    }

    public boolean getK8sServiceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_SERVICE_GTE);
    }

    public EcpLicenseWhereInput k8sServiceIn(List<String> k8sServiceIn) {

        this.k8sServiceIn = k8sServiceIn;
        return this;
    }

    public EcpLicenseWhereInput addK8sServiceInItem(String k8sServiceInItem) {
        if (this.k8sServiceIn == null) {
            this.k8sServiceIn = new ArrayList<String>();
        }
        this.k8sServiceIn.add(k8sServiceInItem);
        return this;
    }

    /**
     * Get k8sServiceIn
     *
     * @return k8sServiceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getK8sServiceIn() {
        return k8sServiceIn;
    }

    public void setK8sServiceIn(List<String> k8sServiceIn) {
        this.k8sServiceIn = k8sServiceIn;
    }

    public EcpLicenseWhereInput k8sServiceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_IN);
        return this;
    }

    public EcpLicenseWhereInput k8sServiceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_IN);
        return this;
    }

    public void setK8sServiceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_IN);
        }
    }

    public boolean getK8sServiceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_SERVICE_IN);
    }

    public EcpLicenseWhereInput k8sServiceLt(String k8sServiceLt) {

        this.k8sServiceLt = k8sServiceLt;
        return this;
    }

    /**
     * Get k8sServiceLt
     *
     * @return k8sServiceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sServiceLt() {
        return k8sServiceLt;
    }

    public void setK8sServiceLt(String k8sServiceLt) {
        this.k8sServiceLt = k8sServiceLt;
    }

    public EcpLicenseWhereInput k8sServiceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_LT);
        return this;
    }

    public EcpLicenseWhereInput k8sServiceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_LT);
        return this;
    }

    public void setK8sServiceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_LT);
        }
    }

    public boolean getK8sServiceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_SERVICE_LT);
    }

    public EcpLicenseWhereInput k8sServiceLte(String k8sServiceLte) {

        this.k8sServiceLte = k8sServiceLte;
        return this;
    }

    /**
     * Get k8sServiceLte
     *
     * @return k8sServiceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sServiceLte() {
        return k8sServiceLte;
    }

    public void setK8sServiceLte(String k8sServiceLte) {
        this.k8sServiceLte = k8sServiceLte;
    }

    public EcpLicenseWhereInput k8sServiceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_LTE);
        return this;
    }

    public EcpLicenseWhereInput k8sServiceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_LTE);
        return this;
    }

    public void setK8sServiceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_LTE);
        }
    }

    public boolean getK8sServiceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_SERVICE_LTE);
    }

    public EcpLicenseWhereInput k8sServiceNot(String k8sServiceNot) {

        this.k8sServiceNot = k8sServiceNot;
        return this;
    }

    /**
     * Get k8sServiceNot
     *
     * @return k8sServiceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sServiceNot() {
        return k8sServiceNot;
    }

    public void setK8sServiceNot(String k8sServiceNot) {
        this.k8sServiceNot = k8sServiceNot;
    }

    public EcpLicenseWhereInput k8sServiceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_NOT);
        return this;
    }

    public EcpLicenseWhereInput k8sServiceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_NOT);
        return this;
    }

    public void setK8sServiceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_NOT);
        }
    }

    public boolean getK8sServiceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_SERVICE_NOT);
    }

    public EcpLicenseWhereInput k8sServiceNotContains(String k8sServiceNotContains) {

        this.k8sServiceNotContains = k8sServiceNotContains;
        return this;
    }

    /**
     * Get k8sServiceNotContains
     *
     * @return k8sServiceNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sServiceNotContains() {
        return k8sServiceNotContains;
    }

    public void setK8sServiceNotContains(String k8sServiceNotContains) {
        this.k8sServiceNotContains = k8sServiceNotContains;
    }

    public EcpLicenseWhereInput k8sServiceNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput k8sServiceNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_NOT_CONTAINS);
        return this;
    }

    public void setK8sServiceNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_NOT_CONTAINS);
        }
    }

    public boolean getK8sServiceNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_SERVICE_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput k8sServiceNotEndsWith(String k8sServiceNotEndsWith) {

        this.k8sServiceNotEndsWith = k8sServiceNotEndsWith;
        return this;
    }

    /**
     * Get k8sServiceNotEndsWith
     *
     * @return k8sServiceNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sServiceNotEndsWith() {
        return k8sServiceNotEndsWith;
    }

    public void setK8sServiceNotEndsWith(String k8sServiceNotEndsWith) {
        this.k8sServiceNotEndsWith = k8sServiceNotEndsWith;
    }

    public EcpLicenseWhereInput k8sServiceNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput k8sServiceNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_NOT_ENDS_WITH);
        return this;
    }

    public void setK8sServiceNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_NOT_ENDS_WITH);
        }
    }

    public boolean getK8sServiceNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_SERVICE_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput k8sServiceNotIn(List<String> k8sServiceNotIn) {

        this.k8sServiceNotIn = k8sServiceNotIn;
        return this;
    }

    public EcpLicenseWhereInput addK8sServiceNotInItem(String k8sServiceNotInItem) {
        if (this.k8sServiceNotIn == null) {
            this.k8sServiceNotIn = new ArrayList<String>();
        }
        this.k8sServiceNotIn.add(k8sServiceNotInItem);
        return this;
    }

    /**
     * Get k8sServiceNotIn
     *
     * @return k8sServiceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getK8sServiceNotIn() {
        return k8sServiceNotIn;
    }

    public void setK8sServiceNotIn(List<String> k8sServiceNotIn) {
        this.k8sServiceNotIn = k8sServiceNotIn;
    }

    public EcpLicenseWhereInput k8sServiceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput k8sServiceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_NOT_IN);
        return this;
    }

    public void setK8sServiceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_NOT_IN);
        }
    }

    public boolean getK8sServiceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_SERVICE_NOT_IN);
    }

    public EcpLicenseWhereInput k8sServiceNotStartsWith(String k8sServiceNotStartsWith) {

        this.k8sServiceNotStartsWith = k8sServiceNotStartsWith;
        return this;
    }

    /**
     * Get k8sServiceNotStartsWith
     *
     * @return k8sServiceNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sServiceNotStartsWith() {
        return k8sServiceNotStartsWith;
    }

    public void setK8sServiceNotStartsWith(String k8sServiceNotStartsWith) {
        this.k8sServiceNotStartsWith = k8sServiceNotStartsWith;
    }

    public EcpLicenseWhereInput k8sServiceNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput k8sServiceNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_NOT_STARTS_WITH);
        return this;
    }

    public void setK8sServiceNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_NOT_STARTS_WITH);
        }
    }

    public boolean getK8sServiceNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_SERVICE_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput k8sServiceStartsWith(String k8sServiceStartsWith) {

        this.k8sServiceStartsWith = k8sServiceStartsWith;
        return this;
    }

    /**
     * Get k8sServiceStartsWith
     *
     * @return k8sServiceStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getK8sServiceStartsWith() {
        return k8sServiceStartsWith;
    }

    public void setK8sServiceStartsWith(String k8sServiceStartsWith) {
        this.k8sServiceStartsWith = k8sServiceStartsWith;
    }

    public EcpLicenseWhereInput k8sServiceStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput k8sServiceStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_STARTS_WITH);
        return this;
    }

    public void setK8sServiceStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K8S_SERVICE_STARTS_WITH);
        }
    }

    public boolean getK8sServiceStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K8S_SERVICE_STARTS_WITH);
    }

    public EcpLicenseWhereInput lb(String lb) {

        this.lb = lb;
        return this;
    }

    /**
     * Get lb
     *
     * @return lb
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLb() {
        return lb;
    }

    public void setLb(String lb) {
        this.lb = lb;
    }

    public EcpLicenseWhereInput lb_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LB);
        return this;
    }

    public EcpLicenseWhereInput lb_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LB);
        return this;
    }

    public void setLb_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LB);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LB);
        }
    }

    public boolean getLb_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LB);
    }

    public EcpLicenseWhereInput lbContains(String lbContains) {

        this.lbContains = lbContains;
        return this;
    }

    /**
     * Get lbContains
     *
     * @return lbContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLbContains() {
        return lbContains;
    }

    public void setLbContains(String lbContains) {
        this.lbContains = lbContains;
    }

    public EcpLicenseWhereInput lbContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LB_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput lbContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LB_CONTAINS);
        return this;
    }

    public void setLbContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LB_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LB_CONTAINS);
        }
    }

    public boolean getLbContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LB_CONTAINS);
    }

    public EcpLicenseWhereInput lbEndsWith(String lbEndsWith) {

        this.lbEndsWith = lbEndsWith;
        return this;
    }

    /**
     * Get lbEndsWith
     *
     * @return lbEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLbEndsWith() {
        return lbEndsWith;
    }

    public void setLbEndsWith(String lbEndsWith) {
        this.lbEndsWith = lbEndsWith;
    }

    public EcpLicenseWhereInput lbEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LB_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput lbEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LB_ENDS_WITH);
        return this;
    }

    public void setLbEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LB_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LB_ENDS_WITH);
        }
    }

    public boolean getLbEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LB_ENDS_WITH);
    }

    public EcpLicenseWhereInput lbGt(String lbGt) {

        this.lbGt = lbGt;
        return this;
    }

    /**
     * Get lbGt
     *
     * @return lbGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLbGt() {
        return lbGt;
    }

    public void setLbGt(String lbGt) {
        this.lbGt = lbGt;
    }

    public EcpLicenseWhereInput lbGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LB_GT);
        return this;
    }

    public EcpLicenseWhereInput lbGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LB_GT);
        return this;
    }

    public void setLbGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LB_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LB_GT);
        }
    }

    public boolean getLbGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LB_GT);
    }

    public EcpLicenseWhereInput lbGte(String lbGte) {

        this.lbGte = lbGte;
        return this;
    }

    /**
     * Get lbGte
     *
     * @return lbGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLbGte() {
        return lbGte;
    }

    public void setLbGte(String lbGte) {
        this.lbGte = lbGte;
    }

    public EcpLicenseWhereInput lbGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LB_GTE);
        return this;
    }

    public EcpLicenseWhereInput lbGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LB_GTE);
        return this;
    }

    public void setLbGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LB_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LB_GTE);
        }
    }

    public boolean getLbGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LB_GTE);
    }

    public EcpLicenseWhereInput lbIn(List<String> lbIn) {

        this.lbIn = lbIn;
        return this;
    }

    public EcpLicenseWhereInput addLbInItem(String lbInItem) {
        if (this.lbIn == null) {
            this.lbIn = new ArrayList<String>();
        }
        this.lbIn.add(lbInItem);
        return this;
    }

    /**
     * Get lbIn
     *
     * @return lbIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLbIn() {
        return lbIn;
    }

    public void setLbIn(List<String> lbIn) {
        this.lbIn = lbIn;
    }

    public EcpLicenseWhereInput lbIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LB_IN);
        return this;
    }

    public EcpLicenseWhereInput lbIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LB_IN);
        return this;
    }

    public void setLbIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LB_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LB_IN);
        }
    }

    public boolean getLbIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LB_IN);
    }

    public EcpLicenseWhereInput lbLt(String lbLt) {

        this.lbLt = lbLt;
        return this;
    }

    /**
     * Get lbLt
     *
     * @return lbLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLbLt() {
        return lbLt;
    }

    public void setLbLt(String lbLt) {
        this.lbLt = lbLt;
    }

    public EcpLicenseWhereInput lbLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LB_LT);
        return this;
    }

    public EcpLicenseWhereInput lbLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LB_LT);
        return this;
    }

    public void setLbLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LB_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LB_LT);
        }
    }

    public boolean getLbLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LB_LT);
    }

    public EcpLicenseWhereInput lbLte(String lbLte) {

        this.lbLte = lbLte;
        return this;
    }

    /**
     * Get lbLte
     *
     * @return lbLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLbLte() {
        return lbLte;
    }

    public void setLbLte(String lbLte) {
        this.lbLte = lbLte;
    }

    public EcpLicenseWhereInput lbLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LB_LTE);
        return this;
    }

    public EcpLicenseWhereInput lbLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LB_LTE);
        return this;
    }

    public void setLbLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LB_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LB_LTE);
        }
    }

    public boolean getLbLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LB_LTE);
    }

    public EcpLicenseWhereInput lbNot(String lbNot) {

        this.lbNot = lbNot;
        return this;
    }

    /**
     * Get lbNot
     *
     * @return lbNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLbNot() {
        return lbNot;
    }

    public void setLbNot(String lbNot) {
        this.lbNot = lbNot;
    }

    public EcpLicenseWhereInput lbNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LB_NOT);
        return this;
    }

    public EcpLicenseWhereInput lbNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LB_NOT);
        return this;
    }

    public void setLbNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LB_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LB_NOT);
        }
    }

    public boolean getLbNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LB_NOT);
    }

    public EcpLicenseWhereInput lbNotContains(String lbNotContains) {

        this.lbNotContains = lbNotContains;
        return this;
    }

    /**
     * Get lbNotContains
     *
     * @return lbNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLbNotContains() {
        return lbNotContains;
    }

    public void setLbNotContains(String lbNotContains) {
        this.lbNotContains = lbNotContains;
    }

    public EcpLicenseWhereInput lbNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LB_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput lbNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LB_NOT_CONTAINS);
        return this;
    }

    public void setLbNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LB_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LB_NOT_CONTAINS);
        }
    }

    public boolean getLbNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LB_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput lbNotEndsWith(String lbNotEndsWith) {

        this.lbNotEndsWith = lbNotEndsWith;
        return this;
    }

    /**
     * Get lbNotEndsWith
     *
     * @return lbNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLbNotEndsWith() {
        return lbNotEndsWith;
    }

    public void setLbNotEndsWith(String lbNotEndsWith) {
        this.lbNotEndsWith = lbNotEndsWith;
    }

    public EcpLicenseWhereInput lbNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LB_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput lbNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LB_NOT_ENDS_WITH);
        return this;
    }

    public void setLbNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LB_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LB_NOT_ENDS_WITH);
        }
    }

    public boolean getLbNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LB_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput lbNotIn(List<String> lbNotIn) {

        this.lbNotIn = lbNotIn;
        return this;
    }

    public EcpLicenseWhereInput addLbNotInItem(String lbNotInItem) {
        if (this.lbNotIn == null) {
            this.lbNotIn = new ArrayList<String>();
        }
        this.lbNotIn.add(lbNotInItem);
        return this;
    }

    /**
     * Get lbNotIn
     *
     * @return lbNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLbNotIn() {
        return lbNotIn;
    }

    public void setLbNotIn(List<String> lbNotIn) {
        this.lbNotIn = lbNotIn;
    }

    public EcpLicenseWhereInput lbNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LB_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput lbNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LB_NOT_IN);
        return this;
    }

    public void setLbNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LB_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LB_NOT_IN);
        }
    }

    public boolean getLbNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LB_NOT_IN);
    }

    public EcpLicenseWhereInput lbNotStartsWith(String lbNotStartsWith) {

        this.lbNotStartsWith = lbNotStartsWith;
        return this;
    }

    /**
     * Get lbNotStartsWith
     *
     * @return lbNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLbNotStartsWith() {
        return lbNotStartsWith;
    }

    public void setLbNotStartsWith(String lbNotStartsWith) {
        this.lbNotStartsWith = lbNotStartsWith;
    }

    public EcpLicenseWhereInput lbNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LB_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput lbNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LB_NOT_STARTS_WITH);
        return this;
    }

    public void setLbNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LB_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LB_NOT_STARTS_WITH);
        }
    }

    public boolean getLbNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LB_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput lbStartsWith(String lbStartsWith) {

        this.lbStartsWith = lbStartsWith;
        return this;
    }

    /**
     * Get lbStartsWith
     *
     * @return lbStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLbStartsWith() {
        return lbStartsWith;
    }

    public void setLbStartsWith(String lbStartsWith) {
        this.lbStartsWith = lbStartsWith;
    }

    public EcpLicenseWhereInput lbStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LB_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput lbStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LB_STARTS_WITH);
        return this;
    }

    public void setLbStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LB_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LB_STARTS_WITH);
        }
    }

    public boolean getLbStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LB_STARTS_WITH);
    }

    public EcpLicenseWhereInput licensePayload(String licensePayload) {

        this.licensePayload = licensePayload;
        return this;
    }

    /**
     * Get licensePayload
     *
     * @return licensePayload
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicensePayload() {
        return licensePayload;
    }

    public void setLicensePayload(String licensePayload) {
        this.licensePayload = licensePayload;
    }

    public EcpLicenseWhereInput licensePayload_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD);
        return this;
    }

    public EcpLicenseWhereInput licensePayload_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD);
        return this;
    }

    public void setLicensePayload_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD);
        }
    }

    public boolean getLicensePayload_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_PAYLOAD);
    }

    public EcpLicenseWhereInput licensePayloadContains(String licensePayloadContains) {

        this.licensePayloadContains = licensePayloadContains;
        return this;
    }

    /**
     * Get licensePayloadContains
     *
     * @return licensePayloadContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicensePayloadContains() {
        return licensePayloadContains;
    }

    public void setLicensePayloadContains(String licensePayloadContains) {
        this.licensePayloadContains = licensePayloadContains;
    }

    public EcpLicenseWhereInput licensePayloadContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput licensePayloadContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_CONTAINS);
        return this;
    }

    public void setLicensePayloadContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_CONTAINS);
        }
    }

    public boolean getLicensePayloadContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_PAYLOAD_CONTAINS);
    }

    public EcpLicenseWhereInput licensePayloadEndsWith(String licensePayloadEndsWith) {

        this.licensePayloadEndsWith = licensePayloadEndsWith;
        return this;
    }

    /**
     * Get licensePayloadEndsWith
     *
     * @return licensePayloadEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicensePayloadEndsWith() {
        return licensePayloadEndsWith;
    }

    public void setLicensePayloadEndsWith(String licensePayloadEndsWith) {
        this.licensePayloadEndsWith = licensePayloadEndsWith;
    }

    public EcpLicenseWhereInput licensePayloadEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput licensePayloadEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_ENDS_WITH);
        return this;
    }

    public void setLicensePayloadEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_ENDS_WITH);
        }
    }

    public boolean getLicensePayloadEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_PAYLOAD_ENDS_WITH);
    }

    public EcpLicenseWhereInput licensePayloadGt(String licensePayloadGt) {

        this.licensePayloadGt = licensePayloadGt;
        return this;
    }

    /**
     * Get licensePayloadGt
     *
     * @return licensePayloadGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicensePayloadGt() {
        return licensePayloadGt;
    }

    public void setLicensePayloadGt(String licensePayloadGt) {
        this.licensePayloadGt = licensePayloadGt;
    }

    public EcpLicenseWhereInput licensePayloadGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_GT);
        return this;
    }

    public EcpLicenseWhereInput licensePayloadGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_GT);
        return this;
    }

    public void setLicensePayloadGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_GT);
        }
    }

    public boolean getLicensePayloadGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_PAYLOAD_GT);
    }

    public EcpLicenseWhereInput licensePayloadGte(String licensePayloadGte) {

        this.licensePayloadGte = licensePayloadGte;
        return this;
    }

    /**
     * Get licensePayloadGte
     *
     * @return licensePayloadGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicensePayloadGte() {
        return licensePayloadGte;
    }

    public void setLicensePayloadGte(String licensePayloadGte) {
        this.licensePayloadGte = licensePayloadGte;
    }

    public EcpLicenseWhereInput licensePayloadGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_GTE);
        return this;
    }

    public EcpLicenseWhereInput licensePayloadGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_GTE);
        return this;
    }

    public void setLicensePayloadGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_GTE);
        }
    }

    public boolean getLicensePayloadGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_PAYLOAD_GTE);
    }

    public EcpLicenseWhereInput licensePayloadIn(List<String> licensePayloadIn) {

        this.licensePayloadIn = licensePayloadIn;
        return this;
    }

    public EcpLicenseWhereInput addLicensePayloadInItem(String licensePayloadInItem) {
        if (this.licensePayloadIn == null) {
            this.licensePayloadIn = new ArrayList<String>();
        }
        this.licensePayloadIn.add(licensePayloadInItem);
        return this;
    }

    /**
     * Get licensePayloadIn
     *
     * @return licensePayloadIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLicensePayloadIn() {
        return licensePayloadIn;
    }

    public void setLicensePayloadIn(List<String> licensePayloadIn) {
        this.licensePayloadIn = licensePayloadIn;
    }

    public EcpLicenseWhereInput licensePayloadIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_IN);
        return this;
    }

    public EcpLicenseWhereInput licensePayloadIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_IN);
        return this;
    }

    public void setLicensePayloadIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_IN);
        }
    }

    public boolean getLicensePayloadIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_PAYLOAD_IN);
    }

    public EcpLicenseWhereInput licensePayloadLt(String licensePayloadLt) {

        this.licensePayloadLt = licensePayloadLt;
        return this;
    }

    /**
     * Get licensePayloadLt
     *
     * @return licensePayloadLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicensePayloadLt() {
        return licensePayloadLt;
    }

    public void setLicensePayloadLt(String licensePayloadLt) {
        this.licensePayloadLt = licensePayloadLt;
    }

    public EcpLicenseWhereInput licensePayloadLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_LT);
        return this;
    }

    public EcpLicenseWhereInput licensePayloadLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_LT);
        return this;
    }

    public void setLicensePayloadLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_LT);
        }
    }

    public boolean getLicensePayloadLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_PAYLOAD_LT);
    }

    public EcpLicenseWhereInput licensePayloadLte(String licensePayloadLte) {

        this.licensePayloadLte = licensePayloadLte;
        return this;
    }

    /**
     * Get licensePayloadLte
     *
     * @return licensePayloadLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicensePayloadLte() {
        return licensePayloadLte;
    }

    public void setLicensePayloadLte(String licensePayloadLte) {
        this.licensePayloadLte = licensePayloadLte;
    }

    public EcpLicenseWhereInput licensePayloadLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_LTE);
        return this;
    }

    public EcpLicenseWhereInput licensePayloadLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_LTE);
        return this;
    }

    public void setLicensePayloadLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_LTE);
        }
    }

    public boolean getLicensePayloadLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_PAYLOAD_LTE);
    }

    public EcpLicenseWhereInput licensePayloadNot(String licensePayloadNot) {

        this.licensePayloadNot = licensePayloadNot;
        return this;
    }

    /**
     * Get licensePayloadNot
     *
     * @return licensePayloadNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicensePayloadNot() {
        return licensePayloadNot;
    }

    public void setLicensePayloadNot(String licensePayloadNot) {
        this.licensePayloadNot = licensePayloadNot;
    }

    public EcpLicenseWhereInput licensePayloadNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT);
        return this;
    }

    public EcpLicenseWhereInput licensePayloadNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT);
        return this;
    }

    public void setLicensePayloadNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT);
        }
    }

    public boolean getLicensePayloadNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT);
    }

    public EcpLicenseWhereInput licensePayloadNotContains(String licensePayloadNotContains) {

        this.licensePayloadNotContains = licensePayloadNotContains;
        return this;
    }

    /**
     * Get licensePayloadNotContains
     *
     * @return licensePayloadNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicensePayloadNotContains() {
        return licensePayloadNotContains;
    }

    public void setLicensePayloadNotContains(String licensePayloadNotContains) {
        this.licensePayloadNotContains = licensePayloadNotContains;
    }

    public EcpLicenseWhereInput licensePayloadNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput licensePayloadNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_CONTAINS);
        return this;
    }

    public void setLicensePayloadNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_CONTAINS);
        }
    }

    public boolean getLicensePayloadNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput licensePayloadNotEndsWith(String licensePayloadNotEndsWith) {

        this.licensePayloadNotEndsWith = licensePayloadNotEndsWith;
        return this;
    }

    /**
     * Get licensePayloadNotEndsWith
     *
     * @return licensePayloadNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicensePayloadNotEndsWith() {
        return licensePayloadNotEndsWith;
    }

    public void setLicensePayloadNotEndsWith(String licensePayloadNotEndsWith) {
        this.licensePayloadNotEndsWith = licensePayloadNotEndsWith;
    }

    public EcpLicenseWhereInput licensePayloadNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput licensePayloadNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_ENDS_WITH);
        return this;
    }

    public void setLicensePayloadNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_ENDS_WITH);
        }
    }

    public boolean getLicensePayloadNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput licensePayloadNotIn(List<String> licensePayloadNotIn) {

        this.licensePayloadNotIn = licensePayloadNotIn;
        return this;
    }

    public EcpLicenseWhereInput addLicensePayloadNotInItem(String licensePayloadNotInItem) {
        if (this.licensePayloadNotIn == null) {
            this.licensePayloadNotIn = new ArrayList<String>();
        }
        this.licensePayloadNotIn.add(licensePayloadNotInItem);
        return this;
    }

    /**
     * Get licensePayloadNotIn
     *
     * @return licensePayloadNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLicensePayloadNotIn() {
        return licensePayloadNotIn;
    }

    public void setLicensePayloadNotIn(List<String> licensePayloadNotIn) {
        this.licensePayloadNotIn = licensePayloadNotIn;
    }

    public EcpLicenseWhereInput licensePayloadNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput licensePayloadNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_IN);
        return this;
    }

    public void setLicensePayloadNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_IN);
        }
    }

    public boolean getLicensePayloadNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_IN);
    }

    public EcpLicenseWhereInput licensePayloadNotStartsWith(String licensePayloadNotStartsWith) {

        this.licensePayloadNotStartsWith = licensePayloadNotStartsWith;
        return this;
    }

    /**
     * Get licensePayloadNotStartsWith
     *
     * @return licensePayloadNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicensePayloadNotStartsWith() {
        return licensePayloadNotStartsWith;
    }

    public void setLicensePayloadNotStartsWith(String licensePayloadNotStartsWith) {
        this.licensePayloadNotStartsWith = licensePayloadNotStartsWith;
    }

    public EcpLicenseWhereInput licensePayloadNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput licensePayloadNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_STARTS_WITH);
        return this;
    }

    public void setLicensePayloadNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_STARTS_WITH);
        }
    }

    public boolean getLicensePayloadNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_PAYLOAD_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput licensePayloadStartsWith(String licensePayloadStartsWith) {

        this.licensePayloadStartsWith = licensePayloadStartsWith;
        return this;
    }

    /**
     * Get licensePayloadStartsWith
     *
     * @return licensePayloadStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicensePayloadStartsWith() {
        return licensePayloadStartsWith;
    }

    public void setLicensePayloadStartsWith(String licensePayloadStartsWith) {
        this.licensePayloadStartsWith = licensePayloadStartsWith;
    }

    public EcpLicenseWhereInput licensePayloadStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput licensePayloadStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_STARTS_WITH);
        return this;
    }

    public void setLicensePayloadStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_PAYLOAD_STARTS_WITH);
        }
    }

    public boolean getLicensePayloadStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_PAYLOAD_STARTS_WITH);
    }

    public EcpLicenseWhereInput licenseSignature(String licenseSignature) {

        this.licenseSignature = licenseSignature;
        return this;
    }

    /**
     * Get licenseSignature
     *
     * @return licenseSignature
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSignature() {
        return licenseSignature;
    }

    public void setLicenseSignature(String licenseSignature) {
        this.licenseSignature = licenseSignature;
    }

    public EcpLicenseWhereInput licenseSignature_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE);
        return this;
    }

    public EcpLicenseWhereInput licenseSignature_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE);
        return this;
    }

    public void setLicenseSignature_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE);
        }
    }

    public boolean getLicenseSignature_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGNATURE);
    }

    public EcpLicenseWhereInput licenseSignatureContains(String licenseSignatureContains) {

        this.licenseSignatureContains = licenseSignatureContains;
        return this;
    }

    /**
     * Get licenseSignatureContains
     *
     * @return licenseSignatureContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSignatureContains() {
        return licenseSignatureContains;
    }

    public void setLicenseSignatureContains(String licenseSignatureContains) {
        this.licenseSignatureContains = licenseSignatureContains;
    }

    public EcpLicenseWhereInput licenseSignatureContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput licenseSignatureContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_CONTAINS);
        return this;
    }

    public void setLicenseSignatureContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_CONTAINS);
        }
    }

    public boolean getLicenseSignatureContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGNATURE_CONTAINS);
    }

    public EcpLicenseWhereInput licenseSignatureEndsWith(String licenseSignatureEndsWith) {

        this.licenseSignatureEndsWith = licenseSignatureEndsWith;
        return this;
    }

    /**
     * Get licenseSignatureEndsWith
     *
     * @return licenseSignatureEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSignatureEndsWith() {
        return licenseSignatureEndsWith;
    }

    public void setLicenseSignatureEndsWith(String licenseSignatureEndsWith) {
        this.licenseSignatureEndsWith = licenseSignatureEndsWith;
    }

    public EcpLicenseWhereInput licenseSignatureEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput licenseSignatureEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_ENDS_WITH);
        return this;
    }

    public void setLicenseSignatureEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_ENDS_WITH);
        }
    }

    public boolean getLicenseSignatureEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGNATURE_ENDS_WITH);
    }

    public EcpLicenseWhereInput licenseSignatureGt(String licenseSignatureGt) {

        this.licenseSignatureGt = licenseSignatureGt;
        return this;
    }

    /**
     * Get licenseSignatureGt
     *
     * @return licenseSignatureGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSignatureGt() {
        return licenseSignatureGt;
    }

    public void setLicenseSignatureGt(String licenseSignatureGt) {
        this.licenseSignatureGt = licenseSignatureGt;
    }

    public EcpLicenseWhereInput licenseSignatureGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_GT);
        return this;
    }

    public EcpLicenseWhereInput licenseSignatureGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_GT);
        return this;
    }

    public void setLicenseSignatureGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_GT);
        }
    }

    public boolean getLicenseSignatureGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGNATURE_GT);
    }

    public EcpLicenseWhereInput licenseSignatureGte(String licenseSignatureGte) {

        this.licenseSignatureGte = licenseSignatureGte;
        return this;
    }

    /**
     * Get licenseSignatureGte
     *
     * @return licenseSignatureGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSignatureGte() {
        return licenseSignatureGte;
    }

    public void setLicenseSignatureGte(String licenseSignatureGte) {
        this.licenseSignatureGte = licenseSignatureGte;
    }

    public EcpLicenseWhereInput licenseSignatureGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_GTE);
        return this;
    }

    public EcpLicenseWhereInput licenseSignatureGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_GTE);
        return this;
    }

    public void setLicenseSignatureGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_GTE);
        }
    }

    public boolean getLicenseSignatureGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGNATURE_GTE);
    }

    public EcpLicenseWhereInput licenseSignatureIn(List<String> licenseSignatureIn) {

        this.licenseSignatureIn = licenseSignatureIn;
        return this;
    }

    public EcpLicenseWhereInput addLicenseSignatureInItem(String licenseSignatureInItem) {
        if (this.licenseSignatureIn == null) {
            this.licenseSignatureIn = new ArrayList<String>();
        }
        this.licenseSignatureIn.add(licenseSignatureInItem);
        return this;
    }

    /**
     * Get licenseSignatureIn
     *
     * @return licenseSignatureIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLicenseSignatureIn() {
        return licenseSignatureIn;
    }

    public void setLicenseSignatureIn(List<String> licenseSignatureIn) {
        this.licenseSignatureIn = licenseSignatureIn;
    }

    public EcpLicenseWhereInput licenseSignatureIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_IN);
        return this;
    }

    public EcpLicenseWhereInput licenseSignatureIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_IN);
        return this;
    }

    public void setLicenseSignatureIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_IN);
        }
    }

    public boolean getLicenseSignatureIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGNATURE_IN);
    }

    public EcpLicenseWhereInput licenseSignatureLt(String licenseSignatureLt) {

        this.licenseSignatureLt = licenseSignatureLt;
        return this;
    }

    /**
     * Get licenseSignatureLt
     *
     * @return licenseSignatureLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSignatureLt() {
        return licenseSignatureLt;
    }

    public void setLicenseSignatureLt(String licenseSignatureLt) {
        this.licenseSignatureLt = licenseSignatureLt;
    }

    public EcpLicenseWhereInput licenseSignatureLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_LT);
        return this;
    }

    public EcpLicenseWhereInput licenseSignatureLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_LT);
        return this;
    }

    public void setLicenseSignatureLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_LT);
        }
    }

    public boolean getLicenseSignatureLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGNATURE_LT);
    }

    public EcpLicenseWhereInput licenseSignatureLte(String licenseSignatureLte) {

        this.licenseSignatureLte = licenseSignatureLte;
        return this;
    }

    /**
     * Get licenseSignatureLte
     *
     * @return licenseSignatureLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSignatureLte() {
        return licenseSignatureLte;
    }

    public void setLicenseSignatureLte(String licenseSignatureLte) {
        this.licenseSignatureLte = licenseSignatureLte;
    }

    public EcpLicenseWhereInput licenseSignatureLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_LTE);
        return this;
    }

    public EcpLicenseWhereInput licenseSignatureLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_LTE);
        return this;
    }

    public void setLicenseSignatureLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_LTE);
        }
    }

    public boolean getLicenseSignatureLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGNATURE_LTE);
    }

    public EcpLicenseWhereInput licenseSignatureNot(String licenseSignatureNot) {

        this.licenseSignatureNot = licenseSignatureNot;
        return this;
    }

    /**
     * Get licenseSignatureNot
     *
     * @return licenseSignatureNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSignatureNot() {
        return licenseSignatureNot;
    }

    public void setLicenseSignatureNot(String licenseSignatureNot) {
        this.licenseSignatureNot = licenseSignatureNot;
    }

    public EcpLicenseWhereInput licenseSignatureNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT);
        return this;
    }

    public EcpLicenseWhereInput licenseSignatureNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT);
        return this;
    }

    public void setLicenseSignatureNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT);
        }
    }

    public boolean getLicenseSignatureNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT);
    }

    public EcpLicenseWhereInput licenseSignatureNotContains(String licenseSignatureNotContains) {

        this.licenseSignatureNotContains = licenseSignatureNotContains;
        return this;
    }

    /**
     * Get licenseSignatureNotContains
     *
     * @return licenseSignatureNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSignatureNotContains() {
        return licenseSignatureNotContains;
    }

    public void setLicenseSignatureNotContains(String licenseSignatureNotContains) {
        this.licenseSignatureNotContains = licenseSignatureNotContains;
    }

    public EcpLicenseWhereInput licenseSignatureNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput licenseSignatureNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_CONTAINS);
        return this;
    }

    public void setLicenseSignatureNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_CONTAINS);
        }
    }

    public boolean getLicenseSignatureNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput licenseSignatureNotEndsWith(String licenseSignatureNotEndsWith) {

        this.licenseSignatureNotEndsWith = licenseSignatureNotEndsWith;
        return this;
    }

    /**
     * Get licenseSignatureNotEndsWith
     *
     * @return licenseSignatureNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSignatureNotEndsWith() {
        return licenseSignatureNotEndsWith;
    }

    public void setLicenseSignatureNotEndsWith(String licenseSignatureNotEndsWith) {
        this.licenseSignatureNotEndsWith = licenseSignatureNotEndsWith;
    }

    public EcpLicenseWhereInput licenseSignatureNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput licenseSignatureNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_ENDS_WITH);
        return this;
    }

    public void setLicenseSignatureNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_ENDS_WITH);
        }
    }

    public boolean getLicenseSignatureNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput licenseSignatureNotIn(List<String> licenseSignatureNotIn) {

        this.licenseSignatureNotIn = licenseSignatureNotIn;
        return this;
    }

    public EcpLicenseWhereInput addLicenseSignatureNotInItem(String licenseSignatureNotInItem) {
        if (this.licenseSignatureNotIn == null) {
            this.licenseSignatureNotIn = new ArrayList<String>();
        }
        this.licenseSignatureNotIn.add(licenseSignatureNotInItem);
        return this;
    }

    /**
     * Get licenseSignatureNotIn
     *
     * @return licenseSignatureNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLicenseSignatureNotIn() {
        return licenseSignatureNotIn;
    }

    public void setLicenseSignatureNotIn(List<String> licenseSignatureNotIn) {
        this.licenseSignatureNotIn = licenseSignatureNotIn;
    }

    public EcpLicenseWhereInput licenseSignatureNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput licenseSignatureNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_IN);
        return this;
    }

    public void setLicenseSignatureNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_IN);
        }
    }

    public boolean getLicenseSignatureNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_IN);
    }

    public EcpLicenseWhereInput licenseSignatureNotStartsWith(
            String licenseSignatureNotStartsWith) {

        this.licenseSignatureNotStartsWith = licenseSignatureNotStartsWith;
        return this;
    }

    /**
     * Get licenseSignatureNotStartsWith
     *
     * @return licenseSignatureNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSignatureNotStartsWith() {
        return licenseSignatureNotStartsWith;
    }

    public void setLicenseSignatureNotStartsWith(String licenseSignatureNotStartsWith) {
        this.licenseSignatureNotStartsWith = licenseSignatureNotStartsWith;
    }

    public EcpLicenseWhereInput licenseSignatureNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput licenseSignatureNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_STARTS_WITH);
        return this;
    }

    public void setLicenseSignatureNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_STARTS_WITH);
        }
    }

    public boolean getLicenseSignatureNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGNATURE_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput licenseSignatureStartsWith(String licenseSignatureStartsWith) {

        this.licenseSignatureStartsWith = licenseSignatureStartsWith;
        return this;
    }

    /**
     * Get licenseSignatureStartsWith
     *
     * @return licenseSignatureStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSignatureStartsWith() {
        return licenseSignatureStartsWith;
    }

    public void setLicenseSignatureStartsWith(String licenseSignatureStartsWith) {
        this.licenseSignatureStartsWith = licenseSignatureStartsWith;
    }

    public EcpLicenseWhereInput licenseSignatureStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput licenseSignatureStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_STARTS_WITH);
        return this;
    }

    public void setLicenseSignatureStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGNATURE_STARTS_WITH);
        }
    }

    public boolean getLicenseSignatureStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGNATURE_STARTS_WITH);
    }

    public EcpLicenseWhereInput licenseType(LicenseType licenseType) {

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

    public EcpLicenseWhereInput licenseType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE);
        return this;
    }

    public EcpLicenseWhereInput licenseType_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput licenseTypeIn(List<LicenseType> licenseTypeIn) {

        this.licenseTypeIn = licenseTypeIn;
        return this;
    }

    public EcpLicenseWhereInput addLicenseTypeInItem(LicenseType licenseTypeInItem) {
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

    public EcpLicenseWhereInput licenseTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE_IN);
        return this;
    }

    public EcpLicenseWhereInput licenseTypeIn_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput licenseTypeNot(LicenseType licenseTypeNot) {

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

    public EcpLicenseWhereInput licenseTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE_NOT);
        return this;
    }

    public EcpLicenseWhereInput licenseTypeNot_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput licenseTypeNotIn(List<LicenseType> licenseTypeNotIn) {

        this.licenseTypeNotIn = licenseTypeNotIn;
        return this;
    }

    public EcpLicenseWhereInput addLicenseTypeNotInItem(LicenseType licenseTypeNotInItem) {
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

    public EcpLicenseWhereInput licenseTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput licenseTypeNotIn_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput maxCoreNum(Integer maxCoreNum) {

        this.maxCoreNum = maxCoreNum;
        return this;
    }

    /**
     * Get maxCoreNum
     *
     * @return maxCoreNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxCoreNum() {
        return maxCoreNum;
    }

    public void setMaxCoreNum(Integer maxCoreNum) {
        this.maxCoreNum = maxCoreNum;
    }

    public EcpLicenseWhereInput maxCoreNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM);
        return this;
    }

    public EcpLicenseWhereInput maxCoreNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM);
        return this;
    }

    public void setMaxCoreNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM);
        }
    }

    public boolean getMaxCoreNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CORE_NUM);
    }

    public EcpLicenseWhereInput maxCoreNumGt(Integer maxCoreNumGt) {

        this.maxCoreNumGt = maxCoreNumGt;
        return this;
    }

    /**
     * Get maxCoreNumGt
     *
     * @return maxCoreNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxCoreNumGt() {
        return maxCoreNumGt;
    }

    public void setMaxCoreNumGt(Integer maxCoreNumGt) {
        this.maxCoreNumGt = maxCoreNumGt;
    }

    public EcpLicenseWhereInput maxCoreNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_GT);
        return this;
    }

    public EcpLicenseWhereInput maxCoreNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_GT);
        return this;
    }

    public void setMaxCoreNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_GT);
        }
    }

    public boolean getMaxCoreNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CORE_NUM_GT);
    }

    public EcpLicenseWhereInput maxCoreNumGte(Integer maxCoreNumGte) {

        this.maxCoreNumGte = maxCoreNumGte;
        return this;
    }

    /**
     * Get maxCoreNumGte
     *
     * @return maxCoreNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxCoreNumGte() {
        return maxCoreNumGte;
    }

    public void setMaxCoreNumGte(Integer maxCoreNumGte) {
        this.maxCoreNumGte = maxCoreNumGte;
    }

    public EcpLicenseWhereInput maxCoreNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_GTE);
        return this;
    }

    public EcpLicenseWhereInput maxCoreNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_GTE);
        return this;
    }

    public void setMaxCoreNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_GTE);
        }
    }

    public boolean getMaxCoreNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CORE_NUM_GTE);
    }

    public EcpLicenseWhereInput maxCoreNumIn(List<Integer> maxCoreNumIn) {

        this.maxCoreNumIn = maxCoreNumIn;
        return this;
    }

    public EcpLicenseWhereInput addMaxCoreNumInItem(Integer maxCoreNumInItem) {
        if (this.maxCoreNumIn == null) {
            this.maxCoreNumIn = new ArrayList<Integer>();
        }
        this.maxCoreNumIn.add(maxCoreNumInItem);
        return this;
    }

    /**
     * Get maxCoreNumIn
     *
     * @return maxCoreNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxCoreNumIn() {
        return maxCoreNumIn;
    }

    public void setMaxCoreNumIn(List<Integer> maxCoreNumIn) {
        this.maxCoreNumIn = maxCoreNumIn;
    }

    public EcpLicenseWhereInput maxCoreNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_IN);
        return this;
    }

    public EcpLicenseWhereInput maxCoreNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_IN);
        return this;
    }

    public void setMaxCoreNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_IN);
        }
    }

    public boolean getMaxCoreNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CORE_NUM_IN);
    }

    public EcpLicenseWhereInput maxCoreNumLt(Integer maxCoreNumLt) {

        this.maxCoreNumLt = maxCoreNumLt;
        return this;
    }

    /**
     * Get maxCoreNumLt
     *
     * @return maxCoreNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxCoreNumLt() {
        return maxCoreNumLt;
    }

    public void setMaxCoreNumLt(Integer maxCoreNumLt) {
        this.maxCoreNumLt = maxCoreNumLt;
    }

    public EcpLicenseWhereInput maxCoreNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_LT);
        return this;
    }

    public EcpLicenseWhereInput maxCoreNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_LT);
        return this;
    }

    public void setMaxCoreNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_LT);
        }
    }

    public boolean getMaxCoreNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CORE_NUM_LT);
    }

    public EcpLicenseWhereInput maxCoreNumLte(Integer maxCoreNumLte) {

        this.maxCoreNumLte = maxCoreNumLte;
        return this;
    }

    /**
     * Get maxCoreNumLte
     *
     * @return maxCoreNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxCoreNumLte() {
        return maxCoreNumLte;
    }

    public void setMaxCoreNumLte(Integer maxCoreNumLte) {
        this.maxCoreNumLte = maxCoreNumLte;
    }

    public EcpLicenseWhereInput maxCoreNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_LTE);
        return this;
    }

    public EcpLicenseWhereInput maxCoreNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_LTE);
        return this;
    }

    public void setMaxCoreNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_LTE);
        }
    }

    public boolean getMaxCoreNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CORE_NUM_LTE);
    }

    public EcpLicenseWhereInput maxCoreNumNot(Integer maxCoreNumNot) {

        this.maxCoreNumNot = maxCoreNumNot;
        return this;
    }

    /**
     * Get maxCoreNumNot
     *
     * @return maxCoreNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxCoreNumNot() {
        return maxCoreNumNot;
    }

    public void setMaxCoreNumNot(Integer maxCoreNumNot) {
        this.maxCoreNumNot = maxCoreNumNot;
    }

    public EcpLicenseWhereInput maxCoreNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_NOT);
        return this;
    }

    public EcpLicenseWhereInput maxCoreNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_NOT);
        return this;
    }

    public void setMaxCoreNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_NOT);
        }
    }

    public boolean getMaxCoreNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CORE_NUM_NOT);
    }

    public EcpLicenseWhereInput maxCoreNumNotIn(List<Integer> maxCoreNumNotIn) {

        this.maxCoreNumNotIn = maxCoreNumNotIn;
        return this;
    }

    public EcpLicenseWhereInput addMaxCoreNumNotInItem(Integer maxCoreNumNotInItem) {
        if (this.maxCoreNumNotIn == null) {
            this.maxCoreNumNotIn = new ArrayList<Integer>();
        }
        this.maxCoreNumNotIn.add(maxCoreNumNotInItem);
        return this;
    }

    /**
     * Get maxCoreNumNotIn
     *
     * @return maxCoreNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxCoreNumNotIn() {
        return maxCoreNumNotIn;
    }

    public void setMaxCoreNumNotIn(List<Integer> maxCoreNumNotIn) {
        this.maxCoreNumNotIn = maxCoreNumNotIn;
    }

    public EcpLicenseWhereInput maxCoreNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput maxCoreNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_NOT_IN);
        return this;
    }

    public void setMaxCoreNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_NOT_IN);
        }
    }

    public boolean getMaxCoreNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CORE_NUM_NOT_IN);
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacity(Double maxPhysicalDataCapacity) {

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
    public Double getMaxPhysicalDataCapacity() {
        return maxPhysicalDataCapacity;
    }

    public void setMaxPhysicalDataCapacity(Double maxPhysicalDataCapacity) {
        this.maxPhysicalDataCapacity = maxPhysicalDataCapacity;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY);
        return this;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacity_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput maxPhysicalDataCapacityGt(Double maxPhysicalDataCapacityGt) {

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
    public Double getMaxPhysicalDataCapacityGt() {
        return maxPhysicalDataCapacityGt;
    }

    public void setMaxPhysicalDataCapacityGt(Double maxPhysicalDataCapacityGt) {
        this.maxPhysicalDataCapacityGt = maxPhysicalDataCapacityGt;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GT);
        return this;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityGt_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput maxPhysicalDataCapacityGte(Double maxPhysicalDataCapacityGte) {

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
    public Double getMaxPhysicalDataCapacityGte() {
        return maxPhysicalDataCapacityGte;
    }

    public void setMaxPhysicalDataCapacityGte(Double maxPhysicalDataCapacityGte) {
        this.maxPhysicalDataCapacityGte = maxPhysicalDataCapacityGte;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GTE);
        return this;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityGte_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput maxPhysicalDataCapacityIn(List<Double> maxPhysicalDataCapacityIn) {

        this.maxPhysicalDataCapacityIn = maxPhysicalDataCapacityIn;
        return this;
    }

    public EcpLicenseWhereInput addMaxPhysicalDataCapacityInItem(
            Double maxPhysicalDataCapacityInItem) {
        if (this.maxPhysicalDataCapacityIn == null) {
            this.maxPhysicalDataCapacityIn = new ArrayList<Double>();
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
    public List<Double> getMaxPhysicalDataCapacityIn() {
        return maxPhysicalDataCapacityIn;
    }

    public void setMaxPhysicalDataCapacityIn(List<Double> maxPhysicalDataCapacityIn) {
        this.maxPhysicalDataCapacityIn = maxPhysicalDataCapacityIn;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_IN);
        return this;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityIn_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput maxPhysicalDataCapacityLt(Double maxPhysicalDataCapacityLt) {

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
    public Double getMaxPhysicalDataCapacityLt() {
        return maxPhysicalDataCapacityLt;
    }

    public void setMaxPhysicalDataCapacityLt(Double maxPhysicalDataCapacityLt) {
        this.maxPhysicalDataCapacityLt = maxPhysicalDataCapacityLt;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LT);
        return this;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityLt_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput maxPhysicalDataCapacityLte(Double maxPhysicalDataCapacityLte) {

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
    public Double getMaxPhysicalDataCapacityLte() {
        return maxPhysicalDataCapacityLte;
    }

    public void setMaxPhysicalDataCapacityLte(Double maxPhysicalDataCapacityLte) {
        this.maxPhysicalDataCapacityLte = maxPhysicalDataCapacityLte;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LTE);
        return this;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityLte_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput maxPhysicalDataCapacityNot(Double maxPhysicalDataCapacityNot) {

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
    public Double getMaxPhysicalDataCapacityNot() {
        return maxPhysicalDataCapacityNot;
    }

    public void setMaxPhysicalDataCapacityNot(Double maxPhysicalDataCapacityNot) {
        this.maxPhysicalDataCapacityNot = maxPhysicalDataCapacityNot;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT);
        return this;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityNot_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput maxPhysicalDataCapacityNotIn(
            List<Double> maxPhysicalDataCapacityNotIn) {

        this.maxPhysicalDataCapacityNotIn = maxPhysicalDataCapacityNotIn;
        return this;
    }

    public EcpLicenseWhereInput addMaxPhysicalDataCapacityNotInItem(
            Double maxPhysicalDataCapacityNotInItem) {
        if (this.maxPhysicalDataCapacityNotIn == null) {
            this.maxPhysicalDataCapacityNotIn = new ArrayList<Double>();
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
    public List<Double> getMaxPhysicalDataCapacityNotIn() {
        return maxPhysicalDataCapacityNotIn;
    }

    public void setMaxPhysicalDataCapacityNotIn(List<Double> maxPhysicalDataCapacityNotIn) {
        this.maxPhysicalDataCapacityNotIn = maxPhysicalDataCapacityNotIn;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityNotIn_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput originalCode(String originalCode) {

        this.originalCode = originalCode;
        return this;
    }

    /**
     * Get originalCode
     *
     * @return originalCode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCode() {
        return originalCode;
    }

    public void setOriginalCode(String originalCode) {
        this.originalCode = originalCode;
    }

    public EcpLicenseWhereInput originalCode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE);
        return this;
    }

    public EcpLicenseWhereInput originalCode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE);
        return this;
    }

    public void setOriginalCode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE);
        }
    }

    public boolean getOriginalCode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE);
    }

    public EcpLicenseWhereInput originalCodeContains(String originalCodeContains) {

        this.originalCodeContains = originalCodeContains;
        return this;
    }

    /**
     * Get originalCodeContains
     *
     * @return originalCodeContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeContains() {
        return originalCodeContains;
    }

    public void setOriginalCodeContains(String originalCodeContains) {
        this.originalCodeContains = originalCodeContains;
    }

    public EcpLicenseWhereInput originalCodeContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput originalCodeContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_CONTAINS);
        return this;
    }

    public void setOriginalCodeContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_CONTAINS);
        }
    }

    public boolean getOriginalCodeContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_CONTAINS);
    }

    public EcpLicenseWhereInput originalCodeEndsWith(String originalCodeEndsWith) {

        this.originalCodeEndsWith = originalCodeEndsWith;
        return this;
    }

    /**
     * Get originalCodeEndsWith
     *
     * @return originalCodeEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeEndsWith() {
        return originalCodeEndsWith;
    }

    public void setOriginalCodeEndsWith(String originalCodeEndsWith) {
        this.originalCodeEndsWith = originalCodeEndsWith;
    }

    public EcpLicenseWhereInput originalCodeEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput originalCodeEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_ENDS_WITH);
        return this;
    }

    public void setOriginalCodeEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_ENDS_WITH);
        }
    }

    public boolean getOriginalCodeEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_ENDS_WITH);
    }

    public EcpLicenseWhereInput originalCodeGt(String originalCodeGt) {

        this.originalCodeGt = originalCodeGt;
        return this;
    }

    /**
     * Get originalCodeGt
     *
     * @return originalCodeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeGt() {
        return originalCodeGt;
    }

    public void setOriginalCodeGt(String originalCodeGt) {
        this.originalCodeGt = originalCodeGt;
    }

    public EcpLicenseWhereInput originalCodeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_GT);
        return this;
    }

    public EcpLicenseWhereInput originalCodeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_GT);
        return this;
    }

    public void setOriginalCodeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_GT);
        }
    }

    public boolean getOriginalCodeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_GT);
    }

    public EcpLicenseWhereInput originalCodeGte(String originalCodeGte) {

        this.originalCodeGte = originalCodeGte;
        return this;
    }

    /**
     * Get originalCodeGte
     *
     * @return originalCodeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeGte() {
        return originalCodeGte;
    }

    public void setOriginalCodeGte(String originalCodeGte) {
        this.originalCodeGte = originalCodeGte;
    }

    public EcpLicenseWhereInput originalCodeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_GTE);
        return this;
    }

    public EcpLicenseWhereInput originalCodeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_GTE);
        return this;
    }

    public void setOriginalCodeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_GTE);
        }
    }

    public boolean getOriginalCodeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_GTE);
    }

    public EcpLicenseWhereInput originalCodeIn(List<String> originalCodeIn) {

        this.originalCodeIn = originalCodeIn;
        return this;
    }

    public EcpLicenseWhereInput addOriginalCodeInItem(String originalCodeInItem) {
        if (this.originalCodeIn == null) {
            this.originalCodeIn = new ArrayList<String>();
        }
        this.originalCodeIn.add(originalCodeInItem);
        return this;
    }

    /**
     * Get originalCodeIn
     *
     * @return originalCodeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getOriginalCodeIn() {
        return originalCodeIn;
    }

    public void setOriginalCodeIn(List<String> originalCodeIn) {
        this.originalCodeIn = originalCodeIn;
    }

    public EcpLicenseWhereInput originalCodeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_IN);
        return this;
    }

    public EcpLicenseWhereInput originalCodeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_IN);
        return this;
    }

    public void setOriginalCodeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_IN);
        }
    }

    public boolean getOriginalCodeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_IN);
    }

    public EcpLicenseWhereInput originalCodeLt(String originalCodeLt) {

        this.originalCodeLt = originalCodeLt;
        return this;
    }

    /**
     * Get originalCodeLt
     *
     * @return originalCodeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeLt() {
        return originalCodeLt;
    }

    public void setOriginalCodeLt(String originalCodeLt) {
        this.originalCodeLt = originalCodeLt;
    }

    public EcpLicenseWhereInput originalCodeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_LT);
        return this;
    }

    public EcpLicenseWhereInput originalCodeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_LT);
        return this;
    }

    public void setOriginalCodeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_LT);
        }
    }

    public boolean getOriginalCodeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_LT);
    }

    public EcpLicenseWhereInput originalCodeLte(String originalCodeLte) {

        this.originalCodeLte = originalCodeLte;
        return this;
    }

    /**
     * Get originalCodeLte
     *
     * @return originalCodeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeLte() {
        return originalCodeLte;
    }

    public void setOriginalCodeLte(String originalCodeLte) {
        this.originalCodeLte = originalCodeLte;
    }

    public EcpLicenseWhereInput originalCodeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_LTE);
        return this;
    }

    public EcpLicenseWhereInput originalCodeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_LTE);
        return this;
    }

    public void setOriginalCodeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_LTE);
        }
    }

    public boolean getOriginalCodeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_LTE);
    }

    public EcpLicenseWhereInput originalCodeNot(String originalCodeNot) {

        this.originalCodeNot = originalCodeNot;
        return this;
    }

    /**
     * Get originalCodeNot
     *
     * @return originalCodeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeNot() {
        return originalCodeNot;
    }

    public void setOriginalCodeNot(String originalCodeNot) {
        this.originalCodeNot = originalCodeNot;
    }

    public EcpLicenseWhereInput originalCodeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_NOT);
        return this;
    }

    public EcpLicenseWhereInput originalCodeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_NOT);
        return this;
    }

    public void setOriginalCodeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_NOT);
        }
    }

    public boolean getOriginalCodeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_NOT);
    }

    public EcpLicenseWhereInput originalCodeNotContains(String originalCodeNotContains) {

        this.originalCodeNotContains = originalCodeNotContains;
        return this;
    }

    /**
     * Get originalCodeNotContains
     *
     * @return originalCodeNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeNotContains() {
        return originalCodeNotContains;
    }

    public void setOriginalCodeNotContains(String originalCodeNotContains) {
        this.originalCodeNotContains = originalCodeNotContains;
    }

    public EcpLicenseWhereInput originalCodeNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput originalCodeNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_NOT_CONTAINS);
        return this;
    }

    public void setOriginalCodeNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_NOT_CONTAINS);
        }
    }

    public boolean getOriginalCodeNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput originalCodeNotEndsWith(String originalCodeNotEndsWith) {

        this.originalCodeNotEndsWith = originalCodeNotEndsWith;
        return this;
    }

    /**
     * Get originalCodeNotEndsWith
     *
     * @return originalCodeNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeNotEndsWith() {
        return originalCodeNotEndsWith;
    }

    public void setOriginalCodeNotEndsWith(String originalCodeNotEndsWith) {
        this.originalCodeNotEndsWith = originalCodeNotEndsWith;
    }

    public EcpLicenseWhereInput originalCodeNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput originalCodeNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_NOT_ENDS_WITH);
        return this;
    }

    public void setOriginalCodeNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_NOT_ENDS_WITH);
        }
    }

    public boolean getOriginalCodeNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput originalCodeNotIn(List<String> originalCodeNotIn) {

        this.originalCodeNotIn = originalCodeNotIn;
        return this;
    }

    public EcpLicenseWhereInput addOriginalCodeNotInItem(String originalCodeNotInItem) {
        if (this.originalCodeNotIn == null) {
            this.originalCodeNotIn = new ArrayList<String>();
        }
        this.originalCodeNotIn.add(originalCodeNotInItem);
        return this;
    }

    /**
     * Get originalCodeNotIn
     *
     * @return originalCodeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getOriginalCodeNotIn() {
        return originalCodeNotIn;
    }

    public void setOriginalCodeNotIn(List<String> originalCodeNotIn) {
        this.originalCodeNotIn = originalCodeNotIn;
    }

    public EcpLicenseWhereInput originalCodeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput originalCodeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_NOT_IN);
        return this;
    }

    public void setOriginalCodeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_NOT_IN);
        }
    }

    public boolean getOriginalCodeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_NOT_IN);
    }

    public EcpLicenseWhereInput originalCodeNotStartsWith(String originalCodeNotStartsWith) {

        this.originalCodeNotStartsWith = originalCodeNotStartsWith;
        return this;
    }

    /**
     * Get originalCodeNotStartsWith
     *
     * @return originalCodeNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeNotStartsWith() {
        return originalCodeNotStartsWith;
    }

    public void setOriginalCodeNotStartsWith(String originalCodeNotStartsWith) {
        this.originalCodeNotStartsWith = originalCodeNotStartsWith;
    }

    public EcpLicenseWhereInput originalCodeNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput originalCodeNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_NOT_STARTS_WITH);
        return this;
    }

    public void setOriginalCodeNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_NOT_STARTS_WITH);
        }
    }

    public boolean getOriginalCodeNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput originalCodeStartsWith(String originalCodeStartsWith) {

        this.originalCodeStartsWith = originalCodeStartsWith;
        return this;
    }

    /**
     * Get originalCodeStartsWith
     *
     * @return originalCodeStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeStartsWith() {
        return originalCodeStartsWith;
    }

    public void setOriginalCodeStartsWith(String originalCodeStartsWith) {
        this.originalCodeStartsWith = originalCodeStartsWith;
    }

    public EcpLicenseWhereInput originalCodeStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput originalCodeStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_STARTS_WITH);
        return this;
    }

    public void setOriginalCodeStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_STARTS_WITH);
        }
    }

    public boolean getOriginalCodeStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_STARTS_WITH);
    }

    public EcpLicenseWhereInput productName(String productName) {

        this.productName = productName;
        return this;
    }

    /**
     * Get productName
     *
     * @return productName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public EcpLicenseWhereInput productName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME);
        return this;
    }

    public EcpLicenseWhereInput productName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME);
        return this;
    }

    public void setProductName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME);
        }
    }

    public boolean getProductName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME);
    }

    public EcpLicenseWhereInput productNameContains(String productNameContains) {

        this.productNameContains = productNameContains;
        return this;
    }

    /**
     * Get productNameContains
     *
     * @return productNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameContains() {
        return productNameContains;
    }

    public void setProductNameContains(String productNameContains) {
        this.productNameContains = productNameContains;
    }

    public EcpLicenseWhereInput productNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput productNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_CONTAINS);
        return this;
    }

    public void setProductNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_CONTAINS);
        }
    }

    public boolean getProductNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_CONTAINS);
    }

    public EcpLicenseWhereInput productNameEndsWith(String productNameEndsWith) {

        this.productNameEndsWith = productNameEndsWith;
        return this;
    }

    /**
     * Get productNameEndsWith
     *
     * @return productNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameEndsWith() {
        return productNameEndsWith;
    }

    public void setProductNameEndsWith(String productNameEndsWith) {
        this.productNameEndsWith = productNameEndsWith;
    }

    public EcpLicenseWhereInput productNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput productNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_ENDS_WITH);
        return this;
    }

    public void setProductNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_ENDS_WITH);
        }
    }

    public boolean getProductNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_ENDS_WITH);
    }

    public EcpLicenseWhereInput productNameGt(String productNameGt) {

        this.productNameGt = productNameGt;
        return this;
    }

    /**
     * Get productNameGt
     *
     * @return productNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameGt() {
        return productNameGt;
    }

    public void setProductNameGt(String productNameGt) {
        this.productNameGt = productNameGt;
    }

    public EcpLicenseWhereInput productNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_GT);
        return this;
    }

    public EcpLicenseWhereInput productNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_GT);
        return this;
    }

    public void setProductNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_GT);
        }
    }

    public boolean getProductNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_GT);
    }

    public EcpLicenseWhereInput productNameGte(String productNameGte) {

        this.productNameGte = productNameGte;
        return this;
    }

    /**
     * Get productNameGte
     *
     * @return productNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameGte() {
        return productNameGte;
    }

    public void setProductNameGte(String productNameGte) {
        this.productNameGte = productNameGte;
    }

    public EcpLicenseWhereInput productNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_GTE);
        return this;
    }

    public EcpLicenseWhereInput productNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_GTE);
        return this;
    }

    public void setProductNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_GTE);
        }
    }

    public boolean getProductNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_GTE);
    }

    public EcpLicenseWhereInput productNameIn(List<String> productNameIn) {

        this.productNameIn = productNameIn;
        return this;
    }

    public EcpLicenseWhereInput addProductNameInItem(String productNameInItem) {
        if (this.productNameIn == null) {
            this.productNameIn = new ArrayList<String>();
        }
        this.productNameIn.add(productNameInItem);
        return this;
    }

    /**
     * Get productNameIn
     *
     * @return productNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getProductNameIn() {
        return productNameIn;
    }

    public void setProductNameIn(List<String> productNameIn) {
        this.productNameIn = productNameIn;
    }

    public EcpLicenseWhereInput productNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_IN);
        return this;
    }

    public EcpLicenseWhereInput productNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_IN);
        return this;
    }

    public void setProductNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_IN);
        }
    }

    public boolean getProductNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_IN);
    }

    public EcpLicenseWhereInput productNameLt(String productNameLt) {

        this.productNameLt = productNameLt;
        return this;
    }

    /**
     * Get productNameLt
     *
     * @return productNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameLt() {
        return productNameLt;
    }

    public void setProductNameLt(String productNameLt) {
        this.productNameLt = productNameLt;
    }

    public EcpLicenseWhereInput productNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_LT);
        return this;
    }

    public EcpLicenseWhereInput productNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_LT);
        return this;
    }

    public void setProductNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_LT);
        }
    }

    public boolean getProductNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_LT);
    }

    public EcpLicenseWhereInput productNameLte(String productNameLte) {

        this.productNameLte = productNameLte;
        return this;
    }

    /**
     * Get productNameLte
     *
     * @return productNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameLte() {
        return productNameLte;
    }

    public void setProductNameLte(String productNameLte) {
        this.productNameLte = productNameLte;
    }

    public EcpLicenseWhereInput productNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_LTE);
        return this;
    }

    public EcpLicenseWhereInput productNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_LTE);
        return this;
    }

    public void setProductNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_LTE);
        }
    }

    public boolean getProductNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_LTE);
    }

    public EcpLicenseWhereInput productNameNot(String productNameNot) {

        this.productNameNot = productNameNot;
        return this;
    }

    /**
     * Get productNameNot
     *
     * @return productNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameNot() {
        return productNameNot;
    }

    public void setProductNameNot(String productNameNot) {
        this.productNameNot = productNameNot;
    }

    public EcpLicenseWhereInput productNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_NOT);
        return this;
    }

    public EcpLicenseWhereInput productNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_NOT);
        return this;
    }

    public void setProductNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_NOT);
        }
    }

    public boolean getProductNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_NOT);
    }

    public EcpLicenseWhereInput productNameNotContains(String productNameNotContains) {

        this.productNameNotContains = productNameNotContains;
        return this;
    }

    /**
     * Get productNameNotContains
     *
     * @return productNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameNotContains() {
        return productNameNotContains;
    }

    public void setProductNameNotContains(String productNameNotContains) {
        this.productNameNotContains = productNameNotContains;
    }

    public EcpLicenseWhereInput productNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput productNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_NOT_CONTAINS);
        return this;
    }

    public void setProductNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_NOT_CONTAINS);
        }
    }

    public boolean getProductNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput productNameNotEndsWith(String productNameNotEndsWith) {

        this.productNameNotEndsWith = productNameNotEndsWith;
        return this;
    }

    /**
     * Get productNameNotEndsWith
     *
     * @return productNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameNotEndsWith() {
        return productNameNotEndsWith;
    }

    public void setProductNameNotEndsWith(String productNameNotEndsWith) {
        this.productNameNotEndsWith = productNameNotEndsWith;
    }

    public EcpLicenseWhereInput productNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput productNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setProductNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getProductNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput productNameNotIn(List<String> productNameNotIn) {

        this.productNameNotIn = productNameNotIn;
        return this;
    }

    public EcpLicenseWhereInput addProductNameNotInItem(String productNameNotInItem) {
        if (this.productNameNotIn == null) {
            this.productNameNotIn = new ArrayList<String>();
        }
        this.productNameNotIn.add(productNameNotInItem);
        return this;
    }

    /**
     * Get productNameNotIn
     *
     * @return productNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getProductNameNotIn() {
        return productNameNotIn;
    }

    public void setProductNameNotIn(List<String> productNameNotIn) {
        this.productNameNotIn = productNameNotIn;
    }

    public EcpLicenseWhereInput productNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput productNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_NOT_IN);
        return this;
    }

    public void setProductNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_NOT_IN);
        }
    }

    public boolean getProductNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_NOT_IN);
    }

    public EcpLicenseWhereInput productNameNotStartsWith(String productNameNotStartsWith) {

        this.productNameNotStartsWith = productNameNotStartsWith;
        return this;
    }

    /**
     * Get productNameNotStartsWith
     *
     * @return productNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameNotStartsWith() {
        return productNameNotStartsWith;
    }

    public void setProductNameNotStartsWith(String productNameNotStartsWith) {
        this.productNameNotStartsWith = productNameNotStartsWith;
    }

    public EcpLicenseWhereInput productNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput productNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setProductNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getProductNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput productNameStartsWith(String productNameStartsWith) {

        this.productNameStartsWith = productNameStartsWith;
        return this;
    }

    /**
     * Get productNameStartsWith
     *
     * @return productNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameStartsWith() {
        return productNameStartsWith;
    }

    public void setProductNameStartsWith(String productNameStartsWith) {
        this.productNameStartsWith = productNameStartsWith;
    }

    public EcpLicenseWhereInput productNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput productNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_STARTS_WITH);
        return this;
    }

    public void setProductNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_STARTS_WITH);
        }
    }

    public boolean getProductNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_STARTS_WITH);
    }

    public EcpLicenseWhereInput serial(String serial) {

        this.serial = serial;
        return this;
    }

    /**
     * Get serial
     *
     * @return serial
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public EcpLicenseWhereInput serial_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL);
        return this;
    }

    public EcpLicenseWhereInput serial_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL);
        return this;
    }

    public void setSerial_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL);
        }
    }

    public boolean getSerial_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL);
    }

    public EcpLicenseWhereInput serialContains(String serialContains) {

        this.serialContains = serialContains;
        return this;
    }

    /**
     * Get serialContains
     *
     * @return serialContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialContains() {
        return serialContains;
    }

    public void setSerialContains(String serialContains) {
        this.serialContains = serialContains;
    }

    public EcpLicenseWhereInput serialContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput serialContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_CONTAINS);
        return this;
    }

    public void setSerialContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_CONTAINS);
        }
    }

    public boolean getSerialContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_CONTAINS);
    }

    public EcpLicenseWhereInput serialEndsWith(String serialEndsWith) {

        this.serialEndsWith = serialEndsWith;
        return this;
    }

    /**
     * Get serialEndsWith
     *
     * @return serialEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialEndsWith() {
        return serialEndsWith;
    }

    public void setSerialEndsWith(String serialEndsWith) {
        this.serialEndsWith = serialEndsWith;
    }

    public EcpLicenseWhereInput serialEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput serialEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_ENDS_WITH);
        return this;
    }

    public void setSerialEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_ENDS_WITH);
        }
    }

    public boolean getSerialEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_ENDS_WITH);
    }

    public EcpLicenseWhereInput serialGt(String serialGt) {

        this.serialGt = serialGt;
        return this;
    }

    /**
     * Get serialGt
     *
     * @return serialGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialGt() {
        return serialGt;
    }

    public void setSerialGt(String serialGt) {
        this.serialGt = serialGt;
    }

    public EcpLicenseWhereInput serialGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_GT);
        return this;
    }

    public EcpLicenseWhereInput serialGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_GT);
        return this;
    }

    public void setSerialGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_GT);
        }
    }

    public boolean getSerialGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_GT);
    }

    public EcpLicenseWhereInput serialGte(String serialGte) {

        this.serialGte = serialGte;
        return this;
    }

    /**
     * Get serialGte
     *
     * @return serialGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialGte() {
        return serialGte;
    }

    public void setSerialGte(String serialGte) {
        this.serialGte = serialGte;
    }

    public EcpLicenseWhereInput serialGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_GTE);
        return this;
    }

    public EcpLicenseWhereInput serialGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_GTE);
        return this;
    }

    public void setSerialGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_GTE);
        }
    }

    public boolean getSerialGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_GTE);
    }

    public EcpLicenseWhereInput serialIn(List<String> serialIn) {

        this.serialIn = serialIn;
        return this;
    }

    public EcpLicenseWhereInput addSerialInItem(String serialInItem) {
        if (this.serialIn == null) {
            this.serialIn = new ArrayList<String>();
        }
        this.serialIn.add(serialInItem);
        return this;
    }

    /**
     * Get serialIn
     *
     * @return serialIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSerialIn() {
        return serialIn;
    }

    public void setSerialIn(List<String> serialIn) {
        this.serialIn = serialIn;
    }

    public EcpLicenseWhereInput serialIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_IN);
        return this;
    }

    public EcpLicenseWhereInput serialIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_IN);
        return this;
    }

    public void setSerialIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_IN);
        }
    }

    public boolean getSerialIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_IN);
    }

    public EcpLicenseWhereInput serialLt(String serialLt) {

        this.serialLt = serialLt;
        return this;
    }

    /**
     * Get serialLt
     *
     * @return serialLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialLt() {
        return serialLt;
    }

    public void setSerialLt(String serialLt) {
        this.serialLt = serialLt;
    }

    public EcpLicenseWhereInput serialLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_LT);
        return this;
    }

    public EcpLicenseWhereInput serialLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_LT);
        return this;
    }

    public void setSerialLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_LT);
        }
    }

    public boolean getSerialLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_LT);
    }

    public EcpLicenseWhereInput serialLte(String serialLte) {

        this.serialLte = serialLte;
        return this;
    }

    /**
     * Get serialLte
     *
     * @return serialLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialLte() {
        return serialLte;
    }

    public void setSerialLte(String serialLte) {
        this.serialLte = serialLte;
    }

    public EcpLicenseWhereInput serialLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_LTE);
        return this;
    }

    public EcpLicenseWhereInput serialLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_LTE);
        return this;
    }

    public void setSerialLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_LTE);
        }
    }

    public boolean getSerialLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_LTE);
    }

    public EcpLicenseWhereInput serialNot(String serialNot) {

        this.serialNot = serialNot;
        return this;
    }

    /**
     * Get serialNot
     *
     * @return serialNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialNot() {
        return serialNot;
    }

    public void setSerialNot(String serialNot) {
        this.serialNot = serialNot;
    }

    public EcpLicenseWhereInput serialNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT);
        return this;
    }

    public EcpLicenseWhereInput serialNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT);
        return this;
    }

    public void setSerialNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT);
        }
    }

    public boolean getSerialNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_NOT);
    }

    public EcpLicenseWhereInput serialNotContains(String serialNotContains) {

        this.serialNotContains = serialNotContains;
        return this;
    }

    /**
     * Get serialNotContains
     *
     * @return serialNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialNotContains() {
        return serialNotContains;
    }

    public void setSerialNotContains(String serialNotContains) {
        this.serialNotContains = serialNotContains;
    }

    public EcpLicenseWhereInput serialNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput serialNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_CONTAINS);
        return this;
    }

    public void setSerialNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_CONTAINS);
        }
    }

    public boolean getSerialNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput serialNotEndsWith(String serialNotEndsWith) {

        this.serialNotEndsWith = serialNotEndsWith;
        return this;
    }

    /**
     * Get serialNotEndsWith
     *
     * @return serialNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialNotEndsWith() {
        return serialNotEndsWith;
    }

    public void setSerialNotEndsWith(String serialNotEndsWith) {
        this.serialNotEndsWith = serialNotEndsWith;
    }

    public EcpLicenseWhereInput serialNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput serialNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH);
        return this;
    }

    public void setSerialNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH);
        }
    }

    public boolean getSerialNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput serialNotIn(List<String> serialNotIn) {

        this.serialNotIn = serialNotIn;
        return this;
    }

    public EcpLicenseWhereInput addSerialNotInItem(String serialNotInItem) {
        if (this.serialNotIn == null) {
            this.serialNotIn = new ArrayList<String>();
        }
        this.serialNotIn.add(serialNotInItem);
        return this;
    }

    /**
     * Get serialNotIn
     *
     * @return serialNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSerialNotIn() {
        return serialNotIn;
    }

    public void setSerialNotIn(List<String> serialNotIn) {
        this.serialNotIn = serialNotIn;
    }

    public EcpLicenseWhereInput serialNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput serialNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_IN);
        return this;
    }

    public void setSerialNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_IN);
        }
    }

    public boolean getSerialNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_NOT_IN);
    }

    public EcpLicenseWhereInput serialNotStartsWith(String serialNotStartsWith) {

        this.serialNotStartsWith = serialNotStartsWith;
        return this;
    }

    /**
     * Get serialNotStartsWith
     *
     * @return serialNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialNotStartsWith() {
        return serialNotStartsWith;
    }

    public void setSerialNotStartsWith(String serialNotStartsWith) {
        this.serialNotStartsWith = serialNotStartsWith;
    }

    public EcpLicenseWhereInput serialNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput serialNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH);
        return this;
    }

    public void setSerialNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH);
        }
    }

    public boolean getSerialNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput serialStartsWith(String serialStartsWith) {

        this.serialStartsWith = serialStartsWith;
        return this;
    }

    /**
     * Get serialStartsWith
     *
     * @return serialStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialStartsWith() {
        return serialStartsWith;
    }

    public void setSerialStartsWith(String serialStartsWith) {
        this.serialStartsWith = serialStartsWith;
    }

    public EcpLicenseWhereInput serialStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput serialStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_STARTS_WITH);
        return this;
    }

    public void setSerialStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_STARTS_WITH);
        }
    }

    public boolean getSerialStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_STARTS_WITH);
    }

    public EcpLicenseWhereInput signDate(String signDate) {

        this.signDate = signDate;
        return this;
    }

    /**
     * Get signDate
     *
     * @return signDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

    public EcpLicenseWhereInput signDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE);
        return this;
    }

    public EcpLicenseWhereInput signDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE);
        return this;
    }

    public void setSignDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE);
        }
    }

    public boolean getSignDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE);
    }

    public EcpLicenseWhereInput signDateGt(String signDateGt) {

        this.signDateGt = signDateGt;
        return this;
    }

    /**
     * Get signDateGt
     *
     * @return signDateGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSignDateGt() {
        return signDateGt;
    }

    public void setSignDateGt(String signDateGt) {
        this.signDateGt = signDateGt;
    }

    public EcpLicenseWhereInput signDateGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_GT);
        return this;
    }

    public EcpLicenseWhereInput signDateGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_GT);
        return this;
    }

    public void setSignDateGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_GT);
        }
    }

    public boolean getSignDateGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_GT);
    }

    public EcpLicenseWhereInput signDateGte(String signDateGte) {

        this.signDateGte = signDateGte;
        return this;
    }

    /**
     * Get signDateGte
     *
     * @return signDateGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSignDateGte() {
        return signDateGte;
    }

    public void setSignDateGte(String signDateGte) {
        this.signDateGte = signDateGte;
    }

    public EcpLicenseWhereInput signDateGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_GTE);
        return this;
    }

    public EcpLicenseWhereInput signDateGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_GTE);
        return this;
    }

    public void setSignDateGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_GTE);
        }
    }

    public boolean getSignDateGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_GTE);
    }

    public EcpLicenseWhereInput signDateIn(List<String> signDateIn) {

        this.signDateIn = signDateIn;
        return this;
    }

    public EcpLicenseWhereInput addSignDateInItem(String signDateInItem) {
        if (this.signDateIn == null) {
            this.signDateIn = new ArrayList<String>();
        }
        this.signDateIn.add(signDateInItem);
        return this;
    }

    /**
     * Get signDateIn
     *
     * @return signDateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSignDateIn() {
        return signDateIn;
    }

    public void setSignDateIn(List<String> signDateIn) {
        this.signDateIn = signDateIn;
    }

    public EcpLicenseWhereInput signDateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_IN);
        return this;
    }

    public EcpLicenseWhereInput signDateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_IN);
        return this;
    }

    public void setSignDateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_IN);
        }
    }

    public boolean getSignDateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_IN);
    }

    public EcpLicenseWhereInput signDateLt(String signDateLt) {

        this.signDateLt = signDateLt;
        return this;
    }

    /**
     * Get signDateLt
     *
     * @return signDateLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSignDateLt() {
        return signDateLt;
    }

    public void setSignDateLt(String signDateLt) {
        this.signDateLt = signDateLt;
    }

    public EcpLicenseWhereInput signDateLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_LT);
        return this;
    }

    public EcpLicenseWhereInput signDateLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_LT);
        return this;
    }

    public void setSignDateLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_LT);
        }
    }

    public boolean getSignDateLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_LT);
    }

    public EcpLicenseWhereInput signDateLte(String signDateLte) {

        this.signDateLte = signDateLte;
        return this;
    }

    /**
     * Get signDateLte
     *
     * @return signDateLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSignDateLte() {
        return signDateLte;
    }

    public void setSignDateLte(String signDateLte) {
        this.signDateLte = signDateLte;
    }

    public EcpLicenseWhereInput signDateLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_LTE);
        return this;
    }

    public EcpLicenseWhereInput signDateLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_LTE);
        return this;
    }

    public void setSignDateLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_LTE);
        }
    }

    public boolean getSignDateLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_LTE);
    }

    public EcpLicenseWhereInput signDateNot(String signDateNot) {

        this.signDateNot = signDateNot;
        return this;
    }

    /**
     * Get signDateNot
     *
     * @return signDateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSignDateNot() {
        return signDateNot;
    }

    public void setSignDateNot(String signDateNot) {
        this.signDateNot = signDateNot;
    }

    public EcpLicenseWhereInput signDateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_NOT);
        return this;
    }

    public EcpLicenseWhereInput signDateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_NOT);
        return this;
    }

    public void setSignDateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_NOT);
        }
    }

    public boolean getSignDateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_NOT);
    }

    public EcpLicenseWhereInput signDateNotIn(List<String> signDateNotIn) {

        this.signDateNotIn = signDateNotIn;
        return this;
    }

    public EcpLicenseWhereInput addSignDateNotInItem(String signDateNotInItem) {
        if (this.signDateNotIn == null) {
            this.signDateNotIn = new ArrayList<String>();
        }
        this.signDateNotIn.add(signDateNotInItem);
        return this;
    }

    /**
     * Get signDateNotIn
     *
     * @return signDateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSignDateNotIn() {
        return signDateNotIn;
    }

    public void setSignDateNotIn(List<String> signDateNotIn) {
        this.signDateNotIn = signDateNotIn;
    }

    public EcpLicenseWhereInput signDateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput signDateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_NOT_IN);
        return this;
    }

    public void setSignDateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_NOT_IN);
        }
    }

    public boolean getSignDateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_NOT_IN);
    }

    public EcpLicenseWhereInput subscriptionExpireDate(String subscriptionExpireDate) {

        this.subscriptionExpireDate = subscriptionExpireDate;
        return this;
    }

    /**
     * Get subscriptionExpireDate
     *
     * @return subscriptionExpireDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionExpireDate() {
        return subscriptionExpireDate;
    }

    public void setSubscriptionExpireDate(String subscriptionExpireDate) {
        this.subscriptionExpireDate = subscriptionExpireDate;
    }

    public EcpLicenseWhereInput subscriptionExpireDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE);
        return this;
    }

    public EcpLicenseWhereInput subscriptionExpireDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE);
        return this;
    }

    public void setSubscriptionExpireDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE);
        }
    }

    public boolean getSubscriptionExpireDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE);
    }

    public EcpLicenseWhereInput subscriptionExpireDateGt(String subscriptionExpireDateGt) {

        this.subscriptionExpireDateGt = subscriptionExpireDateGt;
        return this;
    }

    /**
     * Get subscriptionExpireDateGt
     *
     * @return subscriptionExpireDateGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionExpireDateGt() {
        return subscriptionExpireDateGt;
    }

    public void setSubscriptionExpireDateGt(String subscriptionExpireDateGt) {
        this.subscriptionExpireDateGt = subscriptionExpireDateGt;
    }

    public EcpLicenseWhereInput subscriptionExpireDateGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GT);
        return this;
    }

    public EcpLicenseWhereInput subscriptionExpireDateGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GT);
        return this;
    }

    public void setSubscriptionExpireDateGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GT);
        }
    }

    public boolean getSubscriptionExpireDateGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GT);
    }

    public EcpLicenseWhereInput subscriptionExpireDateGte(String subscriptionExpireDateGte) {

        this.subscriptionExpireDateGte = subscriptionExpireDateGte;
        return this;
    }

    /**
     * Get subscriptionExpireDateGte
     *
     * @return subscriptionExpireDateGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionExpireDateGte() {
        return subscriptionExpireDateGte;
    }

    public void setSubscriptionExpireDateGte(String subscriptionExpireDateGte) {
        this.subscriptionExpireDateGte = subscriptionExpireDateGte;
    }

    public EcpLicenseWhereInput subscriptionExpireDateGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GTE);
        return this;
    }

    public EcpLicenseWhereInput subscriptionExpireDateGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GTE);
        return this;
    }

    public void setSubscriptionExpireDateGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GTE);
        }
    }

    public boolean getSubscriptionExpireDateGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GTE);
    }

    public EcpLicenseWhereInput subscriptionExpireDateIn(List<String> subscriptionExpireDateIn) {

        this.subscriptionExpireDateIn = subscriptionExpireDateIn;
        return this;
    }

    public EcpLicenseWhereInput addSubscriptionExpireDateInItem(
            String subscriptionExpireDateInItem) {
        if (this.subscriptionExpireDateIn == null) {
            this.subscriptionExpireDateIn = new ArrayList<String>();
        }
        this.subscriptionExpireDateIn.add(subscriptionExpireDateInItem);
        return this;
    }

    /**
     * Get subscriptionExpireDateIn
     *
     * @return subscriptionExpireDateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSubscriptionExpireDateIn() {
        return subscriptionExpireDateIn;
    }

    public void setSubscriptionExpireDateIn(List<String> subscriptionExpireDateIn) {
        this.subscriptionExpireDateIn = subscriptionExpireDateIn;
    }

    public EcpLicenseWhereInput subscriptionExpireDateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_IN);
        return this;
    }

    public EcpLicenseWhereInput subscriptionExpireDateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_IN);
        return this;
    }

    public void setSubscriptionExpireDateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_IN);
        }
    }

    public boolean getSubscriptionExpireDateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_IN);
    }

    public EcpLicenseWhereInput subscriptionExpireDateLt(String subscriptionExpireDateLt) {

        this.subscriptionExpireDateLt = subscriptionExpireDateLt;
        return this;
    }

    /**
     * Get subscriptionExpireDateLt
     *
     * @return subscriptionExpireDateLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionExpireDateLt() {
        return subscriptionExpireDateLt;
    }

    public void setSubscriptionExpireDateLt(String subscriptionExpireDateLt) {
        this.subscriptionExpireDateLt = subscriptionExpireDateLt;
    }

    public EcpLicenseWhereInput subscriptionExpireDateLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LT);
        return this;
    }

    public EcpLicenseWhereInput subscriptionExpireDateLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LT);
        return this;
    }

    public void setSubscriptionExpireDateLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LT);
        }
    }

    public boolean getSubscriptionExpireDateLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LT);
    }

    public EcpLicenseWhereInput subscriptionExpireDateLte(String subscriptionExpireDateLte) {

        this.subscriptionExpireDateLte = subscriptionExpireDateLte;
        return this;
    }

    /**
     * Get subscriptionExpireDateLte
     *
     * @return subscriptionExpireDateLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionExpireDateLte() {
        return subscriptionExpireDateLte;
    }

    public void setSubscriptionExpireDateLte(String subscriptionExpireDateLte) {
        this.subscriptionExpireDateLte = subscriptionExpireDateLte;
    }

    public EcpLicenseWhereInput subscriptionExpireDateLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LTE);
        return this;
    }

    public EcpLicenseWhereInput subscriptionExpireDateLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LTE);
        return this;
    }

    public void setSubscriptionExpireDateLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LTE);
        }
    }

    public boolean getSubscriptionExpireDateLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LTE);
    }

    public EcpLicenseWhereInput subscriptionExpireDateNot(String subscriptionExpireDateNot) {

        this.subscriptionExpireDateNot = subscriptionExpireDateNot;
        return this;
    }

    /**
     * Get subscriptionExpireDateNot
     *
     * @return subscriptionExpireDateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionExpireDateNot() {
        return subscriptionExpireDateNot;
    }

    public void setSubscriptionExpireDateNot(String subscriptionExpireDateNot) {
        this.subscriptionExpireDateNot = subscriptionExpireDateNot;
    }

    public EcpLicenseWhereInput subscriptionExpireDateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT);
        return this;
    }

    public EcpLicenseWhereInput subscriptionExpireDateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT);
        return this;
    }

    public void setSubscriptionExpireDateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT);
        }
    }

    public boolean getSubscriptionExpireDateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT);
    }

    public EcpLicenseWhereInput subscriptionExpireDateNotIn(
            List<String> subscriptionExpireDateNotIn) {

        this.subscriptionExpireDateNotIn = subscriptionExpireDateNotIn;
        return this;
    }

    public EcpLicenseWhereInput addSubscriptionExpireDateNotInItem(
            String subscriptionExpireDateNotInItem) {
        if (this.subscriptionExpireDateNotIn == null) {
            this.subscriptionExpireDateNotIn = new ArrayList<String>();
        }
        this.subscriptionExpireDateNotIn.add(subscriptionExpireDateNotInItem);
        return this;
    }

    /**
     * Get subscriptionExpireDateNotIn
     *
     * @return subscriptionExpireDateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSubscriptionExpireDateNotIn() {
        return subscriptionExpireDateNotIn;
    }

    public void setSubscriptionExpireDateNotIn(List<String> subscriptionExpireDateNotIn) {
        this.subscriptionExpireDateNotIn = subscriptionExpireDateNotIn;
    }

    public EcpLicenseWhereInput subscriptionExpireDateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput subscriptionExpireDateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT_IN);
        return this;
    }

    public void setSubscriptionExpireDateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT_IN);
        }
    }

    public boolean getSubscriptionExpireDateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT_IN);
    }

    public EcpLicenseWhereInput subscriptionStartDate(String subscriptionStartDate) {

        this.subscriptionStartDate = subscriptionStartDate;
        return this;
    }

    /**
     * Get subscriptionStartDate
     *
     * @return subscriptionStartDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionStartDate() {
        return subscriptionStartDate;
    }

    public void setSubscriptionStartDate(String subscriptionStartDate) {
        this.subscriptionStartDate = subscriptionStartDate;
    }

    public EcpLicenseWhereInput subscriptionStartDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE);
        return this;
    }

    public EcpLicenseWhereInput subscriptionStartDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE);
        return this;
    }

    public void setSubscriptionStartDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE);
        }
    }

    public boolean getSubscriptionStartDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_START_DATE);
    }

    public EcpLicenseWhereInput subscriptionStartDateGt(String subscriptionStartDateGt) {

        this.subscriptionStartDateGt = subscriptionStartDateGt;
        return this;
    }

    /**
     * Get subscriptionStartDateGt
     *
     * @return subscriptionStartDateGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionStartDateGt() {
        return subscriptionStartDateGt;
    }

    public void setSubscriptionStartDateGt(String subscriptionStartDateGt) {
        this.subscriptionStartDateGt = subscriptionStartDateGt;
    }

    public EcpLicenseWhereInput subscriptionStartDateGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GT);
        return this;
    }

    public EcpLicenseWhereInput subscriptionStartDateGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GT);
        return this;
    }

    public void setSubscriptionStartDateGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GT);
        }
    }

    public boolean getSubscriptionStartDateGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GT);
    }

    public EcpLicenseWhereInput subscriptionStartDateGte(String subscriptionStartDateGte) {

        this.subscriptionStartDateGte = subscriptionStartDateGte;
        return this;
    }

    /**
     * Get subscriptionStartDateGte
     *
     * @return subscriptionStartDateGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionStartDateGte() {
        return subscriptionStartDateGte;
    }

    public void setSubscriptionStartDateGte(String subscriptionStartDateGte) {
        this.subscriptionStartDateGte = subscriptionStartDateGte;
    }

    public EcpLicenseWhereInput subscriptionStartDateGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GTE);
        return this;
    }

    public EcpLicenseWhereInput subscriptionStartDateGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GTE);
        return this;
    }

    public void setSubscriptionStartDateGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GTE);
        }
    }

    public boolean getSubscriptionStartDateGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GTE);
    }

    public EcpLicenseWhereInput subscriptionStartDateIn(List<String> subscriptionStartDateIn) {

        this.subscriptionStartDateIn = subscriptionStartDateIn;
        return this;
    }

    public EcpLicenseWhereInput addSubscriptionStartDateInItem(String subscriptionStartDateInItem) {
        if (this.subscriptionStartDateIn == null) {
            this.subscriptionStartDateIn = new ArrayList<String>();
        }
        this.subscriptionStartDateIn.add(subscriptionStartDateInItem);
        return this;
    }

    /**
     * Get subscriptionStartDateIn
     *
     * @return subscriptionStartDateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSubscriptionStartDateIn() {
        return subscriptionStartDateIn;
    }

    public void setSubscriptionStartDateIn(List<String> subscriptionStartDateIn) {
        this.subscriptionStartDateIn = subscriptionStartDateIn;
    }

    public EcpLicenseWhereInput subscriptionStartDateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_IN);
        return this;
    }

    public EcpLicenseWhereInput subscriptionStartDateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_IN);
        return this;
    }

    public void setSubscriptionStartDateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_IN);
        }
    }

    public boolean getSubscriptionStartDateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_IN);
    }

    public EcpLicenseWhereInput subscriptionStartDateLt(String subscriptionStartDateLt) {

        this.subscriptionStartDateLt = subscriptionStartDateLt;
        return this;
    }

    /**
     * Get subscriptionStartDateLt
     *
     * @return subscriptionStartDateLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionStartDateLt() {
        return subscriptionStartDateLt;
    }

    public void setSubscriptionStartDateLt(String subscriptionStartDateLt) {
        this.subscriptionStartDateLt = subscriptionStartDateLt;
    }

    public EcpLicenseWhereInput subscriptionStartDateLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LT);
        return this;
    }

    public EcpLicenseWhereInput subscriptionStartDateLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LT);
        return this;
    }

    public void setSubscriptionStartDateLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LT);
        }
    }

    public boolean getSubscriptionStartDateLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LT);
    }

    public EcpLicenseWhereInput subscriptionStartDateLte(String subscriptionStartDateLte) {

        this.subscriptionStartDateLte = subscriptionStartDateLte;
        return this;
    }

    /**
     * Get subscriptionStartDateLte
     *
     * @return subscriptionStartDateLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionStartDateLte() {
        return subscriptionStartDateLte;
    }

    public void setSubscriptionStartDateLte(String subscriptionStartDateLte) {
        this.subscriptionStartDateLte = subscriptionStartDateLte;
    }

    public EcpLicenseWhereInput subscriptionStartDateLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LTE);
        return this;
    }

    public EcpLicenseWhereInput subscriptionStartDateLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LTE);
        return this;
    }

    public void setSubscriptionStartDateLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LTE);
        }
    }

    public boolean getSubscriptionStartDateLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LTE);
    }

    public EcpLicenseWhereInput subscriptionStartDateNot(String subscriptionStartDateNot) {

        this.subscriptionStartDateNot = subscriptionStartDateNot;
        return this;
    }

    /**
     * Get subscriptionStartDateNot
     *
     * @return subscriptionStartDateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionStartDateNot() {
        return subscriptionStartDateNot;
    }

    public void setSubscriptionStartDateNot(String subscriptionStartDateNot) {
        this.subscriptionStartDateNot = subscriptionStartDateNot;
    }

    public EcpLicenseWhereInput subscriptionStartDateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT);
        return this;
    }

    public EcpLicenseWhereInput subscriptionStartDateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT);
        return this;
    }

    public void setSubscriptionStartDateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT);
        }
    }

    public boolean getSubscriptionStartDateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT);
    }

    public EcpLicenseWhereInput subscriptionStartDateNotIn(
            List<String> subscriptionStartDateNotIn) {

        this.subscriptionStartDateNotIn = subscriptionStartDateNotIn;
        return this;
    }

    public EcpLicenseWhereInput addSubscriptionStartDateNotInItem(
            String subscriptionStartDateNotInItem) {
        if (this.subscriptionStartDateNotIn == null) {
            this.subscriptionStartDateNotIn = new ArrayList<String>();
        }
        this.subscriptionStartDateNotIn.add(subscriptionStartDateNotInItem);
        return this;
    }

    /**
     * Get subscriptionStartDateNotIn
     *
     * @return subscriptionStartDateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSubscriptionStartDateNotIn() {
        return subscriptionStartDateNotIn;
    }

    public void setSubscriptionStartDateNotIn(List<String> subscriptionStartDateNotIn) {
        this.subscriptionStartDateNotIn = subscriptionStartDateNotIn;
    }

    public EcpLicenseWhereInput subscriptionStartDateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput subscriptionStartDateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT_IN);
        return this;
    }

    public void setSubscriptionStartDateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT_IN);
        }
    }

    public boolean getSubscriptionStartDateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT_IN);
    }

    public EcpLicenseWhereInput syncReplication(String syncReplication) {

        this.syncReplication = syncReplication;
        return this;
    }

    /**
     * Get syncReplication
     *
     * @return syncReplication
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSyncReplication() {
        return syncReplication;
    }

    public void setSyncReplication(String syncReplication) {
        this.syncReplication = syncReplication;
    }

    public EcpLicenseWhereInput syncReplication_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION);
        return this;
    }

    public EcpLicenseWhereInput syncReplication_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION);
        return this;
    }

    public void setSyncReplication_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION);
        }
    }

    public boolean getSyncReplication_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_REPLICATION);
    }

    public EcpLicenseWhereInput syncReplicationContains(String syncReplicationContains) {

        this.syncReplicationContains = syncReplicationContains;
        return this;
    }

    /**
     * Get syncReplicationContains
     *
     * @return syncReplicationContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSyncReplicationContains() {
        return syncReplicationContains;
    }

    public void setSyncReplicationContains(String syncReplicationContains) {
        this.syncReplicationContains = syncReplicationContains;
    }

    public EcpLicenseWhereInput syncReplicationContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput syncReplicationContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_CONTAINS);
        return this;
    }

    public void setSyncReplicationContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_CONTAINS);
        }
    }

    public boolean getSyncReplicationContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_REPLICATION_CONTAINS);
    }

    public EcpLicenseWhereInput syncReplicationEndsWith(String syncReplicationEndsWith) {

        this.syncReplicationEndsWith = syncReplicationEndsWith;
        return this;
    }

    /**
     * Get syncReplicationEndsWith
     *
     * @return syncReplicationEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSyncReplicationEndsWith() {
        return syncReplicationEndsWith;
    }

    public void setSyncReplicationEndsWith(String syncReplicationEndsWith) {
        this.syncReplicationEndsWith = syncReplicationEndsWith;
    }

    public EcpLicenseWhereInput syncReplicationEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput syncReplicationEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_ENDS_WITH);
        return this;
    }

    public void setSyncReplicationEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_ENDS_WITH);
        }
    }

    public boolean getSyncReplicationEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_REPLICATION_ENDS_WITH);
    }

    public EcpLicenseWhereInput syncReplicationGt(String syncReplicationGt) {

        this.syncReplicationGt = syncReplicationGt;
        return this;
    }

    /**
     * Get syncReplicationGt
     *
     * @return syncReplicationGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSyncReplicationGt() {
        return syncReplicationGt;
    }

    public void setSyncReplicationGt(String syncReplicationGt) {
        this.syncReplicationGt = syncReplicationGt;
    }

    public EcpLicenseWhereInput syncReplicationGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_GT);
        return this;
    }

    public EcpLicenseWhereInput syncReplicationGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_GT);
        return this;
    }

    public void setSyncReplicationGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_GT);
        }
    }

    public boolean getSyncReplicationGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_REPLICATION_GT);
    }

    public EcpLicenseWhereInput syncReplicationGte(String syncReplicationGte) {

        this.syncReplicationGte = syncReplicationGte;
        return this;
    }

    /**
     * Get syncReplicationGte
     *
     * @return syncReplicationGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSyncReplicationGte() {
        return syncReplicationGte;
    }

    public void setSyncReplicationGte(String syncReplicationGte) {
        this.syncReplicationGte = syncReplicationGte;
    }

    public EcpLicenseWhereInput syncReplicationGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_GTE);
        return this;
    }

    public EcpLicenseWhereInput syncReplicationGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_GTE);
        return this;
    }

    public void setSyncReplicationGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_GTE);
        }
    }

    public boolean getSyncReplicationGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_REPLICATION_GTE);
    }

    public EcpLicenseWhereInput syncReplicationIn(List<String> syncReplicationIn) {

        this.syncReplicationIn = syncReplicationIn;
        return this;
    }

    public EcpLicenseWhereInput addSyncReplicationInItem(String syncReplicationInItem) {
        if (this.syncReplicationIn == null) {
            this.syncReplicationIn = new ArrayList<String>();
        }
        this.syncReplicationIn.add(syncReplicationInItem);
        return this;
    }

    /**
     * Get syncReplicationIn
     *
     * @return syncReplicationIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSyncReplicationIn() {
        return syncReplicationIn;
    }

    public void setSyncReplicationIn(List<String> syncReplicationIn) {
        this.syncReplicationIn = syncReplicationIn;
    }

    public EcpLicenseWhereInput syncReplicationIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_IN);
        return this;
    }

    public EcpLicenseWhereInput syncReplicationIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_IN);
        return this;
    }

    public void setSyncReplicationIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_IN);
        }
    }

    public boolean getSyncReplicationIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_REPLICATION_IN);
    }

    public EcpLicenseWhereInput syncReplicationLt(String syncReplicationLt) {

        this.syncReplicationLt = syncReplicationLt;
        return this;
    }

    /**
     * Get syncReplicationLt
     *
     * @return syncReplicationLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSyncReplicationLt() {
        return syncReplicationLt;
    }

    public void setSyncReplicationLt(String syncReplicationLt) {
        this.syncReplicationLt = syncReplicationLt;
    }

    public EcpLicenseWhereInput syncReplicationLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_LT);
        return this;
    }

    public EcpLicenseWhereInput syncReplicationLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_LT);
        return this;
    }

    public void setSyncReplicationLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_LT);
        }
    }

    public boolean getSyncReplicationLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_REPLICATION_LT);
    }

    public EcpLicenseWhereInput syncReplicationLte(String syncReplicationLte) {

        this.syncReplicationLte = syncReplicationLte;
        return this;
    }

    /**
     * Get syncReplicationLte
     *
     * @return syncReplicationLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSyncReplicationLte() {
        return syncReplicationLte;
    }

    public void setSyncReplicationLte(String syncReplicationLte) {
        this.syncReplicationLte = syncReplicationLte;
    }

    public EcpLicenseWhereInput syncReplicationLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_LTE);
        return this;
    }

    public EcpLicenseWhereInput syncReplicationLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_LTE);
        return this;
    }

    public void setSyncReplicationLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_LTE);
        }
    }

    public boolean getSyncReplicationLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_REPLICATION_LTE);
    }

    public EcpLicenseWhereInput syncReplicationNot(String syncReplicationNot) {

        this.syncReplicationNot = syncReplicationNot;
        return this;
    }

    /**
     * Get syncReplicationNot
     *
     * @return syncReplicationNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSyncReplicationNot() {
        return syncReplicationNot;
    }

    public void setSyncReplicationNot(String syncReplicationNot) {
        this.syncReplicationNot = syncReplicationNot;
    }

    public EcpLicenseWhereInput syncReplicationNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_NOT);
        return this;
    }

    public EcpLicenseWhereInput syncReplicationNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_NOT);
        return this;
    }

    public void setSyncReplicationNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_NOT);
        }
    }

    public boolean getSyncReplicationNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_REPLICATION_NOT);
    }

    public EcpLicenseWhereInput syncReplicationNotContains(String syncReplicationNotContains) {

        this.syncReplicationNotContains = syncReplicationNotContains;
        return this;
    }

    /**
     * Get syncReplicationNotContains
     *
     * @return syncReplicationNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSyncReplicationNotContains() {
        return syncReplicationNotContains;
    }

    public void setSyncReplicationNotContains(String syncReplicationNotContains) {
        this.syncReplicationNotContains = syncReplicationNotContains;
    }

    public EcpLicenseWhereInput syncReplicationNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput syncReplicationNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_NOT_CONTAINS);
        return this;
    }

    public void setSyncReplicationNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_NOT_CONTAINS);
        }
    }

    public boolean getSyncReplicationNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_REPLICATION_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput syncReplicationNotEndsWith(String syncReplicationNotEndsWith) {

        this.syncReplicationNotEndsWith = syncReplicationNotEndsWith;
        return this;
    }

    /**
     * Get syncReplicationNotEndsWith
     *
     * @return syncReplicationNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSyncReplicationNotEndsWith() {
        return syncReplicationNotEndsWith;
    }

    public void setSyncReplicationNotEndsWith(String syncReplicationNotEndsWith) {
        this.syncReplicationNotEndsWith = syncReplicationNotEndsWith;
    }

    public EcpLicenseWhereInput syncReplicationNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput syncReplicationNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_NOT_ENDS_WITH);
        return this;
    }

    public void setSyncReplicationNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_NOT_ENDS_WITH);
        }
    }

    public boolean getSyncReplicationNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_REPLICATION_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput syncReplicationNotIn(List<String> syncReplicationNotIn) {

        this.syncReplicationNotIn = syncReplicationNotIn;
        return this;
    }

    public EcpLicenseWhereInput addSyncReplicationNotInItem(String syncReplicationNotInItem) {
        if (this.syncReplicationNotIn == null) {
            this.syncReplicationNotIn = new ArrayList<String>();
        }
        this.syncReplicationNotIn.add(syncReplicationNotInItem);
        return this;
    }

    /**
     * Get syncReplicationNotIn
     *
     * @return syncReplicationNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSyncReplicationNotIn() {
        return syncReplicationNotIn;
    }

    public void setSyncReplicationNotIn(List<String> syncReplicationNotIn) {
        this.syncReplicationNotIn = syncReplicationNotIn;
    }

    public EcpLicenseWhereInput syncReplicationNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput syncReplicationNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_NOT_IN);
        return this;
    }

    public void setSyncReplicationNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_NOT_IN);
        }
    }

    public boolean getSyncReplicationNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_REPLICATION_NOT_IN);
    }

    public EcpLicenseWhereInput syncReplicationNotStartsWith(String syncReplicationNotStartsWith) {

        this.syncReplicationNotStartsWith = syncReplicationNotStartsWith;
        return this;
    }

    /**
     * Get syncReplicationNotStartsWith
     *
     * @return syncReplicationNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSyncReplicationNotStartsWith() {
        return syncReplicationNotStartsWith;
    }

    public void setSyncReplicationNotStartsWith(String syncReplicationNotStartsWith) {
        this.syncReplicationNotStartsWith = syncReplicationNotStartsWith;
    }

    public EcpLicenseWhereInput syncReplicationNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput syncReplicationNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_NOT_STARTS_WITH);
        return this;
    }

    public void setSyncReplicationNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_NOT_STARTS_WITH);
        }
    }

    public boolean getSyncReplicationNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_REPLICATION_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput syncReplicationStartsWith(String syncReplicationStartsWith) {

        this.syncReplicationStartsWith = syncReplicationStartsWith;
        return this;
    }

    /**
     * Get syncReplicationStartsWith
     *
     * @return syncReplicationStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSyncReplicationStartsWith() {
        return syncReplicationStartsWith;
    }

    public void setSyncReplicationStartsWith(String syncReplicationStartsWith) {
        this.syncReplicationStartsWith = syncReplicationStartsWith;
    }

    public EcpLicenseWhereInput syncReplicationStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput syncReplicationStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_STARTS_WITH);
        return this;
    }

    public void setSyncReplicationStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_STARTS_WITH);
        }
    }

    public boolean getSyncReplicationStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_REPLICATION_STARTS_WITH);
    }

    public EcpLicenseWhereInput trafficVisualization(String trafficVisualization) {

        this.trafficVisualization = trafficVisualization;
        return this;
    }

    /**
     * Get trafficVisualization
     *
     * @return trafficVisualization
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTrafficVisualization() {
        return trafficVisualization;
    }

    public void setTrafficVisualization(String trafficVisualization) {
        this.trafficVisualization = trafficVisualization;
    }

    public EcpLicenseWhereInput trafficVisualization_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION);
        return this;
    }

    public EcpLicenseWhereInput trafficVisualization_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION);
        return this;
    }

    public void setTrafficVisualization_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION);
        }
    }

    public boolean getTrafficVisualization_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRAFFIC_VISUALIZATION);
    }

    public EcpLicenseWhereInput trafficVisualizationContains(String trafficVisualizationContains) {

        this.trafficVisualizationContains = trafficVisualizationContains;
        return this;
    }

    /**
     * Get trafficVisualizationContains
     *
     * @return trafficVisualizationContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTrafficVisualizationContains() {
        return trafficVisualizationContains;
    }

    public void setTrafficVisualizationContains(String trafficVisualizationContains) {
        this.trafficVisualizationContains = trafficVisualizationContains;
    }

    public EcpLicenseWhereInput trafficVisualizationContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput trafficVisualizationContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_CONTAINS);
        return this;
    }

    public void setTrafficVisualizationContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_CONTAINS);
        }
    }

    public boolean getTrafficVisualizationContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_CONTAINS);
    }

    public EcpLicenseWhereInput trafficVisualizationEndsWith(String trafficVisualizationEndsWith) {

        this.trafficVisualizationEndsWith = trafficVisualizationEndsWith;
        return this;
    }

    /**
     * Get trafficVisualizationEndsWith
     *
     * @return trafficVisualizationEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTrafficVisualizationEndsWith() {
        return trafficVisualizationEndsWith;
    }

    public void setTrafficVisualizationEndsWith(String trafficVisualizationEndsWith) {
        this.trafficVisualizationEndsWith = trafficVisualizationEndsWith;
    }

    public EcpLicenseWhereInput trafficVisualizationEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput trafficVisualizationEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_ENDS_WITH);
        return this;
    }

    public void setTrafficVisualizationEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_ENDS_WITH);
        }
    }

    public boolean getTrafficVisualizationEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_ENDS_WITH);
    }

    public EcpLicenseWhereInput trafficVisualizationGt(String trafficVisualizationGt) {

        this.trafficVisualizationGt = trafficVisualizationGt;
        return this;
    }

    /**
     * Get trafficVisualizationGt
     *
     * @return trafficVisualizationGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTrafficVisualizationGt() {
        return trafficVisualizationGt;
    }

    public void setTrafficVisualizationGt(String trafficVisualizationGt) {
        this.trafficVisualizationGt = trafficVisualizationGt;
    }

    public EcpLicenseWhereInput trafficVisualizationGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_GT);
        return this;
    }

    public EcpLicenseWhereInput trafficVisualizationGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_GT);
        return this;
    }

    public void setTrafficVisualizationGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_GT);
        }
    }

    public boolean getTrafficVisualizationGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_GT);
    }

    public EcpLicenseWhereInput trafficVisualizationGte(String trafficVisualizationGte) {

        this.trafficVisualizationGte = trafficVisualizationGte;
        return this;
    }

    /**
     * Get trafficVisualizationGte
     *
     * @return trafficVisualizationGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTrafficVisualizationGte() {
        return trafficVisualizationGte;
    }

    public void setTrafficVisualizationGte(String trafficVisualizationGte) {
        this.trafficVisualizationGte = trafficVisualizationGte;
    }

    public EcpLicenseWhereInput trafficVisualizationGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_GTE);
        return this;
    }

    public EcpLicenseWhereInput trafficVisualizationGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_GTE);
        return this;
    }

    public void setTrafficVisualizationGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_GTE);
        }
    }

    public boolean getTrafficVisualizationGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_GTE);
    }

    public EcpLicenseWhereInput trafficVisualizationIn(List<String> trafficVisualizationIn) {

        this.trafficVisualizationIn = trafficVisualizationIn;
        return this;
    }

    public EcpLicenseWhereInput addTrafficVisualizationInItem(String trafficVisualizationInItem) {
        if (this.trafficVisualizationIn == null) {
            this.trafficVisualizationIn = new ArrayList<String>();
        }
        this.trafficVisualizationIn.add(trafficVisualizationInItem);
        return this;
    }

    /**
     * Get trafficVisualizationIn
     *
     * @return trafficVisualizationIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getTrafficVisualizationIn() {
        return trafficVisualizationIn;
    }

    public void setTrafficVisualizationIn(List<String> trafficVisualizationIn) {
        this.trafficVisualizationIn = trafficVisualizationIn;
    }

    public EcpLicenseWhereInput trafficVisualizationIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_IN);
        return this;
    }

    public EcpLicenseWhereInput trafficVisualizationIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_IN);
        return this;
    }

    public void setTrafficVisualizationIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_IN);
        }
    }

    public boolean getTrafficVisualizationIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_IN);
    }

    public EcpLicenseWhereInput trafficVisualizationLt(String trafficVisualizationLt) {

        this.trafficVisualizationLt = trafficVisualizationLt;
        return this;
    }

    /**
     * Get trafficVisualizationLt
     *
     * @return trafficVisualizationLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTrafficVisualizationLt() {
        return trafficVisualizationLt;
    }

    public void setTrafficVisualizationLt(String trafficVisualizationLt) {
        this.trafficVisualizationLt = trafficVisualizationLt;
    }

    public EcpLicenseWhereInput trafficVisualizationLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_LT);
        return this;
    }

    public EcpLicenseWhereInput trafficVisualizationLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_LT);
        return this;
    }

    public void setTrafficVisualizationLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_LT);
        }
    }

    public boolean getTrafficVisualizationLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_LT);
    }

    public EcpLicenseWhereInput trafficVisualizationLte(String trafficVisualizationLte) {

        this.trafficVisualizationLte = trafficVisualizationLte;
        return this;
    }

    /**
     * Get trafficVisualizationLte
     *
     * @return trafficVisualizationLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTrafficVisualizationLte() {
        return trafficVisualizationLte;
    }

    public void setTrafficVisualizationLte(String trafficVisualizationLte) {
        this.trafficVisualizationLte = trafficVisualizationLte;
    }

    public EcpLicenseWhereInput trafficVisualizationLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_LTE);
        return this;
    }

    public EcpLicenseWhereInput trafficVisualizationLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_LTE);
        return this;
    }

    public void setTrafficVisualizationLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_LTE);
        }
    }

    public boolean getTrafficVisualizationLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_LTE);
    }

    public EcpLicenseWhereInput trafficVisualizationNot(String trafficVisualizationNot) {

        this.trafficVisualizationNot = trafficVisualizationNot;
        return this;
    }

    /**
     * Get trafficVisualizationNot
     *
     * @return trafficVisualizationNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTrafficVisualizationNot() {
        return trafficVisualizationNot;
    }

    public void setTrafficVisualizationNot(String trafficVisualizationNot) {
        this.trafficVisualizationNot = trafficVisualizationNot;
    }

    public EcpLicenseWhereInput trafficVisualizationNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT);
        return this;
    }

    public EcpLicenseWhereInput trafficVisualizationNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT);
        return this;
    }

    public void setTrafficVisualizationNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT);
        }
    }

    public boolean getTrafficVisualizationNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT);
    }

    public EcpLicenseWhereInput trafficVisualizationNotContains(
            String trafficVisualizationNotContains) {

        this.trafficVisualizationNotContains = trafficVisualizationNotContains;
        return this;
    }

    /**
     * Get trafficVisualizationNotContains
     *
     * @return trafficVisualizationNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTrafficVisualizationNotContains() {
        return trafficVisualizationNotContains;
    }

    public void setTrafficVisualizationNotContains(String trafficVisualizationNotContains) {
        this.trafficVisualizationNotContains = trafficVisualizationNotContains;
    }

    public EcpLicenseWhereInput trafficVisualizationNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput trafficVisualizationNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_CONTAINS);
        return this;
    }

    public void setTrafficVisualizationNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_CONTAINS);
        }
    }

    public boolean getTrafficVisualizationNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput trafficVisualizationNotEndsWith(
            String trafficVisualizationNotEndsWith) {

        this.trafficVisualizationNotEndsWith = trafficVisualizationNotEndsWith;
        return this;
    }

    /**
     * Get trafficVisualizationNotEndsWith
     *
     * @return trafficVisualizationNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTrafficVisualizationNotEndsWith() {
        return trafficVisualizationNotEndsWith;
    }

    public void setTrafficVisualizationNotEndsWith(String trafficVisualizationNotEndsWith) {
        this.trafficVisualizationNotEndsWith = trafficVisualizationNotEndsWith;
    }

    public EcpLicenseWhereInput trafficVisualizationNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput trafficVisualizationNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_ENDS_WITH);
        return this;
    }

    public void setTrafficVisualizationNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_ENDS_WITH);
        }
    }

    public boolean getTrafficVisualizationNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput trafficVisualizationNotIn(List<String> trafficVisualizationNotIn) {

        this.trafficVisualizationNotIn = trafficVisualizationNotIn;
        return this;
    }

    public EcpLicenseWhereInput addTrafficVisualizationNotInItem(
            String trafficVisualizationNotInItem) {
        if (this.trafficVisualizationNotIn == null) {
            this.trafficVisualizationNotIn = new ArrayList<String>();
        }
        this.trafficVisualizationNotIn.add(trafficVisualizationNotInItem);
        return this;
    }

    /**
     * Get trafficVisualizationNotIn
     *
     * @return trafficVisualizationNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getTrafficVisualizationNotIn() {
        return trafficVisualizationNotIn;
    }

    public void setTrafficVisualizationNotIn(List<String> trafficVisualizationNotIn) {
        this.trafficVisualizationNotIn = trafficVisualizationNotIn;
    }

    public EcpLicenseWhereInput trafficVisualizationNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput trafficVisualizationNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_IN);
        return this;
    }

    public void setTrafficVisualizationNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_IN);
        }
    }

    public boolean getTrafficVisualizationNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_IN);
    }

    public EcpLicenseWhereInput trafficVisualizationNotStartsWith(
            String trafficVisualizationNotStartsWith) {

        this.trafficVisualizationNotStartsWith = trafficVisualizationNotStartsWith;
        return this;
    }

    /**
     * Get trafficVisualizationNotStartsWith
     *
     * @return trafficVisualizationNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTrafficVisualizationNotStartsWith() {
        return trafficVisualizationNotStartsWith;
    }

    public void setTrafficVisualizationNotStartsWith(String trafficVisualizationNotStartsWith) {
        this.trafficVisualizationNotStartsWith = trafficVisualizationNotStartsWith;
    }

    public EcpLicenseWhereInput trafficVisualizationNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput trafficVisualizationNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_STARTS_WITH);
        return this;
    }

    public void setTrafficVisualizationNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_STARTS_WITH);
        }
    }

    public boolean getTrafficVisualizationNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput trafficVisualizationStartsWith(
            String trafficVisualizationStartsWith) {

        this.trafficVisualizationStartsWith = trafficVisualizationStartsWith;
        return this;
    }

    /**
     * Get trafficVisualizationStartsWith
     *
     * @return trafficVisualizationStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTrafficVisualizationStartsWith() {
        return trafficVisualizationStartsWith;
    }

    public void setTrafficVisualizationStartsWith(String trafficVisualizationStartsWith) {
        this.trafficVisualizationStartsWith = trafficVisualizationStartsWith;
    }

    public EcpLicenseWhereInput trafficVisualizationStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput trafficVisualizationStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_STARTS_WITH);
        return this;
    }

    public void setTrafficVisualizationStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_STARTS_WITH);
        }
    }

    public boolean getTrafficVisualizationStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TRAFFIC_VISUALIZATION_STARTS_WITH);
    }

    public EcpLicenseWhereInput vendor(String vendor) {

        this.vendor = vendor;
        return this;
    }

    /**
     * Get vendor
     *
     * @return vendor
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public EcpLicenseWhereInput vendor_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR);
        return this;
    }

    public EcpLicenseWhereInput vendor_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR);
        return this;
    }

    public void setVendor_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR);
        }
    }

    public boolean getVendor_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR);
    }

    public EcpLicenseWhereInput vendorContains(String vendorContains) {

        this.vendorContains = vendorContains;
        return this;
    }

    /**
     * Get vendorContains
     *
     * @return vendorContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorContains() {
        return vendorContains;
    }

    public void setVendorContains(String vendorContains) {
        this.vendorContains = vendorContains;
    }

    public EcpLicenseWhereInput vendorContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput vendorContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_CONTAINS);
        return this;
    }

    public void setVendorContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_CONTAINS);
        }
    }

    public boolean getVendorContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_CONTAINS);
    }

    public EcpLicenseWhereInput vendorEndsWith(String vendorEndsWith) {

        this.vendorEndsWith = vendorEndsWith;
        return this;
    }

    /**
     * Get vendorEndsWith
     *
     * @return vendorEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorEndsWith() {
        return vendorEndsWith;
    }

    public void setVendorEndsWith(String vendorEndsWith) {
        this.vendorEndsWith = vendorEndsWith;
    }

    public EcpLicenseWhereInput vendorEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput vendorEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ENDS_WITH);
        return this;
    }

    public void setVendorEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ENDS_WITH);
        }
    }

    public boolean getVendorEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_ENDS_WITH);
    }

    public EcpLicenseWhereInput vendorGt(String vendorGt) {

        this.vendorGt = vendorGt;
        return this;
    }

    /**
     * Get vendorGt
     *
     * @return vendorGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorGt() {
        return vendorGt;
    }

    public void setVendorGt(String vendorGt) {
        this.vendorGt = vendorGt;
    }

    public EcpLicenseWhereInput vendorGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_GT);
        return this;
    }

    public EcpLicenseWhereInput vendorGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_GT);
        return this;
    }

    public void setVendorGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_GT);
        }
    }

    public boolean getVendorGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_GT);
    }

    public EcpLicenseWhereInput vendorGte(String vendorGte) {

        this.vendorGte = vendorGte;
        return this;
    }

    /**
     * Get vendorGte
     *
     * @return vendorGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorGte() {
        return vendorGte;
    }

    public void setVendorGte(String vendorGte) {
        this.vendorGte = vendorGte;
    }

    public EcpLicenseWhereInput vendorGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_GTE);
        return this;
    }

    public EcpLicenseWhereInput vendorGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_GTE);
        return this;
    }

    public void setVendorGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_GTE);
        }
    }

    public boolean getVendorGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_GTE);
    }

    public EcpLicenseWhereInput vendorIn(List<String> vendorIn) {

        this.vendorIn = vendorIn;
        return this;
    }

    public EcpLicenseWhereInput addVendorInItem(String vendorInItem) {
        if (this.vendorIn == null) {
            this.vendorIn = new ArrayList<String>();
        }
        this.vendorIn.add(vendorInItem);
        return this;
    }

    /**
     * Get vendorIn
     *
     * @return vendorIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVendorIn() {
        return vendorIn;
    }

    public void setVendorIn(List<String> vendorIn) {
        this.vendorIn = vendorIn;
    }

    public EcpLicenseWhereInput vendorIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_IN);
        return this;
    }

    public EcpLicenseWhereInput vendorIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_IN);
        return this;
    }

    public void setVendorIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_IN);
        }
    }

    public boolean getVendorIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_IN);
    }

    public EcpLicenseWhereInput vendorLt(String vendorLt) {

        this.vendorLt = vendorLt;
        return this;
    }

    /**
     * Get vendorLt
     *
     * @return vendorLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorLt() {
        return vendorLt;
    }

    public void setVendorLt(String vendorLt) {
        this.vendorLt = vendorLt;
    }

    public EcpLicenseWhereInput vendorLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_LT);
        return this;
    }

    public EcpLicenseWhereInput vendorLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_LT);
        return this;
    }

    public void setVendorLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_LT);
        }
    }

    public boolean getVendorLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_LT);
    }

    public EcpLicenseWhereInput vendorLte(String vendorLte) {

        this.vendorLte = vendorLte;
        return this;
    }

    /**
     * Get vendorLte
     *
     * @return vendorLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorLte() {
        return vendorLte;
    }

    public void setVendorLte(String vendorLte) {
        this.vendorLte = vendorLte;
    }

    public EcpLicenseWhereInput vendorLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_LTE);
        return this;
    }

    public EcpLicenseWhereInput vendorLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_LTE);
        return this;
    }

    public void setVendorLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_LTE);
        }
    }

    public boolean getVendorLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_LTE);
    }

    public EcpLicenseWhereInput vendorNot(String vendorNot) {

        this.vendorNot = vendorNot;
        return this;
    }

    /**
     * Get vendorNot
     *
     * @return vendorNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorNot() {
        return vendorNot;
    }

    public void setVendorNot(String vendorNot) {
        this.vendorNot = vendorNot;
    }

    public EcpLicenseWhereInput vendorNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_NOT);
        return this;
    }

    public EcpLicenseWhereInput vendorNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_NOT);
        return this;
    }

    public void setVendorNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_NOT);
        }
    }

    public boolean getVendorNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_NOT);
    }

    public EcpLicenseWhereInput vendorNotContains(String vendorNotContains) {

        this.vendorNotContains = vendorNotContains;
        return this;
    }

    /**
     * Get vendorNotContains
     *
     * @return vendorNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorNotContains() {
        return vendorNotContains;
    }

    public void setVendorNotContains(String vendorNotContains) {
        this.vendorNotContains = vendorNotContains;
    }

    public EcpLicenseWhereInput vendorNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput vendorNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_NOT_CONTAINS);
        return this;
    }

    public void setVendorNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_NOT_CONTAINS);
        }
    }

    public boolean getVendorNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput vendorNotEndsWith(String vendorNotEndsWith) {

        this.vendorNotEndsWith = vendorNotEndsWith;
        return this;
    }

    /**
     * Get vendorNotEndsWith
     *
     * @return vendorNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorNotEndsWith() {
        return vendorNotEndsWith;
    }

    public void setVendorNotEndsWith(String vendorNotEndsWith) {
        this.vendorNotEndsWith = vendorNotEndsWith;
    }

    public EcpLicenseWhereInput vendorNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput vendorNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_NOT_ENDS_WITH);
        return this;
    }

    public void setVendorNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_NOT_ENDS_WITH);
        }
    }

    public boolean getVendorNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput vendorNotIn(List<String> vendorNotIn) {

        this.vendorNotIn = vendorNotIn;
        return this;
    }

    public EcpLicenseWhereInput addVendorNotInItem(String vendorNotInItem) {
        if (this.vendorNotIn == null) {
            this.vendorNotIn = new ArrayList<String>();
        }
        this.vendorNotIn.add(vendorNotInItem);
        return this;
    }

    /**
     * Get vendorNotIn
     *
     * @return vendorNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVendorNotIn() {
        return vendorNotIn;
    }

    public void setVendorNotIn(List<String> vendorNotIn) {
        this.vendorNotIn = vendorNotIn;
    }

    public EcpLicenseWhereInput vendorNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput vendorNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_NOT_IN);
        return this;
    }

    public void setVendorNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_NOT_IN);
        }
    }

    public boolean getVendorNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_NOT_IN);
    }

    public EcpLicenseWhereInput vendorNotStartsWith(String vendorNotStartsWith) {

        this.vendorNotStartsWith = vendorNotStartsWith;
        return this;
    }

    /**
     * Get vendorNotStartsWith
     *
     * @return vendorNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorNotStartsWith() {
        return vendorNotStartsWith;
    }

    public void setVendorNotStartsWith(String vendorNotStartsWith) {
        this.vendorNotStartsWith = vendorNotStartsWith;
    }

    public EcpLicenseWhereInput vendorNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput vendorNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_NOT_STARTS_WITH);
        return this;
    }

    public void setVendorNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_NOT_STARTS_WITH);
        }
    }

    public boolean getVendorNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput vendorStartsWith(String vendorStartsWith) {

        this.vendorStartsWith = vendorStartsWith;
        return this;
    }

    /**
     * Get vendorStartsWith
     *
     * @return vendorStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorStartsWith() {
        return vendorStartsWith;
    }

    public void setVendorStartsWith(String vendorStartsWith) {
        this.vendorStartsWith = vendorStartsWith;
    }

    public EcpLicenseWhereInput vendorStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput vendorStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_STARTS_WITH);
        return this;
    }

    public void setVendorStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_STARTS_WITH);
        }
    }

    public boolean getVendorStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_STARTS_WITH);
    }

    public EcpLicenseWhereInput version(Integer version) {

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
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public EcpLicenseWhereInput version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public EcpLicenseWhereInput version_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput versionGt(Integer versionGt) {

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
    public Integer getVersionGt() {
        return versionGt;
    }

    public void setVersionGt(Integer versionGt) {
        this.versionGt = versionGt;
    }

    public EcpLicenseWhereInput versionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_GT);
        return this;
    }

    public EcpLicenseWhereInput versionGt_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput versionGte(Integer versionGte) {

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
    public Integer getVersionGte() {
        return versionGte;
    }

    public void setVersionGte(Integer versionGte) {
        this.versionGte = versionGte;
    }

    public EcpLicenseWhereInput versionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_GTE);
        return this;
    }

    public EcpLicenseWhereInput versionGte_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput versionIn(List<Integer> versionIn) {

        this.versionIn = versionIn;
        return this;
    }

    public EcpLicenseWhereInput addVersionInItem(Integer versionInItem) {
        if (this.versionIn == null) {
            this.versionIn = new ArrayList<Integer>();
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
    public List<Integer> getVersionIn() {
        return versionIn;
    }

    public void setVersionIn(List<Integer> versionIn) {
        this.versionIn = versionIn;
    }

    public EcpLicenseWhereInput versionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_IN);
        return this;
    }

    public EcpLicenseWhereInput versionIn_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput versionLt(Integer versionLt) {

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
    public Integer getVersionLt() {
        return versionLt;
    }

    public void setVersionLt(Integer versionLt) {
        this.versionLt = versionLt;
    }

    public EcpLicenseWhereInput versionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_LT);
        return this;
    }

    public EcpLicenseWhereInput versionLt_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput versionLte(Integer versionLte) {

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
    public Integer getVersionLte() {
        return versionLte;
    }

    public void setVersionLte(Integer versionLte) {
        this.versionLte = versionLte;
    }

    public EcpLicenseWhereInput versionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_LTE);
        return this;
    }

    public EcpLicenseWhereInput versionLte_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput versionNot(Integer versionNot) {

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
    public Integer getVersionNot() {
        return versionNot;
    }

    public void setVersionNot(Integer versionNot) {
        this.versionNot = versionNot;
    }

    public EcpLicenseWhereInput versionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT);
        return this;
    }

    public EcpLicenseWhereInput versionNot_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput versionNotIn(List<Integer> versionNotIn) {

        this.versionNotIn = versionNotIn;
        return this;
    }

    public EcpLicenseWhereInput addVersionNotInItem(Integer versionNotInItem) {
        if (this.versionNotIn == null) {
            this.versionNotIn = new ArrayList<Integer>();
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
    public List<Integer> getVersionNotIn() {
        return versionNotIn;
    }

    public void setVersionNotIn(List<Integer> versionNotIn) {
        this.versionNotIn = versionNotIn;
    }

    public EcpLicenseWhereInput versionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput versionNotIn_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput vpc(String vpc) {

        this.vpc = vpc;
        return this;
    }

    /**
     * Get vpc
     *
     * @return vpc
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVpc() {
        return vpc;
    }

    public void setVpc(String vpc) {
        this.vpc = vpc;
    }

    public EcpLicenseWhereInput vpc_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC);
        return this;
    }

    public EcpLicenseWhereInput vpc_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC);
        return this;
    }

    public void setVpc_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC);
        }
    }

    public boolean getVpc_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC);
    }

    public EcpLicenseWhereInput vpcContains(String vpcContains) {

        this.vpcContains = vpcContains;
        return this;
    }

    /**
     * Get vpcContains
     *
     * @return vpcContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVpcContains() {
        return vpcContains;
    }

    public void setVpcContains(String vpcContains) {
        this.vpcContains = vpcContains;
    }

    public EcpLicenseWhereInput vpcContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput vpcContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_CONTAINS);
        return this;
    }

    public void setVpcContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_CONTAINS);
        }
    }

    public boolean getVpcContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_CONTAINS);
    }

    public EcpLicenseWhereInput vpcEndsWith(String vpcEndsWith) {

        this.vpcEndsWith = vpcEndsWith;
        return this;
    }

    /**
     * Get vpcEndsWith
     *
     * @return vpcEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVpcEndsWith() {
        return vpcEndsWith;
    }

    public void setVpcEndsWith(String vpcEndsWith) {
        this.vpcEndsWith = vpcEndsWith;
    }

    public EcpLicenseWhereInput vpcEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput vpcEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_ENDS_WITH);
        return this;
    }

    public void setVpcEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_ENDS_WITH);
        }
    }

    public boolean getVpcEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_ENDS_WITH);
    }

    public EcpLicenseWhereInput vpcGt(String vpcGt) {

        this.vpcGt = vpcGt;
        return this;
    }

    /**
     * Get vpcGt
     *
     * @return vpcGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVpcGt() {
        return vpcGt;
    }

    public void setVpcGt(String vpcGt) {
        this.vpcGt = vpcGt;
    }

    public EcpLicenseWhereInput vpcGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_GT);
        return this;
    }

    public EcpLicenseWhereInput vpcGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_GT);
        return this;
    }

    public void setVpcGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_GT);
        }
    }

    public boolean getVpcGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_GT);
    }

    public EcpLicenseWhereInput vpcGte(String vpcGte) {

        this.vpcGte = vpcGte;
        return this;
    }

    /**
     * Get vpcGte
     *
     * @return vpcGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVpcGte() {
        return vpcGte;
    }

    public void setVpcGte(String vpcGte) {
        this.vpcGte = vpcGte;
    }

    public EcpLicenseWhereInput vpcGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_GTE);
        return this;
    }

    public EcpLicenseWhereInput vpcGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_GTE);
        return this;
    }

    public void setVpcGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_GTE);
        }
    }

    public boolean getVpcGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_GTE);
    }

    public EcpLicenseWhereInput vpcIn(List<String> vpcIn) {

        this.vpcIn = vpcIn;
        return this;
    }

    public EcpLicenseWhereInput addVpcInItem(String vpcInItem) {
        if (this.vpcIn == null) {
            this.vpcIn = new ArrayList<String>();
        }
        this.vpcIn.add(vpcInItem);
        return this;
    }

    /**
     * Get vpcIn
     *
     * @return vpcIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVpcIn() {
        return vpcIn;
    }

    public void setVpcIn(List<String> vpcIn) {
        this.vpcIn = vpcIn;
    }

    public EcpLicenseWhereInput vpcIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_IN);
        return this;
    }

    public EcpLicenseWhereInput vpcIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_IN);
        return this;
    }

    public void setVpcIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_IN);
        }
    }

    public boolean getVpcIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_IN);
    }

    public EcpLicenseWhereInput vpcLt(String vpcLt) {

        this.vpcLt = vpcLt;
        return this;
    }

    /**
     * Get vpcLt
     *
     * @return vpcLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVpcLt() {
        return vpcLt;
    }

    public void setVpcLt(String vpcLt) {
        this.vpcLt = vpcLt;
    }

    public EcpLicenseWhereInput vpcLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_LT);
        return this;
    }

    public EcpLicenseWhereInput vpcLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_LT);
        return this;
    }

    public void setVpcLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_LT);
        }
    }

    public boolean getVpcLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_LT);
    }

    public EcpLicenseWhereInput vpcLte(String vpcLte) {

        this.vpcLte = vpcLte;
        return this;
    }

    /**
     * Get vpcLte
     *
     * @return vpcLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVpcLte() {
        return vpcLte;
    }

    public void setVpcLte(String vpcLte) {
        this.vpcLte = vpcLte;
    }

    public EcpLicenseWhereInput vpcLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_LTE);
        return this;
    }

    public EcpLicenseWhereInput vpcLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_LTE);
        return this;
    }

    public void setVpcLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_LTE);
        }
    }

    public boolean getVpcLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_LTE);
    }

    public EcpLicenseWhereInput vpcNot(String vpcNot) {

        this.vpcNot = vpcNot;
        return this;
    }

    /**
     * Get vpcNot
     *
     * @return vpcNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVpcNot() {
        return vpcNot;
    }

    public void setVpcNot(String vpcNot) {
        this.vpcNot = vpcNot;
    }

    public EcpLicenseWhereInput vpcNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_NOT);
        return this;
    }

    public EcpLicenseWhereInput vpcNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_NOT);
        return this;
    }

    public void setVpcNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_NOT);
        }
    }

    public boolean getVpcNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_NOT);
    }

    public EcpLicenseWhereInput vpcNotContains(String vpcNotContains) {

        this.vpcNotContains = vpcNotContains;
        return this;
    }

    /**
     * Get vpcNotContains
     *
     * @return vpcNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVpcNotContains() {
        return vpcNotContains;
    }

    public void setVpcNotContains(String vpcNotContains) {
        this.vpcNotContains = vpcNotContains;
    }

    public EcpLicenseWhereInput vpcNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput vpcNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_NOT_CONTAINS);
        return this;
    }

    public void setVpcNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_NOT_CONTAINS);
        }
    }

    public boolean getVpcNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput vpcNotEndsWith(String vpcNotEndsWith) {

        this.vpcNotEndsWith = vpcNotEndsWith;
        return this;
    }

    /**
     * Get vpcNotEndsWith
     *
     * @return vpcNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVpcNotEndsWith() {
        return vpcNotEndsWith;
    }

    public void setVpcNotEndsWith(String vpcNotEndsWith) {
        this.vpcNotEndsWith = vpcNotEndsWith;
    }

    public EcpLicenseWhereInput vpcNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput vpcNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_NOT_ENDS_WITH);
        return this;
    }

    public void setVpcNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_NOT_ENDS_WITH);
        }
    }

    public boolean getVpcNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput vpcNotIn(List<String> vpcNotIn) {

        this.vpcNotIn = vpcNotIn;
        return this;
    }

    public EcpLicenseWhereInput addVpcNotInItem(String vpcNotInItem) {
        if (this.vpcNotIn == null) {
            this.vpcNotIn = new ArrayList<String>();
        }
        this.vpcNotIn.add(vpcNotInItem);
        return this;
    }

    /**
     * Get vpcNotIn
     *
     * @return vpcNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVpcNotIn() {
        return vpcNotIn;
    }

    public void setVpcNotIn(List<String> vpcNotIn) {
        this.vpcNotIn = vpcNotIn;
    }

    public EcpLicenseWhereInput vpcNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput vpcNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_NOT_IN);
        return this;
    }

    public void setVpcNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_NOT_IN);
        }
    }

    public boolean getVpcNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_NOT_IN);
    }

    public EcpLicenseWhereInput vpcNotStartsWith(String vpcNotStartsWith) {

        this.vpcNotStartsWith = vpcNotStartsWith;
        return this;
    }

    /**
     * Get vpcNotStartsWith
     *
     * @return vpcNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVpcNotStartsWith() {
        return vpcNotStartsWith;
    }

    public void setVpcNotStartsWith(String vpcNotStartsWith) {
        this.vpcNotStartsWith = vpcNotStartsWith;
    }

    public EcpLicenseWhereInput vpcNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput vpcNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_NOT_STARTS_WITH);
        return this;
    }

    public void setVpcNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_NOT_STARTS_WITH);
        }
    }

    public boolean getVpcNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput vpcStartsWith(String vpcStartsWith) {

        this.vpcStartsWith = vpcStartsWith;
        return this;
    }

    /**
     * Get vpcStartsWith
     *
     * @return vpcStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVpcStartsWith() {
        return vpcStartsWith;
    }

    public void setVpcStartsWith(String vpcStartsWith) {
        this.vpcStartsWith = vpcStartsWith;
    }

    public EcpLicenseWhereInput vpcStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput vpcStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_STARTS_WITH);
        return this;
    }

    public void setVpcStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_STARTS_WITH);
        }
    }

    public boolean getVpcStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EcpLicenseWhereInput ecpLicenseWhereInput = (EcpLicenseWhereInput) o;
        return Objects.equals(this.AND, ecpLicenseWhereInput.AND)
                && Objects.equals(this.NOT, ecpLicenseWhereInput.NOT)
                && Objects.equals(this.OR, ecpLicenseWhereInput.OR)
                && Objects.equals(this.asyncReplication, ecpLicenseWhereInput.asyncReplication)
                && Objects.equals(
                        this.asyncReplicationContains,
                        ecpLicenseWhereInput.asyncReplicationContains)
                && Objects.equals(
                        this.asyncReplicationEndsWith,
                        ecpLicenseWhereInput.asyncReplicationEndsWith)
                && Objects.equals(this.asyncReplicationGt, ecpLicenseWhereInput.asyncReplicationGt)
                && Objects.equals(
                        this.asyncReplicationGte, ecpLicenseWhereInput.asyncReplicationGte)
                && Objects.equals(this.asyncReplicationIn, ecpLicenseWhereInput.asyncReplicationIn)
                && Objects.equals(this.asyncReplicationLt, ecpLicenseWhereInput.asyncReplicationLt)
                && Objects.equals(
                        this.asyncReplicationLte, ecpLicenseWhereInput.asyncReplicationLte)
                && Objects.equals(
                        this.asyncReplicationNot, ecpLicenseWhereInput.asyncReplicationNot)
                && Objects.equals(
                        this.asyncReplicationNotContains,
                        ecpLicenseWhereInput.asyncReplicationNotContains)
                && Objects.equals(
                        this.asyncReplicationNotEndsWith,
                        ecpLicenseWhereInput.asyncReplicationNotEndsWith)
                && Objects.equals(
                        this.asyncReplicationNotIn, ecpLicenseWhereInput.asyncReplicationNotIn)
                && Objects.equals(
                        this.asyncReplicationNotStartsWith,
                        ecpLicenseWhereInput.asyncReplicationNotStartsWith)
                && Objects.equals(
                        this.asyncReplicationStartsWith,
                        ecpLicenseWhereInput.asyncReplicationStartsWith)
                && Objects.equals(this.backup, ecpLicenseWhereInput.backup)
                && Objects.equals(this.backupContains, ecpLicenseWhereInput.backupContains)
                && Objects.equals(this.backupEndsWith, ecpLicenseWhereInput.backupEndsWith)
                && Objects.equals(this.backupGt, ecpLicenseWhereInput.backupGt)
                && Objects.equals(this.backupGte, ecpLicenseWhereInput.backupGte)
                && Objects.equals(this.backupIn, ecpLicenseWhereInput.backupIn)
                && Objects.equals(this.backupLt, ecpLicenseWhereInput.backupLt)
                && Objects.equals(this.backupLte, ecpLicenseWhereInput.backupLte)
                && Objects.equals(this.backupNot, ecpLicenseWhereInput.backupNot)
                && Objects.equals(this.backupNotContains, ecpLicenseWhereInput.backupNotContains)
                && Objects.equals(this.backupNotEndsWith, ecpLicenseWhereInput.backupNotEndsWith)
                && Objects.equals(this.backupNotIn, ecpLicenseWhereInput.backupNotIn)
                && Objects.equals(
                        this.backupNotStartsWith, ecpLicenseWhereInput.backupNotStartsWith)
                && Objects.equals(this.backupStartsWith, ecpLicenseWhereInput.backupStartsWith)
                && Objects.equals(this.brand, ecpLicenseWhereInput.brand)
                && Objects.equals(this.brandContains, ecpLicenseWhereInput.brandContains)
                && Objects.equals(this.brandEndsWith, ecpLicenseWhereInput.brandEndsWith)
                && Objects.equals(this.brandGt, ecpLicenseWhereInput.brandGt)
                && Objects.equals(this.brandGte, ecpLicenseWhereInput.brandGte)
                && Objects.equals(this.brandIn, ecpLicenseWhereInput.brandIn)
                && Objects.equals(this.brandLt, ecpLicenseWhereInput.brandLt)
                && Objects.equals(this.brandLte, ecpLicenseWhereInput.brandLte)
                && Objects.equals(this.brandNot, ecpLicenseWhereInput.brandNot)
                && Objects.equals(this.brandNotContains, ecpLicenseWhereInput.brandNotContains)
                && Objects.equals(this.brandNotEndsWith, ecpLicenseWhereInput.brandNotEndsWith)
                && Objects.equals(this.brandNotIn, ecpLicenseWhereInput.brandNotIn)
                && Objects.equals(this.brandNotStartsWith, ecpLicenseWhereInput.brandNotStartsWith)
                && Objects.equals(this.brandStartsWith, ecpLicenseWhereInput.brandStartsWith)
                && Objects.equals(this.cluster, ecpLicenseWhereInput.cluster)
                && Objects.equals(this.clusterLocalId, ecpLicenseWhereInput.clusterLocalId)
                && Objects.equals(
                        this.clusterLocalIdContains, ecpLicenseWhereInput.clusterLocalIdContains)
                && Objects.equals(
                        this.clusterLocalIdEndsWith, ecpLicenseWhereInput.clusterLocalIdEndsWith)
                && Objects.equals(this.clusterLocalIdGt, ecpLicenseWhereInput.clusterLocalIdGt)
                && Objects.equals(this.clusterLocalIdGte, ecpLicenseWhereInput.clusterLocalIdGte)
                && Objects.equals(this.clusterLocalIdIn, ecpLicenseWhereInput.clusterLocalIdIn)
                && Objects.equals(this.clusterLocalIdLt, ecpLicenseWhereInput.clusterLocalIdLt)
                && Objects.equals(this.clusterLocalIdLte, ecpLicenseWhereInput.clusterLocalIdLte)
                && Objects.equals(this.clusterLocalIdNot, ecpLicenseWhereInput.clusterLocalIdNot)
                && Objects.equals(
                        this.clusterLocalIdNotContains,
                        ecpLicenseWhereInput.clusterLocalIdNotContains)
                && Objects.equals(
                        this.clusterLocalIdNotEndsWith,
                        ecpLicenseWhereInput.clusterLocalIdNotEndsWith)
                && Objects.equals(
                        this.clusterLocalIdNotIn, ecpLicenseWhereInput.clusterLocalIdNotIn)
                && Objects.equals(
                        this.clusterLocalIdNotStartsWith,
                        ecpLicenseWhereInput.clusterLocalIdNotStartsWith)
                && Objects.equals(
                        this.clusterLocalIdStartsWith,
                        ecpLicenseWhereInput.clusterLocalIdStartsWith)
                && Objects.equals(this.dfw, ecpLicenseWhereInput.dfw)
                && Objects.equals(this.dfwContains, ecpLicenseWhereInput.dfwContains)
                && Objects.equals(this.dfwEndsWith, ecpLicenseWhereInput.dfwEndsWith)
                && Objects.equals(this.dfwGt, ecpLicenseWhereInput.dfwGt)
                && Objects.equals(this.dfwGte, ecpLicenseWhereInput.dfwGte)
                && Objects.equals(this.dfwIn, ecpLicenseWhereInput.dfwIn)
                && Objects.equals(this.dfwLt, ecpLicenseWhereInput.dfwLt)
                && Objects.equals(this.dfwLte, ecpLicenseWhereInput.dfwLte)
                && Objects.equals(this.dfwNot, ecpLicenseWhereInput.dfwNot)
                && Objects.equals(this.dfwNotContains, ecpLicenseWhereInput.dfwNotContains)
                && Objects.equals(this.dfwNotEndsWith, ecpLicenseWhereInput.dfwNotEndsWith)
                && Objects.equals(this.dfwNotIn, ecpLicenseWhereInput.dfwNotIn)
                && Objects.equals(this.dfwNotStartsWith, ecpLicenseWhereInput.dfwNotStartsWith)
                && Objects.equals(this.dfwStartsWith, ecpLicenseWhereInput.dfwStartsWith)
                && Objects.equals(this.ecpEdition, ecpLicenseWhereInput.ecpEdition)
                && Objects.equals(this.ecpEditionIn, ecpLicenseWhereInput.ecpEditionIn)
                && Objects.equals(this.ecpEditionNot, ecpLicenseWhereInput.ecpEditionNot)
                && Objects.equals(this.ecpEditionNotIn, ecpLicenseWhereInput.ecpEditionNotIn)
                && Objects.equals(this.expireDate, ecpLicenseWhereInput.expireDate)
                && Objects.equals(this.expireDateGt, ecpLicenseWhereInput.expireDateGt)
                && Objects.equals(this.expireDateGte, ecpLicenseWhereInput.expireDateGte)
                && Objects.equals(this.expireDateIn, ecpLicenseWhereInput.expireDateIn)
                && Objects.equals(this.expireDateLt, ecpLicenseWhereInput.expireDateLt)
                && Objects.equals(this.expireDateLte, ecpLicenseWhereInput.expireDateLte)
                && Objects.equals(this.expireDateNot, ecpLicenseWhereInput.expireDateNot)
                && Objects.equals(this.expireDateNotIn, ecpLicenseWhereInput.expireDateNotIn)
                && Objects.equals(this.externalStorage, ecpLicenseWhereInput.externalStorage)
                && Objects.equals(this.externalStorageNot, ecpLicenseWhereInput.externalStorageNot)
                && Objects.equals(this.fileStorage, ecpLicenseWhereInput.fileStorage)
                && Objects.equals(
                        this.fileStorageContains, ecpLicenseWhereInput.fileStorageContains)
                && Objects.equals(
                        this.fileStorageEndsWith, ecpLicenseWhereInput.fileStorageEndsWith)
                && Objects.equals(this.fileStorageGt, ecpLicenseWhereInput.fileStorageGt)
                && Objects.equals(this.fileStorageGte, ecpLicenseWhereInput.fileStorageGte)
                && Objects.equals(this.fileStorageIn, ecpLicenseWhereInput.fileStorageIn)
                && Objects.equals(this.fileStorageLt, ecpLicenseWhereInput.fileStorageLt)
                && Objects.equals(this.fileStorageLte, ecpLicenseWhereInput.fileStorageLte)
                && Objects.equals(this.fileStorageNot, ecpLicenseWhereInput.fileStorageNot)
                && Objects.equals(
                        this.fileStorageNotContains, ecpLicenseWhereInput.fileStorageNotContains)
                && Objects.equals(
                        this.fileStorageNotEndsWith, ecpLicenseWhereInput.fileStorageNotEndsWith)
                && Objects.equals(this.fileStorageNotIn, ecpLicenseWhereInput.fileStorageNotIn)
                && Objects.equals(
                        this.fileStorageNotStartsWith,
                        ecpLicenseWhereInput.fileStorageNotStartsWith)
                && Objects.equals(
                        this.fileStorageStartsWith, ecpLicenseWhereInput.fileStorageStartsWith)
                && Objects.equals(this.hasMetrox, ecpLicenseWhereInput.hasMetrox)
                && Objects.equals(this.hasMetroxNot, ecpLicenseWhereInput.hasMetroxNot)
                && Objects.equals(this.hasRemoteBackup, ecpLicenseWhereInput.hasRemoteBackup)
                && Objects.equals(this.hasRemoteBackupNot, ecpLicenseWhereInput.hasRemoteBackupNot)
                && Objects.equals(this.id, ecpLicenseWhereInput.id)
                && Objects.equals(this.idContains, ecpLicenseWhereInput.idContains)
                && Objects.equals(this.idEndsWith, ecpLicenseWhereInput.idEndsWith)
                && Objects.equals(this.idGt, ecpLicenseWhereInput.idGt)
                && Objects.equals(this.idGte, ecpLicenseWhereInput.idGte)
                && Objects.equals(this.idIn, ecpLicenseWhereInput.idIn)
                && Objects.equals(this.idLt, ecpLicenseWhereInput.idLt)
                && Objects.equals(this.idLte, ecpLicenseWhereInput.idLte)
                && Objects.equals(this.idNot, ecpLicenseWhereInput.idNot)
                && Objects.equals(this.idNotContains, ecpLicenseWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, ecpLicenseWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, ecpLicenseWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, ecpLicenseWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, ecpLicenseWhereInput.idStartsWith)
                && Objects.equals(this.k8sBareMetal, ecpLicenseWhereInput.k8sBareMetal)
                && Objects.equals(
                        this.k8sBareMetalContains, ecpLicenseWhereInput.k8sBareMetalContains)
                && Objects.equals(
                        this.k8sBareMetalEndsWith, ecpLicenseWhereInput.k8sBareMetalEndsWith)
                && Objects.equals(this.k8sBareMetalGt, ecpLicenseWhereInput.k8sBareMetalGt)
                && Objects.equals(this.k8sBareMetalGte, ecpLicenseWhereInput.k8sBareMetalGte)
                && Objects.equals(this.k8sBareMetalIn, ecpLicenseWhereInput.k8sBareMetalIn)
                && Objects.equals(this.k8sBareMetalLt, ecpLicenseWhereInput.k8sBareMetalLt)
                && Objects.equals(this.k8sBareMetalLte, ecpLicenseWhereInput.k8sBareMetalLte)
                && Objects.equals(this.k8sBareMetalNot, ecpLicenseWhereInput.k8sBareMetalNot)
                && Objects.equals(
                        this.k8sBareMetalNotContains, ecpLicenseWhereInput.k8sBareMetalNotContains)
                && Objects.equals(
                        this.k8sBareMetalNotEndsWith, ecpLicenseWhereInput.k8sBareMetalNotEndsWith)
                && Objects.equals(this.k8sBareMetalNotIn, ecpLicenseWhereInput.k8sBareMetalNotIn)
                && Objects.equals(
                        this.k8sBareMetalNotStartsWith,
                        ecpLicenseWhereInput.k8sBareMetalNotStartsWith)
                && Objects.equals(
                        this.k8sBareMetalStartsWith, ecpLicenseWhereInput.k8sBareMetalStartsWith)
                && Objects.equals(this.k8sService, ecpLicenseWhereInput.k8sService)
                && Objects.equals(this.k8sServiceContains, ecpLicenseWhereInput.k8sServiceContains)
                && Objects.equals(this.k8sServiceEndsWith, ecpLicenseWhereInput.k8sServiceEndsWith)
                && Objects.equals(this.k8sServiceGt, ecpLicenseWhereInput.k8sServiceGt)
                && Objects.equals(this.k8sServiceGte, ecpLicenseWhereInput.k8sServiceGte)
                && Objects.equals(this.k8sServiceIn, ecpLicenseWhereInput.k8sServiceIn)
                && Objects.equals(this.k8sServiceLt, ecpLicenseWhereInput.k8sServiceLt)
                && Objects.equals(this.k8sServiceLte, ecpLicenseWhereInput.k8sServiceLte)
                && Objects.equals(this.k8sServiceNot, ecpLicenseWhereInput.k8sServiceNot)
                && Objects.equals(
                        this.k8sServiceNotContains, ecpLicenseWhereInput.k8sServiceNotContains)
                && Objects.equals(
                        this.k8sServiceNotEndsWith, ecpLicenseWhereInput.k8sServiceNotEndsWith)
                && Objects.equals(this.k8sServiceNotIn, ecpLicenseWhereInput.k8sServiceNotIn)
                && Objects.equals(
                        this.k8sServiceNotStartsWith, ecpLicenseWhereInput.k8sServiceNotStartsWith)
                && Objects.equals(
                        this.k8sServiceStartsWith, ecpLicenseWhereInput.k8sServiceStartsWith)
                && Objects.equals(this.lb, ecpLicenseWhereInput.lb)
                && Objects.equals(this.lbContains, ecpLicenseWhereInput.lbContains)
                && Objects.equals(this.lbEndsWith, ecpLicenseWhereInput.lbEndsWith)
                && Objects.equals(this.lbGt, ecpLicenseWhereInput.lbGt)
                && Objects.equals(this.lbGte, ecpLicenseWhereInput.lbGte)
                && Objects.equals(this.lbIn, ecpLicenseWhereInput.lbIn)
                && Objects.equals(this.lbLt, ecpLicenseWhereInput.lbLt)
                && Objects.equals(this.lbLte, ecpLicenseWhereInput.lbLte)
                && Objects.equals(this.lbNot, ecpLicenseWhereInput.lbNot)
                && Objects.equals(this.lbNotContains, ecpLicenseWhereInput.lbNotContains)
                && Objects.equals(this.lbNotEndsWith, ecpLicenseWhereInput.lbNotEndsWith)
                && Objects.equals(this.lbNotIn, ecpLicenseWhereInput.lbNotIn)
                && Objects.equals(this.lbNotStartsWith, ecpLicenseWhereInput.lbNotStartsWith)
                && Objects.equals(this.lbStartsWith, ecpLicenseWhereInput.lbStartsWith)
                && Objects.equals(this.licensePayload, ecpLicenseWhereInput.licensePayload)
                && Objects.equals(
                        this.licensePayloadContains, ecpLicenseWhereInput.licensePayloadContains)
                && Objects.equals(
                        this.licensePayloadEndsWith, ecpLicenseWhereInput.licensePayloadEndsWith)
                && Objects.equals(this.licensePayloadGt, ecpLicenseWhereInput.licensePayloadGt)
                && Objects.equals(this.licensePayloadGte, ecpLicenseWhereInput.licensePayloadGte)
                && Objects.equals(this.licensePayloadIn, ecpLicenseWhereInput.licensePayloadIn)
                && Objects.equals(this.licensePayloadLt, ecpLicenseWhereInput.licensePayloadLt)
                && Objects.equals(this.licensePayloadLte, ecpLicenseWhereInput.licensePayloadLte)
                && Objects.equals(this.licensePayloadNot, ecpLicenseWhereInput.licensePayloadNot)
                && Objects.equals(
                        this.licensePayloadNotContains,
                        ecpLicenseWhereInput.licensePayloadNotContains)
                && Objects.equals(
                        this.licensePayloadNotEndsWith,
                        ecpLicenseWhereInput.licensePayloadNotEndsWith)
                && Objects.equals(
                        this.licensePayloadNotIn, ecpLicenseWhereInput.licensePayloadNotIn)
                && Objects.equals(
                        this.licensePayloadNotStartsWith,
                        ecpLicenseWhereInput.licensePayloadNotStartsWith)
                && Objects.equals(
                        this.licensePayloadStartsWith,
                        ecpLicenseWhereInput.licensePayloadStartsWith)
                && Objects.equals(this.licenseSignature, ecpLicenseWhereInput.licenseSignature)
                && Objects.equals(
                        this.licenseSignatureContains,
                        ecpLicenseWhereInput.licenseSignatureContains)
                && Objects.equals(
                        this.licenseSignatureEndsWith,
                        ecpLicenseWhereInput.licenseSignatureEndsWith)
                && Objects.equals(this.licenseSignatureGt, ecpLicenseWhereInput.licenseSignatureGt)
                && Objects.equals(
                        this.licenseSignatureGte, ecpLicenseWhereInput.licenseSignatureGte)
                && Objects.equals(this.licenseSignatureIn, ecpLicenseWhereInput.licenseSignatureIn)
                && Objects.equals(this.licenseSignatureLt, ecpLicenseWhereInput.licenseSignatureLt)
                && Objects.equals(
                        this.licenseSignatureLte, ecpLicenseWhereInput.licenseSignatureLte)
                && Objects.equals(
                        this.licenseSignatureNot, ecpLicenseWhereInput.licenseSignatureNot)
                && Objects.equals(
                        this.licenseSignatureNotContains,
                        ecpLicenseWhereInput.licenseSignatureNotContains)
                && Objects.equals(
                        this.licenseSignatureNotEndsWith,
                        ecpLicenseWhereInput.licenseSignatureNotEndsWith)
                && Objects.equals(
                        this.licenseSignatureNotIn, ecpLicenseWhereInput.licenseSignatureNotIn)
                && Objects.equals(
                        this.licenseSignatureNotStartsWith,
                        ecpLicenseWhereInput.licenseSignatureNotStartsWith)
                && Objects.equals(
                        this.licenseSignatureStartsWith,
                        ecpLicenseWhereInput.licenseSignatureStartsWith)
                && Objects.equals(this.licenseType, ecpLicenseWhereInput.licenseType)
                && Objects.equals(this.licenseTypeIn, ecpLicenseWhereInput.licenseTypeIn)
                && Objects.equals(this.licenseTypeNot, ecpLicenseWhereInput.licenseTypeNot)
                && Objects.equals(this.licenseTypeNotIn, ecpLicenseWhereInput.licenseTypeNotIn)
                && Objects.equals(this.maxCoreNum, ecpLicenseWhereInput.maxCoreNum)
                && Objects.equals(this.maxCoreNumGt, ecpLicenseWhereInput.maxCoreNumGt)
                && Objects.equals(this.maxCoreNumGte, ecpLicenseWhereInput.maxCoreNumGte)
                && Objects.equals(this.maxCoreNumIn, ecpLicenseWhereInput.maxCoreNumIn)
                && Objects.equals(this.maxCoreNumLt, ecpLicenseWhereInput.maxCoreNumLt)
                && Objects.equals(this.maxCoreNumLte, ecpLicenseWhereInput.maxCoreNumLte)
                && Objects.equals(this.maxCoreNumNot, ecpLicenseWhereInput.maxCoreNumNot)
                && Objects.equals(this.maxCoreNumNotIn, ecpLicenseWhereInput.maxCoreNumNotIn)
                && Objects.equals(
                        this.maxPhysicalDataCapacity, ecpLicenseWhereInput.maxPhysicalDataCapacity)
                && Objects.equals(
                        this.maxPhysicalDataCapacityGt,
                        ecpLicenseWhereInput.maxPhysicalDataCapacityGt)
                && Objects.equals(
                        this.maxPhysicalDataCapacityGte,
                        ecpLicenseWhereInput.maxPhysicalDataCapacityGte)
                && Objects.equals(
                        this.maxPhysicalDataCapacityIn,
                        ecpLicenseWhereInput.maxPhysicalDataCapacityIn)
                && Objects.equals(
                        this.maxPhysicalDataCapacityLt,
                        ecpLicenseWhereInput.maxPhysicalDataCapacityLt)
                && Objects.equals(
                        this.maxPhysicalDataCapacityLte,
                        ecpLicenseWhereInput.maxPhysicalDataCapacityLte)
                && Objects.equals(
                        this.maxPhysicalDataCapacityNot,
                        ecpLicenseWhereInput.maxPhysicalDataCapacityNot)
                && Objects.equals(
                        this.maxPhysicalDataCapacityNotIn,
                        ecpLicenseWhereInput.maxPhysicalDataCapacityNotIn)
                && Objects.equals(this.originalCode, ecpLicenseWhereInput.originalCode)
                && Objects.equals(
                        this.originalCodeContains, ecpLicenseWhereInput.originalCodeContains)
                && Objects.equals(
                        this.originalCodeEndsWith, ecpLicenseWhereInput.originalCodeEndsWith)
                && Objects.equals(this.originalCodeGt, ecpLicenseWhereInput.originalCodeGt)
                && Objects.equals(this.originalCodeGte, ecpLicenseWhereInput.originalCodeGte)
                && Objects.equals(this.originalCodeIn, ecpLicenseWhereInput.originalCodeIn)
                && Objects.equals(this.originalCodeLt, ecpLicenseWhereInput.originalCodeLt)
                && Objects.equals(this.originalCodeLte, ecpLicenseWhereInput.originalCodeLte)
                && Objects.equals(this.originalCodeNot, ecpLicenseWhereInput.originalCodeNot)
                && Objects.equals(
                        this.originalCodeNotContains, ecpLicenseWhereInput.originalCodeNotContains)
                && Objects.equals(
                        this.originalCodeNotEndsWith, ecpLicenseWhereInput.originalCodeNotEndsWith)
                && Objects.equals(this.originalCodeNotIn, ecpLicenseWhereInput.originalCodeNotIn)
                && Objects.equals(
                        this.originalCodeNotStartsWith,
                        ecpLicenseWhereInput.originalCodeNotStartsWith)
                && Objects.equals(
                        this.originalCodeStartsWith, ecpLicenseWhereInput.originalCodeStartsWith)
                && Objects.equals(this.productName, ecpLicenseWhereInput.productName)
                && Objects.equals(
                        this.productNameContains, ecpLicenseWhereInput.productNameContains)
                && Objects.equals(
                        this.productNameEndsWith, ecpLicenseWhereInput.productNameEndsWith)
                && Objects.equals(this.productNameGt, ecpLicenseWhereInput.productNameGt)
                && Objects.equals(this.productNameGte, ecpLicenseWhereInput.productNameGte)
                && Objects.equals(this.productNameIn, ecpLicenseWhereInput.productNameIn)
                && Objects.equals(this.productNameLt, ecpLicenseWhereInput.productNameLt)
                && Objects.equals(this.productNameLte, ecpLicenseWhereInput.productNameLte)
                && Objects.equals(this.productNameNot, ecpLicenseWhereInput.productNameNot)
                && Objects.equals(
                        this.productNameNotContains, ecpLicenseWhereInput.productNameNotContains)
                && Objects.equals(
                        this.productNameNotEndsWith, ecpLicenseWhereInput.productNameNotEndsWith)
                && Objects.equals(this.productNameNotIn, ecpLicenseWhereInput.productNameNotIn)
                && Objects.equals(
                        this.productNameNotStartsWith,
                        ecpLicenseWhereInput.productNameNotStartsWith)
                && Objects.equals(
                        this.productNameStartsWith, ecpLicenseWhereInput.productNameStartsWith)
                && Objects.equals(this.serial, ecpLicenseWhereInput.serial)
                && Objects.equals(this.serialContains, ecpLicenseWhereInput.serialContains)
                && Objects.equals(this.serialEndsWith, ecpLicenseWhereInput.serialEndsWith)
                && Objects.equals(this.serialGt, ecpLicenseWhereInput.serialGt)
                && Objects.equals(this.serialGte, ecpLicenseWhereInput.serialGte)
                && Objects.equals(this.serialIn, ecpLicenseWhereInput.serialIn)
                && Objects.equals(this.serialLt, ecpLicenseWhereInput.serialLt)
                && Objects.equals(this.serialLte, ecpLicenseWhereInput.serialLte)
                && Objects.equals(this.serialNot, ecpLicenseWhereInput.serialNot)
                && Objects.equals(this.serialNotContains, ecpLicenseWhereInput.serialNotContains)
                && Objects.equals(this.serialNotEndsWith, ecpLicenseWhereInput.serialNotEndsWith)
                && Objects.equals(this.serialNotIn, ecpLicenseWhereInput.serialNotIn)
                && Objects.equals(
                        this.serialNotStartsWith, ecpLicenseWhereInput.serialNotStartsWith)
                && Objects.equals(this.serialStartsWith, ecpLicenseWhereInput.serialStartsWith)
                && Objects.equals(this.signDate, ecpLicenseWhereInput.signDate)
                && Objects.equals(this.signDateGt, ecpLicenseWhereInput.signDateGt)
                && Objects.equals(this.signDateGte, ecpLicenseWhereInput.signDateGte)
                && Objects.equals(this.signDateIn, ecpLicenseWhereInput.signDateIn)
                && Objects.equals(this.signDateLt, ecpLicenseWhereInput.signDateLt)
                && Objects.equals(this.signDateLte, ecpLicenseWhereInput.signDateLte)
                && Objects.equals(this.signDateNot, ecpLicenseWhereInput.signDateNot)
                && Objects.equals(this.signDateNotIn, ecpLicenseWhereInput.signDateNotIn)
                && Objects.equals(
                        this.subscriptionExpireDate, ecpLicenseWhereInput.subscriptionExpireDate)
                && Objects.equals(
                        this.subscriptionExpireDateGt,
                        ecpLicenseWhereInput.subscriptionExpireDateGt)
                && Objects.equals(
                        this.subscriptionExpireDateGte,
                        ecpLicenseWhereInput.subscriptionExpireDateGte)
                && Objects.equals(
                        this.subscriptionExpireDateIn,
                        ecpLicenseWhereInput.subscriptionExpireDateIn)
                && Objects.equals(
                        this.subscriptionExpireDateLt,
                        ecpLicenseWhereInput.subscriptionExpireDateLt)
                && Objects.equals(
                        this.subscriptionExpireDateLte,
                        ecpLicenseWhereInput.subscriptionExpireDateLte)
                && Objects.equals(
                        this.subscriptionExpireDateNot,
                        ecpLicenseWhereInput.subscriptionExpireDateNot)
                && Objects.equals(
                        this.subscriptionExpireDateNotIn,
                        ecpLicenseWhereInput.subscriptionExpireDateNotIn)
                && Objects.equals(
                        this.subscriptionStartDate, ecpLicenseWhereInput.subscriptionStartDate)
                && Objects.equals(
                        this.subscriptionStartDateGt, ecpLicenseWhereInput.subscriptionStartDateGt)
                && Objects.equals(
                        this.subscriptionStartDateGte,
                        ecpLicenseWhereInput.subscriptionStartDateGte)
                && Objects.equals(
                        this.subscriptionStartDateIn, ecpLicenseWhereInput.subscriptionStartDateIn)
                && Objects.equals(
                        this.subscriptionStartDateLt, ecpLicenseWhereInput.subscriptionStartDateLt)
                && Objects.equals(
                        this.subscriptionStartDateLte,
                        ecpLicenseWhereInput.subscriptionStartDateLte)
                && Objects.equals(
                        this.subscriptionStartDateNot,
                        ecpLicenseWhereInput.subscriptionStartDateNot)
                && Objects.equals(
                        this.subscriptionStartDateNotIn,
                        ecpLicenseWhereInput.subscriptionStartDateNotIn)
                && Objects.equals(this.syncReplication, ecpLicenseWhereInput.syncReplication)
                && Objects.equals(
                        this.syncReplicationContains, ecpLicenseWhereInput.syncReplicationContains)
                && Objects.equals(
                        this.syncReplicationEndsWith, ecpLicenseWhereInput.syncReplicationEndsWith)
                && Objects.equals(this.syncReplicationGt, ecpLicenseWhereInput.syncReplicationGt)
                && Objects.equals(this.syncReplicationGte, ecpLicenseWhereInput.syncReplicationGte)
                && Objects.equals(this.syncReplicationIn, ecpLicenseWhereInput.syncReplicationIn)
                && Objects.equals(this.syncReplicationLt, ecpLicenseWhereInput.syncReplicationLt)
                && Objects.equals(this.syncReplicationLte, ecpLicenseWhereInput.syncReplicationLte)
                && Objects.equals(this.syncReplicationNot, ecpLicenseWhereInput.syncReplicationNot)
                && Objects.equals(
                        this.syncReplicationNotContains,
                        ecpLicenseWhereInput.syncReplicationNotContains)
                && Objects.equals(
                        this.syncReplicationNotEndsWith,
                        ecpLicenseWhereInput.syncReplicationNotEndsWith)
                && Objects.equals(
                        this.syncReplicationNotIn, ecpLicenseWhereInput.syncReplicationNotIn)
                && Objects.equals(
                        this.syncReplicationNotStartsWith,
                        ecpLicenseWhereInput.syncReplicationNotStartsWith)
                && Objects.equals(
                        this.syncReplicationStartsWith,
                        ecpLicenseWhereInput.syncReplicationStartsWith)
                && Objects.equals(
                        this.trafficVisualization, ecpLicenseWhereInput.trafficVisualization)
                && Objects.equals(
                        this.trafficVisualizationContains,
                        ecpLicenseWhereInput.trafficVisualizationContains)
                && Objects.equals(
                        this.trafficVisualizationEndsWith,
                        ecpLicenseWhereInput.trafficVisualizationEndsWith)
                && Objects.equals(
                        this.trafficVisualizationGt, ecpLicenseWhereInput.trafficVisualizationGt)
                && Objects.equals(
                        this.trafficVisualizationGte, ecpLicenseWhereInput.trafficVisualizationGte)
                && Objects.equals(
                        this.trafficVisualizationIn, ecpLicenseWhereInput.trafficVisualizationIn)
                && Objects.equals(
                        this.trafficVisualizationLt, ecpLicenseWhereInput.trafficVisualizationLt)
                && Objects.equals(
                        this.trafficVisualizationLte, ecpLicenseWhereInput.trafficVisualizationLte)
                && Objects.equals(
                        this.trafficVisualizationNot, ecpLicenseWhereInput.trafficVisualizationNot)
                && Objects.equals(
                        this.trafficVisualizationNotContains,
                        ecpLicenseWhereInput.trafficVisualizationNotContains)
                && Objects.equals(
                        this.trafficVisualizationNotEndsWith,
                        ecpLicenseWhereInput.trafficVisualizationNotEndsWith)
                && Objects.equals(
                        this.trafficVisualizationNotIn,
                        ecpLicenseWhereInput.trafficVisualizationNotIn)
                && Objects.equals(
                        this.trafficVisualizationNotStartsWith,
                        ecpLicenseWhereInput.trafficVisualizationNotStartsWith)
                && Objects.equals(
                        this.trafficVisualizationStartsWith,
                        ecpLicenseWhereInput.trafficVisualizationStartsWith)
                && Objects.equals(this.vendor, ecpLicenseWhereInput.vendor)
                && Objects.equals(this.vendorContains, ecpLicenseWhereInput.vendorContains)
                && Objects.equals(this.vendorEndsWith, ecpLicenseWhereInput.vendorEndsWith)
                && Objects.equals(this.vendorGt, ecpLicenseWhereInput.vendorGt)
                && Objects.equals(this.vendorGte, ecpLicenseWhereInput.vendorGte)
                && Objects.equals(this.vendorIn, ecpLicenseWhereInput.vendorIn)
                && Objects.equals(this.vendorLt, ecpLicenseWhereInput.vendorLt)
                && Objects.equals(this.vendorLte, ecpLicenseWhereInput.vendorLte)
                && Objects.equals(this.vendorNot, ecpLicenseWhereInput.vendorNot)
                && Objects.equals(this.vendorNotContains, ecpLicenseWhereInput.vendorNotContains)
                && Objects.equals(this.vendorNotEndsWith, ecpLicenseWhereInput.vendorNotEndsWith)
                && Objects.equals(this.vendorNotIn, ecpLicenseWhereInput.vendorNotIn)
                && Objects.equals(
                        this.vendorNotStartsWith, ecpLicenseWhereInput.vendorNotStartsWith)
                && Objects.equals(this.vendorStartsWith, ecpLicenseWhereInput.vendorStartsWith)
                && Objects.equals(this.version, ecpLicenseWhereInput.version)
                && Objects.equals(this.versionGt, ecpLicenseWhereInput.versionGt)
                && Objects.equals(this.versionGte, ecpLicenseWhereInput.versionGte)
                && Objects.equals(this.versionIn, ecpLicenseWhereInput.versionIn)
                && Objects.equals(this.versionLt, ecpLicenseWhereInput.versionLt)
                && Objects.equals(this.versionLte, ecpLicenseWhereInput.versionLte)
                && Objects.equals(this.versionNot, ecpLicenseWhereInput.versionNot)
                && Objects.equals(this.versionNotIn, ecpLicenseWhereInput.versionNotIn)
                && Objects.equals(this.vpc, ecpLicenseWhereInput.vpc)
                && Objects.equals(this.vpcContains, ecpLicenseWhereInput.vpcContains)
                && Objects.equals(this.vpcEndsWith, ecpLicenseWhereInput.vpcEndsWith)
                && Objects.equals(this.vpcGt, ecpLicenseWhereInput.vpcGt)
                && Objects.equals(this.vpcGte, ecpLicenseWhereInput.vpcGte)
                && Objects.equals(this.vpcIn, ecpLicenseWhereInput.vpcIn)
                && Objects.equals(this.vpcLt, ecpLicenseWhereInput.vpcLt)
                && Objects.equals(this.vpcLte, ecpLicenseWhereInput.vpcLte)
                && Objects.equals(this.vpcNot, ecpLicenseWhereInput.vpcNot)
                && Objects.equals(this.vpcNotContains, ecpLicenseWhereInput.vpcNotContains)
                && Objects.equals(this.vpcNotEndsWith, ecpLicenseWhereInput.vpcNotEndsWith)
                && Objects.equals(this.vpcNotIn, ecpLicenseWhereInput.vpcNotIn)
                && Objects.equals(this.vpcNotStartsWith, ecpLicenseWhereInput.vpcNotStartsWith)
                && Objects.equals(this.vpcStartsWith, ecpLicenseWhereInput.vpcStartsWith);
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
                asyncReplication,
                asyncReplicationContains,
                asyncReplicationEndsWith,
                asyncReplicationGt,
                asyncReplicationGte,
                asyncReplicationIn,
                asyncReplicationLt,
                asyncReplicationLte,
                asyncReplicationNot,
                asyncReplicationNotContains,
                asyncReplicationNotEndsWith,
                asyncReplicationNotIn,
                asyncReplicationNotStartsWith,
                asyncReplicationStartsWith,
                backup,
                backupContains,
                backupEndsWith,
                backupGt,
                backupGte,
                backupIn,
                backupLt,
                backupLte,
                backupNot,
                backupNotContains,
                backupNotEndsWith,
                backupNotIn,
                backupNotStartsWith,
                backupStartsWith,
                brand,
                brandContains,
                brandEndsWith,
                brandGt,
                brandGte,
                brandIn,
                brandLt,
                brandLte,
                brandNot,
                brandNotContains,
                brandNotEndsWith,
                brandNotIn,
                brandNotStartsWith,
                brandStartsWith,
                cluster,
                clusterLocalId,
                clusterLocalIdContains,
                clusterLocalIdEndsWith,
                clusterLocalIdGt,
                clusterLocalIdGte,
                clusterLocalIdIn,
                clusterLocalIdLt,
                clusterLocalIdLte,
                clusterLocalIdNot,
                clusterLocalIdNotContains,
                clusterLocalIdNotEndsWith,
                clusterLocalIdNotIn,
                clusterLocalIdNotStartsWith,
                clusterLocalIdStartsWith,
                dfw,
                dfwContains,
                dfwEndsWith,
                dfwGt,
                dfwGte,
                dfwIn,
                dfwLt,
                dfwLte,
                dfwNot,
                dfwNotContains,
                dfwNotEndsWith,
                dfwNotIn,
                dfwNotStartsWith,
                dfwStartsWith,
                ecpEdition,
                ecpEditionIn,
                ecpEditionNot,
                ecpEditionNotIn,
                expireDate,
                expireDateGt,
                expireDateGte,
                expireDateIn,
                expireDateLt,
                expireDateLte,
                expireDateNot,
                expireDateNotIn,
                externalStorage,
                externalStorageNot,
                fileStorage,
                fileStorageContains,
                fileStorageEndsWith,
                fileStorageGt,
                fileStorageGte,
                fileStorageIn,
                fileStorageLt,
                fileStorageLte,
                fileStorageNot,
                fileStorageNotContains,
                fileStorageNotEndsWith,
                fileStorageNotIn,
                fileStorageNotStartsWith,
                fileStorageStartsWith,
                hasMetrox,
                hasMetroxNot,
                hasRemoteBackup,
                hasRemoteBackupNot,
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
                k8sBareMetal,
                k8sBareMetalContains,
                k8sBareMetalEndsWith,
                k8sBareMetalGt,
                k8sBareMetalGte,
                k8sBareMetalIn,
                k8sBareMetalLt,
                k8sBareMetalLte,
                k8sBareMetalNot,
                k8sBareMetalNotContains,
                k8sBareMetalNotEndsWith,
                k8sBareMetalNotIn,
                k8sBareMetalNotStartsWith,
                k8sBareMetalStartsWith,
                k8sService,
                k8sServiceContains,
                k8sServiceEndsWith,
                k8sServiceGt,
                k8sServiceGte,
                k8sServiceIn,
                k8sServiceLt,
                k8sServiceLte,
                k8sServiceNot,
                k8sServiceNotContains,
                k8sServiceNotEndsWith,
                k8sServiceNotIn,
                k8sServiceNotStartsWith,
                k8sServiceStartsWith,
                lb,
                lbContains,
                lbEndsWith,
                lbGt,
                lbGte,
                lbIn,
                lbLt,
                lbLte,
                lbNot,
                lbNotContains,
                lbNotEndsWith,
                lbNotIn,
                lbNotStartsWith,
                lbStartsWith,
                licensePayload,
                licensePayloadContains,
                licensePayloadEndsWith,
                licensePayloadGt,
                licensePayloadGte,
                licensePayloadIn,
                licensePayloadLt,
                licensePayloadLte,
                licensePayloadNot,
                licensePayloadNotContains,
                licensePayloadNotEndsWith,
                licensePayloadNotIn,
                licensePayloadNotStartsWith,
                licensePayloadStartsWith,
                licenseSignature,
                licenseSignatureContains,
                licenseSignatureEndsWith,
                licenseSignatureGt,
                licenseSignatureGte,
                licenseSignatureIn,
                licenseSignatureLt,
                licenseSignatureLte,
                licenseSignatureNot,
                licenseSignatureNotContains,
                licenseSignatureNotEndsWith,
                licenseSignatureNotIn,
                licenseSignatureNotStartsWith,
                licenseSignatureStartsWith,
                licenseType,
                licenseTypeIn,
                licenseTypeNot,
                licenseTypeNotIn,
                maxCoreNum,
                maxCoreNumGt,
                maxCoreNumGte,
                maxCoreNumIn,
                maxCoreNumLt,
                maxCoreNumLte,
                maxCoreNumNot,
                maxCoreNumNotIn,
                maxPhysicalDataCapacity,
                maxPhysicalDataCapacityGt,
                maxPhysicalDataCapacityGte,
                maxPhysicalDataCapacityIn,
                maxPhysicalDataCapacityLt,
                maxPhysicalDataCapacityLte,
                maxPhysicalDataCapacityNot,
                maxPhysicalDataCapacityNotIn,
                originalCode,
                originalCodeContains,
                originalCodeEndsWith,
                originalCodeGt,
                originalCodeGte,
                originalCodeIn,
                originalCodeLt,
                originalCodeLte,
                originalCodeNot,
                originalCodeNotContains,
                originalCodeNotEndsWith,
                originalCodeNotIn,
                originalCodeNotStartsWith,
                originalCodeStartsWith,
                productName,
                productNameContains,
                productNameEndsWith,
                productNameGt,
                productNameGte,
                productNameIn,
                productNameLt,
                productNameLte,
                productNameNot,
                productNameNotContains,
                productNameNotEndsWith,
                productNameNotIn,
                productNameNotStartsWith,
                productNameStartsWith,
                serial,
                serialContains,
                serialEndsWith,
                serialGt,
                serialGte,
                serialIn,
                serialLt,
                serialLte,
                serialNot,
                serialNotContains,
                serialNotEndsWith,
                serialNotIn,
                serialNotStartsWith,
                serialStartsWith,
                signDate,
                signDateGt,
                signDateGte,
                signDateIn,
                signDateLt,
                signDateLte,
                signDateNot,
                signDateNotIn,
                subscriptionExpireDate,
                subscriptionExpireDateGt,
                subscriptionExpireDateGte,
                subscriptionExpireDateIn,
                subscriptionExpireDateLt,
                subscriptionExpireDateLte,
                subscriptionExpireDateNot,
                subscriptionExpireDateNotIn,
                subscriptionStartDate,
                subscriptionStartDateGt,
                subscriptionStartDateGte,
                subscriptionStartDateIn,
                subscriptionStartDateLt,
                subscriptionStartDateLte,
                subscriptionStartDateNot,
                subscriptionStartDateNotIn,
                syncReplication,
                syncReplicationContains,
                syncReplicationEndsWith,
                syncReplicationGt,
                syncReplicationGte,
                syncReplicationIn,
                syncReplicationLt,
                syncReplicationLte,
                syncReplicationNot,
                syncReplicationNotContains,
                syncReplicationNotEndsWith,
                syncReplicationNotIn,
                syncReplicationNotStartsWith,
                syncReplicationStartsWith,
                trafficVisualization,
                trafficVisualizationContains,
                trafficVisualizationEndsWith,
                trafficVisualizationGt,
                trafficVisualizationGte,
                trafficVisualizationIn,
                trafficVisualizationLt,
                trafficVisualizationLte,
                trafficVisualizationNot,
                trafficVisualizationNotContains,
                trafficVisualizationNotEndsWith,
                trafficVisualizationNotIn,
                trafficVisualizationNotStartsWith,
                trafficVisualizationStartsWith,
                vendor,
                vendorContains,
                vendorEndsWith,
                vendorGt,
                vendorGte,
                vendorIn,
                vendorLt,
                vendorLte,
                vendorNot,
                vendorNotContains,
                vendorNotEndsWith,
                vendorNotIn,
                vendorNotStartsWith,
                vendorStartsWith,
                version,
                versionGt,
                versionGte,
                versionIn,
                versionLt,
                versionLte,
                versionNot,
                versionNotIn,
                vpc,
                vpcContains,
                vpcEndsWith,
                vpcGt,
                vpcGte,
                vpcIn,
                vpcLt,
                vpcLte,
                vpcNot,
                vpcNotContains,
                vpcNotEndsWith,
                vpcNotIn,
                vpcNotStartsWith,
                vpcStartsWith);
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
        sb.append("class EcpLicenseWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    asyncReplication: ").append(toIndentedString(asyncReplication)).append("\n");
        sb.append("    asyncReplicationContains: ")
                .append(toIndentedString(asyncReplicationContains))
                .append("\n");
        sb.append("    asyncReplicationEndsWith: ")
                .append(toIndentedString(asyncReplicationEndsWith))
                .append("\n");
        sb.append("    asyncReplicationGt: ")
                .append(toIndentedString(asyncReplicationGt))
                .append("\n");
        sb.append("    asyncReplicationGte: ")
                .append(toIndentedString(asyncReplicationGte))
                .append("\n");
        sb.append("    asyncReplicationIn: ")
                .append(toIndentedString(asyncReplicationIn))
                .append("\n");
        sb.append("    asyncReplicationLt: ")
                .append(toIndentedString(asyncReplicationLt))
                .append("\n");
        sb.append("    asyncReplicationLte: ")
                .append(toIndentedString(asyncReplicationLte))
                .append("\n");
        sb.append("    asyncReplicationNot: ")
                .append(toIndentedString(asyncReplicationNot))
                .append("\n");
        sb.append("    asyncReplicationNotContains: ")
                .append(toIndentedString(asyncReplicationNotContains))
                .append("\n");
        sb.append("    asyncReplicationNotEndsWith: ")
                .append(toIndentedString(asyncReplicationNotEndsWith))
                .append("\n");
        sb.append("    asyncReplicationNotIn: ")
                .append(toIndentedString(asyncReplicationNotIn))
                .append("\n");
        sb.append("    asyncReplicationNotStartsWith: ")
                .append(toIndentedString(asyncReplicationNotStartsWith))
                .append("\n");
        sb.append("    asyncReplicationStartsWith: ")
                .append(toIndentedString(asyncReplicationStartsWith))
                .append("\n");
        sb.append("    backup: ").append(toIndentedString(backup)).append("\n");
        sb.append("    backupContains: ").append(toIndentedString(backupContains)).append("\n");
        sb.append("    backupEndsWith: ").append(toIndentedString(backupEndsWith)).append("\n");
        sb.append("    backupGt: ").append(toIndentedString(backupGt)).append("\n");
        sb.append("    backupGte: ").append(toIndentedString(backupGte)).append("\n");
        sb.append("    backupIn: ").append(toIndentedString(backupIn)).append("\n");
        sb.append("    backupLt: ").append(toIndentedString(backupLt)).append("\n");
        sb.append("    backupLte: ").append(toIndentedString(backupLte)).append("\n");
        sb.append("    backupNot: ").append(toIndentedString(backupNot)).append("\n");
        sb.append("    backupNotContains: ")
                .append(toIndentedString(backupNotContains))
                .append("\n");
        sb.append("    backupNotEndsWith: ")
                .append(toIndentedString(backupNotEndsWith))
                .append("\n");
        sb.append("    backupNotIn: ").append(toIndentedString(backupNotIn)).append("\n");
        sb.append("    backupNotStartsWith: ")
                .append(toIndentedString(backupNotStartsWith))
                .append("\n");
        sb.append("    backupStartsWith: ").append(toIndentedString(backupStartsWith)).append("\n");
        sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
        sb.append("    brandContains: ").append(toIndentedString(brandContains)).append("\n");
        sb.append("    brandEndsWith: ").append(toIndentedString(brandEndsWith)).append("\n");
        sb.append("    brandGt: ").append(toIndentedString(brandGt)).append("\n");
        sb.append("    brandGte: ").append(toIndentedString(brandGte)).append("\n");
        sb.append("    brandIn: ").append(toIndentedString(brandIn)).append("\n");
        sb.append("    brandLt: ").append(toIndentedString(brandLt)).append("\n");
        sb.append("    brandLte: ").append(toIndentedString(brandLte)).append("\n");
        sb.append("    brandNot: ").append(toIndentedString(brandNot)).append("\n");
        sb.append("    brandNotContains: ").append(toIndentedString(brandNotContains)).append("\n");
        sb.append("    brandNotEndsWith: ").append(toIndentedString(brandNotEndsWith)).append("\n");
        sb.append("    brandNotIn: ").append(toIndentedString(brandNotIn)).append("\n");
        sb.append("    brandNotStartsWith: ")
                .append(toIndentedString(brandNotStartsWith))
                .append("\n");
        sb.append("    brandStartsWith: ").append(toIndentedString(brandStartsWith)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    clusterLocalId: ").append(toIndentedString(clusterLocalId)).append("\n");
        sb.append("    clusterLocalIdContains: ")
                .append(toIndentedString(clusterLocalIdContains))
                .append("\n");
        sb.append("    clusterLocalIdEndsWith: ")
                .append(toIndentedString(clusterLocalIdEndsWith))
                .append("\n");
        sb.append("    clusterLocalIdGt: ").append(toIndentedString(clusterLocalIdGt)).append("\n");
        sb.append("    clusterLocalIdGte: ")
                .append(toIndentedString(clusterLocalIdGte))
                .append("\n");
        sb.append("    clusterLocalIdIn: ").append(toIndentedString(clusterLocalIdIn)).append("\n");
        sb.append("    clusterLocalIdLt: ").append(toIndentedString(clusterLocalIdLt)).append("\n");
        sb.append("    clusterLocalIdLte: ")
                .append(toIndentedString(clusterLocalIdLte))
                .append("\n");
        sb.append("    clusterLocalIdNot: ")
                .append(toIndentedString(clusterLocalIdNot))
                .append("\n");
        sb.append("    clusterLocalIdNotContains: ")
                .append(toIndentedString(clusterLocalIdNotContains))
                .append("\n");
        sb.append("    clusterLocalIdNotEndsWith: ")
                .append(toIndentedString(clusterLocalIdNotEndsWith))
                .append("\n");
        sb.append("    clusterLocalIdNotIn: ")
                .append(toIndentedString(clusterLocalIdNotIn))
                .append("\n");
        sb.append("    clusterLocalIdNotStartsWith: ")
                .append(toIndentedString(clusterLocalIdNotStartsWith))
                .append("\n");
        sb.append("    clusterLocalIdStartsWith: ")
                .append(toIndentedString(clusterLocalIdStartsWith))
                .append("\n");
        sb.append("    dfw: ").append(toIndentedString(dfw)).append("\n");
        sb.append("    dfwContains: ").append(toIndentedString(dfwContains)).append("\n");
        sb.append("    dfwEndsWith: ").append(toIndentedString(dfwEndsWith)).append("\n");
        sb.append("    dfwGt: ").append(toIndentedString(dfwGt)).append("\n");
        sb.append("    dfwGte: ").append(toIndentedString(dfwGte)).append("\n");
        sb.append("    dfwIn: ").append(toIndentedString(dfwIn)).append("\n");
        sb.append("    dfwLt: ").append(toIndentedString(dfwLt)).append("\n");
        sb.append("    dfwLte: ").append(toIndentedString(dfwLte)).append("\n");
        sb.append("    dfwNot: ").append(toIndentedString(dfwNot)).append("\n");
        sb.append("    dfwNotContains: ").append(toIndentedString(dfwNotContains)).append("\n");
        sb.append("    dfwNotEndsWith: ").append(toIndentedString(dfwNotEndsWith)).append("\n");
        sb.append("    dfwNotIn: ").append(toIndentedString(dfwNotIn)).append("\n");
        sb.append("    dfwNotStartsWith: ").append(toIndentedString(dfwNotStartsWith)).append("\n");
        sb.append("    dfwStartsWith: ").append(toIndentedString(dfwStartsWith)).append("\n");
        sb.append("    ecpEdition: ").append(toIndentedString(ecpEdition)).append("\n");
        sb.append("    ecpEditionIn: ").append(toIndentedString(ecpEditionIn)).append("\n");
        sb.append("    ecpEditionNot: ").append(toIndentedString(ecpEditionNot)).append("\n");
        sb.append("    ecpEditionNotIn: ").append(toIndentedString(ecpEditionNotIn)).append("\n");
        sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
        sb.append("    expireDateGt: ").append(toIndentedString(expireDateGt)).append("\n");
        sb.append("    expireDateGte: ").append(toIndentedString(expireDateGte)).append("\n");
        sb.append("    expireDateIn: ").append(toIndentedString(expireDateIn)).append("\n");
        sb.append("    expireDateLt: ").append(toIndentedString(expireDateLt)).append("\n");
        sb.append("    expireDateLte: ").append(toIndentedString(expireDateLte)).append("\n");
        sb.append("    expireDateNot: ").append(toIndentedString(expireDateNot)).append("\n");
        sb.append("    expireDateNotIn: ").append(toIndentedString(expireDateNotIn)).append("\n");
        sb.append("    externalStorage: ").append(toIndentedString(externalStorage)).append("\n");
        sb.append("    externalStorageNot: ")
                .append(toIndentedString(externalStorageNot))
                .append("\n");
        sb.append("    fileStorage: ").append(toIndentedString(fileStorage)).append("\n");
        sb.append("    fileStorageContains: ")
                .append(toIndentedString(fileStorageContains))
                .append("\n");
        sb.append("    fileStorageEndsWith: ")
                .append(toIndentedString(fileStorageEndsWith))
                .append("\n");
        sb.append("    fileStorageGt: ").append(toIndentedString(fileStorageGt)).append("\n");
        sb.append("    fileStorageGte: ").append(toIndentedString(fileStorageGte)).append("\n");
        sb.append("    fileStorageIn: ").append(toIndentedString(fileStorageIn)).append("\n");
        sb.append("    fileStorageLt: ").append(toIndentedString(fileStorageLt)).append("\n");
        sb.append("    fileStorageLte: ").append(toIndentedString(fileStorageLte)).append("\n");
        sb.append("    fileStorageNot: ").append(toIndentedString(fileStorageNot)).append("\n");
        sb.append("    fileStorageNotContains: ")
                .append(toIndentedString(fileStorageNotContains))
                .append("\n");
        sb.append("    fileStorageNotEndsWith: ")
                .append(toIndentedString(fileStorageNotEndsWith))
                .append("\n");
        sb.append("    fileStorageNotIn: ").append(toIndentedString(fileStorageNotIn)).append("\n");
        sb.append("    fileStorageNotStartsWith: ")
                .append(toIndentedString(fileStorageNotStartsWith))
                .append("\n");
        sb.append("    fileStorageStartsWith: ")
                .append(toIndentedString(fileStorageStartsWith))
                .append("\n");
        sb.append("    hasMetrox: ").append(toIndentedString(hasMetrox)).append("\n");
        sb.append("    hasMetroxNot: ").append(toIndentedString(hasMetroxNot)).append("\n");
        sb.append("    hasRemoteBackup: ").append(toIndentedString(hasRemoteBackup)).append("\n");
        sb.append("    hasRemoteBackupNot: ")
                .append(toIndentedString(hasRemoteBackupNot))
                .append("\n");
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
        sb.append("    k8sBareMetal: ").append(toIndentedString(k8sBareMetal)).append("\n");
        sb.append("    k8sBareMetalContains: ")
                .append(toIndentedString(k8sBareMetalContains))
                .append("\n");
        sb.append("    k8sBareMetalEndsWith: ")
                .append(toIndentedString(k8sBareMetalEndsWith))
                .append("\n");
        sb.append("    k8sBareMetalGt: ").append(toIndentedString(k8sBareMetalGt)).append("\n");
        sb.append("    k8sBareMetalGte: ").append(toIndentedString(k8sBareMetalGte)).append("\n");
        sb.append("    k8sBareMetalIn: ").append(toIndentedString(k8sBareMetalIn)).append("\n");
        sb.append("    k8sBareMetalLt: ").append(toIndentedString(k8sBareMetalLt)).append("\n");
        sb.append("    k8sBareMetalLte: ").append(toIndentedString(k8sBareMetalLte)).append("\n");
        sb.append("    k8sBareMetalNot: ").append(toIndentedString(k8sBareMetalNot)).append("\n");
        sb.append("    k8sBareMetalNotContains: ")
                .append(toIndentedString(k8sBareMetalNotContains))
                .append("\n");
        sb.append("    k8sBareMetalNotEndsWith: ")
                .append(toIndentedString(k8sBareMetalNotEndsWith))
                .append("\n");
        sb.append("    k8sBareMetalNotIn: ")
                .append(toIndentedString(k8sBareMetalNotIn))
                .append("\n");
        sb.append("    k8sBareMetalNotStartsWith: ")
                .append(toIndentedString(k8sBareMetalNotStartsWith))
                .append("\n");
        sb.append("    k8sBareMetalStartsWith: ")
                .append(toIndentedString(k8sBareMetalStartsWith))
                .append("\n");
        sb.append("    k8sService: ").append(toIndentedString(k8sService)).append("\n");
        sb.append("    k8sServiceContains: ")
                .append(toIndentedString(k8sServiceContains))
                .append("\n");
        sb.append("    k8sServiceEndsWith: ")
                .append(toIndentedString(k8sServiceEndsWith))
                .append("\n");
        sb.append("    k8sServiceGt: ").append(toIndentedString(k8sServiceGt)).append("\n");
        sb.append("    k8sServiceGte: ").append(toIndentedString(k8sServiceGte)).append("\n");
        sb.append("    k8sServiceIn: ").append(toIndentedString(k8sServiceIn)).append("\n");
        sb.append("    k8sServiceLt: ").append(toIndentedString(k8sServiceLt)).append("\n");
        sb.append("    k8sServiceLte: ").append(toIndentedString(k8sServiceLte)).append("\n");
        sb.append("    k8sServiceNot: ").append(toIndentedString(k8sServiceNot)).append("\n");
        sb.append("    k8sServiceNotContains: ")
                .append(toIndentedString(k8sServiceNotContains))
                .append("\n");
        sb.append("    k8sServiceNotEndsWith: ")
                .append(toIndentedString(k8sServiceNotEndsWith))
                .append("\n");
        sb.append("    k8sServiceNotIn: ").append(toIndentedString(k8sServiceNotIn)).append("\n");
        sb.append("    k8sServiceNotStartsWith: ")
                .append(toIndentedString(k8sServiceNotStartsWith))
                .append("\n");
        sb.append("    k8sServiceStartsWith: ")
                .append(toIndentedString(k8sServiceStartsWith))
                .append("\n");
        sb.append("    lb: ").append(toIndentedString(lb)).append("\n");
        sb.append("    lbContains: ").append(toIndentedString(lbContains)).append("\n");
        sb.append("    lbEndsWith: ").append(toIndentedString(lbEndsWith)).append("\n");
        sb.append("    lbGt: ").append(toIndentedString(lbGt)).append("\n");
        sb.append("    lbGte: ").append(toIndentedString(lbGte)).append("\n");
        sb.append("    lbIn: ").append(toIndentedString(lbIn)).append("\n");
        sb.append("    lbLt: ").append(toIndentedString(lbLt)).append("\n");
        sb.append("    lbLte: ").append(toIndentedString(lbLte)).append("\n");
        sb.append("    lbNot: ").append(toIndentedString(lbNot)).append("\n");
        sb.append("    lbNotContains: ").append(toIndentedString(lbNotContains)).append("\n");
        sb.append("    lbNotEndsWith: ").append(toIndentedString(lbNotEndsWith)).append("\n");
        sb.append("    lbNotIn: ").append(toIndentedString(lbNotIn)).append("\n");
        sb.append("    lbNotStartsWith: ").append(toIndentedString(lbNotStartsWith)).append("\n");
        sb.append("    lbStartsWith: ").append(toIndentedString(lbStartsWith)).append("\n");
        sb.append("    licensePayload: ").append(toIndentedString(licensePayload)).append("\n");
        sb.append("    licensePayloadContains: ")
                .append(toIndentedString(licensePayloadContains))
                .append("\n");
        sb.append("    licensePayloadEndsWith: ")
                .append(toIndentedString(licensePayloadEndsWith))
                .append("\n");
        sb.append("    licensePayloadGt: ").append(toIndentedString(licensePayloadGt)).append("\n");
        sb.append("    licensePayloadGte: ")
                .append(toIndentedString(licensePayloadGte))
                .append("\n");
        sb.append("    licensePayloadIn: ").append(toIndentedString(licensePayloadIn)).append("\n");
        sb.append("    licensePayloadLt: ").append(toIndentedString(licensePayloadLt)).append("\n");
        sb.append("    licensePayloadLte: ")
                .append(toIndentedString(licensePayloadLte))
                .append("\n");
        sb.append("    licensePayloadNot: ")
                .append(toIndentedString(licensePayloadNot))
                .append("\n");
        sb.append("    licensePayloadNotContains: ")
                .append(toIndentedString(licensePayloadNotContains))
                .append("\n");
        sb.append("    licensePayloadNotEndsWith: ")
                .append(toIndentedString(licensePayloadNotEndsWith))
                .append("\n");
        sb.append("    licensePayloadNotIn: ")
                .append(toIndentedString(licensePayloadNotIn))
                .append("\n");
        sb.append("    licensePayloadNotStartsWith: ")
                .append(toIndentedString(licensePayloadNotStartsWith))
                .append("\n");
        sb.append("    licensePayloadStartsWith: ")
                .append(toIndentedString(licensePayloadStartsWith))
                .append("\n");
        sb.append("    licenseSignature: ").append(toIndentedString(licenseSignature)).append("\n");
        sb.append("    licenseSignatureContains: ")
                .append(toIndentedString(licenseSignatureContains))
                .append("\n");
        sb.append("    licenseSignatureEndsWith: ")
                .append(toIndentedString(licenseSignatureEndsWith))
                .append("\n");
        sb.append("    licenseSignatureGt: ")
                .append(toIndentedString(licenseSignatureGt))
                .append("\n");
        sb.append("    licenseSignatureGte: ")
                .append(toIndentedString(licenseSignatureGte))
                .append("\n");
        sb.append("    licenseSignatureIn: ")
                .append(toIndentedString(licenseSignatureIn))
                .append("\n");
        sb.append("    licenseSignatureLt: ")
                .append(toIndentedString(licenseSignatureLt))
                .append("\n");
        sb.append("    licenseSignatureLte: ")
                .append(toIndentedString(licenseSignatureLte))
                .append("\n");
        sb.append("    licenseSignatureNot: ")
                .append(toIndentedString(licenseSignatureNot))
                .append("\n");
        sb.append("    licenseSignatureNotContains: ")
                .append(toIndentedString(licenseSignatureNotContains))
                .append("\n");
        sb.append("    licenseSignatureNotEndsWith: ")
                .append(toIndentedString(licenseSignatureNotEndsWith))
                .append("\n");
        sb.append("    licenseSignatureNotIn: ")
                .append(toIndentedString(licenseSignatureNotIn))
                .append("\n");
        sb.append("    licenseSignatureNotStartsWith: ")
                .append(toIndentedString(licenseSignatureNotStartsWith))
                .append("\n");
        sb.append("    licenseSignatureStartsWith: ")
                .append(toIndentedString(licenseSignatureStartsWith))
                .append("\n");
        sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
        sb.append("    licenseTypeIn: ").append(toIndentedString(licenseTypeIn)).append("\n");
        sb.append("    licenseTypeNot: ").append(toIndentedString(licenseTypeNot)).append("\n");
        sb.append("    licenseTypeNotIn: ").append(toIndentedString(licenseTypeNotIn)).append("\n");
        sb.append("    maxCoreNum: ").append(toIndentedString(maxCoreNum)).append("\n");
        sb.append("    maxCoreNumGt: ").append(toIndentedString(maxCoreNumGt)).append("\n");
        sb.append("    maxCoreNumGte: ").append(toIndentedString(maxCoreNumGte)).append("\n");
        sb.append("    maxCoreNumIn: ").append(toIndentedString(maxCoreNumIn)).append("\n");
        sb.append("    maxCoreNumLt: ").append(toIndentedString(maxCoreNumLt)).append("\n");
        sb.append("    maxCoreNumLte: ").append(toIndentedString(maxCoreNumLte)).append("\n");
        sb.append("    maxCoreNumNot: ").append(toIndentedString(maxCoreNumNot)).append("\n");
        sb.append("    maxCoreNumNotIn: ").append(toIndentedString(maxCoreNumNotIn)).append("\n");
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
        sb.append("    originalCode: ").append(toIndentedString(originalCode)).append("\n");
        sb.append("    originalCodeContains: ")
                .append(toIndentedString(originalCodeContains))
                .append("\n");
        sb.append("    originalCodeEndsWith: ")
                .append(toIndentedString(originalCodeEndsWith))
                .append("\n");
        sb.append("    originalCodeGt: ").append(toIndentedString(originalCodeGt)).append("\n");
        sb.append("    originalCodeGte: ").append(toIndentedString(originalCodeGte)).append("\n");
        sb.append("    originalCodeIn: ").append(toIndentedString(originalCodeIn)).append("\n");
        sb.append("    originalCodeLt: ").append(toIndentedString(originalCodeLt)).append("\n");
        sb.append("    originalCodeLte: ").append(toIndentedString(originalCodeLte)).append("\n");
        sb.append("    originalCodeNot: ").append(toIndentedString(originalCodeNot)).append("\n");
        sb.append("    originalCodeNotContains: ")
                .append(toIndentedString(originalCodeNotContains))
                .append("\n");
        sb.append("    originalCodeNotEndsWith: ")
                .append(toIndentedString(originalCodeNotEndsWith))
                .append("\n");
        sb.append("    originalCodeNotIn: ")
                .append(toIndentedString(originalCodeNotIn))
                .append("\n");
        sb.append("    originalCodeNotStartsWith: ")
                .append(toIndentedString(originalCodeNotStartsWith))
                .append("\n");
        sb.append("    originalCodeStartsWith: ")
                .append(toIndentedString(originalCodeStartsWith))
                .append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    productNameContains: ")
                .append(toIndentedString(productNameContains))
                .append("\n");
        sb.append("    productNameEndsWith: ")
                .append(toIndentedString(productNameEndsWith))
                .append("\n");
        sb.append("    productNameGt: ").append(toIndentedString(productNameGt)).append("\n");
        sb.append("    productNameGte: ").append(toIndentedString(productNameGte)).append("\n");
        sb.append("    productNameIn: ").append(toIndentedString(productNameIn)).append("\n");
        sb.append("    productNameLt: ").append(toIndentedString(productNameLt)).append("\n");
        sb.append("    productNameLte: ").append(toIndentedString(productNameLte)).append("\n");
        sb.append("    productNameNot: ").append(toIndentedString(productNameNot)).append("\n");
        sb.append("    productNameNotContains: ")
                .append(toIndentedString(productNameNotContains))
                .append("\n");
        sb.append("    productNameNotEndsWith: ")
                .append(toIndentedString(productNameNotEndsWith))
                .append("\n");
        sb.append("    productNameNotIn: ").append(toIndentedString(productNameNotIn)).append("\n");
        sb.append("    productNameNotStartsWith: ")
                .append(toIndentedString(productNameNotStartsWith))
                .append("\n");
        sb.append("    productNameStartsWith: ")
                .append(toIndentedString(productNameStartsWith))
                .append("\n");
        sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
        sb.append("    serialContains: ").append(toIndentedString(serialContains)).append("\n");
        sb.append("    serialEndsWith: ").append(toIndentedString(serialEndsWith)).append("\n");
        sb.append("    serialGt: ").append(toIndentedString(serialGt)).append("\n");
        sb.append("    serialGte: ").append(toIndentedString(serialGte)).append("\n");
        sb.append("    serialIn: ").append(toIndentedString(serialIn)).append("\n");
        sb.append("    serialLt: ").append(toIndentedString(serialLt)).append("\n");
        sb.append("    serialLte: ").append(toIndentedString(serialLte)).append("\n");
        sb.append("    serialNot: ").append(toIndentedString(serialNot)).append("\n");
        sb.append("    serialNotContains: ")
                .append(toIndentedString(serialNotContains))
                .append("\n");
        sb.append("    serialNotEndsWith: ")
                .append(toIndentedString(serialNotEndsWith))
                .append("\n");
        sb.append("    serialNotIn: ").append(toIndentedString(serialNotIn)).append("\n");
        sb.append("    serialNotStartsWith: ")
                .append(toIndentedString(serialNotStartsWith))
                .append("\n");
        sb.append("    serialStartsWith: ").append(toIndentedString(serialStartsWith)).append("\n");
        sb.append("    signDate: ").append(toIndentedString(signDate)).append("\n");
        sb.append("    signDateGt: ").append(toIndentedString(signDateGt)).append("\n");
        sb.append("    signDateGte: ").append(toIndentedString(signDateGte)).append("\n");
        sb.append("    signDateIn: ").append(toIndentedString(signDateIn)).append("\n");
        sb.append("    signDateLt: ").append(toIndentedString(signDateLt)).append("\n");
        sb.append("    signDateLte: ").append(toIndentedString(signDateLte)).append("\n");
        sb.append("    signDateNot: ").append(toIndentedString(signDateNot)).append("\n");
        sb.append("    signDateNotIn: ").append(toIndentedString(signDateNotIn)).append("\n");
        sb.append("    subscriptionExpireDate: ")
                .append(toIndentedString(subscriptionExpireDate))
                .append("\n");
        sb.append("    subscriptionExpireDateGt: ")
                .append(toIndentedString(subscriptionExpireDateGt))
                .append("\n");
        sb.append("    subscriptionExpireDateGte: ")
                .append(toIndentedString(subscriptionExpireDateGte))
                .append("\n");
        sb.append("    subscriptionExpireDateIn: ")
                .append(toIndentedString(subscriptionExpireDateIn))
                .append("\n");
        sb.append("    subscriptionExpireDateLt: ")
                .append(toIndentedString(subscriptionExpireDateLt))
                .append("\n");
        sb.append("    subscriptionExpireDateLte: ")
                .append(toIndentedString(subscriptionExpireDateLte))
                .append("\n");
        sb.append("    subscriptionExpireDateNot: ")
                .append(toIndentedString(subscriptionExpireDateNot))
                .append("\n");
        sb.append("    subscriptionExpireDateNotIn: ")
                .append(toIndentedString(subscriptionExpireDateNotIn))
                .append("\n");
        sb.append("    subscriptionStartDate: ")
                .append(toIndentedString(subscriptionStartDate))
                .append("\n");
        sb.append("    subscriptionStartDateGt: ")
                .append(toIndentedString(subscriptionStartDateGt))
                .append("\n");
        sb.append("    subscriptionStartDateGte: ")
                .append(toIndentedString(subscriptionStartDateGte))
                .append("\n");
        sb.append("    subscriptionStartDateIn: ")
                .append(toIndentedString(subscriptionStartDateIn))
                .append("\n");
        sb.append("    subscriptionStartDateLt: ")
                .append(toIndentedString(subscriptionStartDateLt))
                .append("\n");
        sb.append("    subscriptionStartDateLte: ")
                .append(toIndentedString(subscriptionStartDateLte))
                .append("\n");
        sb.append("    subscriptionStartDateNot: ")
                .append(toIndentedString(subscriptionStartDateNot))
                .append("\n");
        sb.append("    subscriptionStartDateNotIn: ")
                .append(toIndentedString(subscriptionStartDateNotIn))
                .append("\n");
        sb.append("    syncReplication: ").append(toIndentedString(syncReplication)).append("\n");
        sb.append("    syncReplicationContains: ")
                .append(toIndentedString(syncReplicationContains))
                .append("\n");
        sb.append("    syncReplicationEndsWith: ")
                .append(toIndentedString(syncReplicationEndsWith))
                .append("\n");
        sb.append("    syncReplicationGt: ")
                .append(toIndentedString(syncReplicationGt))
                .append("\n");
        sb.append("    syncReplicationGte: ")
                .append(toIndentedString(syncReplicationGte))
                .append("\n");
        sb.append("    syncReplicationIn: ")
                .append(toIndentedString(syncReplicationIn))
                .append("\n");
        sb.append("    syncReplicationLt: ")
                .append(toIndentedString(syncReplicationLt))
                .append("\n");
        sb.append("    syncReplicationLte: ")
                .append(toIndentedString(syncReplicationLte))
                .append("\n");
        sb.append("    syncReplicationNot: ")
                .append(toIndentedString(syncReplicationNot))
                .append("\n");
        sb.append("    syncReplicationNotContains: ")
                .append(toIndentedString(syncReplicationNotContains))
                .append("\n");
        sb.append("    syncReplicationNotEndsWith: ")
                .append(toIndentedString(syncReplicationNotEndsWith))
                .append("\n");
        sb.append("    syncReplicationNotIn: ")
                .append(toIndentedString(syncReplicationNotIn))
                .append("\n");
        sb.append("    syncReplicationNotStartsWith: ")
                .append(toIndentedString(syncReplicationNotStartsWith))
                .append("\n");
        sb.append("    syncReplicationStartsWith: ")
                .append(toIndentedString(syncReplicationStartsWith))
                .append("\n");
        sb.append("    trafficVisualization: ")
                .append(toIndentedString(trafficVisualization))
                .append("\n");
        sb.append("    trafficVisualizationContains: ")
                .append(toIndentedString(trafficVisualizationContains))
                .append("\n");
        sb.append("    trafficVisualizationEndsWith: ")
                .append(toIndentedString(trafficVisualizationEndsWith))
                .append("\n");
        sb.append("    trafficVisualizationGt: ")
                .append(toIndentedString(trafficVisualizationGt))
                .append("\n");
        sb.append("    trafficVisualizationGte: ")
                .append(toIndentedString(trafficVisualizationGte))
                .append("\n");
        sb.append("    trafficVisualizationIn: ")
                .append(toIndentedString(trafficVisualizationIn))
                .append("\n");
        sb.append("    trafficVisualizationLt: ")
                .append(toIndentedString(trafficVisualizationLt))
                .append("\n");
        sb.append("    trafficVisualizationLte: ")
                .append(toIndentedString(trafficVisualizationLte))
                .append("\n");
        sb.append("    trafficVisualizationNot: ")
                .append(toIndentedString(trafficVisualizationNot))
                .append("\n");
        sb.append("    trafficVisualizationNotContains: ")
                .append(toIndentedString(trafficVisualizationNotContains))
                .append("\n");
        sb.append("    trafficVisualizationNotEndsWith: ")
                .append(toIndentedString(trafficVisualizationNotEndsWith))
                .append("\n");
        sb.append("    trafficVisualizationNotIn: ")
                .append(toIndentedString(trafficVisualizationNotIn))
                .append("\n");
        sb.append("    trafficVisualizationNotStartsWith: ")
                .append(toIndentedString(trafficVisualizationNotStartsWith))
                .append("\n");
        sb.append("    trafficVisualizationStartsWith: ")
                .append(toIndentedString(trafficVisualizationStartsWith))
                .append("\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
        sb.append("    vendorContains: ").append(toIndentedString(vendorContains)).append("\n");
        sb.append("    vendorEndsWith: ").append(toIndentedString(vendorEndsWith)).append("\n");
        sb.append("    vendorGt: ").append(toIndentedString(vendorGt)).append("\n");
        sb.append("    vendorGte: ").append(toIndentedString(vendorGte)).append("\n");
        sb.append("    vendorIn: ").append(toIndentedString(vendorIn)).append("\n");
        sb.append("    vendorLt: ").append(toIndentedString(vendorLt)).append("\n");
        sb.append("    vendorLte: ").append(toIndentedString(vendorLte)).append("\n");
        sb.append("    vendorNot: ").append(toIndentedString(vendorNot)).append("\n");
        sb.append("    vendorNotContains: ")
                .append(toIndentedString(vendorNotContains))
                .append("\n");
        sb.append("    vendorNotEndsWith: ")
                .append(toIndentedString(vendorNotEndsWith))
                .append("\n");
        sb.append("    vendorNotIn: ").append(toIndentedString(vendorNotIn)).append("\n");
        sb.append("    vendorNotStartsWith: ")
                .append(toIndentedString(vendorNotStartsWith))
                .append("\n");
        sb.append("    vendorStartsWith: ").append(toIndentedString(vendorStartsWith)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionGt: ").append(toIndentedString(versionGt)).append("\n");
        sb.append("    versionGte: ").append(toIndentedString(versionGte)).append("\n");
        sb.append("    versionIn: ").append(toIndentedString(versionIn)).append("\n");
        sb.append("    versionLt: ").append(toIndentedString(versionLt)).append("\n");
        sb.append("    versionLte: ").append(toIndentedString(versionLte)).append("\n");
        sb.append("    versionNot: ").append(toIndentedString(versionNot)).append("\n");
        sb.append("    versionNotIn: ").append(toIndentedString(versionNotIn)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
        sb.append("    vpcContains: ").append(toIndentedString(vpcContains)).append("\n");
        sb.append("    vpcEndsWith: ").append(toIndentedString(vpcEndsWith)).append("\n");
        sb.append("    vpcGt: ").append(toIndentedString(vpcGt)).append("\n");
        sb.append("    vpcGte: ").append(toIndentedString(vpcGte)).append("\n");
        sb.append("    vpcIn: ").append(toIndentedString(vpcIn)).append("\n");
        sb.append("    vpcLt: ").append(toIndentedString(vpcLt)).append("\n");
        sb.append("    vpcLte: ").append(toIndentedString(vpcLte)).append("\n");
        sb.append("    vpcNot: ").append(toIndentedString(vpcNot)).append("\n");
        sb.append("    vpcNotContains: ").append(toIndentedString(vpcNotContains)).append("\n");
        sb.append("    vpcNotEndsWith: ").append(toIndentedString(vpcNotEndsWith)).append("\n");
        sb.append("    vpcNotIn: ").append(toIndentedString(vpcNotIn)).append("\n");
        sb.append("    vpcNotStartsWith: ").append(toIndentedString(vpcNotStartsWith)).append("\n");
        sb.append("    vpcStartsWith: ").append(toIndentedString(vpcStartsWith)).append("\n");
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
