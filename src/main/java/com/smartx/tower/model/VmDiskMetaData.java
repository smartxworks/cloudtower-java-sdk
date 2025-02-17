package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.Bus;
import com.smartx.tower.model.VmDiskIoRestrictType;
import com.smartx.tower.model.VmDiskType;
import com.smartx.tower.model.VmVolumeElfStoragePolicyType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VmDiskMetaData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VmDiskMetaData {
  public static final String SERIALIZED_NAME_VM_VOLUME_SIZE = "vm_volume_size";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_SIZE)
  private Double vmVolumeSize;

  public static final String SERIALIZED_NAME_VM_VOLUME_SHARING = "vm_volume_sharing";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_SHARING)
  private Boolean vmVolumeSharing;

  public static final String SERIALIZED_NAME_VM_VOLUME_PATH = "vm_volume_path";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_PATH)
  private String vmVolumePath;

  public static final String SERIALIZED_NAME_VM_VOLUME_NAME = "vm_volume_name";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_NAME)
  private String vmVolumeName;

  public static final String SERIALIZED_NAME_VM_VOLUME_MOUNTING = "vm_volume_mounting";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_MOUNTING)
  private Boolean vmVolumeMounting;

  public static final String SERIALIZED_NAME_VM_VOLUME_LUN_ZBS_VOLUME_ID = "vm_volume_lun_zbs_volume_id";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_LUN_ZBS_VOLUME_ID)
  private String vmVolumeLunZbsVolumeId;

  public static final String SERIALIZED_NAME_VM_VOLUME_ELF_STORAGE_POLICY = "vm_volume_elf_storage_policy";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_ELF_STORAGE_POLICY)
  private VmVolumeElfStoragePolicyType vmVolumeElfStoragePolicy;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private VmDiskType type;

  public static final String SERIALIZED_NAME_MAX_IOPS_POLICY = "max_iops_policy";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY)
  private VmDiskIoRestrictType maxIopsPolicy;

  public static final String SERIALIZED_NAME_MAX_IOPS = "max_iops";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS)
  private Integer maxIops;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY = "max_bandwidth_policy";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY)
  private VmDiskIoRestrictType maxBandwidthPolicy;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH = "max_bandwidth";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH)
  private Double maxBandwidth;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_BUS = "bus";
  @SerializedName(SERIALIZED_NAME_BUS)
  private Bus bus;

  public static final String SERIALIZED_NAME_BOOT = "boot";
  @SerializedName(SERIALIZED_NAME_BOOT)
  private Integer boot;

  public VmDiskMetaData() { 
  }

  public VmDiskMetaData vmVolumeSize(Double vmVolumeSize) {
    
    this.vmVolumeSize = vmVolumeSize;
    return this;
  }

   /**
   * Get vmVolumeSize
   * @return vmVolumeSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getVmVolumeSize() {
    return vmVolumeSize;
  }


  public void setVmVolumeSize(Double vmVolumeSize) {
    this.vmVolumeSize = vmVolumeSize;
  }


  public VmDiskMetaData vmVolumeSharing(Boolean vmVolumeSharing) {
    
    this.vmVolumeSharing = vmVolumeSharing;
    return this;
  }

   /**
   * Get vmVolumeSharing
   * @return vmVolumeSharing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVmVolumeSharing() {
    return vmVolumeSharing;
  }


  public void setVmVolumeSharing(Boolean vmVolumeSharing) {
    this.vmVolumeSharing = vmVolumeSharing;
  }


  public VmDiskMetaData vmVolumePath(String vmVolumePath) {
    
    this.vmVolumePath = vmVolumePath;
    return this;
  }

   /**
   * Get vmVolumePath
   * @return vmVolumePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmVolumePath() {
    return vmVolumePath;
  }


  public void setVmVolumePath(String vmVolumePath) {
    this.vmVolumePath = vmVolumePath;
  }


  public VmDiskMetaData vmVolumeName(String vmVolumeName) {
    
    this.vmVolumeName = vmVolumeName;
    return this;
  }

   /**
   * Get vmVolumeName
   * @return vmVolumeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmVolumeName() {
    return vmVolumeName;
  }


  public void setVmVolumeName(String vmVolumeName) {
    this.vmVolumeName = vmVolumeName;
  }


  public VmDiskMetaData vmVolumeMounting(Boolean vmVolumeMounting) {
    
    this.vmVolumeMounting = vmVolumeMounting;
    return this;
  }

   /**
   * Get vmVolumeMounting
   * @return vmVolumeMounting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVmVolumeMounting() {
    return vmVolumeMounting;
  }


  public void setVmVolumeMounting(Boolean vmVolumeMounting) {
    this.vmVolumeMounting = vmVolumeMounting;
  }


  public VmDiskMetaData vmVolumeLunZbsVolumeId(String vmVolumeLunZbsVolumeId) {
    
    this.vmVolumeLunZbsVolumeId = vmVolumeLunZbsVolumeId;
    return this;
  }

   /**
   * Get vmVolumeLunZbsVolumeId
   * @return vmVolumeLunZbsVolumeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmVolumeLunZbsVolumeId() {
    return vmVolumeLunZbsVolumeId;
  }


  public void setVmVolumeLunZbsVolumeId(String vmVolumeLunZbsVolumeId) {
    this.vmVolumeLunZbsVolumeId = vmVolumeLunZbsVolumeId;
  }


  public VmDiskMetaData vmVolumeElfStoragePolicy(VmVolumeElfStoragePolicyType vmVolumeElfStoragePolicy) {
    
    this.vmVolumeElfStoragePolicy = vmVolumeElfStoragePolicy;
    return this;
  }

   /**
   * Get vmVolumeElfStoragePolicy
   * @return vmVolumeElfStoragePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmVolumeElfStoragePolicyType getVmVolumeElfStoragePolicy() {
    return vmVolumeElfStoragePolicy;
  }


  public void setVmVolumeElfStoragePolicy(VmVolumeElfStoragePolicyType vmVolumeElfStoragePolicy) {
    this.vmVolumeElfStoragePolicy = vmVolumeElfStoragePolicy;
  }


  public VmDiskMetaData type(VmDiskType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskType getType() {
    return type;
  }


  public void setType(VmDiskType type) {
    this.type = type;
  }


  public VmDiskMetaData maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
    
    this.maxIopsPolicy = maxIopsPolicy;
    return this;
  }

   /**
   * Get maxIopsPolicy
   * @return maxIopsPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskIoRestrictType getMaxIopsPolicy() {
    return maxIopsPolicy;
  }


  public void setMaxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
    this.maxIopsPolicy = maxIopsPolicy;
  }


  public VmDiskMetaData maxIops(Integer maxIops) {
    
    this.maxIops = maxIops;
    return this;
  }

   /**
   * Get maxIops
   * @return maxIops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxIops() {
    return maxIops;
  }


  public void setMaxIops(Integer maxIops) {
    this.maxIops = maxIops;
  }


  public VmDiskMetaData maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
    
    this.maxBandwidthPolicy = maxBandwidthPolicy;
    return this;
  }

   /**
   * Get maxBandwidthPolicy
   * @return maxBandwidthPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskIoRestrictType getMaxBandwidthPolicy() {
    return maxBandwidthPolicy;
  }


  public void setMaxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
    this.maxBandwidthPolicy = maxBandwidthPolicy;
  }


  public VmDiskMetaData maxBandwidth(Double maxBandwidth) {
    
    this.maxBandwidth = maxBandwidth;
    return this;
  }

   /**
   * Get maxBandwidth
   * @return maxBandwidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMaxBandwidth() {
    return maxBandwidth;
  }


  public void setMaxBandwidth(Double maxBandwidth) {
    this.maxBandwidth = maxBandwidth;
  }


  public VmDiskMetaData disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public VmDiskMetaData bus(Bus bus) {
    
    this.bus = bus;
    return this;
  }

   /**
   * Get bus
   * @return bus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Bus getBus() {
    return bus;
  }


  public void setBus(Bus bus) {
    this.bus = bus;
  }


  public VmDiskMetaData boot(Integer boot) {
    
    this.boot = boot;
    return this;
  }

   /**
   * Get boot
   * @return boot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBoot() {
    return boot;
  }


  public void setBoot(Integer boot) {
    this.boot = boot;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmDiskMetaData vmDiskMetaData = (VmDiskMetaData) o;
    return Objects.equals(this.vmVolumeSize, vmDiskMetaData.vmVolumeSize) &&
        Objects.equals(this.vmVolumeSharing, vmDiskMetaData.vmVolumeSharing) &&
        Objects.equals(this.vmVolumePath, vmDiskMetaData.vmVolumePath) &&
        Objects.equals(this.vmVolumeName, vmDiskMetaData.vmVolumeName) &&
        Objects.equals(this.vmVolumeMounting, vmDiskMetaData.vmVolumeMounting) &&
        Objects.equals(this.vmVolumeLunZbsVolumeId, vmDiskMetaData.vmVolumeLunZbsVolumeId) &&
        Objects.equals(this.vmVolumeElfStoragePolicy, vmDiskMetaData.vmVolumeElfStoragePolicy) &&
        Objects.equals(this.type, vmDiskMetaData.type) &&
        Objects.equals(this.maxIopsPolicy, vmDiskMetaData.maxIopsPolicy) &&
        Objects.equals(this.maxIops, vmDiskMetaData.maxIops) &&
        Objects.equals(this.maxBandwidthPolicy, vmDiskMetaData.maxBandwidthPolicy) &&
        Objects.equals(this.maxBandwidth, vmDiskMetaData.maxBandwidth) &&
        Objects.equals(this.disabled, vmDiskMetaData.disabled) &&
        Objects.equals(this.bus, vmDiskMetaData.bus) &&
        Objects.equals(this.boot, vmDiskMetaData.boot);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmVolumeSize, vmVolumeSharing, vmVolumePath, vmVolumeName, vmVolumeMounting, vmVolumeLunZbsVolumeId, vmVolumeElfStoragePolicy, type, maxIopsPolicy, maxIops, maxBandwidthPolicy, maxBandwidth, disabled, bus, boot);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmDiskMetaData {\n");
    sb.append("    vmVolumeSize: ").append(toIndentedString(vmVolumeSize)).append("\n");
    sb.append("    vmVolumeSharing: ").append(toIndentedString(vmVolumeSharing)).append("\n");
    sb.append("    vmVolumePath: ").append(toIndentedString(vmVolumePath)).append("\n");
    sb.append("    vmVolumeName: ").append(toIndentedString(vmVolumeName)).append("\n");
    sb.append("    vmVolumeMounting: ").append(toIndentedString(vmVolumeMounting)).append("\n");
    sb.append("    vmVolumeLunZbsVolumeId: ").append(toIndentedString(vmVolumeLunZbsVolumeId)).append("\n");
    sb.append("    vmVolumeElfStoragePolicy: ").append(toIndentedString(vmVolumeElfStoragePolicy)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
    sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
    sb.append("    maxBandwidthPolicy: ").append(toIndentedString(maxBandwidthPolicy)).append("\n");
    sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
    sb.append("    boot: ").append(toIndentedString(boot)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

