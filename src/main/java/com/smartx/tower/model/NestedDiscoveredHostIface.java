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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NestedDiscoveredHostIface
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class NestedDiscoveredHostIface {
  public static final String SERIALIZED_NAME_IPV4 = "ipv4";
  @SerializedName(SERIALIZED_NAME_IPV4)
  private String ipv4;

  public static final String SERIALIZED_NAME_IPV6 = "ipv6";
  @SerializedName(SERIALIZED_NAME_IPV6)
  private String ipv6;

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "mac_address";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_MTU = "mtu";
  @SerializedName(SERIALIZED_NAME_MTU)
  private Integer mtu;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PCI_SLOT_NAME = "pci_slot_name";
  @SerializedName(SERIALIZED_NAME_PCI_SLOT_NAME)
  private String pciSlotName;

  public static final String SERIALIZED_NAME_RDMA_ENABLED = "rdma_enabled";
  @SerializedName(SERIALIZED_NAME_RDMA_ENABLED)
  private Boolean rdmaEnabled;

  public static final String SERIALIZED_NAME_SPEED = "speed";
  @SerializedName(SERIALIZED_NAME_SPEED)
  private Double speed;

  public static final String SERIALIZED_NAME_UP = "up";
  @SerializedName(SERIALIZED_NAME_UP)
  private Boolean up;

  public NestedDiscoveredHostIface() { 
  }

  public NestedDiscoveredHostIface ipv4(String ipv4) {
    
    this.ipv4 = ipv4;
    return this;
  }

   /**
   * Get ipv4
   * @return ipv4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpv4() {
    return ipv4;
  }


  public void setIpv4(String ipv4) {
    this.ipv4 = ipv4;
  }


  public NestedDiscoveredHostIface ipv6(String ipv6) {
    
    this.ipv6 = ipv6;
    return this;
  }

   /**
   * Get ipv6
   * @return ipv6
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpv6() {
    return ipv6;
  }


  public void setIpv6(String ipv6) {
    this.ipv6 = ipv6;
  }


  public NestedDiscoveredHostIface macAddress(String macAddress) {
    
    this.macAddress = macAddress;
    return this;
  }

   /**
   * Get macAddress
   * @return macAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMacAddress() {
    return macAddress;
  }


  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }


  public NestedDiscoveredHostIface mtu(Integer mtu) {
    
    this.mtu = mtu;
    return this;
  }

   /**
   * Get mtu
   * @return mtu
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getMtu() {
    return mtu;
  }


  public void setMtu(Integer mtu) {
    this.mtu = mtu;
  }


  public NestedDiscoveredHostIface name(String name) {
    
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


  public NestedDiscoveredHostIface pciSlotName(String pciSlotName) {
    
    this.pciSlotName = pciSlotName;
    return this;
  }

   /**
   * Get pciSlotName
   * @return pciSlotName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPciSlotName() {
    return pciSlotName;
  }


  public void setPciSlotName(String pciSlotName) {
    this.pciSlotName = pciSlotName;
  }


  public NestedDiscoveredHostIface rdmaEnabled(Boolean rdmaEnabled) {
    
    this.rdmaEnabled = rdmaEnabled;
    return this;
  }

   /**
   * Get rdmaEnabled
   * @return rdmaEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRdmaEnabled() {
    return rdmaEnabled;
  }


  public void setRdmaEnabled(Boolean rdmaEnabled) {
    this.rdmaEnabled = rdmaEnabled;
  }


  public NestedDiscoveredHostIface speed(Double speed) {
    
    this.speed = speed;
    return this;
  }

   /**
   * Get speed
   * @return speed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSpeed() {
    return speed;
  }


  public void setSpeed(Double speed) {
    this.speed = speed;
  }


  public NestedDiscoveredHostIface up(Boolean up) {
    
    this.up = up;
    return this;
  }

   /**
   * Get up
   * @return up
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getUp() {
    return up;
  }


  public void setUp(Boolean up) {
    this.up = up;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedDiscoveredHostIface nestedDiscoveredHostIface = (NestedDiscoveredHostIface) o;
    return Objects.equals(this.ipv4, nestedDiscoveredHostIface.ipv4) &&
        Objects.equals(this.ipv6, nestedDiscoveredHostIface.ipv6) &&
        Objects.equals(this.macAddress, nestedDiscoveredHostIface.macAddress) &&
        Objects.equals(this.mtu, nestedDiscoveredHostIface.mtu) &&
        Objects.equals(this.name, nestedDiscoveredHostIface.name) &&
        Objects.equals(this.pciSlotName, nestedDiscoveredHostIface.pciSlotName) &&
        Objects.equals(this.rdmaEnabled, nestedDiscoveredHostIface.rdmaEnabled) &&
        Objects.equals(this.speed, nestedDiscoveredHostIface.speed) &&
        Objects.equals(this.up, nestedDiscoveredHostIface.up);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4, ipv6, macAddress, mtu, name, pciSlotName, rdmaEnabled, speed, up);
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
    sb.append("class NestedDiscoveredHostIface {\n");
    sb.append("    ipv4: ").append(toIndentedString(ipv4)).append("\n");
    sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pciSlotName: ").append(toIndentedString(pciSlotName)).append("\n");
    sb.append("    rdmaEnabled: ").append(toIndentedString(rdmaEnabled)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    up: ").append(toIndentedString(up)).append("\n");
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

