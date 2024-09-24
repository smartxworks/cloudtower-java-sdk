package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NestedEverouteControllerTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class NestedEverouteControllerTemplate {
  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private String cluster;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private Long memory;

  public static final String SERIALIZED_NAME_NETMASK = "netmask";
  @SerializedName(SERIALIZED_NAME_NETMASK)
  private String netmask;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_VCPU = "vcpu";
  @SerializedName(SERIALIZED_NAME_VCPU)
  private Integer vcpu;

  public NestedEverouteControllerTemplate() { 
  }

  public NestedEverouteControllerTemplate cluster(String cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCluster() {
    return cluster;
  }


  public void setCluster(String cluster) {
    this.cluster = cluster;
  }


  public NestedEverouteControllerTemplate gateway(String gateway) {
    
    this.gateway = gateway;
    return this;
  }

   /**
   * Get gateway
   * @return gateway
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getGateway() {
    return gateway;
  }


  public void setGateway(String gateway) {
    this.gateway = gateway;
  }


  public NestedEverouteControllerTemplate memory(Long memory) {
    
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getMemory() {
    return memory;
  }


  public void setMemory(Long memory) {
    this.memory = memory;
  }


  public NestedEverouteControllerTemplate netmask(String netmask) {
    
    this.netmask = netmask;
    return this;
  }

   /**
   * Get netmask
   * @return netmask
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNetmask() {
    return netmask;
  }


  public void setNetmask(String netmask) {
    this.netmask = netmask;
  }


  public NestedEverouteControllerTemplate size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public NestedEverouteControllerTemplate vcpu(Integer vcpu) {
    
    this.vcpu = vcpu;
    return this;
  }

   /**
   * Get vcpu
   * @return vcpu
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getVcpu() {
    return vcpu;
  }


  public void setVcpu(Integer vcpu) {
    this.vcpu = vcpu;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedEverouteControllerTemplate nestedEverouteControllerTemplate = (NestedEverouteControllerTemplate) o;
    return Objects.equals(this.cluster, nestedEverouteControllerTemplate.cluster) &&
        Objects.equals(this.gateway, nestedEverouteControllerTemplate.gateway) &&
        Objects.equals(this.memory, nestedEverouteControllerTemplate.memory) &&
        Objects.equals(this.netmask, nestedEverouteControllerTemplate.netmask) &&
        Objects.equals(this.size, nestedEverouteControllerTemplate.size) &&
        Objects.equals(this.vcpu, nestedEverouteControllerTemplate.vcpu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, gateway, memory, netmask, size, vcpu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedEverouteControllerTemplate {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    netmask: ").append(toIndentedString(netmask)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
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

