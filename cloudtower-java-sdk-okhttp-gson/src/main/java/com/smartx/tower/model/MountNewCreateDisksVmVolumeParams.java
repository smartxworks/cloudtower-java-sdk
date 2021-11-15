package com.smartx.tower.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

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