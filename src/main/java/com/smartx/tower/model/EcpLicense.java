package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** EcpLicense */
@javax.annotation.Generated(value = "JavaCloudTowerClientCodegen")
public class EcpLicense extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ASYNC_REPLICATION = "async_replication";

    @SerializedName(SERIALIZED_NAME_ASYNC_REPLICATION)
    private String asyncReplication;

    public static final String SERIALIZED_NAME_BACKUP = "backup";

    @SerializedName(SERIALIZED_NAME_BACKUP)
    private String backup;

    public static final String SERIALIZED_NAME_BRAND = "brand";

    @SerializedName(SERIALIZED_NAME_BRAND)
    private String brand;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID = "cluster_local_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID)
    private String clusterLocalId;

    public static final String SERIALIZED_NAME_DFW = "dfw";

    @SerializedName(SERIALIZED_NAME_DFW)
    private String dfw;

    public static final String SERIALIZED_NAME_ECP_EDITION = "ecp_edition";

    @SerializedName(SERIALIZED_NAME_ECP_EDITION)
    private EcpEdition ecpEdition;

    public static final String SERIALIZED_NAME_EXPIRE_DATE = "expire_date";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE)
    private String expireDate;

    public static final String SERIALIZED_NAME_EXTERNAL_STORAGE = "external_storage";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_STORAGE)
    private Boolean externalStorage;

    public static final String SERIALIZED_NAME_FILE_STORAGE = "file_storage";

    @SerializedName(SERIALIZED_NAME_FILE_STORAGE)
    private String fileStorage;

    public static final String SERIALIZED_NAME_HAS_METROX = "has_metrox";

    @SerializedName(SERIALIZED_NAME_HAS_METROX)
    private Boolean hasMetrox;

    public static final String SERIALIZED_NAME_HAS_REMOTE_BACKUP = "has_remote_backup";

    @SerializedName(SERIALIZED_NAME_HAS_REMOTE_BACKUP)
    private Boolean hasRemoteBackup;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_K8S_BARE_METAL = "k8s_bare_metal";

    @SerializedName(SERIALIZED_NAME_K8S_BARE_METAL)
    private String k8sBareMetal;

    public static final String SERIALIZED_NAME_K8S_SERVICE = "k8s_service";

    @SerializedName(SERIALIZED_NAME_K8S_SERVICE)
    private String k8sService;

    public static final String SERIALIZED_NAME_LB = "lb";

    @SerializedName(SERIALIZED_NAME_LB)
    private String lb;

    public static final String SERIALIZED_NAME_LICENSE_PAYLOAD = "license_payload";

    @SerializedName(SERIALIZED_NAME_LICENSE_PAYLOAD)
    private String licensePayload;

    public static final String SERIALIZED_NAME_LICENSE_SIGNATURE = "license_signature";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGNATURE)
    private String licenseSignature;

    public static final String SERIALIZED_NAME_LICENSE_TYPE = "license_type";

    @SerializedName(SERIALIZED_NAME_LICENSE_TYPE)
    private LicenseType licenseType;

    public static final String SERIALIZED_NAME_MAX_CORE_NUM = "max_core_num";

    @SerializedName(SERIALIZED_NAME_MAX_CORE_NUM)
    private Integer maxCoreNum;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY =
            "max_physical_data_capacity";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY)
    private Double maxPhysicalDataCapacity;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE = "original_code";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE)
    private String originalCode;

    public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
    private String productName;

    public static final String SERIALIZED_NAME_SERIAL = "serial";

    @SerializedName(SERIALIZED_NAME_SERIAL)
    private String serial;

    public static final String SERIALIZED_NAME_SIGN_DATE = "sign_date";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE)
    private String signDate;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE =
            "subscription_expire_date";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE)
    private String subscriptionExpireDate;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_START_DATE = "subscription_start_date";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_START_DATE)
    private String subscriptionStartDate;

    public static final String SERIALIZED_NAME_SYNC_REPLICATION = "sync_replication";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION)
    private String syncReplication;

    public static final String SERIALIZED_NAME_TRAFFIC_VISUALIZATION = "traffic_visualization";

    @SerializedName(SERIALIZED_NAME_TRAFFIC_VISUALIZATION)
    private String trafficVisualization;

    public static final String SERIALIZED_NAME_VENDOR = "vendor";

    @SerializedName(SERIALIZED_NAME_VENDOR)
    private String vendor;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private Integer version;

    public static final String SERIALIZED_NAME_VPC = "vpc";

    @SerializedName(SERIALIZED_NAME_VPC)
    private String vpc;

    public EcpLicense() {}

    public EcpLicense asyncReplication(String asyncReplication) {

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

    public EcpLicense asyncReplication_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION);
        return this;
    }

    public EcpLicense asyncReplication_ExplictlyNonNull() {
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

    public EcpLicense backup(String backup) {

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

    public EcpLicense backup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP);
        return this;
    }

    public EcpLicense backup_ExplictlyNonNull() {
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

    public EcpLicense brand(String brand) {

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

    public EcpLicense brand_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRAND);
        return this;
    }

    public EcpLicense brand_ExplictlyNonNull() {
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

    public EcpLicense cluster(NestedCluster cluster) {

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
    public NestedCluster getCluster() {
        return cluster;
    }

    public void setCluster(NestedCluster cluster) {
        this.cluster = cluster;
    }

    public EcpLicense cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public EcpLicense cluster_ExplictlyNonNull() {
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

    public EcpLicense clusterLocalId(String clusterLocalId) {

        this.clusterLocalId = clusterLocalId;
        return this;
    }

    /**
     * Get clusterLocalId
     *
     * @return clusterLocalId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getClusterLocalId() {
        return clusterLocalId;
    }

    public void setClusterLocalId(String clusterLocalId) {
        this.clusterLocalId = clusterLocalId;
    }

    public EcpLicense clusterLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        return this;
    }

    public EcpLicense clusterLocalId_ExplictlyNonNull() {
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

    public EcpLicense dfw(String dfw) {

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

    public EcpLicense dfw_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DFW);
        return this;
    }

    public EcpLicense dfw_ExplictlyNonNull() {
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

    public EcpLicense ecpEdition(EcpEdition ecpEdition) {

        this.ecpEdition = ecpEdition;
        return this;
    }

    /**
     * Get ecpEdition
     *
     * @return ecpEdition
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public EcpEdition getEcpEdition() {
        return ecpEdition;
    }

    public void setEcpEdition(EcpEdition ecpEdition) {
        this.ecpEdition = ecpEdition;
    }

    public EcpLicense ecpEdition_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ECP_EDITION);
        return this;
    }

    public EcpLicense ecpEdition_ExplictlyNonNull() {
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

    public EcpLicense expireDate(String expireDate) {

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

    public EcpLicense expireDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE);
        return this;
    }

    public EcpLicense expireDate_ExplictlyNonNull() {
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

    public EcpLicense externalStorage(Boolean externalStorage) {

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

    public EcpLicense externalStorage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_STORAGE);
        return this;
    }

    public EcpLicense externalStorage_ExplictlyNonNull() {
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

    public EcpLicense fileStorage(String fileStorage) {

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

    public EcpLicense fileStorage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE);
        return this;
    }

    public EcpLicense fileStorage_ExplictlyNonNull() {
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

    public EcpLicense hasMetrox(Boolean hasMetrox) {

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

    public EcpLicense hasMetrox_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HAS_METROX);
        return this;
    }

    public EcpLicense hasMetrox_ExplictlyNonNull() {
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

    public EcpLicense hasRemoteBackup(Boolean hasRemoteBackup) {

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

    public EcpLicense hasRemoteBackup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HAS_REMOTE_BACKUP);
        return this;
    }

    public EcpLicense hasRemoteBackup_ExplictlyNonNull() {
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

    public EcpLicense id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EcpLicense id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public EcpLicense id_ExplictlyNonNull() {
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

    public EcpLicense k8sBareMetal(String k8sBareMetal) {

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

    public EcpLicense k8sBareMetal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL);
        return this;
    }

    public EcpLicense k8sBareMetal_ExplictlyNonNull() {
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

    public EcpLicense k8sService(String k8sService) {

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

    public EcpLicense k8sService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE);
        return this;
    }

    public EcpLicense k8sService_ExplictlyNonNull() {
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

    public EcpLicense lb(String lb) {

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

    public EcpLicense lb_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LB);
        return this;
    }

    public EcpLicense lb_ExplictlyNonNull() {
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

    public EcpLicense licensePayload(String licensePayload) {

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

    public EcpLicense licensePayload_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD);
        return this;
    }

    public EcpLicense licensePayload_ExplictlyNonNull() {
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

    public EcpLicense licenseSignature(String licenseSignature) {

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

    public EcpLicense licenseSignature_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE);
        return this;
    }

    public EcpLicense licenseSignature_ExplictlyNonNull() {
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

    public EcpLicense licenseType(LicenseType licenseType) {

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

    public EcpLicense licenseType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE);
        return this;
    }

    public EcpLicense licenseType_ExplictlyNonNull() {
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

    public EcpLicense maxCoreNum(Integer maxCoreNum) {

        this.maxCoreNum = maxCoreNum;
        return this;
    }

    /**
     * Get maxCoreNum
     *
     * @return maxCoreNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getMaxCoreNum() {
        return maxCoreNum;
    }

    public void setMaxCoreNum(Integer maxCoreNum) {
        this.maxCoreNum = maxCoreNum;
    }

    public EcpLicense maxCoreNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM);
        return this;
    }

    public EcpLicense maxCoreNum_ExplictlyNonNull() {
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

    public EcpLicense maxPhysicalDataCapacity(Double maxPhysicalDataCapacity) {

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

    public EcpLicense maxPhysicalDataCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY);
        return this;
    }

    public EcpLicense maxPhysicalDataCapacity_ExplictlyNonNull() {
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

    public EcpLicense originalCode(String originalCode) {

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

    public EcpLicense originalCode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE);
        return this;
    }

    public EcpLicense originalCode_ExplictlyNonNull() {
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

    public EcpLicense productName(String productName) {

        this.productName = productName;
        return this;
    }

    /**
     * Get productName
     *
     * @return productName
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public EcpLicense productName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME);
        return this;
    }

    public EcpLicense productName_ExplictlyNonNull() {
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

    public EcpLicense serial(String serial) {

        this.serial = serial;
        return this;
    }

    /**
     * Get serial
     *
     * @return serial
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public EcpLicense serial_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL);
        return this;
    }

    public EcpLicense serial_ExplictlyNonNull() {
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

    public EcpLicense signDate(String signDate) {

        this.signDate = signDate;
        return this;
    }

    /**
     * Get signDate
     *
     * @return signDate
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

    public EcpLicense signDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE);
        return this;
    }

    public EcpLicense signDate_ExplictlyNonNull() {
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

    public EcpLicense subscriptionExpireDate(String subscriptionExpireDate) {

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

    public EcpLicense subscriptionExpireDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE);
        return this;
    }

    public EcpLicense subscriptionExpireDate_ExplictlyNonNull() {
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

    public EcpLicense subscriptionStartDate(String subscriptionStartDate) {

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

    public EcpLicense subscriptionStartDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE);
        return this;
    }

    public EcpLicense subscriptionStartDate_ExplictlyNonNull() {
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

    public EcpLicense syncReplication(String syncReplication) {

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

    public EcpLicense syncReplication_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION);
        return this;
    }

    public EcpLicense syncReplication_ExplictlyNonNull() {
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

    public EcpLicense trafficVisualization(String trafficVisualization) {

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

    public EcpLicense trafficVisualization_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION);
        return this;
    }

    public EcpLicense trafficVisualization_ExplictlyNonNull() {
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

    public EcpLicense vendor(String vendor) {

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

    public EcpLicense vendor_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR);
        return this;
    }

    public EcpLicense vendor_ExplictlyNonNull() {
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

    public EcpLicense version(Integer version) {

        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public EcpLicense version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public EcpLicense version_ExplictlyNonNull() {
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

    public EcpLicense vpc(String vpc) {

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

    public EcpLicense vpc_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC);
        return this;
    }

    public EcpLicense vpc_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EcpLicense ecpLicense = (EcpLicense) o;
        return Objects.equals(this.asyncReplication, ecpLicense.asyncReplication)
                && Objects.equals(this.backup, ecpLicense.backup)
                && Objects.equals(this.brand, ecpLicense.brand)
                && Objects.equals(this.cluster, ecpLicense.cluster)
                && Objects.equals(this.clusterLocalId, ecpLicense.clusterLocalId)
                && Objects.equals(this.dfw, ecpLicense.dfw)
                && Objects.equals(this.ecpEdition, ecpLicense.ecpEdition)
                && Objects.equals(this.expireDate, ecpLicense.expireDate)
                && Objects.equals(this.externalStorage, ecpLicense.externalStorage)
                && Objects.equals(this.fileStorage, ecpLicense.fileStorage)
                && Objects.equals(this.hasMetrox, ecpLicense.hasMetrox)
                && Objects.equals(this.hasRemoteBackup, ecpLicense.hasRemoteBackup)
                && Objects.equals(this.id, ecpLicense.id)
                && Objects.equals(this.k8sBareMetal, ecpLicense.k8sBareMetal)
                && Objects.equals(this.k8sService, ecpLicense.k8sService)
                && Objects.equals(this.lb, ecpLicense.lb)
                && Objects.equals(this.licensePayload, ecpLicense.licensePayload)
                && Objects.equals(this.licenseSignature, ecpLicense.licenseSignature)
                && Objects.equals(this.licenseType, ecpLicense.licenseType)
                && Objects.equals(this.maxCoreNum, ecpLicense.maxCoreNum)
                && Objects.equals(this.maxPhysicalDataCapacity, ecpLicense.maxPhysicalDataCapacity)
                && Objects.equals(this.originalCode, ecpLicense.originalCode)
                && Objects.equals(this.productName, ecpLicense.productName)
                && Objects.equals(this.serial, ecpLicense.serial)
                && Objects.equals(this.signDate, ecpLicense.signDate)
                && Objects.equals(this.subscriptionExpireDate, ecpLicense.subscriptionExpireDate)
                && Objects.equals(this.subscriptionStartDate, ecpLicense.subscriptionStartDate)
                && Objects.equals(this.syncReplication, ecpLicense.syncReplication)
                && Objects.equals(this.trafficVisualization, ecpLicense.trafficVisualization)
                && Objects.equals(this.vendor, ecpLicense.vendor)
                && Objects.equals(this.version, ecpLicense.version)
                && Objects.equals(this.vpc, ecpLicense.vpc);
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
                asyncReplication,
                backup,
                brand,
                cluster,
                clusterLocalId,
                dfw,
                ecpEdition,
                expireDate,
                externalStorage,
                fileStorage,
                hasMetrox,
                hasRemoteBackup,
                id,
                k8sBareMetal,
                k8sService,
                lb,
                licensePayload,
                licenseSignature,
                licenseType,
                maxCoreNum,
                maxPhysicalDataCapacity,
                originalCode,
                productName,
                serial,
                signDate,
                subscriptionExpireDate,
                subscriptionStartDate,
                syncReplication,
                trafficVisualization,
                vendor,
                version,
                vpc);
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
        sb.append("class EcpLicense {\n");
        sb.append("    asyncReplication: ").append(toIndentedString(asyncReplication)).append("\n");
        sb.append("    backup: ").append(toIndentedString(backup)).append("\n");
        sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    clusterLocalId: ").append(toIndentedString(clusterLocalId)).append("\n");
        sb.append("    dfw: ").append(toIndentedString(dfw)).append("\n");
        sb.append("    ecpEdition: ").append(toIndentedString(ecpEdition)).append("\n");
        sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
        sb.append("    externalStorage: ").append(toIndentedString(externalStorage)).append("\n");
        sb.append("    fileStorage: ").append(toIndentedString(fileStorage)).append("\n");
        sb.append("    hasMetrox: ").append(toIndentedString(hasMetrox)).append("\n");
        sb.append("    hasRemoteBackup: ").append(toIndentedString(hasRemoteBackup)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    k8sBareMetal: ").append(toIndentedString(k8sBareMetal)).append("\n");
        sb.append("    k8sService: ").append(toIndentedString(k8sService)).append("\n");
        sb.append("    lb: ").append(toIndentedString(lb)).append("\n");
        sb.append("    licensePayload: ").append(toIndentedString(licensePayload)).append("\n");
        sb.append("    licenseSignature: ").append(toIndentedString(licenseSignature)).append("\n");
        sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
        sb.append("    maxCoreNum: ").append(toIndentedString(maxCoreNum)).append("\n");
        sb.append("    maxPhysicalDataCapacity: ")
                .append(toIndentedString(maxPhysicalDataCapacity))
                .append("\n");
        sb.append("    originalCode: ").append(toIndentedString(originalCode)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
        sb.append("    signDate: ").append(toIndentedString(signDate)).append("\n");
        sb.append("    subscriptionExpireDate: ")
                .append(toIndentedString(subscriptionExpireDate))
                .append("\n");
        sb.append("    subscriptionStartDate: ")
                .append(toIndentedString(subscriptionStartDate))
                .append("\n");
        sb.append("    syncReplication: ").append(toIndentedString(syncReplication)).append("\n");
        sb.append("    trafficVisualization: ")
                .append(toIndentedString(trafficVisualization))
                .append("\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
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
