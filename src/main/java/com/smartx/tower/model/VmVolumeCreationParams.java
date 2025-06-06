package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmVolumeCreationParams */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VmVolumeCreationParams
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY = "elf_storage_policy";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY)
    private VmVolumeElfStoragePolicyType elfStoragePolicy;

    public static final String SERIALIZED_NAME_SIZE_UNIT = "size_unit";

    @SerializedName(SERIALIZED_NAME_SIZE_UNIT)
    private ByteUnit sizeUnit;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_SHARING = "sharing";

    @SerializedName(SERIALIZED_NAME_SHARING)
    private Boolean sharing;

    public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
    private String clusterId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public VmVolumeCreationParams() {}

    public VmVolumeCreationParams elfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {

        this.elfStoragePolicy = elfStoragePolicy;
        return this;
    }

    /**
     * Get elfStoragePolicy
     *
     * @return elfStoragePolicy
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public VmVolumeElfStoragePolicyType getElfStoragePolicy() {
        return elfStoragePolicy;
    }

    public void setElfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {
        this.elfStoragePolicy = elfStoragePolicy;
    }

    public VmVolumeCreationParams elfStoragePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        return this;
    }

    public VmVolumeCreationParams elfStoragePolicy_ExplictlyNonNull() {
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

    public VmVolumeCreationParams sizeUnit(ByteUnit sizeUnit) {

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

    public VmVolumeCreationParams sizeUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_UNIT);
        return this;
    }

    public VmVolumeCreationParams sizeUnit_ExplictlyNonNull() {
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

    public VmVolumeCreationParams size(Long size) {

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

    public VmVolumeCreationParams size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public VmVolumeCreationParams size_ExplictlyNonNull() {
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

    public VmVolumeCreationParams sharing(Boolean sharing) {

        this.sharing = sharing;
        return this;
    }

    /**
     * Get sharing
     *
     * @return sharing
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getSharing() {
        return sharing;
    }

    public void setSharing(Boolean sharing) {
        this.sharing = sharing;
    }

    public VmVolumeCreationParams sharing_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARING);
        return this;
    }

    public VmVolumeCreationParams sharing_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHARING);
        return this;
    }

    public void setSharing_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHARING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHARING);
        }
    }

    public boolean getSharing_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHARING);
    }

    public VmVolumeCreationParams clusterId(String clusterId) {

        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get clusterId
     *
     * @return clusterId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public VmVolumeCreationParams clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public VmVolumeCreationParams clusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public void setClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        }
    }

    public boolean getClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_ID);
    }

    public VmVolumeCreationParams name(String name) {

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

    public VmVolumeCreationParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VmVolumeCreationParams name_ExplictlyNonNull() {
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
        VmVolumeCreationParams vmVolumeCreationParams = (VmVolumeCreationParams) o;
        return Objects.equals(this.elfStoragePolicy, vmVolumeCreationParams.elfStoragePolicy)
                && Objects.equals(this.sizeUnit, vmVolumeCreationParams.sizeUnit)
                && Objects.equals(this.size, vmVolumeCreationParams.size)
                && Objects.equals(this.sharing, vmVolumeCreationParams.sharing)
                && Objects.equals(this.clusterId, vmVolumeCreationParams.clusterId)
                && Objects.equals(this.name, vmVolumeCreationParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elfStoragePolicy, sizeUnit, size, sharing, clusterId, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmVolumeCreationParams {\n");
        sb.append("    elfStoragePolicy: ").append(toIndentedString(elfStoragePolicy)).append("\n");
        sb.append("    sizeUnit: ").append(toIndentedString(sizeUnit)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    sharing: ").append(toIndentedString(sharing)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
