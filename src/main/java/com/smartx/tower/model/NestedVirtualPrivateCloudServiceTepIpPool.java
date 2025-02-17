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
 * NestedVirtualPrivateCloudServiceTepIpPool
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NestedVirtualPrivateCloudServiceTepIpPool {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_IP_END = "ip_end";
  @SerializedName(SERIALIZED_NAME_IP_END)
  private String ipEnd;

  public static final String SERIALIZED_NAME_IP_START = "ip_start";
  @SerializedName(SERIALIZED_NAME_IP_START)
  private String ipStart;

  public static final String SERIALIZED_NAME_NETMASK = "netmask";
  @SerializedName(SERIALIZED_NAME_NETMASK)
  private String netmask;

  public NestedVirtualPrivateCloudServiceTepIpPool() { 
  }

  public NestedVirtualPrivateCloudServiceTepIpPool displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public NestedVirtualPrivateCloudServiceTepIpPool gateway(String gateway) {
    
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


  public NestedVirtualPrivateCloudServiceTepIpPool ipEnd(String ipEnd) {
    
    this.ipEnd = ipEnd;
    return this;
  }

   /**
   * Get ipEnd
   * @return ipEnd
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIpEnd() {
    return ipEnd;
  }


  public void setIpEnd(String ipEnd) {
    this.ipEnd = ipEnd;
  }


  public NestedVirtualPrivateCloudServiceTepIpPool ipStart(String ipStart) {
    
    this.ipStart = ipStart;
    return this;
  }

   /**
   * Get ipStart
   * @return ipStart
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIpStart() {
    return ipStart;
  }


  public void setIpStart(String ipStart) {
    this.ipStart = ipStart;
  }


  public NestedVirtualPrivateCloudServiceTepIpPool netmask(String netmask) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedVirtualPrivateCloudServiceTepIpPool nestedVirtualPrivateCloudServiceTepIpPool = (NestedVirtualPrivateCloudServiceTepIpPool) o;
    return Objects.equals(this.displayName, nestedVirtualPrivateCloudServiceTepIpPool.displayName) &&
        Objects.equals(this.gateway, nestedVirtualPrivateCloudServiceTepIpPool.gateway) &&
        Objects.equals(this.ipEnd, nestedVirtualPrivateCloudServiceTepIpPool.ipEnd) &&
        Objects.equals(this.ipStart, nestedVirtualPrivateCloudServiceTepIpPool.ipStart) &&
        Objects.equals(this.netmask, nestedVirtualPrivateCloudServiceTepIpPool.netmask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, gateway, ipEnd, ipStart, netmask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedVirtualPrivateCloudServiceTepIpPool {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    ipEnd: ").append(toIndentedString(ipEnd)).append("\n");
    sb.append("    ipStart: ").append(toIndentedString(ipStart)).append("\n");
    sb.append("    netmask: ").append(toIndentedString(netmask)).append("\n");
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

