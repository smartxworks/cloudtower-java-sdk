package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** AddVmDiskVmVolumeParams */
@javax.annotation.Generated(value = "JavaCloudTowerClientCodegen")
public class AddVmDiskVmVolumeParams
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_PROVISION_POLICY = "provision_policy";

    @SerializedName(SERIALIZED_NAME_PROVISION_POLICY)
    private VmVolumeProvisionPolicy provisionPolicy;

    public static final String SERIALIZED_NAME_RESIDENT_IN_CACHE = "resident_in_cache";

    @SerializedName(SERIALIZED_NAME_RESIDENT_IN_CACHE)
    private Boolean residentInCache;

    public static final String SERIALIZED_NAME_ELF_EC_STORAGE_POLICY = "elf_ec_storage_policy";

    @SerializedName(SERIALIZED_NAME_ELF_EC_STORAGE_POLICY)
    private MountNewCreateDisksParamsVmVolumeElfEcStoragePolicy elfEcStoragePolicy;

    public static final String SERIALIZED_NAME_ELF_REPLICA_STORAGE_POLICY =
            "elf_replica_storage_policy";

    @SerializedName(SERIALIZED_NAME_ELF_REPLICA_STORAGE_POLICY)
    private VmVolumeElfStoragePolicyType elfReplicaStoragePolicy;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY = "elf_storage_policy";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY)
    private VmVolumeElfStoragePolicyType elfStoragePolicy;

    public static final String SERIALIZED_NAME_PATH = "path";

    @SerializedName(SERIALIZED_NAME_PATH)
    private String path;

    public static final String SERIALIZED_NAME_SIZE_UNIT = "size_unit";

    @SerializedName(SERIALIZED_NAME_SIZE_UNIT)
    private ByteUnit sizeUnit;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public AddVmDiskVmVolumeParams() {}

    public AddVmDiskVmVolumeParams provisionPolicy(VmVolumeProvisionPolicy provisionPolicy) {

        this.provisionPolicy = provisionPolicy;
        return this;
    }

    /**
     * Get provisionPolicy
     *
     * @return provisionPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeProvisionPolicy getProvisionPolicy() {
        return provisionPolicy;
    }

    public void setProvisionPolicy(VmVolumeProvisionPolicy provisionPolicy) {
        this.provisionPolicy = provisionPolicy;
    }

    public AddVmDiskVmVolumeParams provisionPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY);
        return this;
    }

    public AddVmDiskVmVolumeParams provisionPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY);
        return this;
    }

    public void setProvisionPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY);
        }
    }

    public boolean getProvisionPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISION_POLICY);
    }

    public AddVmDiskVmVolumeParams residentInCache(Boolean residentInCache) {

        this.residentInCache = residentInCache;
        return this;
    }

    /**
     * Get residentInCache
     *
     * @return residentInCache
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getResidentInCache() {
        return residentInCache;
    }

    public void setResidentInCache(Boolean residentInCache) {
        this.residentInCache = residentInCache;
    }

    public AddVmDiskVmVolumeParams residentInCache_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        return this;
    }

    public AddVmDiskVmVolumeParams residentInCache_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        return this;
    }

    public void setResidentInCache_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        }
    }

    public boolean getResidentInCache_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESIDENT_IN_CACHE);
    }

    public AddVmDiskVmVolumeParams elfEcStoragePolicy(
            MountNewCreateDisksParamsVmVolumeElfEcStoragePolicy elfEcStoragePolicy) {

        this.elfEcStoragePolicy = elfEcStoragePolicy;
        return this;
    }

    /**
     * Get elfEcStoragePolicy
     *
     * @return elfEcStoragePolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public MountNewCreateDisksParamsVmVolumeElfEcStoragePolicy getElfEcStoragePolicy() {
        return elfEcStoragePolicy;
    }

    public void setElfEcStoragePolicy(
            MountNewCreateDisksParamsVmVolumeElfEcStoragePolicy elfEcStoragePolicy) {
        this.elfEcStoragePolicy = elfEcStoragePolicy;
    }

    public AddVmDiskVmVolumeParams elfEcStoragePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_EC_STORAGE_POLICY);
        return this;
    }

    public AddVmDiskVmVolumeParams elfEcStoragePolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_EC_STORAGE_POLICY);
        return this;
    }

    public void setElfEcStoragePolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_EC_STORAGE_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_EC_STORAGE_POLICY);
        }
    }

    public boolean getElfEcStoragePolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_EC_STORAGE_POLICY);
    }

    public AddVmDiskVmVolumeParams elfReplicaStoragePolicy(
            VmVolumeElfStoragePolicyType elfReplicaStoragePolicy) {

        this.elfReplicaStoragePolicy = elfReplicaStoragePolicy;
        return this;
    }

    /**
     * Get elfReplicaStoragePolicy
     *
     * @return elfReplicaStoragePolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeElfStoragePolicyType getElfReplicaStoragePolicy() {
        return elfReplicaStoragePolicy;
    }

    public void setElfReplicaStoragePolicy(VmVolumeElfStoragePolicyType elfReplicaStoragePolicy) {
        this.elfReplicaStoragePolicy = elfReplicaStoragePolicy;
    }

    public AddVmDiskVmVolumeParams elfReplicaStoragePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_REPLICA_STORAGE_POLICY);
        return this;
    }

    public AddVmDiskVmVolumeParams elfReplicaStoragePolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_REPLICA_STORAGE_POLICY);
        return this;
    }

    public void setElfReplicaStoragePolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_REPLICA_STORAGE_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_REPLICA_STORAGE_POLICY);
        }
    }

    public boolean getElfReplicaStoragePolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_REPLICA_STORAGE_POLICY);
    }

    public AddVmDiskVmVolumeParams elfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {

        this.elfStoragePolicy = elfStoragePolicy;
        return this;
    }

    /**
     * Get elfStoragePolicy
     *
     * @return elfStoragePolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeElfStoragePolicyType getElfStoragePolicy() {
        return elfStoragePolicy;
    }

    public void setElfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {
        this.elfStoragePolicy = elfStoragePolicy;
    }

    public AddVmDiskVmVolumeParams elfStoragePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        return this;
    }

    public AddVmDiskVmVolumeParams elfStoragePolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        return this;
    }

    public void setElfStoragePolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        }
    }

    public boolean getElfStoragePolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY);
    }

    public AddVmDiskVmVolumeParams path(String path) {

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

    public AddVmDiskVmVolumeParams path_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH);
        return this;
    }

    public AddVmDiskVmVolumeParams path_ExplictlyNonNull() {
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

    public AddVmDiskVmVolumeParams sizeUnit(ByteUnit sizeUnit) {

        this.sizeUnit = sizeUnit;
        return this;
    }

    /**
     * Get sizeUnit
     *
     * @return sizeUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ByteUnit getSizeUnit() {
        return sizeUnit;
    }

    public void setSizeUnit(ByteUnit sizeUnit) {
        this.sizeUnit = sizeUnit;
    }

    public AddVmDiskVmVolumeParams sizeUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_UNIT);
        return this;
    }

    public AddVmDiskVmVolumeParams sizeUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_UNIT);
        return this;
    }

    public void setSizeUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_UNIT);
        }
    }

    public boolean getSizeUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_UNIT);
    }

    public AddVmDiskVmVolumeParams size(Long size) {

        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public AddVmDiskVmVolumeParams size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public AddVmDiskVmVolumeParams size_ExplictlyNonNull() {
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

    public AddVmDiskVmVolumeParams name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddVmDiskVmVolumeParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public AddVmDiskVmVolumeParams name_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddVmDiskVmVolumeParams addVmDiskVmVolumeParams = (AddVmDiskVmVolumeParams) o;
        return Objects.equals(this.provisionPolicy, addVmDiskVmVolumeParams.provisionPolicy)
                && Objects.equals(this.residentInCache, addVmDiskVmVolumeParams.residentInCache)
                && Objects.equals(
                        this.elfEcStoragePolicy, addVmDiskVmVolumeParams.elfEcStoragePolicy)
                && Objects.equals(
                        this.elfReplicaStoragePolicy,
                        addVmDiskVmVolumeParams.elfReplicaStoragePolicy)
                && Objects.equals(this.elfStoragePolicy, addVmDiskVmVolumeParams.elfStoragePolicy)
                && Objects.equals(this.path, addVmDiskVmVolumeParams.path)
                && Objects.equals(this.sizeUnit, addVmDiskVmVolumeParams.sizeUnit)
                && Objects.equals(this.size, addVmDiskVmVolumeParams.size)
                && Objects.equals(this.name, addVmDiskVmVolumeParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                provisionPolicy,
                residentInCache,
                elfEcStoragePolicy,
                elfReplicaStoragePolicy,
                elfStoragePolicy,
                path,
                sizeUnit,
                size,
                name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddVmDiskVmVolumeParams {\n");
        sb.append("    provisionPolicy: ").append(toIndentedString(provisionPolicy)).append("\n");
        sb.append("    residentInCache: ").append(toIndentedString(residentInCache)).append("\n");
        sb.append("    elfEcStoragePolicy: ")
                .append(toIndentedString(elfEcStoragePolicy))
                .append("\n");
        sb.append("    elfReplicaStoragePolicy: ")
                .append(toIndentedString(elfReplicaStoragePolicy))
                .append("\n");
        sb.append("    elfStoragePolicy: ").append(toIndentedString(elfStoragePolicy)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    sizeUnit: ").append(toIndentedString(sizeUnit)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
