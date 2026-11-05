package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedEcpLicense */
@javax.annotation.Generated(value = "JavaCloudTowerClientCodegen")
public class NestedEcpLicense extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ASYNC_REPLICATION = "async_replication";

    @SerializedName(SERIALIZED_NAME_ASYNC_REPLICATION)
    private String asyncReplication;

    public static final String SERIALIZED_NAME_BACKUP = "backup";

    @SerializedName(SERIALIZED_NAME_BACKUP)
    private String backup;

    public static final String SERIALIZED_NAME_BRAND = "brand";

    @SerializedName(SERIALIZED_NAME_BRAND)
    private String brand;

    public static final String SERIALIZED_NAME_DFW = "dfw";

    @SerializedName(SERIALIZED_NAME_DFW)
    private String dfw;

    public static final String SERIALIZED_NAME_EXTERNAL_STORAGE = "external_storage";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_STORAGE)
    private Boolean externalStorage;

    public static final String SERIALIZED_NAME_FILE_STORAGE = "file_storage";

    @SerializedName(SERIALIZED_NAME_FILE_STORAGE)
    private String fileStorage;

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

    public static final String SERIALIZED_NAME_SYNC_REPLICATION = "sync_replication";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION)
    private String syncReplication;

    public static final String SERIALIZED_NAME_TRAFFIC_VISUALIZATION = "traffic_visualization";

    @SerializedName(SERIALIZED_NAME_TRAFFIC_VISUALIZATION)
    private String trafficVisualization;

    public static final String SERIALIZED_NAME_VPC = "vpc";

    @SerializedName(SERIALIZED_NAME_VPC)
    private String vpc;

    public NestedEcpLicense() {}

    public NestedEcpLicense asyncReplication(String asyncReplication) {

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

    public NestedEcpLicense asyncReplication_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASYNC_REPLICATION);
        return this;
    }

    public NestedEcpLicense asyncReplication_ExplictlyNonNull() {
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

    public NestedEcpLicense backup(String backup) {

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

    public NestedEcpLicense backup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP);
        return this;
    }

    public NestedEcpLicense backup_ExplictlyNonNull() {
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

    public NestedEcpLicense brand(String brand) {

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

    public NestedEcpLicense brand_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRAND);
        return this;
    }

    public NestedEcpLicense brand_ExplictlyNonNull() {
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

    public NestedEcpLicense dfw(String dfw) {

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

    public NestedEcpLicense dfw_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DFW);
        return this;
    }

    public NestedEcpLicense dfw_ExplictlyNonNull() {
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

    public NestedEcpLicense externalStorage(Boolean externalStorage) {

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

    public NestedEcpLicense externalStorage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_STORAGE);
        return this;
    }

    public NestedEcpLicense externalStorage_ExplictlyNonNull() {
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

    public NestedEcpLicense fileStorage(String fileStorage) {

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

    public NestedEcpLicense fileStorage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_STORAGE);
        return this;
    }

    public NestedEcpLicense fileStorage_ExplictlyNonNull() {
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

    public NestedEcpLicense id(String id) {

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

    public NestedEcpLicense id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NestedEcpLicense id_ExplictlyNonNull() {
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

    public NestedEcpLicense k8sBareMetal(String k8sBareMetal) {

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

    public NestedEcpLicense k8sBareMetal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_BARE_METAL);
        return this;
    }

    public NestedEcpLicense k8sBareMetal_ExplictlyNonNull() {
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

    public NestedEcpLicense k8sService(String k8sService) {

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

    public NestedEcpLicense k8sService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K8S_SERVICE);
        return this;
    }

    public NestedEcpLicense k8sService_ExplictlyNonNull() {
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

    public NestedEcpLicense lb(String lb) {

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

    public NestedEcpLicense lb_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LB);
        return this;
    }

    public NestedEcpLicense lb_ExplictlyNonNull() {
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

    public NestedEcpLicense licensePayload(String licensePayload) {

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

    public NestedEcpLicense licensePayload_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_PAYLOAD);
        return this;
    }

    public NestedEcpLicense licensePayload_ExplictlyNonNull() {
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

    public NestedEcpLicense licenseSignature(String licenseSignature) {

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

    public NestedEcpLicense licenseSignature_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGNATURE);
        return this;
    }

    public NestedEcpLicense licenseSignature_ExplictlyNonNull() {
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

    public NestedEcpLicense syncReplication(String syncReplication) {

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

    public NestedEcpLicense syncReplication_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION);
        return this;
    }

    public NestedEcpLicense syncReplication_ExplictlyNonNull() {
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

    public NestedEcpLicense trafficVisualization(String trafficVisualization) {

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

    public NestedEcpLicense trafficVisualization_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TRAFFIC_VISUALIZATION);
        return this;
    }

    public NestedEcpLicense trafficVisualization_ExplictlyNonNull() {
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

    public NestedEcpLicense vpc(String vpc) {

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

    public NestedEcpLicense vpc_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC);
        return this;
    }

    public NestedEcpLicense vpc_ExplictlyNonNull() {
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
        NestedEcpLicense nestedEcpLicense = (NestedEcpLicense) o;
        return Objects.equals(this.asyncReplication, nestedEcpLicense.asyncReplication)
                && Objects.equals(this.backup, nestedEcpLicense.backup)
                && Objects.equals(this.brand, nestedEcpLicense.brand)
                && Objects.equals(this.dfw, nestedEcpLicense.dfw)
                && Objects.equals(this.externalStorage, nestedEcpLicense.externalStorage)
                && Objects.equals(this.fileStorage, nestedEcpLicense.fileStorage)
                && Objects.equals(this.id, nestedEcpLicense.id)
                && Objects.equals(this.k8sBareMetal, nestedEcpLicense.k8sBareMetal)
                && Objects.equals(this.k8sService, nestedEcpLicense.k8sService)
                && Objects.equals(this.lb, nestedEcpLicense.lb)
                && Objects.equals(this.licensePayload, nestedEcpLicense.licensePayload)
                && Objects.equals(this.licenseSignature, nestedEcpLicense.licenseSignature)
                && Objects.equals(this.syncReplication, nestedEcpLicense.syncReplication)
                && Objects.equals(this.trafficVisualization, nestedEcpLicense.trafficVisualization)
                && Objects.equals(this.vpc, nestedEcpLicense.vpc);
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
                dfw,
                externalStorage,
                fileStorage,
                id,
                k8sBareMetal,
                k8sService,
                lb,
                licensePayload,
                licenseSignature,
                syncReplication,
                trafficVisualization,
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
        sb.append("class NestedEcpLicense {\n");
        sb.append("    asyncReplication: ").append(toIndentedString(asyncReplication)).append("\n");
        sb.append("    backup: ").append(toIndentedString(backup)).append("\n");
        sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
        sb.append("    dfw: ").append(toIndentedString(dfw)).append("\n");
        sb.append("    externalStorage: ").append(toIndentedString(externalStorage)).append("\n");
        sb.append("    fileStorage: ").append(toIndentedString(fileStorage)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    k8sBareMetal: ").append(toIndentedString(k8sBareMetal)).append("\n");
        sb.append("    k8sService: ").append(toIndentedString(k8sService)).append("\n");
        sb.append("    lb: ").append(toIndentedString(lb)).append("\n");
        sb.append("    licensePayload: ").append(toIndentedString(licensePayload)).append("\n");
        sb.append("    licenseSignature: ").append(toIndentedString(licenseSignature)).append("\n");
        sb.append("    syncReplication: ").append(toIndentedString(syncReplication)).append("\n");
        sb.append("    trafficVisualization: ")
                .append(toIndentedString(trafficVisualization))
                .append("\n");
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
