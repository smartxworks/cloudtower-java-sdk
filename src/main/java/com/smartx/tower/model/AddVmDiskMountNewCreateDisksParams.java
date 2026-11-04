package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** AddVmDiskMountNewCreateDisksParams */
@javax.annotation.Generated(value = "JavaCloudTowerClientCodegen")
public class AddVmDiskMountNewCreateDisksParams
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_STORAGE_CONFIG = "storage_config";

    @SerializedName(SERIALIZED_NAME_STORAGE_CONFIG)
    private StorageConfig storageConfig;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY = "max_bandwidth_policy";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY)
    private VmDiskIoRestrictType maxBandwidthPolicy;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_UNIT = "max_bandwidth_unit";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT)
    private BPSUnit maxBandwidthUnit;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH = "max_bandwidth";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH)
    private Long maxBandwidth;

    public static final String SERIALIZED_NAME_MAX_IOPS_POLICY = "max_iops_policy";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY)
    private VmDiskIoRestrictType maxIopsPolicy;

    public static final String SERIALIZED_NAME_MAX_IOPS = "max_iops";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS)
    private Long maxIops;

    public static final String SERIALIZED_NAME_VM_VOLUME = "vm_volume";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME)
    private AddVmDiskVmVolumeParams vmVolume;

    public static final String SERIALIZED_NAME_INDEX = "index";

    @SerializedName(SERIALIZED_NAME_INDEX)
    private Integer index;

    public static final String SERIALIZED_NAME_KEY = "key";

    @SerializedName(SERIALIZED_NAME_KEY)
    private Integer key;

    public static final String SERIALIZED_NAME_BUS = "bus";

    @SerializedName(SERIALIZED_NAME_BUS)
    private Bus bus;

    public static final String SERIALIZED_NAME_BOOT = "boot";

    @SerializedName(SERIALIZED_NAME_BOOT)
    private Integer boot;

    public AddVmDiskMountNewCreateDisksParams() {}

    public AddVmDiskMountNewCreateDisksParams storageConfig(StorageConfig storageConfig) {

        this.storageConfig = storageConfig;
        return this;
    }

    /**
     * Get storageConfig
     *
     * @return storageConfig
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageConfig getStorageConfig() {
        return storageConfig;
    }

    public void setStorageConfig(StorageConfig storageConfig) {
        this.storageConfig = storageConfig;
    }

    public AddVmDiskMountNewCreateDisksParams storageConfig_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CONFIG);
        return this;
    }

    public AddVmDiskMountNewCreateDisksParams storageConfig_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CONFIG);
        return this;
    }

    public void setStorageConfig_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CONFIG);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CONFIG);
        }
    }

    public boolean getStorageConfig_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CONFIG);
    }

    public AddVmDiskMountNewCreateDisksParams maxBandwidthPolicy(
            VmDiskIoRestrictType maxBandwidthPolicy) {

        this.maxBandwidthPolicy = maxBandwidthPolicy;
        return this;
    }

    /**
     * Get maxBandwidthPolicy
     *
     * @return maxBandwidthPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskIoRestrictType getMaxBandwidthPolicy() {
        return maxBandwidthPolicy;
    }

    public void setMaxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
        this.maxBandwidthPolicy = maxBandwidthPolicy;
    }

    public AddVmDiskMountNewCreateDisksParams maxBandwidthPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public AddVmDiskMountNewCreateDisksParams maxBandwidthPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public void setMaxBandwidthPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        }
    }

    public boolean getMaxBandwidthPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
    }

    public AddVmDiskMountNewCreateDisksParams maxBandwidthUnit(BPSUnit maxBandwidthUnit) {

        this.maxBandwidthUnit = maxBandwidthUnit;
        return this;
    }

    /**
     * Get maxBandwidthUnit
     *
     * @return maxBandwidthUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BPSUnit getMaxBandwidthUnit() {
        return maxBandwidthUnit;
    }

    public void setMaxBandwidthUnit(BPSUnit maxBandwidthUnit) {
        this.maxBandwidthUnit = maxBandwidthUnit;
    }

    public AddVmDiskMountNewCreateDisksParams maxBandwidthUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT);
        return this;
    }

    public AddVmDiskMountNewCreateDisksParams maxBandwidthUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT);
        return this;
    }

    public void setMaxBandwidthUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT);
        }
    }

    public boolean getMaxBandwidthUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT);
    }

    public AddVmDiskMountNewCreateDisksParams maxBandwidth(Long maxBandwidth) {

        this.maxBandwidth = maxBandwidth;
        return this;
    }

    /**
     * Get maxBandwidth
     *
     * @return maxBandwidth
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxBandwidth() {
        return maxBandwidth;
    }

    public void setMaxBandwidth(Long maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }

    public AddVmDiskMountNewCreateDisksParams maxBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public AddVmDiskMountNewCreateDisksParams maxBandwidth_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public void setMaxBandwidth_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH);
        }
    }

    public boolean getMaxBandwidth_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH);
    }

    public AddVmDiskMountNewCreateDisksParams maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {

        this.maxIopsPolicy = maxIopsPolicy;
        return this;
    }

    /**
     * Get maxIopsPolicy
     *
     * @return maxIopsPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskIoRestrictType getMaxIopsPolicy() {
        return maxIopsPolicy;
    }

    public void setMaxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
        this.maxIopsPolicy = maxIopsPolicy;
    }

    public AddVmDiskMountNewCreateDisksParams maxIopsPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public AddVmDiskMountNewCreateDisksParams maxIopsPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public void setMaxIopsPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_POLICY);
        }
    }

    public boolean getMaxIopsPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS_POLICY);
    }

    public AddVmDiskMountNewCreateDisksParams maxIops(Long maxIops) {

        this.maxIops = maxIops;
        return this;
    }

    /**
     * Get maxIops
     *
     * @return maxIops
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxIops() {
        return maxIops;
    }

    public void setMaxIops(Long maxIops) {
        this.maxIops = maxIops;
    }

    public AddVmDiskMountNewCreateDisksParams maxIops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public AddVmDiskMountNewCreateDisksParams maxIops_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public void setMaxIops_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS);
        }
    }

    public boolean getMaxIops_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS);
    }

    public AddVmDiskMountNewCreateDisksParams vmVolume(AddVmDiskVmVolumeParams vmVolume) {

        this.vmVolume = vmVolume;
        return this;
    }

    /**
     * Get vmVolume
     *
     * @return vmVolume
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public AddVmDiskVmVolumeParams getVmVolume() {
        return vmVolume;
    }

    public void setVmVolume(AddVmDiskVmVolumeParams vmVolume) {
        this.vmVolume = vmVolume;
    }

    public AddVmDiskMountNewCreateDisksParams vmVolume_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME);
        return this;
    }

    public AddVmDiskMountNewCreateDisksParams vmVolume_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME);
        return this;
    }

    public void setVmVolume_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME);
        }
    }

    public boolean getVmVolume_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME);
    }

    public AddVmDiskMountNewCreateDisksParams index(Integer index) {

        this.index = index;
        return this;
    }

    /**
     * Get index
     *
     * @return index
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public AddVmDiskMountNewCreateDisksParams index_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX);
        return this;
    }

    public AddVmDiskMountNewCreateDisksParams index_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX);
        return this;
    }

    public void setIndex_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX);
        }
    }

    public boolean getIndex_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX);
    }

    public AddVmDiskMountNewCreateDisksParams key(Integer key) {

        this.key = key;
        return this;
    }

    /**
     * Get key
     *
     * @return key
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public AddVmDiskMountNewCreateDisksParams key_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY);
        return this;
    }

    public AddVmDiskMountNewCreateDisksParams key_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY);
        return this;
    }

    public void setKey_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY);
        }
    }

    public boolean getKey_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY);
    }

    public AddVmDiskMountNewCreateDisksParams bus(Bus bus) {

        this.bus = bus;
        return this;
    }

    /**
     * Get bus
     *
     * @return bus
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public AddVmDiskMountNewCreateDisksParams bus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS);
        return this;
    }

    public AddVmDiskMountNewCreateDisksParams bus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS);
        return this;
    }

    public void setBus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS);
        }
    }

    public boolean getBus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS);
    }

    public AddVmDiskMountNewCreateDisksParams boot(Integer boot) {

        this.boot = boot;
        return this;
    }

    /**
     * Get boot
     *
     * @return boot
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getBoot() {
        return boot;
    }

    public void setBoot(Integer boot) {
        this.boot = boot;
    }

    public AddVmDiskMountNewCreateDisksParams boot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT);
        return this;
    }

    public AddVmDiskMountNewCreateDisksParams boot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOOT);
        return this;
    }

    public void setBoot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOOT);
        }
    }

    public boolean getBoot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOOT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddVmDiskMountNewCreateDisksParams addVmDiskMountNewCreateDisksParams =
                (AddVmDiskMountNewCreateDisksParams) o;
        return Objects.equals(this.storageConfig, addVmDiskMountNewCreateDisksParams.storageConfig)
                && Objects.equals(
                        this.maxBandwidthPolicy,
                        addVmDiskMountNewCreateDisksParams.maxBandwidthPolicy)
                && Objects.equals(
                        this.maxBandwidthUnit, addVmDiskMountNewCreateDisksParams.maxBandwidthUnit)
                && Objects.equals(
                        this.maxBandwidth, addVmDiskMountNewCreateDisksParams.maxBandwidth)
                && Objects.equals(
                        this.maxIopsPolicy, addVmDiskMountNewCreateDisksParams.maxIopsPolicy)
                && Objects.equals(this.maxIops, addVmDiskMountNewCreateDisksParams.maxIops)
                && Objects.equals(this.vmVolume, addVmDiskMountNewCreateDisksParams.vmVolume)
                && Objects.equals(this.index, addVmDiskMountNewCreateDisksParams.index)
                && Objects.equals(this.key, addVmDiskMountNewCreateDisksParams.key)
                && Objects.equals(this.bus, addVmDiskMountNewCreateDisksParams.bus)
                && Objects.equals(this.boot, addVmDiskMountNewCreateDisksParams.boot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                storageConfig,
                maxBandwidthPolicy,
                maxBandwidthUnit,
                maxBandwidth,
                maxIopsPolicy,
                maxIops,
                vmVolume,
                index,
                key,
                bus,
                boot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddVmDiskMountNewCreateDisksParams {\n");
        sb.append("    storageConfig: ").append(toIndentedString(storageConfig)).append("\n");
        sb.append("    maxBandwidthPolicy: ")
                .append(toIndentedString(maxBandwidthPolicy))
                .append("\n");
        sb.append("    maxBandwidthUnit: ").append(toIndentedString(maxBandwidthUnit)).append("\n");
        sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
        sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
        sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
        sb.append("    vmVolume: ").append(toIndentedString(vmVolume)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
        sb.append("    boot: ").append(toIndentedString(boot)).append("\n");
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
