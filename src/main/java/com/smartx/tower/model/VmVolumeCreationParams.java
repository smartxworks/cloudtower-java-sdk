/*
 * CloudTower APIs
 * cloudtower operation API and SDK
 *
 * The version of the OpenAPI document: 1.9.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.VmVolumeElfStoragePolicyType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmVolumeCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VmVolumeCreationParams {
  public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY = "elf_storage_policy";
  @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY)
  private VmVolumeElfStoragePolicyType elfStoragePolicy;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_SHARING = "sharing";
  @SerializedName(SERIALIZED_NAME_SHARING)
  private Boolean sharing;

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public VmVolumeCreationParams() { 
  }

  public VmVolumeCreationParams elfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {
    
    this.elfStoragePolicy = elfStoragePolicy;
    return this;
  }

   /**
   * Get elfStoragePolicy
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


  public VmVolumeCreationParams size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public VmVolumeCreationParams sharing(Boolean sharing) {
    
    this.sharing = sharing;
    return this;
  }

   /**
   * Get sharing
   * @return sharing
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getSharing() {
    return sharing;
  }


  public void setSharing(Boolean sharing) {
    this.sharing = sharing;
  }


  public VmVolumeCreationParams clusterId(String clusterId) {
    
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getClusterId() {
    return clusterId;
  }


  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }


  public VmVolumeCreationParams name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmVolumeCreationParams vmVolumeCreationParams = (VmVolumeCreationParams) o;
    return Objects.equals(this.elfStoragePolicy, vmVolumeCreationParams.elfStoragePolicy) &&
        Objects.equals(this.size, vmVolumeCreationParams.size) &&
        Objects.equals(this.sharing, vmVolumeCreationParams.sharing) &&
        Objects.equals(this.clusterId, vmVolumeCreationParams.clusterId) &&
        Objects.equals(this.name, vmVolumeCreationParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elfStoragePolicy, size, sharing, clusterId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmVolumeCreationParams {\n");
    sb.append("    elfStoragePolicy: ").append(toIndentedString(elfStoragePolicy)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sharing: ").append(toIndentedString(sharing)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
