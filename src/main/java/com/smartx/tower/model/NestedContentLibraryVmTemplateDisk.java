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
 * NestedContentLibraryVmTemplateDisk
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NestedContentLibraryVmTemplateDisk {
  public static final String SERIALIZED_NAME_BOOT = "boot";
  @SerializedName(SERIALIZED_NAME_BOOT)
  private Integer boot;

  public static final String SERIALIZED_NAME_BUS = "bus";
  @SerializedName(SERIALIZED_NAME_BUS)
  private Bus bus;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID = "content_library_image_id";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID)
  private String contentLibraryImageId;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_DISK_NAME = "disk_name";
  @SerializedName(SERIALIZED_NAME_DISK_NAME)
  private String diskName;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH = "max_bandwidth";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH)
  private Long maxBandwidth;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY = "max_bandwidth_policy";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY)
  private VmDiskIoRestrictType maxBandwidthPolicy;

  public static final String SERIALIZED_NAME_MAX_IOPS = "max_iops";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS)
  private Integer maxIops;

  public static final String SERIALIZED_NAME_MAX_IOPS_POLICY = "max_iops_policy";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY)
  private VmDiskIoRestrictType maxIopsPolicy;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_RESIDENT_IN_CACHE = "resident_in_cache";
  @SerializedName(SERIALIZED_NAME_RESIDENT_IN_CACHE)
  private Boolean residentInCache;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_STORAGE_ENCRYPTED = "storage_encrypted";
  @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTED)
  private Boolean storageEncrypted;

  public static final String SERIALIZED_NAME_STORAGE_POLICY = "storage_policy";
  @SerializedName(SERIALIZED_NAME_STORAGE_POLICY)
  private VmVolumeElfStoragePolicyType storagePolicy;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private VmDiskType type;

  public NestedContentLibraryVmTemplateDisk() { 
  }

  public NestedContentLibraryVmTemplateDisk boot(Integer boot) {
    
    this.boot = boot;
    return this;
  }

   /**
   * Get boot
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


  public NestedContentLibraryVmTemplateDisk bus(Bus bus) {
    
    this.bus = bus;
    return this;
  }

   /**
   * Get bus
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


  public NestedContentLibraryVmTemplateDisk contentLibraryImageId(String contentLibraryImageId) {
    
    this.contentLibraryImageId = contentLibraryImageId;
    return this;
  }

   /**
   * Get contentLibraryImageId
   * @return contentLibraryImageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContentLibraryImageId() {
    return contentLibraryImageId;
  }


  public void setContentLibraryImageId(String contentLibraryImageId) {
    this.contentLibraryImageId = contentLibraryImageId;
  }


  public NestedContentLibraryVmTemplateDisk disabled(Boolean disabled) {
    
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


  public NestedContentLibraryVmTemplateDisk diskName(String diskName) {
    
    this.diskName = diskName;
    return this;
  }

   /**
   * Get diskName
   * @return diskName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDiskName() {
    return diskName;
  }


  public void setDiskName(String diskName) {
    this.diskName = diskName;
  }


  public NestedContentLibraryVmTemplateDisk index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public NestedContentLibraryVmTemplateDisk maxBandwidth(Long maxBandwidth) {
    
    this.maxBandwidth = maxBandwidth;
    return this;
  }

   /**
   * Get maxBandwidth
   * @return maxBandwidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMaxBandwidth() {
    return maxBandwidth;
  }


  public void setMaxBandwidth(Long maxBandwidth) {
    this.maxBandwidth = maxBandwidth;
  }


  public NestedContentLibraryVmTemplateDisk maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
    
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


  public NestedContentLibraryVmTemplateDisk maxIops(Integer maxIops) {
    
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


  public NestedContentLibraryVmTemplateDisk maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
    
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


  public NestedContentLibraryVmTemplateDisk path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
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


  public NestedContentLibraryVmTemplateDisk residentInCache(Boolean residentInCache) {
    
    this.residentInCache = residentInCache;
    return this;
  }

   /**
   * Get residentInCache
   * @return residentInCache
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getResidentInCache() {
    return residentInCache;
  }


  public void setResidentInCache(Boolean residentInCache) {
    this.residentInCache = residentInCache;
  }


  public NestedContentLibraryVmTemplateDisk size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public NestedContentLibraryVmTemplateDisk storageEncrypted(Boolean storageEncrypted) {
    
    this.storageEncrypted = storageEncrypted;
    return this;
  }

   /**
   * Get storageEncrypted
   * @return storageEncrypted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getStorageEncrypted() {
    return storageEncrypted;
  }


  public void setStorageEncrypted(Boolean storageEncrypted) {
    this.storageEncrypted = storageEncrypted;
  }


  public NestedContentLibraryVmTemplateDisk storagePolicy(VmVolumeElfStoragePolicyType storagePolicy) {
    
    this.storagePolicy = storagePolicy;
    return this;
  }

   /**
   * Get storagePolicy
   * @return storagePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmVolumeElfStoragePolicyType getStoragePolicy() {
    return storagePolicy;
  }


  public void setStoragePolicy(VmVolumeElfStoragePolicyType storagePolicy) {
    this.storagePolicy = storagePolicy;
  }


  public NestedContentLibraryVmTemplateDisk type(VmDiskType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmDiskType getType() {
    return type;
  }


  public void setType(VmDiskType type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedContentLibraryVmTemplateDisk nestedContentLibraryVmTemplateDisk = (NestedContentLibraryVmTemplateDisk) o;
    return Objects.equals(this.boot, nestedContentLibraryVmTemplateDisk.boot) &&
        Objects.equals(this.bus, nestedContentLibraryVmTemplateDisk.bus) &&
        Objects.equals(this.contentLibraryImageId, nestedContentLibraryVmTemplateDisk.contentLibraryImageId) &&
        Objects.equals(this.disabled, nestedContentLibraryVmTemplateDisk.disabled) &&
        Objects.equals(this.diskName, nestedContentLibraryVmTemplateDisk.diskName) &&
        Objects.equals(this.index, nestedContentLibraryVmTemplateDisk.index) &&
        Objects.equals(this.maxBandwidth, nestedContentLibraryVmTemplateDisk.maxBandwidth) &&
        Objects.equals(this.maxBandwidthPolicy, nestedContentLibraryVmTemplateDisk.maxBandwidthPolicy) &&
        Objects.equals(this.maxIops, nestedContentLibraryVmTemplateDisk.maxIops) &&
        Objects.equals(this.maxIopsPolicy, nestedContentLibraryVmTemplateDisk.maxIopsPolicy) &&
        Objects.equals(this.path, nestedContentLibraryVmTemplateDisk.path) &&
        Objects.equals(this.residentInCache, nestedContentLibraryVmTemplateDisk.residentInCache) &&
        Objects.equals(this.size, nestedContentLibraryVmTemplateDisk.size) &&
        Objects.equals(this.storageEncrypted, nestedContentLibraryVmTemplateDisk.storageEncrypted) &&
        Objects.equals(this.storagePolicy, nestedContentLibraryVmTemplateDisk.storagePolicy) &&
        Objects.equals(this.type, nestedContentLibraryVmTemplateDisk.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(boot, bus, contentLibraryImageId, disabled, diskName, index, maxBandwidth, maxBandwidthPolicy, maxIops, maxIopsPolicy, path, residentInCache, size, storageEncrypted, storagePolicy, type);
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
    sb.append("class NestedContentLibraryVmTemplateDisk {\n");
    sb.append("    boot: ").append(toIndentedString(boot)).append("\n");
    sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
    sb.append("    contentLibraryImageId: ").append(toIndentedString(contentLibraryImageId)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    diskName: ").append(toIndentedString(diskName)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
    sb.append("    maxBandwidthPolicy: ").append(toIndentedString(maxBandwidthPolicy)).append("\n");
    sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
    sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    residentInCache: ").append(toIndentedString(residentInCache)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    storageEncrypted: ").append(toIndentedString(storageEncrypted)).append("\n");
    sb.append("    storagePolicy: ").append(toIndentedString(storagePolicy)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

