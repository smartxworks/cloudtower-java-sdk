package com.smartx.tower.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class MountDisksParams {
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

  public static final String SERIALIZED_NAME_VM_VOLUME_ID = "vm_volume_id";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_ID)
  private String vmVolumeId;

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

  public MountDisksParams maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {

    this.maxBandwidthPolicy = maxBandwidthPolicy;
    return this;
  }

  /**
   * Get maxBandwidthPolicy
   * 
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

  public MountDisksParams maxBandwidth(Double maxBandwidth) {

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

  public MountDisksParams maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
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

  public MountDisksParams maxIops(Double maxIops) {
    this.maxIops = maxIops;
    return this;
  }

  /**
   * Get maxIops
   * 
   * @return maxIops
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(value = "", required = true)
  public Double getMaxIops() {
    return maxIops;
  }

  public void setMaxIops(Double maxIops) {
    this.maxIops = maxIops;
  }

  public MountDisksParams vmVolumeId(String vmVolumeId) {
    this.vmVolumeId = vmVolumeId;
    return this;
  }

  /**
   * Get vmVolumeId
   * 
   * @return vmVolumeId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getVmVolumeId() {
    return vmVolumeId;
  }

  public void setVmVolumeId(String vmVolumeId) {
    this.vmVolumeId = vmVolumeId;
  }

  public MountDisksParams index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * 
   * @return index
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(value = "", required = true)
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public MountDisksParams key(String key) {
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

  public MountDisksParams bus(Bus bus) {
    this.bus = bus;
    return this;
  }

  /**
   * Get bus
   * 
   * @return bus
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(value = "", required = true)
  public Bus getBus() {
    return bus;
  }

  public void setBus(Bus bus) {
    this.bus = bus;
  }

  public MountDisksParams boot(Integer boot) {
    this.boot = boot;
    return this;
  }

  /**
   * Get boot
   * 
   * @return boot
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(value = "", required = true)
  public Integer getBoot() {
    return boot;
  }

  public void setBoot(Integer boot) {
    this.boot = boot;
  }
}
