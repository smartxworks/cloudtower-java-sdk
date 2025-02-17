package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.Architecture;
import com.smartx.tower.model.ClusterType;
import com.smartx.tower.model.VmClockOffset;
import com.smartx.tower.model.VmDiskIoPolicy;
import com.smartx.tower.model.VmDiskIoRestrictType;
import com.smartx.tower.model.VmDiskMetaData;
import com.smartx.tower.model.VmFirmware;
import com.smartx.tower.model.VmGuestsOperationSystem;
import com.smartx.tower.model.VmHaPriority;
import com.smartx.tower.model.VmNicMetaData;
import com.smartx.tower.model.VmToolsStatus;
import com.smartx.tower.model.VmVideoType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VmMetaData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VmMetaData {
  public static final String SERIALIZED_NAME_WIN_OPT = "win_opt";
  @SerializedName(SERIALIZED_NAME_WIN_OPT)
  private Boolean winOpt;

  public static final String SERIALIZED_NAME_VM_TOOLS_STATUS = "vm_tools_status";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_STATUS)
  private VmToolsStatus vmToolsStatus;

  public static final String SERIALIZED_NAME_VM_NICS = "vm_nics";
  @SerializedName(SERIALIZED_NAME_VM_NICS)
  private List<VmNicMetaData> vmNics = null;

  public static final String SERIALIZED_NAME_VM_DISKS = "vm_disks";
  @SerializedName(SERIALIZED_NAME_VM_DISKS)
  private List<VmDiskMetaData> vmDisks = null;

  public static final String SERIALIZED_NAME_VIDEO_TYPE = "video_type";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE)
  private VmVideoType videoType;

  public static final String SERIALIZED_NAME_VCPU = "vcpu";
  @SerializedName(SERIALIZED_NAME_VCPU)
  private Integer vcpu;

  public static final String SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME = "sync_vm_time_on_resume";
  @SerializedName(SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME)
  private Boolean syncVmTimeOnResume;

  public static final String SERIALIZED_NAME_PROTECTED = "protected";
  @SerializedName(SERIALIZED_NAME_PROTECTED)
  private Boolean _protected;

  public static final String SERIALIZED_NAME_NESTED_VIRTUALIZATION = "nested_virtualization";
  @SerializedName(SERIALIZED_NAME_NESTED_VIRTUALIZATION)
  private Boolean nestedVirtualization;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private Double memory;

  public static final String SERIALIZED_NAME_MAX_IOPS_POLICY = "max_iops_policy";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY)
  private VmDiskIoRestrictType maxIopsPolicy;

  public static final String SERIALIZED_NAME_MAX_IOPS = "max_iops";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS)
  private Integer maxIops;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY = "max_bandwidth_policy";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY)
  private VmDiskIoRestrictType maxBandwidthPolicy;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH = "max_bandwidth";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH)
  private Double maxBandwidth;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_IO_POLICY = "io_policy";
  @SerializedName(SERIALIZED_NAME_IO_POLICY)
  private VmDiskIoPolicy ioPolicy;

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_HOST_LOCAL_ID = "host_local_id";
  @SerializedName(SERIALIZED_NAME_HOST_LOCAL_ID)
  private String hostLocalId;

  public static final String SERIALIZED_NAME_HA_PRIORITY = "ha_priority";
  @SerializedName(SERIALIZED_NAME_HA_PRIORITY)
  private VmHaPriority haPriority;

  public static final String SERIALIZED_NAME_HA = "ha";
  @SerializedName(SERIALIZED_NAME_HA)
  private Boolean ha;

  public static final String SERIALIZED_NAME_GUEST_OS_TYPE = "guest_os_type";
  @SerializedName(SERIALIZED_NAME_GUEST_OS_TYPE)
  private VmGuestsOperationSystem guestOsType;

  public static final String SERIALIZED_NAME_FIRMWARE = "firmware";
  @SerializedName(SERIALIZED_NAME_FIRMWARE)
  private VmFirmware firmware;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CPU_SOCKETS = "cpu_sockets";
  @SerializedName(SERIALIZED_NAME_CPU_SOCKETS)
  private Integer cpuSockets;

  public static final String SERIALIZED_NAME_CPU_MODEL = "cpu_model";
  @SerializedName(SERIALIZED_NAME_CPU_MODEL)
  private String cpuModel;

  public static final String SERIALIZED_NAME_CPU_EXCLUSIVE_EXPECTED_ENABLED = "cpu_exclusive_expected_enabled";
  @SerializedName(SERIALIZED_NAME_CPU_EXCLUSIVE_EXPECTED_ENABLED)
  private Boolean cpuExclusiveExpectedEnabled;

  public static final String SERIALIZED_NAME_CPU_CORES = "cpu_cores";
  @SerializedName(SERIALIZED_NAME_CPU_CORES)
  private Integer cpuCores;

  public static final String SERIALIZED_NAME_CLUSTER_VHOST_ENABLED = "cluster_vhost_enabled";
  @SerializedName(SERIALIZED_NAME_CLUSTER_VHOST_ENABLED)
  private Boolean clusterVhostEnabled;

  public static final String SERIALIZED_NAME_CLUSTER_VERSION = "cluster_version";
  @SerializedName(SERIALIZED_NAME_CLUSTER_VERSION)
  private String clusterVersion;

  public static final String SERIALIZED_NAME_CLUSTER_TYPE = "cluster_type";
  @SerializedName(SERIALIZED_NAME_CLUSTER_TYPE)
  private ClusterType clusterType;

  public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID = "cluster_local_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID)
  private String clusterLocalId;

  public static final String SERIALIZED_NAME_CLUSTER_ARCHITECTURE = "cluster_architecture";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ARCHITECTURE)
  private Architecture clusterArchitecture;

  public static final String SERIALIZED_NAME_CLOCK_OFFSET = "clock_offset";
  @SerializedName(SERIALIZED_NAME_CLOCK_OFFSET)
  private VmClockOffset clockOffset;

  public static final String SERIALIZED_NAME_BOOT_WITH_HOST = "boot_with_host";
  @SerializedName(SERIALIZED_NAME_BOOT_WITH_HOST)
  private Boolean bootWithHost;

  public VmMetaData() { 
  }

  public VmMetaData winOpt(Boolean winOpt) {
    
    this.winOpt = winOpt;
    return this;
  }

   /**
   * Get winOpt
   * @return winOpt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWinOpt() {
    return winOpt;
  }


  public void setWinOpt(Boolean winOpt) {
    this.winOpt = winOpt;
  }


  public VmMetaData vmToolsStatus(VmToolsStatus vmToolsStatus) {
    
    this.vmToolsStatus = vmToolsStatus;
    return this;
  }

   /**
   * Get vmToolsStatus
   * @return vmToolsStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmToolsStatus getVmToolsStatus() {
    return vmToolsStatus;
  }


  public void setVmToolsStatus(VmToolsStatus vmToolsStatus) {
    this.vmToolsStatus = vmToolsStatus;
  }


  public VmMetaData vmNics(List<VmNicMetaData> vmNics) {
    
    this.vmNics = vmNics;
    return this;
  }

  public VmMetaData addVmNicsItem(VmNicMetaData vmNicsItem) {
    if (this.vmNics == null) {
      this.vmNics = new ArrayList<VmNicMetaData>();
    }
    this.vmNics.add(vmNicsItem);
    return this;
  }

   /**
   * Get vmNics
   * @return vmNics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmNicMetaData> getVmNics() {
    return vmNics;
  }


  public void setVmNics(List<VmNicMetaData> vmNics) {
    this.vmNics = vmNics;
  }


  public VmMetaData vmDisks(List<VmDiskMetaData> vmDisks) {
    
    this.vmDisks = vmDisks;
    return this;
  }

  public VmMetaData addVmDisksItem(VmDiskMetaData vmDisksItem) {
    if (this.vmDisks == null) {
      this.vmDisks = new ArrayList<VmDiskMetaData>();
    }
    this.vmDisks.add(vmDisksItem);
    return this;
  }

   /**
   * Get vmDisks
   * @return vmDisks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmDiskMetaData> getVmDisks() {
    return vmDisks;
  }


  public void setVmDisks(List<VmDiskMetaData> vmDisks) {
    this.vmDisks = vmDisks;
  }


  public VmMetaData videoType(VmVideoType videoType) {
    
    this.videoType = videoType;
    return this;
  }

   /**
   * Get videoType
   * @return videoType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmVideoType getVideoType() {
    return videoType;
  }


  public void setVideoType(VmVideoType videoType) {
    this.videoType = videoType;
  }


  public VmMetaData vcpu(Integer vcpu) {
    
    this.vcpu = vcpu;
    return this;
  }

   /**
   * Get vcpu
   * @return vcpu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVcpu() {
    return vcpu;
  }


  public void setVcpu(Integer vcpu) {
    this.vcpu = vcpu;
  }


  public VmMetaData syncVmTimeOnResume(Boolean syncVmTimeOnResume) {
    
    this.syncVmTimeOnResume = syncVmTimeOnResume;
    return this;
  }

   /**
   * Get syncVmTimeOnResume
   * @return syncVmTimeOnResume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSyncVmTimeOnResume() {
    return syncVmTimeOnResume;
  }


  public void setSyncVmTimeOnResume(Boolean syncVmTimeOnResume) {
    this.syncVmTimeOnResume = syncVmTimeOnResume;
  }


  public VmMetaData _protected(Boolean _protected) {
    
    this._protected = _protected;
    return this;
  }

   /**
   * Get _protected
   * @return _protected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getProtected() {
    return _protected;
  }


  public void setProtected(Boolean _protected) {
    this._protected = _protected;
  }


  public VmMetaData nestedVirtualization(Boolean nestedVirtualization) {
    
    this.nestedVirtualization = nestedVirtualization;
    return this;
  }

   /**
   * Get nestedVirtualization
   * @return nestedVirtualization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNestedVirtualization() {
    return nestedVirtualization;
  }


  public void setNestedVirtualization(Boolean nestedVirtualization) {
    this.nestedVirtualization = nestedVirtualization;
  }


  public VmMetaData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public VmMetaData memory(Double memory) {
    
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMemory() {
    return memory;
  }


  public void setMemory(Double memory) {
    this.memory = memory;
  }


  public VmMetaData maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
    
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


  public VmMetaData maxIops(Integer maxIops) {
    
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


  public VmMetaData maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
    
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


  public VmMetaData maxBandwidth(Double maxBandwidth) {
    
    this.maxBandwidth = maxBandwidth;
    return this;
  }

   /**
   * Get maxBandwidth
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


  public VmMetaData localId(String localId) {
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public VmMetaData ioPolicy(VmDiskIoPolicy ioPolicy) {
    
    this.ioPolicy = ioPolicy;
    return this;
  }

   /**
   * Get ioPolicy
   * @return ioPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskIoPolicy getIoPolicy() {
    return ioPolicy;
  }


  public void setIoPolicy(VmDiskIoPolicy ioPolicy) {
    this.ioPolicy = ioPolicy;
  }


  public VmMetaData internal(Boolean internal) {
    
    this.internal = internal;
    return this;
  }

   /**
   * Get internal
   * @return internal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInternal() {
    return internal;
  }


  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  public VmMetaData hostLocalId(String hostLocalId) {
    
    this.hostLocalId = hostLocalId;
    return this;
  }

   /**
   * Get hostLocalId
   * @return hostLocalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostLocalId() {
    return hostLocalId;
  }


  public void setHostLocalId(String hostLocalId) {
    this.hostLocalId = hostLocalId;
  }


  public VmMetaData haPriority(VmHaPriority haPriority) {
    
    this.haPriority = haPriority;
    return this;
  }

   /**
   * Get haPriority
   * @return haPriority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmHaPriority getHaPriority() {
    return haPriority;
  }


  public void setHaPriority(VmHaPriority haPriority) {
    this.haPriority = haPriority;
  }


  public VmMetaData ha(Boolean ha) {
    
    this.ha = ha;
    return this;
  }

   /**
   * Get ha
   * @return ha
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHa() {
    return ha;
  }


  public void setHa(Boolean ha) {
    this.ha = ha;
  }


  public VmMetaData guestOsType(VmGuestsOperationSystem guestOsType) {
    
    this.guestOsType = guestOsType;
    return this;
  }

   /**
   * Get guestOsType
   * @return guestOsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmGuestsOperationSystem getGuestOsType() {
    return guestOsType;
  }


  public void setGuestOsType(VmGuestsOperationSystem guestOsType) {
    this.guestOsType = guestOsType;
  }


  public VmMetaData firmware(VmFirmware firmware) {
    
    this.firmware = firmware;
    return this;
  }

   /**
   * Get firmware
   * @return firmware
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmFirmware getFirmware() {
    return firmware;
  }


  public void setFirmware(VmFirmware firmware) {
    this.firmware = firmware;
  }


  public VmMetaData description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public VmMetaData cpuSockets(Integer cpuSockets) {
    
    this.cpuSockets = cpuSockets;
    return this;
  }

   /**
   * Get cpuSockets
   * @return cpuSockets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCpuSockets() {
    return cpuSockets;
  }


  public void setCpuSockets(Integer cpuSockets) {
    this.cpuSockets = cpuSockets;
  }


  public VmMetaData cpuModel(String cpuModel) {
    
    this.cpuModel = cpuModel;
    return this;
  }

   /**
   * Get cpuModel
   * @return cpuModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuModel() {
    return cpuModel;
  }


  public void setCpuModel(String cpuModel) {
    this.cpuModel = cpuModel;
  }


  public VmMetaData cpuExclusiveExpectedEnabled(Boolean cpuExclusiveExpectedEnabled) {
    
    this.cpuExclusiveExpectedEnabled = cpuExclusiveExpectedEnabled;
    return this;
  }

   /**
   * Get cpuExclusiveExpectedEnabled
   * @return cpuExclusiveExpectedEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCpuExclusiveExpectedEnabled() {
    return cpuExclusiveExpectedEnabled;
  }


  public void setCpuExclusiveExpectedEnabled(Boolean cpuExclusiveExpectedEnabled) {
    this.cpuExclusiveExpectedEnabled = cpuExclusiveExpectedEnabled;
  }


  public VmMetaData cpuCores(Integer cpuCores) {
    
    this.cpuCores = cpuCores;
    return this;
  }

   /**
   * Get cpuCores
   * @return cpuCores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCpuCores() {
    return cpuCores;
  }


  public void setCpuCores(Integer cpuCores) {
    this.cpuCores = cpuCores;
  }


  public VmMetaData clusterVhostEnabled(Boolean clusterVhostEnabled) {
    
    this.clusterVhostEnabled = clusterVhostEnabled;
    return this;
  }

   /**
   * Get clusterVhostEnabled
   * @return clusterVhostEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getClusterVhostEnabled() {
    return clusterVhostEnabled;
  }


  public void setClusterVhostEnabled(Boolean clusterVhostEnabled) {
    this.clusterVhostEnabled = clusterVhostEnabled;
  }


  public VmMetaData clusterVersion(String clusterVersion) {
    
    this.clusterVersion = clusterVersion;
    return this;
  }

   /**
   * Get clusterVersion
   * @return clusterVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClusterVersion() {
    return clusterVersion;
  }


  public void setClusterVersion(String clusterVersion) {
    this.clusterVersion = clusterVersion;
  }


  public VmMetaData clusterType(ClusterType clusterType) {
    
    this.clusterType = clusterType;
    return this;
  }

   /**
   * Get clusterType
   * @return clusterType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterType getClusterType() {
    return clusterType;
  }


  public void setClusterType(ClusterType clusterType) {
    this.clusterType = clusterType;
  }


  public VmMetaData clusterLocalId(String clusterLocalId) {
    
    this.clusterLocalId = clusterLocalId;
    return this;
  }

   /**
   * Get clusterLocalId
   * @return clusterLocalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClusterLocalId() {
    return clusterLocalId;
  }


  public void setClusterLocalId(String clusterLocalId) {
    this.clusterLocalId = clusterLocalId;
  }


  public VmMetaData clusterArchitecture(Architecture clusterArchitecture) {
    
    this.clusterArchitecture = clusterArchitecture;
    return this;
  }

   /**
   * Get clusterArchitecture
   * @return clusterArchitecture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Architecture getClusterArchitecture() {
    return clusterArchitecture;
  }


  public void setClusterArchitecture(Architecture clusterArchitecture) {
    this.clusterArchitecture = clusterArchitecture;
  }


  public VmMetaData clockOffset(VmClockOffset clockOffset) {
    
    this.clockOffset = clockOffset;
    return this;
  }

   /**
   * Get clockOffset
   * @return clockOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmClockOffset getClockOffset() {
    return clockOffset;
  }


  public void setClockOffset(VmClockOffset clockOffset) {
    this.clockOffset = clockOffset;
  }


  public VmMetaData bootWithHost(Boolean bootWithHost) {
    
    this.bootWithHost = bootWithHost;
    return this;
  }

   /**
   * Get bootWithHost
   * @return bootWithHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBootWithHost() {
    return bootWithHost;
  }


  public void setBootWithHost(Boolean bootWithHost) {
    this.bootWithHost = bootWithHost;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmMetaData vmMetaData = (VmMetaData) o;
    return Objects.equals(this.winOpt, vmMetaData.winOpt) &&
        Objects.equals(this.vmToolsStatus, vmMetaData.vmToolsStatus) &&
        Objects.equals(this.vmNics, vmMetaData.vmNics) &&
        Objects.equals(this.vmDisks, vmMetaData.vmDisks) &&
        Objects.equals(this.videoType, vmMetaData.videoType) &&
        Objects.equals(this.vcpu, vmMetaData.vcpu) &&
        Objects.equals(this.syncVmTimeOnResume, vmMetaData.syncVmTimeOnResume) &&
        Objects.equals(this._protected, vmMetaData._protected) &&
        Objects.equals(this.nestedVirtualization, vmMetaData.nestedVirtualization) &&
        Objects.equals(this.name, vmMetaData.name) &&
        Objects.equals(this.memory, vmMetaData.memory) &&
        Objects.equals(this.maxIopsPolicy, vmMetaData.maxIopsPolicy) &&
        Objects.equals(this.maxIops, vmMetaData.maxIops) &&
        Objects.equals(this.maxBandwidthPolicy, vmMetaData.maxBandwidthPolicy) &&
        Objects.equals(this.maxBandwidth, vmMetaData.maxBandwidth) &&
        Objects.equals(this.localId, vmMetaData.localId) &&
        Objects.equals(this.ioPolicy, vmMetaData.ioPolicy) &&
        Objects.equals(this.internal, vmMetaData.internal) &&
        Objects.equals(this.hostLocalId, vmMetaData.hostLocalId) &&
        Objects.equals(this.haPriority, vmMetaData.haPriority) &&
        Objects.equals(this.ha, vmMetaData.ha) &&
        Objects.equals(this.guestOsType, vmMetaData.guestOsType) &&
        Objects.equals(this.firmware, vmMetaData.firmware) &&
        Objects.equals(this.description, vmMetaData.description) &&
        Objects.equals(this.cpuSockets, vmMetaData.cpuSockets) &&
        Objects.equals(this.cpuModel, vmMetaData.cpuModel) &&
        Objects.equals(this.cpuExclusiveExpectedEnabled, vmMetaData.cpuExclusiveExpectedEnabled) &&
        Objects.equals(this.cpuCores, vmMetaData.cpuCores) &&
        Objects.equals(this.clusterVhostEnabled, vmMetaData.clusterVhostEnabled) &&
        Objects.equals(this.clusterVersion, vmMetaData.clusterVersion) &&
        Objects.equals(this.clusterType, vmMetaData.clusterType) &&
        Objects.equals(this.clusterLocalId, vmMetaData.clusterLocalId) &&
        Objects.equals(this.clusterArchitecture, vmMetaData.clusterArchitecture) &&
        Objects.equals(this.clockOffset, vmMetaData.clockOffset) &&
        Objects.equals(this.bootWithHost, vmMetaData.bootWithHost);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(winOpt, vmToolsStatus, vmNics, vmDisks, videoType, vcpu, syncVmTimeOnResume, _protected, nestedVirtualization, name, memory, maxIopsPolicy, maxIops, maxBandwidthPolicy, maxBandwidth, localId, ioPolicy, internal, hostLocalId, haPriority, ha, guestOsType, firmware, description, cpuSockets, cpuModel, cpuExclusiveExpectedEnabled, cpuCores, clusterVhostEnabled, clusterVersion, clusterType, clusterLocalId, clusterArchitecture, clockOffset, bootWithHost);
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
    sb.append("class VmMetaData {\n");
    sb.append("    winOpt: ").append(toIndentedString(winOpt)).append("\n");
    sb.append("    vmToolsStatus: ").append(toIndentedString(vmToolsStatus)).append("\n");
    sb.append("    vmNics: ").append(toIndentedString(vmNics)).append("\n");
    sb.append("    vmDisks: ").append(toIndentedString(vmDisks)).append("\n");
    sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
    sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
    sb.append("    syncVmTimeOnResume: ").append(toIndentedString(syncVmTimeOnResume)).append("\n");
    sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
    sb.append("    nestedVirtualization: ").append(toIndentedString(nestedVirtualization)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
    sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
    sb.append("    maxBandwidthPolicy: ").append(toIndentedString(maxBandwidthPolicy)).append("\n");
    sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    ioPolicy: ").append(toIndentedString(ioPolicy)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    hostLocalId: ").append(toIndentedString(hostLocalId)).append("\n");
    sb.append("    haPriority: ").append(toIndentedString(haPriority)).append("\n");
    sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
    sb.append("    guestOsType: ").append(toIndentedString(guestOsType)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cpuSockets: ").append(toIndentedString(cpuSockets)).append("\n");
    sb.append("    cpuModel: ").append(toIndentedString(cpuModel)).append("\n");
    sb.append("    cpuExclusiveExpectedEnabled: ").append(toIndentedString(cpuExclusiveExpectedEnabled)).append("\n");
    sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
    sb.append("    clusterVhostEnabled: ").append(toIndentedString(clusterVhostEnabled)).append("\n");
    sb.append("    clusterVersion: ").append(toIndentedString(clusterVersion)).append("\n");
    sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
    sb.append("    clusterLocalId: ").append(toIndentedString(clusterLocalId)).append("\n");
    sb.append("    clusterArchitecture: ").append(toIndentedString(clusterArchitecture)).append("\n");
    sb.append("    clockOffset: ").append(toIndentedString(clockOffset)).append("\n");
    sb.append("    bootWithHost: ").append(toIndentedString(bootWithHost)).append("\n");
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

