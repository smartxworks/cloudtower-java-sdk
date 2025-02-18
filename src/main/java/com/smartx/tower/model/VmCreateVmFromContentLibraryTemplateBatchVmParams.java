package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.BPSUnit;
import com.smartx.tower.model.ByteUnit;
import com.smartx.tower.model.NicWhereInput;
import com.smartx.tower.model.TemplateCloudInit;
import com.smartx.tower.model.VmDiskIoRestrictType;
import com.smartx.tower.model.VmDiskOperate;
import com.smartx.tower.model.VmFirmware;
import com.smartx.tower.model.VmGpuOperationParams;
import com.smartx.tower.model.VmGuestsOperationSystem;
import com.smartx.tower.model.VmNicParams;
import com.smartx.tower.model.VmOwnerParams;
import com.smartx.tower.model.VmPlacementGroupWhereInput;
import com.smartx.tower.model.VmStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * VmCreateVmFromContentLibraryTemplateBatchVmParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VmCreateVmFromContentLibraryTemplateBatchVmParams {
  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private VmOwnerParams owner;

  public static final String SERIALIZED_NAME_GPU_DEVICES = "gpu_devices";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICES)
  private List<VmGpuOperationParams> gpuDevices = null;

  public static final String SERIALIZED_NAME_CLOUD_INIT = "cloud_init";
  @SerializedName(SERIALIZED_NAME_CLOUD_INIT)
  private TemplateCloudInit cloudInit;

  public static final String SERIALIZED_NAME_IS_FULL_COPY = "is_full_copy";
  @SerializedName(SERIALIZED_NAME_IS_FULL_COPY)
  private Boolean isFullCopy;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY = "max_bandwidth_policy";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY)
  private VmDiskIoRestrictType maxBandwidthPolicy;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_UNIT = "max_bandwidth_unit";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT)
  private BPSUnit maxBandwidthUnit;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH = "max_bandwidth";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH)
  private Long maxBandwidth;

  public static final String SERIALIZED_NAME_MAX_IOPS_POLICY = "max_iops_policy";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY)
  private VmDiskIoRestrictType maxIopsPolicy;

  public static final String SERIALIZED_NAME_MAX_IOPS = "max_iops";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS)
  private Long maxIops;

  public static final String SERIALIZED_NAME_VCPU = "vcpu";
  @SerializedName(SERIALIZED_NAME_VCPU)
  private Integer vcpu;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private VmStatus status;

  public static final String SERIALIZED_NAME_FIRMWARE = "firmware";
  @SerializedName(SERIALIZED_NAME_FIRMWARE)
  private VmFirmware firmware;

  public static final String SERIALIZED_NAME_HA = "ha";
  @SerializedName(SERIALIZED_NAME_HA)
  private Boolean ha;

  public static final String SERIALIZED_NAME_PCI_NICS = "pci_nics";
  @SerializedName(SERIALIZED_NAME_PCI_NICS)
  private NicWhereInput pciNics;

  public static final String SERIALIZED_NAME_VM_PLACEMENT_GROUP = "vm_placement_group";
  @SerializedName(SERIALIZED_NAME_VM_PLACEMENT_GROUP)
  private VmPlacementGroupWhereInput vmPlacementGroup;

  public static final String SERIALIZED_NAME_VM_NICS = "vm_nics";
  @SerializedName(SERIALIZED_NAME_VM_NICS)
  private List<VmNicParams> vmNics = null;

  public static final String SERIALIZED_NAME_DISK_OPERATE = "disk_operate";
  @SerializedName(SERIALIZED_NAME_DISK_OPERATE)
  private VmDiskOperate diskOperate;

  public static final String SERIALIZED_NAME_MEMORY_UNIT = "memory_unit";
  @SerializedName(SERIALIZED_NAME_MEMORY_UNIT)
  private ByteUnit memoryUnit;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private Long memory;

  public static final String SERIALIZED_NAME_CPU_CORES = "cpu_cores";
  @SerializedName(SERIALIZED_NAME_CPU_CORES)
  private Integer cpuCores;

  public static final String SERIALIZED_NAME_CPU_SOCKETS = "cpu_sockets";
  @SerializedName(SERIALIZED_NAME_CPU_SOCKETS)
  private Integer cpuSockets;

  public static final String SERIALIZED_NAME_GUEST_OS_TYPE = "guest_os_type";
  @SerializedName(SERIALIZED_NAME_GUEST_OS_TYPE)
  private VmGuestsOperationSystem guestOsType;

  public static final String SERIALIZED_NAME_FOLDER_ID = "folder_id";
  @SerializedName(SERIALIZED_NAME_FOLDER_ID)
  private String folderId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_HOST_ID = "host_id";
  @SerializedName(SERIALIZED_NAME_HOST_ID)
  private String hostId;

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;

  public VmCreateVmFromContentLibraryTemplateBatchVmParams() { 
  }

  public VmCreateVmFromContentLibraryTemplateBatchVmParams owner(VmOwnerParams owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmOwnerParams getOwner() {
    return owner;
  }


  public void setOwner(VmOwnerParams owner) {
    this.owner = owner;
  }


  public VmCreateVmFromContentLibraryTemplateBatchVmParams gpuDevices(List<VmGpuOperationParams> gpuDevices) {
    
    this.gpuDevices = gpuDevices;
    return this;
  }

  public VmCreateVmFromContentLibraryTemplateBatchVmParams addGpuDevicesItem(VmGpuOperationParams gpuDevicesItem) {
    if (this.gpuDevices == null) {
      this.gpuDevices = new ArrayList<VmGpuOperationParams>();
    }
    this.gpuDevices.add(gpuDevicesItem);
    return this;
  }

   /**
   * Get gpuDevices
   * @return gpuDevices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmGpuOperationParams> getGpuDevices() {
    return gpuDevices;
  }


  public void setGpuDevices(List<VmGpuOperationParams> gpuDevices) {
    this.gpuDevices = gpuDevices;
  }


  public VmCreateVmFromContentLibraryTemplateBatchVmParams cloudInit(TemplateCloudInit cloudInit) {
    
    this.cloudInit = cloudInit;
    return this;
  }

   /**
   * Get cloudInit
   * @return cloudInit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateCloudInit getCloudInit() {
    return cloudInit;
  }


  public void setCloudInit(TemplateCloudInit cloudInit) {
    this.cloudInit = cloudInit;
  }


  public VmCreateVmFromContentLibraryTemplateBatchVmParams isFullCopy(Boolean isFullCopy) {
    
    this.isFullCopy = isFullCopy;
    return this;
  }

   /**
   * Get isFullCopy
   * @return isFullCopy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsFullCopy() {
    return isFullCopy;
  }


  public void setIsFullCopy(Boolean isFullCopy) {
    this.isFullCopy = isFullCopy;
  }


  public VmCreateVmFromContentLibraryTemplateBatchVmParams maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
    
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


  public VmCreateVmFromContentLibraryTemplateBatchVmParams maxBandwidthUnit(BPSUnit maxBandwidthUnit) {
    
    this.maxBandwidthUnit = maxBandwidthUnit;
    return this;
  }

   /**
   * Get maxBandwidthUnit
   * @return maxBandwidthUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BPSUnit getMaxBandwidthUnit() {
    return maxBandwidthUnit;
  }


  public void setMaxBandwidthUnit(BPSUnit maxBandwidthUnit) {
    this.maxBandwidthUnit = maxBandwidthUnit;
  }


  public VmCreateVmFromContentLibraryTemplateBatchVmParams maxBandwidth(Long maxBandwidth) {
    
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


  public VmCreateVmFromContentLibraryTemplateBatchVmParams maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
    
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


  public VmCreateVmFromContentLibraryTemplateBatchVmParams maxIops(Long maxIops) {
    
    this.maxIops = maxIops;
    return this;
  }

   /**
   * Get maxIops
   * @return maxIops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMaxIops() {
    return maxIops;
  }


  public void setMaxIops(Long maxIops) {
    this.maxIops = maxIops;
  }


  public VmCreateVmFromContentLibraryTemplateBatchVmParams vcpu(Integer vcpu) {
    
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


  public VmCreateVmFromContentLibraryTemplateBatchVmParams status(VmStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmStatus getStatus() {
    return status;
  }


  public void setStatus(VmStatus status) {
    this.status = status;
  }


  public VmCreateVmFromContentLibraryTemplateBatchVmParams firmware(VmFirmware firmware) {
    
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


  public VmCreateVmFromContentLibraryTemplateBatchVmParams ha(Boolean ha) {
    
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


  public VmCreateVmFromContentLibraryTemplateBatchVmParams pciNics(NicWhereInput pciNics) {
    
    this.pciNics = pciNics;
    return this;
  }

   /**
   * Get pciNics
   * @return pciNics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NicWhereInput getPciNics() {
    return pciNics;
  }


  public void setPciNics(NicWhereInput pciNics) {
    this.pciNics = pciNics;
  }


  public VmCreateVmFromContentLibraryTemplateBatchVmParams vmPlacementGroup(VmPlacementGroupWhereInput vmPlacementGroup) {
    
    this.vmPlacementGroup = vmPlacementGroup;
    return this;
  }

   /**
   * Get vmPlacementGroup
   * @return vmPlacementGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmPlacementGroupWhereInput getVmPlacementGroup() {
    return vmPlacementGroup;
  }


  public void setVmPlacementGroup(VmPlacementGroupWhereInput vmPlacementGroup) {
    this.vmPlacementGroup = vmPlacementGroup;
  }


  public VmCreateVmFromContentLibraryTemplateBatchVmParams vmNics(List<VmNicParams> vmNics) {
    
    this.vmNics = vmNics;
    return this;
  }

  public VmCreateVmFromContentLibraryTemplateBatchVmParams addVmNicsItem(VmNicParams vmNicsItem) {
    if (this.vmNics == null) {
      this.vmNics = new ArrayList<VmNicParams>();
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

  public List<VmNicParams> getVmNics() {
    return vmNics;
  }


  public void setVmNics(List<VmNicParams> vmNics) {
    this.vmNics = vmNics;
  }


  public VmCreateVmFromContentLibraryTemplateBatchVmParams diskOperate(VmDiskOperate diskOperate) {
    
    this.diskOperate = diskOperate;
    return this;
  }

   /**
   * Get diskOperate
   * @return diskOperate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskOperate getDiskOperate() {
    return diskOperate;
  }


  public void setDiskOperate(VmDiskOperate diskOperate) {
    this.diskOperate = diskOperate;
  }


  public VmCreateVmFromContentLibraryTemplateBatchVmParams memoryUnit(ByteUnit memoryUnit) {
    
    this.memoryUnit = memoryUnit;
    return this;
  }

   /**
   * Get memoryUnit
   * @return memoryUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByteUnit getMemoryUnit() {
    return memoryUnit;
  }


  public void setMemoryUnit(ByteUnit memoryUnit) {
    this.memoryUnit = memoryUnit;
  }


  public VmCreateVmFromContentLibraryTemplateBatchVmParams memory(Long memory) {
    
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMemory() {
    return memory;
  }


  public void setMemory(Long memory) {
    this.memory = memory;
  }


  public VmCreateVmFromContentLibraryTemplateBatchVmParams cpuCores(Integer cpuCores) {
    
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


  public VmCreateVmFromContentLibraryTemplateBatchVmParams cpuSockets(Integer cpuSockets) {
    
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


  public VmCreateVmFromContentLibraryTemplateBatchVmParams guestOsType(VmGuestsOperationSystem guestOsType) {
    
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


  public VmCreateVmFromContentLibraryTemplateBatchVmParams folderId(String folderId) {
    
    this.folderId = folderId;
    return this;
  }

   /**
   * Get folderId
   * @return folderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFolderId() {
    return folderId;
  }


  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }


  public VmCreateVmFromContentLibraryTemplateBatchVmParams description(String description) {
    
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


  public VmCreateVmFromContentLibraryTemplateBatchVmParams name(String name) {
    
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


  public VmCreateVmFromContentLibraryTemplateBatchVmParams hostId(String hostId) {
    
    this.hostId = hostId;
    return this;
  }

   /**
   * Get hostId
   * @return hostId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostId() {
    return hostId;
  }


  public void setHostId(String hostId) {
    this.hostId = hostId;
  }


  public VmCreateVmFromContentLibraryTemplateBatchVmParams clusterId(String clusterId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmCreateVmFromContentLibraryTemplateBatchVmParams vmCreateVmFromContentLibraryTemplateBatchVmParams = (VmCreateVmFromContentLibraryTemplateBatchVmParams) o;
    return Objects.equals(this.owner, vmCreateVmFromContentLibraryTemplateBatchVmParams.owner) &&
        Objects.equals(this.gpuDevices, vmCreateVmFromContentLibraryTemplateBatchVmParams.gpuDevices) &&
        Objects.equals(this.cloudInit, vmCreateVmFromContentLibraryTemplateBatchVmParams.cloudInit) &&
        Objects.equals(this.isFullCopy, vmCreateVmFromContentLibraryTemplateBatchVmParams.isFullCopy) &&
        Objects.equals(this.maxBandwidthPolicy, vmCreateVmFromContentLibraryTemplateBatchVmParams.maxBandwidthPolicy) &&
        Objects.equals(this.maxBandwidthUnit, vmCreateVmFromContentLibraryTemplateBatchVmParams.maxBandwidthUnit) &&
        Objects.equals(this.maxBandwidth, vmCreateVmFromContentLibraryTemplateBatchVmParams.maxBandwidth) &&
        Objects.equals(this.maxIopsPolicy, vmCreateVmFromContentLibraryTemplateBatchVmParams.maxIopsPolicy) &&
        Objects.equals(this.maxIops, vmCreateVmFromContentLibraryTemplateBatchVmParams.maxIops) &&
        Objects.equals(this.vcpu, vmCreateVmFromContentLibraryTemplateBatchVmParams.vcpu) &&
        Objects.equals(this.status, vmCreateVmFromContentLibraryTemplateBatchVmParams.status) &&
        Objects.equals(this.firmware, vmCreateVmFromContentLibraryTemplateBatchVmParams.firmware) &&
        Objects.equals(this.ha, vmCreateVmFromContentLibraryTemplateBatchVmParams.ha) &&
        Objects.equals(this.pciNics, vmCreateVmFromContentLibraryTemplateBatchVmParams.pciNics) &&
        Objects.equals(this.vmPlacementGroup, vmCreateVmFromContentLibraryTemplateBatchVmParams.vmPlacementGroup) &&
        Objects.equals(this.vmNics, vmCreateVmFromContentLibraryTemplateBatchVmParams.vmNics) &&
        Objects.equals(this.diskOperate, vmCreateVmFromContentLibraryTemplateBatchVmParams.diskOperate) &&
        Objects.equals(this.memoryUnit, vmCreateVmFromContentLibraryTemplateBatchVmParams.memoryUnit) &&
        Objects.equals(this.memory, vmCreateVmFromContentLibraryTemplateBatchVmParams.memory) &&
        Objects.equals(this.cpuCores, vmCreateVmFromContentLibraryTemplateBatchVmParams.cpuCores) &&
        Objects.equals(this.cpuSockets, vmCreateVmFromContentLibraryTemplateBatchVmParams.cpuSockets) &&
        Objects.equals(this.guestOsType, vmCreateVmFromContentLibraryTemplateBatchVmParams.guestOsType) &&
        Objects.equals(this.folderId, vmCreateVmFromContentLibraryTemplateBatchVmParams.folderId) &&
        Objects.equals(this.description, vmCreateVmFromContentLibraryTemplateBatchVmParams.description) &&
        Objects.equals(this.name, vmCreateVmFromContentLibraryTemplateBatchVmParams.name) &&
        Objects.equals(this.hostId, vmCreateVmFromContentLibraryTemplateBatchVmParams.hostId) &&
        Objects.equals(this.clusterId, vmCreateVmFromContentLibraryTemplateBatchVmParams.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, gpuDevices, cloudInit, isFullCopy, maxBandwidthPolicy, maxBandwidthUnit, maxBandwidth, maxIopsPolicy, maxIops, vcpu, status, firmware, ha, pciNics, vmPlacementGroup, vmNics, diskOperate, memoryUnit, memory, cpuCores, cpuSockets, guestOsType, folderId, description, name, hostId, clusterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmCreateVmFromContentLibraryTemplateBatchVmParams {\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    gpuDevices: ").append(toIndentedString(gpuDevices)).append("\n");
    sb.append("    cloudInit: ").append(toIndentedString(cloudInit)).append("\n");
    sb.append("    isFullCopy: ").append(toIndentedString(isFullCopy)).append("\n");
    sb.append("    maxBandwidthPolicy: ").append(toIndentedString(maxBandwidthPolicy)).append("\n");
    sb.append("    maxBandwidthUnit: ").append(toIndentedString(maxBandwidthUnit)).append("\n");
    sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
    sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
    sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
    sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
    sb.append("    pciNics: ").append(toIndentedString(pciNics)).append("\n");
    sb.append("    vmPlacementGroup: ").append(toIndentedString(vmPlacementGroup)).append("\n");
    sb.append("    vmNics: ").append(toIndentedString(vmNics)).append("\n");
    sb.append("    diskOperate: ").append(toIndentedString(diskOperate)).append("\n");
    sb.append("    memoryUnit: ").append(toIndentedString(memoryUnit)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
    sb.append("    cpuSockets: ").append(toIndentedString(cpuSockets)).append("\n");
    sb.append("    guestOsType: ").append(toIndentedString(guestOsType)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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

