package com.smartx.tower.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class MountNewCreateDisksParams {
  public class MountNewCreateDisksVmVolumeParams {
    public static final String SERIALIZED_NAME_ELF_STORAGE_POILCY = "elf_storage_policy";
    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POILCY)
    private VmVolumeElfStoragePolicyType elfStoragePolicy;

    public static final String SERIALIZED_NAME_PATH = "path";
    @SerializedName(SERIALIZED_NAME_PATH)
    private String path;

    public static final String SERIALIZED_NAME_SIZE = "size";
    @SerializedName(SERIALIZED_NAME_SIZE)
    private Double size;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public MountNewCreateDisksVmVolumeParams elfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {
      this.elfStoragePolicy = elfStoragePolicy;
      return this;
    }

    /**
     * Get elfStoragePolicy
     * 
     * @return elfStoragePolicy
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public VmVolumeElfStoragePolicyType getElfStoragePolicy() {
      return elfStoragePolicy;
    }

    public void setElfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {
      this.elfStoragePolicy = elfStoragePolicy;
    }

    public MountNewCreateDisksVmVolumeParams path(String path) {
      this.path = path;
      return this;
    }

    /**
     * Get path
     * 
     * @return path
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPath() {
      return path;
    }

    public void setPath(String path) {
      this.path = path;
    }

    public MountNewCreateDisksVmVolumeParams size(Double size) {
      this.size = size;
      return this;
    }

    /**
     * Get size
     * 
     * @return size
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Double getSize() {
      return size;
    }

    public void setSize(Double size) {
      this.size = size;
    }

    public MountNewCreateDisksVmVolumeParams name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Get name
     * 
     * @return name
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }

  public static final String SERIALIZED_NAME_MAX_BANDWITH_POLICY = "max_bandwidth_policy";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWITH_POLICY)
  private VmDiskIoRestrictType maxBandwidthPolicy;

  public static final String SERIALIZED_NAME_MAX_BANDWITH = "max_bandwidth";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWITH)
  private String maxBandwidth;

  public static final String SERIALIZED_NAME_MAX_IPOS_POLICY = "max_iops_policy";
  @SerializedName(SERIALIZED_NAME_MAX_IPOS_POLICY)
  private VmDiskIoRestrictType maxIposPolicy;

  public static final String SERIALIZED_NAME_MAX_IPOS = "max_iops";
  @SerializedName(SERIALIZED_NAME_MAX_IPOS)
  private String maxIpos;

  public static final String SERIALIZED_NAME_VM_VOLUME = "vm_volume";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME)
  private MountNewCreateDisksVmVolumeParams vmVolume;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Double index;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_BUS = "bus";
  @SerializedName(SERIALIZED_NAME_BUS)
  private Bus bus;

  public static final String SERIALIZED_NAME_BOOT = "boot";
  @SerializedName(SERIALIZED_NAME_BOOT)
  private Double boot;

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

  public MountNewCreateDisksParams maxBandwidth(String maxBandwidth) {
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
  public String getMaxBandwidth() {
    return maxBandwidth;
  }

  public void setMaxBandwidth(String maxBandwidth) {
    this.maxBandwidth = maxBandwidth;
  }

  public MountNewCreateDisksParams maxIposPolicy(VmDiskIoRestrictType maxIposPolicy) {
    this.maxIposPolicy = maxIposPolicy;
    return this;
  }

  /**
   * Get maxIposPolicy
   * 
   * @return maxIposPolicy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public VmDiskIoRestrictType getMaxIposPolicy() {
    return maxIposPolicy;
  }

  public void setMaxIposPolicy(VmDiskIoRestrictType maxIposPolicy) {
    this.maxIposPolicy = maxIposPolicy;
  }

  public MountNewCreateDisksParams maxIpos(String maxIpos) {
    this.maxIpos = maxIpos;
    return this;
  }

  /**
   * Get maxIpos
   * 
   * @return maxIpos
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getMaxIpos() {
    return maxIpos;
  }

  public void setMaxIpos(String maxIpos) {
    this.maxIpos = maxIpos;
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

  public MountNewCreateDisksParams index(Double index) {
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
  public Double getIndex() {
    return index;
  }

  public void setIndex(Double index) {
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

  public MountNewCreateDisksParams boot(Double boot) {
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
  public Double getBoot() {
    return boot;
  }

  public void setBoot(Double boot) {
    this.boot = boot;
  }

}
