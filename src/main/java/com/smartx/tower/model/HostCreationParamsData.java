package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.HostBatchCreateDiskInput;
import com.smartx.tower.model.HostBatchCreateIfaceInput;
import com.smartx.tower.model.HostBatchCreateIpmiInput;
import com.smartx.tower.model.HostVdsConfig;
import com.smartx.tower.model.ZbsSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HostCreationParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class HostCreationParamsData {
  public static final String SERIALIZED_NAME_VDSES = "vdses";
  @SerializedName(SERIALIZED_NAME_VDSES)
  private List<HostVdsConfig> vdses = null;

  public static final String SERIALIZED_NAME_ZBS_SPEC = "zbs_spec";
  @SerializedName(SERIALIZED_NAME_ZBS_SPEC)
  private ZbsSpec zbsSpec;

  public static final String SERIALIZED_NAME_IFACES = "ifaces";
  @SerializedName(SERIALIZED_NAME_IFACES)
  private List<HostBatchCreateIfaceInput> ifaces = new ArrayList<HostBatchCreateIfaceInput>();

  public static final String SERIALIZED_NAME_DISKS = "disks";
  @SerializedName(SERIALIZED_NAME_DISKS)
  private List<HostBatchCreateDiskInput> disks = new ArrayList<HostBatchCreateDiskInput>();

  public static final String SERIALIZED_NAME_PLATFORM_PASSWORD = "platform_password";
  @SerializedName(SERIALIZED_NAME_PLATFORM_PASSWORD)
  private String platformPassword;

  public static final String SERIALIZED_NAME_PLATFORM_USERNAME = "platform_username";
  @SerializedName(SERIALIZED_NAME_PLATFORM_USERNAME)
  private String platformUsername;

  public static final String SERIALIZED_NAME_PLATFORM_IP = "platform_ip";
  @SerializedName(SERIALIZED_NAME_PLATFORM_IP)
  private String platformIp;

  public static final String SERIALIZED_NAME_IPMI = "ipmi";
  @SerializedName(SERIALIZED_NAME_IPMI)
  private HostBatchCreateIpmiInput ipmi;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_HOST_UUID = "host_uuid";
  @SerializedName(SERIALIZED_NAME_HOST_UUID)
  private String hostUuid;

  public static final String SERIALIZED_NAME_HOST_IP = "host_ip";
  @SerializedName(SERIALIZED_NAME_HOST_IP)
  private String hostIp;

  public HostCreationParamsData() { 
  }

  public HostCreationParamsData vdses(List<HostVdsConfig> vdses) {
    
    this.vdses = vdses;
    return this;
  }

  public HostCreationParamsData addVdsesItem(HostVdsConfig vdsesItem) {
    if (this.vdses == null) {
      this.vdses = new ArrayList<HostVdsConfig>();
    }
    this.vdses.add(vdsesItem);
    return this;
  }

   /**
   * Get vdses
   * @return vdses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HostVdsConfig> getVdses() {
    return vdses;
  }


  public void setVdses(List<HostVdsConfig> vdses) {
    this.vdses = vdses;
  }


  public HostCreationParamsData zbsSpec(ZbsSpec zbsSpec) {
    
    this.zbsSpec = zbsSpec;
    return this;
  }

   /**
   * Get zbsSpec
   * @return zbsSpec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZbsSpec getZbsSpec() {
    return zbsSpec;
  }


  public void setZbsSpec(ZbsSpec zbsSpec) {
    this.zbsSpec = zbsSpec;
  }


  public HostCreationParamsData ifaces(List<HostBatchCreateIfaceInput> ifaces) {
    
    this.ifaces = ifaces;
    return this;
  }

  public HostCreationParamsData addIfacesItem(HostBatchCreateIfaceInput ifacesItem) {
    this.ifaces.add(ifacesItem);
    return this;
  }

   /**
   * Get ifaces
   * @return ifaces
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<HostBatchCreateIfaceInput> getIfaces() {
    return ifaces;
  }


  public void setIfaces(List<HostBatchCreateIfaceInput> ifaces) {
    this.ifaces = ifaces;
  }


  public HostCreationParamsData disks(List<HostBatchCreateDiskInput> disks) {
    
    this.disks = disks;
    return this;
  }

  public HostCreationParamsData addDisksItem(HostBatchCreateDiskInput disksItem) {
    this.disks.add(disksItem);
    return this;
  }

   /**
   * Get disks
   * @return disks
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<HostBatchCreateDiskInput> getDisks() {
    return disks;
  }


  public void setDisks(List<HostBatchCreateDiskInput> disks) {
    this.disks = disks;
  }


  public HostCreationParamsData platformPassword(String platformPassword) {
    
    this.platformPassword = platformPassword;
    return this;
  }

   /**
   * Get platformPassword
   * @return platformPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlatformPassword() {
    return platformPassword;
  }


  public void setPlatformPassword(String platformPassword) {
    this.platformPassword = platformPassword;
  }


  public HostCreationParamsData platformUsername(String platformUsername) {
    
    this.platformUsername = platformUsername;
    return this;
  }

   /**
   * Get platformUsername
   * @return platformUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlatformUsername() {
    return platformUsername;
  }


  public void setPlatformUsername(String platformUsername) {
    this.platformUsername = platformUsername;
  }


  public HostCreationParamsData platformIp(String platformIp) {
    
    this.platformIp = platformIp;
    return this;
  }

   /**
   * Get platformIp
   * @return platformIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlatformIp() {
    return platformIp;
  }


  public void setPlatformIp(String platformIp) {
    this.platformIp = platformIp;
  }


  public HostCreationParamsData ipmi(HostBatchCreateIpmiInput ipmi) {
    
    this.ipmi = ipmi;
    return this;
  }

   /**
   * Get ipmi
   * @return ipmi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostBatchCreateIpmiInput getIpmi() {
    return ipmi;
  }


  public void setIpmi(HostBatchCreateIpmiInput ipmi) {
    this.ipmi = ipmi;
  }


  public HostCreationParamsData hostname(String hostname) {
    
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


  public HostCreationParamsData hostUuid(String hostUuid) {
    
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


  public HostCreationParamsData hostIp(String hostIp) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostCreationParamsData hostCreationParamsData = (HostCreationParamsData) o;
    return Objects.equals(this.vdses, hostCreationParamsData.vdses) &&
        Objects.equals(this.zbsSpec, hostCreationParamsData.zbsSpec) &&
        Objects.equals(this.ifaces, hostCreationParamsData.ifaces) &&
        Objects.equals(this.disks, hostCreationParamsData.disks) &&
        Objects.equals(this.platformPassword, hostCreationParamsData.platformPassword) &&
        Objects.equals(this.platformUsername, hostCreationParamsData.platformUsername) &&
        Objects.equals(this.platformIp, hostCreationParamsData.platformIp) &&
        Objects.equals(this.ipmi, hostCreationParamsData.ipmi) &&
        Objects.equals(this.hostname, hostCreationParamsData.hostname) &&
        Objects.equals(this.hostUuid, hostCreationParamsData.hostUuid) &&
        Objects.equals(this.hostIp, hostCreationParamsData.hostIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vdses, zbsSpec, ifaces, disks, platformPassword, platformUsername, platformIp, ipmi, hostname, hostUuid, hostIp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostCreationParamsData {\n");
    sb.append("    vdses: ").append(toIndentedString(vdses)).append("\n");
    sb.append("    zbsSpec: ").append(toIndentedString(zbsSpec)).append("\n");
    sb.append("    ifaces: ").append(toIndentedString(ifaces)).append("\n");
    sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
    sb.append("    platformPassword: ").append(toIndentedString(platformPassword)).append("\n");
    sb.append("    platformUsername: ").append(toIndentedString(platformUsername)).append("\n");
    sb.append("    platformIp: ").append(toIndentedString(platformIp)).append("\n");
    sb.append("    ipmi: ").append(toIndentedString(ipmi)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    hostUuid: ").append(toIndentedString(hostUuid)).append("\n");
    sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
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

