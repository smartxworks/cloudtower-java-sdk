package com.smartx.tower.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class MountNewCreateDisksParams {
  public static final String SERIALIZED_NAME_MAX_BANDWITH_POLICY = "max_bandwidth_policy";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWITH_POLICY)
  private VmDiskIoRestrictType maxBandwidthPolicy;

  public static final String SERIALIZED_NAME_MAX_BANDWITH = "max_bandwidth";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWITH)
  private Double maxBandwidth;

  public static final String SERIALIZED_NAME_MAX_IPOS_POLICY = "max_iops_policy";
  @SerializedName(SERIALIZED_NAME_MAX_IPOS_POLICY)
  private VmDiskIoRestrictType maxIopsPolicy;

  public static final String SERIALIZED_NAME_MAX_IPOS = "max_iops";
  @SerializedName(SERIALIZED_NAME_MAX_IPOS)
  private Double maxIops;

  public static final String SERIALIZED_NAME_VM_VOLUME = "vm_volume";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME)
  private MountNewCreateDisksVmVolumeParams vmVolume;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_BUS = "bus";
  @SerializedName(SERIALIZED_NAME_BUS)
  private Bus bus;

  public static final String SERIALIZED_NAME_BOOT = "boot";
  @SerializedName(SERIALIZED_NAME_BOOT)
  private Integer boot;

  public MountNewCreateDisksParams maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
    this.maxBandwidthPolicy = maxBandwidthPolicy;
    return this;
  }

  /**
   * Get elfStoragePolicy
   * 
   * @return elfStoragePolicy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public VmDiskIoRestrictType getMaxBandwidthPolicy() {
    return maxBandwidthPolicy;
  }

  public void setMaxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
    this.maxBandwidthPolicy = maxBandwidthPolicy;
  }

  public MountNewCreateDisksParams maxBandwidth(Double maxBandwidth) {
    this.maxBandwidth = maxBandwidth;
    return this;
  }

  /**
   * Get maxBandwidth
   * 
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

  public MountNewCreateDisksParams maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
    this.maxIopsPolicy = maxIopsPolicy;
    return this;
  }

  /**
   * Get maxIopsPolicy
   * 
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

  public MountNewCreateDisksParams maxIops(Double maxIops) {
    this.maxIops = maxIops;
    return this;
  }

  /**
   * Get maxIops
   * 
   * @return maxIops
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Double getMaxIops() {
    return maxIops;
  }

  public void setMaxIops(Double maxIops) {
    this.maxIops = maxIops;
  }

  public MountNewCreateDisksParams vmVolume(MountNewCreateDisksVmVolumeParams vmVolume) {
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
  public MountNewCreateDisksVmVolumeParams getVmVolume() {
    return vmVolume;
  }

  public void setVmVolume(MountNewCreateDisksVmVolumeParams vmVolume) {
    this.vmVolume = vmVolume;
  }

  public MountNewCreateDisksParams index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * 
   * @return index
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public MountNewCreateDisksParams key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * 
   * @return key
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public MountNewCreateDisksParams bus(Bus bus) {
    this.bus = bus;
    return this;
  }

  /**
   * Get bus
   * 
   * @return bus
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public Bus getBus() {
    return bus;
  }

  public void setBus(Bus bus) {
    this.bus = bus;
  }

  public MountNewCreateDisksParams boot(Integer boot) {
    this.boot = boot;
    return this;
  }

  /**
   * Get boot
   * 
   * @return boot
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public Integer getBoot() {
    return boot;
  }

  public void setBoot(Integer boot) {
    this.boot = boot;
  }

}
