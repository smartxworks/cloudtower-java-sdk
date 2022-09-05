package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NestedDiscoveredHostDimms;
import com.smartx.tower.model.NestedDiscoveredHostDisk;
import com.smartx.tower.model.NestedDiscoveredHostIface;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * DiscoveredHost
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class DiscoveredHost {
  public static final String SERIALIZED_NAME_ALL_FLASH = "all_flash";
  @SerializedName(SERIALIZED_NAME_ALL_FLASH)
  private Boolean allFlash;

  public static final String SERIALIZED_NAME_DEPLOYED = "deployed";
  @SerializedName(SERIALIZED_NAME_DEPLOYED)
  private Boolean deployed;

  public static final String SERIALIZED_NAME_DIMMS = "dimms";
  @SerializedName(SERIALIZED_NAME_DIMMS)
  private List<NestedDiscoveredHostDimms> dimms = null;

  public static final String SERIALIZED_NAME_DISKS = "disks";
  @SerializedName(SERIALIZED_NAME_DISKS)
  private List<NestedDiscoveredHostDisk> disks = new ArrayList<NestedDiscoveredHostDisk>();

  public static final String SERIALIZED_NAME_HOST_IP = "host_ip";
  @SerializedName(SERIALIZED_NAME_HOST_IP)
  private String hostIp;

  public static final String SERIALIZED_NAME_HOST_UUID = "host_uuid";
  @SerializedName(SERIALIZED_NAME_HOST_UUID)
  private String hostUuid;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_IFACES = "ifaces";
  @SerializedName(SERIALIZED_NAME_IFACES)
  private List<NestedDiscoveredHostIface> ifaces = new ArrayList<NestedDiscoveredHostIface>();

  public static final String SERIALIZED_NAME_IPMI_IP = "ipmi_ip";
  @SerializedName(SERIALIZED_NAME_IPMI_IP)
  private String ipmiIp;

  public static final String SERIALIZED_NAME_IS_OS_IN_RAID1 = "is_os_in_raid1";
  @SerializedName(SERIALIZED_NAME_IS_OS_IN_RAID1)
  private Boolean isOsInRaid1;

  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private String product;

  public static final String SERIALIZED_NAME_SERIAL = "serial";
  @SerializedName(SERIALIZED_NAME_SERIAL)
  private String serial;

  public static final String SERIALIZED_NAME_SOCKETS = "sockets";
  @SerializedName(SERIALIZED_NAME_SOCKETS)
  private Integer sockets;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public DiscoveredHost() { 
  }

  public DiscoveredHost allFlash(Boolean allFlash) {
    
    this.allFlash = allFlash;
    return this;
  }

   /**
   * Get allFlash
   * @return allFlash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getAllFlash() {
    return allFlash;
  }


  public void setAllFlash(Boolean allFlash) {
    this.allFlash = allFlash;
  }


  public DiscoveredHost deployed(Boolean deployed) {
    
    this.deployed = deployed;
    return this;
  }

   /**
   * Get deployed
   * @return deployed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDeployed() {
    return deployed;
  }


  public void setDeployed(Boolean deployed) {
    this.deployed = deployed;
  }


  public DiscoveredHost dimms(List<NestedDiscoveredHostDimms> dimms) {
    
    this.dimms = dimms;
    return this;
  }

  public DiscoveredHost addDimmsItem(NestedDiscoveredHostDimms dimmsItem) {
    if (this.dimms == null) {
      this.dimms = new ArrayList<NestedDiscoveredHostDimms>();
    }
    this.dimms.add(dimmsItem);
    return this;
  }

   /**
   * Get dimms
   * @return dimms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedDiscoveredHostDimms> getDimms() {
    return dimms;
  }


  public void setDimms(List<NestedDiscoveredHostDimms> dimms) {
    this.dimms = dimms;
  }


  public DiscoveredHost disks(List<NestedDiscoveredHostDisk> disks) {
    
    this.disks = disks;
    return this;
  }

  public DiscoveredHost addDisksItem(NestedDiscoveredHostDisk disksItem) {
    this.disks.add(disksItem);
    return this;
  }

   /**
   * Get disks
   * @return disks
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<NestedDiscoveredHostDisk> getDisks() {
    return disks;
  }


  public void setDisks(List<NestedDiscoveredHostDisk> disks) {
    this.disks = disks;
  }


  public DiscoveredHost hostIp(String hostIp) {
    
    this.hostIp = hostIp;
    return this;
  }

   /**
   * Get hostIp
   * @return hostIp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getHostIp() {
    return hostIp;
  }


  public void setHostIp(String hostIp) {
    this.hostIp = hostIp;
  }


  public DiscoveredHost hostUuid(String hostUuid) {
    
    this.hostUuid = hostUuid;
    return this;
  }

   /**
   * Get hostUuid
   * @return hostUuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getHostUuid() {
    return hostUuid;
  }


  public void setHostUuid(String hostUuid) {
    this.hostUuid = hostUuid;
  }


  public DiscoveredHost hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public DiscoveredHost ifaces(List<NestedDiscoveredHostIface> ifaces) {
    
    this.ifaces = ifaces;
    return this;
  }

  public DiscoveredHost addIfacesItem(NestedDiscoveredHostIface ifacesItem) {
    this.ifaces.add(ifacesItem);
    return this;
  }

   /**
   * Get ifaces
   * @return ifaces
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<NestedDiscoveredHostIface> getIfaces() {
    return ifaces;
  }


  public void setIfaces(List<NestedDiscoveredHostIface> ifaces) {
    this.ifaces = ifaces;
  }


  public DiscoveredHost ipmiIp(String ipmiIp) {
    
    this.ipmiIp = ipmiIp;
    return this;
  }

   /**
   * Get ipmiIp
   * @return ipmiIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpmiIp() {
    return ipmiIp;
  }


  public void setIpmiIp(String ipmiIp) {
    this.ipmiIp = ipmiIp;
  }


  public DiscoveredHost isOsInRaid1(Boolean isOsInRaid1) {
    
    this.isOsInRaid1 = isOsInRaid1;
    return this;
  }

   /**
   * Get isOsInRaid1
   * @return isOsInRaid1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsOsInRaid1() {
    return isOsInRaid1;
  }


  public void setIsOsInRaid1(Boolean isOsInRaid1) {
    this.isOsInRaid1 = isOsInRaid1;
  }


  public DiscoveredHost product(String product) {
    
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProduct() {
    return product;
  }


  public void setProduct(String product) {
    this.product = product;
  }


  public DiscoveredHost serial(String serial) {
    
    this.serial = serial;
    return this;
  }

   /**
   * Get serial
   * @return serial
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSerial() {
    return serial;
  }


  public void setSerial(String serial) {
    this.serial = serial;
  }


  public DiscoveredHost sockets(Integer sockets) {
    
    this.sockets = sockets;
    return this;
  }

   /**
   * Get sockets
   * @return sockets
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSockets() {
    return sockets;
  }


  public void setSockets(Integer sockets) {
    this.sockets = sockets;
  }


  public DiscoveredHost version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscoveredHost discoveredHost = (DiscoveredHost) o;
    return Objects.equals(this.allFlash, discoveredHost.allFlash) &&
        Objects.equals(this.deployed, discoveredHost.deployed) &&
        Objects.equals(this.dimms, discoveredHost.dimms) &&
        Objects.equals(this.disks, discoveredHost.disks) &&
        Objects.equals(this.hostIp, discoveredHost.hostIp) &&
        Objects.equals(this.hostUuid, discoveredHost.hostUuid) &&
        Objects.equals(this.hostname, discoveredHost.hostname) &&
        Objects.equals(this.ifaces, discoveredHost.ifaces) &&
        Objects.equals(this.ipmiIp, discoveredHost.ipmiIp) &&
        Objects.equals(this.isOsInRaid1, discoveredHost.isOsInRaid1) &&
        Objects.equals(this.product, discoveredHost.product) &&
        Objects.equals(this.serial, discoveredHost.serial) &&
        Objects.equals(this.sockets, discoveredHost.sockets) &&
        Objects.equals(this.version, discoveredHost.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allFlash, deployed, dimms, disks, hostIp, hostUuid, hostname, ifaces, ipmiIp, isOsInRaid1, product, serial, sockets, version);
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
    sb.append("class DiscoveredHost {\n");
    sb.append("    allFlash: ").append(toIndentedString(allFlash)).append("\n");
    sb.append("    deployed: ").append(toIndentedString(deployed)).append("\n");
    sb.append("    dimms: ").append(toIndentedString(dimms)).append("\n");
    sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
    sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
    sb.append("    hostUuid: ").append(toIndentedString(hostUuid)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ifaces: ").append(toIndentedString(ifaces)).append("\n");
    sb.append("    ipmiIp: ").append(toIndentedString(ipmiIp)).append("\n");
    sb.append("    isOsInRaid1: ").append(toIndentedString(isOsInRaid1)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

