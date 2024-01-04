package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.NestedCluster;
import com.smartx.tower.model.NestedCpu;
import com.smartx.tower.model.NestedGpuDevice;
import com.smartx.tower.model.NestedHost;
import com.smartx.tower.model.NestedIsolationPolicy;
import com.smartx.tower.model.NestedLabel;
import com.smartx.tower.model.NestedNic;
import com.smartx.tower.model.NestedSnapshotPlan;
import com.smartx.tower.model.NestedUsbDevice;
import com.smartx.tower.model.NestedVmDisk;
import com.smartx.tower.model.NestedVmEntityFilterResult;
import com.smartx.tower.model.NestedVmFolder;
import com.smartx.tower.model.NestedVmNic;
import com.smartx.tower.model.NestedVmPlacementGroup;
import com.smartx.tower.model.NestedVmSnapshot;
import com.smartx.tower.model.VmClockOffset;
import com.smartx.tower.model.VmDiskIoPolicy;
import com.smartx.tower.model.VmDiskIoRestrictType;
import com.smartx.tower.model.VmFirmware;
import com.smartx.tower.model.VmGuestsOperationSystem;
import com.smartx.tower.model.VmStatus;
import com.smartx.tower.model.VmToolsStatus;
import com.smartx.tower.model.VmUsage;
import com.smartx.tower.model.VmVideoType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * GpuVmDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class GpuVmDetail {
  public static final String SERIALIZED_NAME_VGPU_INSTANCE_ON_VM_NUM = "vgpu_instance_on_vm_num";
  @SerializedName(SERIALIZED_NAME_VGPU_INSTANCE_ON_VM_NUM)
  private Integer vgpuInstanceOnVmNum;

  public static final String SERIALIZED_NAME_WIN_OPT = "win_opt";
  @SerializedName(SERIALIZED_NAME_WIN_OPT)
  private Boolean winOpt;

  public static final String SERIALIZED_NAME_VM_USAGE = "vm_usage";
  @SerializedName(SERIALIZED_NAME_VM_USAGE)
  private VmUsage vmUsage;

  public static final String SERIALIZED_NAME_VM_TOOLS_VERSION = "vm_tools_version";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_VERSION)
  private String vmToolsVersion;

  public static final String SERIALIZED_NAME_VM_TOOLS_STATUS = "vm_tools_status";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_STATUS)
  private VmToolsStatus vmToolsStatus;

  public static final String SERIALIZED_NAME_VM_PLACEMENT_GROUP = "vm_placement_group";
  @SerializedName(SERIALIZED_NAME_VM_PLACEMENT_GROUP)
  private List<NestedVmPlacementGroup> vmPlacementGroup = null;

  public static final String SERIALIZED_NAME_VM_NICS = "vm_nics";
  @SerializedName(SERIALIZED_NAME_VM_NICS)
  private List<NestedVmNic> vmNics = null;

  public static final String SERIALIZED_NAME_VM_DISKS = "vm_disks";
  @SerializedName(SERIALIZED_NAME_VM_DISKS)
  private List<NestedVmDisk> vmDisks = null;

  public static final String SERIALIZED_NAME_VIDEO_TYPE = "video_type";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE)
  private VmVideoType videoType;

  public static final String SERIALIZED_NAME_VCPU = "vcpu";
  @SerializedName(SERIALIZED_NAME_VCPU)
  private Integer vcpu;

  public static final String SERIALIZED_NAME_USB_DEVICES = "usb_devices";
  @SerializedName(SERIALIZED_NAME_USB_DEVICES)
  private List<NestedUsbDevice> usbDevices = null;

  public static final String SERIALIZED_NAME_UNIQUE_SIZE = "unique_size";
  @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
  private Long uniqueSize;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private VmStatus status;

  public static final String SERIALIZED_NAME_SNAPSHOTS = "snapshots";
  @SerializedName(SERIALIZED_NAME_SNAPSHOTS)
  private List<NestedVmSnapshot> snapshots = null;

  public static final String SERIALIZED_NAME_SNAPSHOT_PLAN = "snapshot_plan";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_PLAN)
  private NestedSnapshotPlan snapshotPlan;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_PROVISIONED_SIZE = "provisioned_size";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_SIZE)
  private Long provisionedSize;

  public static final String SERIALIZED_NAME_PROTECTED = "protected";
  @SerializedName(SERIALIZED_NAME_PROTECTED)
  private Boolean _protected;

  public static final String SERIALIZED_NAME_PCI_NICS = "pci_nics";
  @SerializedName(SERIALIZED_NAME_PCI_NICS)
  private List<NestedNic> pciNics = null;

  public static final String SERIALIZED_NAME_OUT_UNINSTALL_USB = "out_uninstall_usb";
  @SerializedName(SERIALIZED_NAME_OUT_UNINSTALL_USB)
  private List<String> outUninstallUsb = new ArrayList<String>();

  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private String os;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME = "original_name";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME)
  private String originalName;

  public static final String SERIALIZED_NAME_NODE_IP = "node_ip";
  @SerializedName(SERIALIZED_NAME_NODE_IP)
  private String nodeIp;

  public static final String SERIALIZED_NAME_NESTED_VIRTUALIZATION = "nested_virtualization";
  @SerializedName(SERIALIZED_NAME_NESTED_VIRTUALIZATION)
  private Boolean nestedVirtualization;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MEMORY_USAGE = "memory_usage";
  @SerializedName(SERIALIZED_NAME_MEMORY_USAGE)
  private Double memoryUsage;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private Long memory;

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
  private Long maxBandwidth;

  public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES = "logical_size_bytes";
  @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES)
  private Long logicalSizeBytes;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
  private String localCreatedAt;

  public static final String SERIALIZED_NAME_LAST_SHUTDOWN_TIME = "last_shutdown_time";
  @SerializedName(SERIALIZED_NAME_LAST_SHUTDOWN_TIME)
  private String lastShutdownTime;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<NestedLabel> labels = null;

  public static final String SERIALIZED_NAME_KERNEL_INFO = "kernel_info";
  @SerializedName(SERIALIZED_NAME_KERNEL_INFO)
  private String kernelInfo;

  public static final String SERIALIZED_NAME_ISOLATION_POLICY = "isolation_policy";
  @SerializedName(SERIALIZED_NAME_ISOLATION_POLICY)
  private NestedIsolationPolicy isolationPolicy;

  public static final String SERIALIZED_NAME_IPS = "ips";
  @SerializedName(SERIALIZED_NAME_IPS)
  private String ips;

  public static final String SERIALIZED_NAME_IO_POLICY = "io_policy";
  @SerializedName(SERIALIZED_NAME_IO_POLICY)
  private VmDiskIoPolicy ioPolicy;

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_IN_RECYCLE_BIN = "in_recycle_bin";
  @SerializedName(SERIALIZED_NAME_IN_RECYCLE_BIN)
  private Boolean inRecycleBin;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private NestedHost host;

  public static final String SERIALIZED_NAME_HA = "ha";
  @SerializedName(SERIALIZED_NAME_HA)
  private Boolean ha;

  public static final String SERIALIZED_NAME_GUEST_USED_SIZE = "guest_used_size";
  @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE)
  private Long guestUsedSize;

  public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE = "guest_size_usage";
  @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE)
  private Double guestSizeUsage;

  public static final String SERIALIZED_NAME_GUEST_OS_TYPE = "guest_os_type";
  @SerializedName(SERIALIZED_NAME_GUEST_OS_TYPE)
  private VmGuestsOperationSystem guestOsType;

  public static final String SERIALIZED_NAME_GUEST_CPU_MODEL = "guest_cpu_model";
  @SerializedName(SERIALIZED_NAME_GUEST_CPU_MODEL)
  private String guestCpuModel;

  public static final String SERIALIZED_NAME_GPU_DEVICES = "gpu_devices";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICES)
  private List<NestedGpuDevice> gpuDevices = null;

  public static final String SERIALIZED_NAME_FOLDER = "folder";
  @SerializedName(SERIALIZED_NAME_FOLDER)
  private NestedVmFolder folder;

  public static final String SERIALIZED_NAME_FIRMWARE = "firmware";
  @SerializedName(SERIALIZED_NAME_FIRMWARE)
  private VmFirmware firmware;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_ENTITY_FILTER_RESULTS = "entity_filter_results";
  @SerializedName(SERIALIZED_NAME_ENTITY_FILTER_RESULTS)
  private List<NestedVmEntityFilterResult> entityFilterResults = null;

  public static final String SERIALIZED_NAME_DNS_SERVERS = "dns_servers";
  @SerializedName(SERIALIZED_NAME_DNS_SERVERS)
  private String dnsServers;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DELETED_AT = "deleted_at";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private String deletedAt;

  public static final String SERIALIZED_NAME_CPU_USAGE = "cpu_usage";
  @SerializedName(SERIALIZED_NAME_CPU_USAGE)
  private Double cpuUsage;

  public static final String SERIALIZED_NAME_CPU_MODEL = "cpu_model";
  @SerializedName(SERIALIZED_NAME_CPU_MODEL)
  private String cpuModel;

  public static final String SERIALIZED_NAME_CPU = "cpu";
  @SerializedName(SERIALIZED_NAME_CPU)
  private NestedCpu cpu;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private NestedCluster cluster;

  public static final String SERIALIZED_NAME_CLOUD_INIT_SUPPORTED = "cloud_init_supported";
  @SerializedName(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED)
  private Boolean cloudInitSupported;

  public static final String SERIALIZED_NAME_CLOCK_OFFSET = "clock_offset";
  @SerializedName(SERIALIZED_NAME_CLOCK_OFFSET)
  private VmClockOffset clockOffset;

  public GpuVmDetail() { 
  }

  public GpuVmDetail vgpuInstanceOnVmNum(Integer vgpuInstanceOnVmNum) {
    
    this.vgpuInstanceOnVmNum = vgpuInstanceOnVmNum;
    return this;
  }

   /**
   * Get vgpuInstanceOnVmNum
   * @return vgpuInstanceOnVmNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVgpuInstanceOnVmNum() {
    return vgpuInstanceOnVmNum;
  }


  public void setVgpuInstanceOnVmNum(Integer vgpuInstanceOnVmNum) {
    this.vgpuInstanceOnVmNum = vgpuInstanceOnVmNum;
  }


  public GpuVmDetail winOpt(Boolean winOpt) {
    
    this.winOpt = winOpt;
    return this;
  }

   /**
   * Get winOpt
   * @return winOpt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getWinOpt() {
    return winOpt;
  }


  public void setWinOpt(Boolean winOpt) {
    this.winOpt = winOpt;
  }


  public GpuVmDetail vmUsage(VmUsage vmUsage) {
    
    this.vmUsage = vmUsage;
    return this;
  }

   /**
   * Get vmUsage
   * @return vmUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmUsage getVmUsage() {
    return vmUsage;
  }


  public void setVmUsage(VmUsage vmUsage) {
    this.vmUsage = vmUsage;
  }


  public GpuVmDetail vmToolsVersion(String vmToolsVersion) {
    
    this.vmToolsVersion = vmToolsVersion;
    return this;
  }

   /**
   * Get vmToolsVersion
   * @return vmToolsVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmToolsVersion() {
    return vmToolsVersion;
  }


  public void setVmToolsVersion(String vmToolsVersion) {
    this.vmToolsVersion = vmToolsVersion;
  }


  public GpuVmDetail vmToolsStatus(VmToolsStatus vmToolsStatus) {
    
    this.vmToolsStatus = vmToolsStatus;
    return this;
  }

   /**
   * Get vmToolsStatus
   * @return vmToolsStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmToolsStatus getVmToolsStatus() {
    return vmToolsStatus;
  }


  public void setVmToolsStatus(VmToolsStatus vmToolsStatus) {
    this.vmToolsStatus = vmToolsStatus;
  }


  public GpuVmDetail vmPlacementGroup(List<NestedVmPlacementGroup> vmPlacementGroup) {
    
    this.vmPlacementGroup = vmPlacementGroup;
    return this;
  }

  public GpuVmDetail addVmPlacementGroupItem(NestedVmPlacementGroup vmPlacementGroupItem) {
    if (this.vmPlacementGroup == null) {
      this.vmPlacementGroup = new ArrayList<NestedVmPlacementGroup>();
    }
    this.vmPlacementGroup.add(vmPlacementGroupItem);
    return this;
  }

   /**
   * Get vmPlacementGroup
   * @return vmPlacementGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVmPlacementGroup> getVmPlacementGroup() {
    return vmPlacementGroup;
  }


  public void setVmPlacementGroup(List<NestedVmPlacementGroup> vmPlacementGroup) {
    this.vmPlacementGroup = vmPlacementGroup;
  }


  public GpuVmDetail vmNics(List<NestedVmNic> vmNics) {
    
    this.vmNics = vmNics;
    return this;
  }

  public GpuVmDetail addVmNicsItem(NestedVmNic vmNicsItem) {
    if (this.vmNics == null) {
      this.vmNics = new ArrayList<NestedVmNic>();
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

  public List<NestedVmNic> getVmNics() {
    return vmNics;
  }


  public void setVmNics(List<NestedVmNic> vmNics) {
    this.vmNics = vmNics;
  }


  public GpuVmDetail vmDisks(List<NestedVmDisk> vmDisks) {
    
    this.vmDisks = vmDisks;
    return this;
  }

  public GpuVmDetail addVmDisksItem(NestedVmDisk vmDisksItem) {
    if (this.vmDisks == null) {
      this.vmDisks = new ArrayList<NestedVmDisk>();
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

  public List<NestedVmDisk> getVmDisks() {
    return vmDisks;
  }


  public void setVmDisks(List<NestedVmDisk> vmDisks) {
    this.vmDisks = vmDisks;
  }


  public GpuVmDetail videoType(VmVideoType videoType) {
    
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


  public GpuVmDetail vcpu(Integer vcpu) {
    
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


  public GpuVmDetail usbDevices(List<NestedUsbDevice> usbDevices) {
    
    this.usbDevices = usbDevices;
    return this;
  }

  public GpuVmDetail addUsbDevicesItem(NestedUsbDevice usbDevicesItem) {
    if (this.usbDevices == null) {
      this.usbDevices = new ArrayList<NestedUsbDevice>();
    }
    this.usbDevices.add(usbDevicesItem);
    return this;
  }

   /**
   * Get usbDevices
   * @return usbDevices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedUsbDevice> getUsbDevices() {
    return usbDevices;
  }


  public void setUsbDevices(List<NestedUsbDevice> usbDevices) {
    this.usbDevices = usbDevices;
  }


  public GpuVmDetail uniqueSize(Long uniqueSize) {
    
    this.uniqueSize = uniqueSize;
    return this;
  }

   /**
   * Get uniqueSize
   * @return uniqueSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUniqueSize() {
    return uniqueSize;
  }


  public void setUniqueSize(Long uniqueSize) {
    this.uniqueSize = uniqueSize;
  }


  public GpuVmDetail status(VmStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmStatus getStatus() {
    return status;
  }


  public void setStatus(VmStatus status) {
    this.status = status;
  }


  public GpuVmDetail snapshots(List<NestedVmSnapshot> snapshots) {
    
    this.snapshots = snapshots;
    return this;
  }

  public GpuVmDetail addSnapshotsItem(NestedVmSnapshot snapshotsItem) {
    if (this.snapshots == null) {
      this.snapshots = new ArrayList<NestedVmSnapshot>();
    }
    this.snapshots.add(snapshotsItem);
    return this;
  }

   /**
   * Get snapshots
   * @return snapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVmSnapshot> getSnapshots() {
    return snapshots;
  }


  public void setSnapshots(List<NestedVmSnapshot> snapshots) {
    this.snapshots = snapshots;
  }


  public GpuVmDetail snapshotPlan(NestedSnapshotPlan snapshotPlan) {
    
    this.snapshotPlan = snapshotPlan;
    return this;
  }

   /**
   * Get snapshotPlan
   * @return snapshotPlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedSnapshotPlan getSnapshotPlan() {
    return snapshotPlan;
  }


  public void setSnapshotPlan(NestedSnapshotPlan snapshotPlan) {
    this.snapshotPlan = snapshotPlan;
  }


  public GpuVmDetail size(Long size) {
    
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


  public GpuVmDetail provisionedSize(Long provisionedSize) {
    
    this.provisionedSize = provisionedSize;
    return this;
  }

   /**
   * Get provisionedSize
   * @return provisionedSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProvisionedSize() {
    return provisionedSize;
  }


  public void setProvisionedSize(Long provisionedSize) {
    this.provisionedSize = provisionedSize;
  }


  public GpuVmDetail _protected(Boolean _protected) {
    
    this._protected = _protected;
    return this;
  }

   /**
   * Get _protected
   * @return _protected
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getProtected() {
    return _protected;
  }


  public void setProtected(Boolean _protected) {
    this._protected = _protected;
  }


  public GpuVmDetail pciNics(List<NestedNic> pciNics) {
    
    this.pciNics = pciNics;
    return this;
  }

  public GpuVmDetail addPciNicsItem(NestedNic pciNicsItem) {
    if (this.pciNics == null) {
      this.pciNics = new ArrayList<NestedNic>();
    }
    this.pciNics.add(pciNicsItem);
    return this;
  }

   /**
   * Get pciNics
   * @return pciNics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedNic> getPciNics() {
    return pciNics;
  }


  public void setPciNics(List<NestedNic> pciNics) {
    this.pciNics = pciNics;
  }


  public GpuVmDetail outUninstallUsb(List<String> outUninstallUsb) {
    
    this.outUninstallUsb = outUninstallUsb;
    return this;
  }

  public GpuVmDetail addOutUninstallUsbItem(String outUninstallUsbItem) {
    this.outUninstallUsb.add(outUninstallUsbItem);
    return this;
  }

   /**
   * Get outUninstallUsb
   * @return outUninstallUsb
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getOutUninstallUsb() {
    return outUninstallUsb;
  }


  public void setOutUninstallUsb(List<String> outUninstallUsb) {
    this.outUninstallUsb = outUninstallUsb;
  }


  public GpuVmDetail os(String os) {
    
    this.os = os;
    return this;
  }

   /**
   * Get os
   * @return os
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOs() {
    return os;
  }


  public void setOs(String os) {
    this.os = os;
  }


  public GpuVmDetail originalName(String originalName) {
    
    this.originalName = originalName;
    return this;
  }

   /**
   * Get originalName
   * @return originalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOriginalName() {
    return originalName;
  }


  public void setOriginalName(String originalName) {
    this.originalName = originalName;
  }


  public GpuVmDetail nodeIp(String nodeIp) {
    
    this.nodeIp = nodeIp;
    return this;
  }

   /**
   * Get nodeIp
   * @return nodeIp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNodeIp() {
    return nodeIp;
  }


  public void setNodeIp(String nodeIp) {
    this.nodeIp = nodeIp;
  }


  public GpuVmDetail nestedVirtualization(Boolean nestedVirtualization) {
    
    this.nestedVirtualization = nestedVirtualization;
    return this;
  }

   /**
   * Get nestedVirtualization
   * @return nestedVirtualization
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getNestedVirtualization() {
    return nestedVirtualization;
  }


  public void setNestedVirtualization(Boolean nestedVirtualization) {
    this.nestedVirtualization = nestedVirtualization;
  }


  public GpuVmDetail name(String name) {
    
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


  public GpuVmDetail memoryUsage(Double memoryUsage) {
    
    this.memoryUsage = memoryUsage;
    return this;
  }

   /**
   * Get memoryUsage
   * @return memoryUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMemoryUsage() {
    return memoryUsage;
  }


  public void setMemoryUsage(Double memoryUsage) {
    this.memoryUsage = memoryUsage;
  }


  public GpuVmDetail memory(Long memory) {
    
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


  public GpuVmDetail maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
    
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


  public GpuVmDetail maxIops(Integer maxIops) {
    
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


  public GpuVmDetail maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
    
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


  public GpuVmDetail maxBandwidth(Long maxBandwidth) {
    
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


  public GpuVmDetail logicalSizeBytes(Long logicalSizeBytes) {
    
    this.logicalSizeBytes = logicalSizeBytes;
    return this;
  }

   /**
   * Get logicalSizeBytes
   * @return logicalSizeBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLogicalSizeBytes() {
    return logicalSizeBytes;
  }


  public void setLogicalSizeBytes(Long logicalSizeBytes) {
    this.logicalSizeBytes = logicalSizeBytes;
  }


  public GpuVmDetail localId(String localId) {
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public GpuVmDetail localCreatedAt(String localCreatedAt) {
    
    this.localCreatedAt = localCreatedAt;
    return this;
  }

   /**
   * Get localCreatedAt
   * @return localCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAt() {
    return localCreatedAt;
  }


  public void setLocalCreatedAt(String localCreatedAt) {
    this.localCreatedAt = localCreatedAt;
  }


  public GpuVmDetail lastShutdownTime(String lastShutdownTime) {
    
    this.lastShutdownTime = lastShutdownTime;
    return this;
  }

   /**
   * Get lastShutdownTime
   * @return lastShutdownTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastShutdownTime() {
    return lastShutdownTime;
  }


  public void setLastShutdownTime(String lastShutdownTime) {
    this.lastShutdownTime = lastShutdownTime;
  }


  public GpuVmDetail labels(List<NestedLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public GpuVmDetail addLabelsItem(NestedLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<NestedLabel>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedLabel> getLabels() {
    return labels;
  }


  public void setLabels(List<NestedLabel> labels) {
    this.labels = labels;
  }


  public GpuVmDetail kernelInfo(String kernelInfo) {
    
    this.kernelInfo = kernelInfo;
    return this;
  }

   /**
   * Get kernelInfo
   * @return kernelInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKernelInfo() {
    return kernelInfo;
  }


  public void setKernelInfo(String kernelInfo) {
    this.kernelInfo = kernelInfo;
  }


  public GpuVmDetail isolationPolicy(NestedIsolationPolicy isolationPolicy) {
    
    this.isolationPolicy = isolationPolicy;
    return this;
  }

   /**
   * Get isolationPolicy
   * @return isolationPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedIsolationPolicy getIsolationPolicy() {
    return isolationPolicy;
  }


  public void setIsolationPolicy(NestedIsolationPolicy isolationPolicy) {
    this.isolationPolicy = isolationPolicy;
  }


  public GpuVmDetail ips(String ips) {
    
    this.ips = ips;
    return this;
  }

   /**
   * Get ips
   * @return ips
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIps() {
    return ips;
  }


  public void setIps(String ips) {
    this.ips = ips;
  }


  public GpuVmDetail ioPolicy(VmDiskIoPolicy ioPolicy) {
    
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


  public GpuVmDetail internal(Boolean internal) {
    
    this.internal = internal;
    return this;
  }

   /**
   * Get internal
   * @return internal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getInternal() {
    return internal;
  }


  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  public GpuVmDetail inRecycleBin(Boolean inRecycleBin) {
    
    this.inRecycleBin = inRecycleBin;
    return this;
  }

   /**
   * Get inRecycleBin
   * @return inRecycleBin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getInRecycleBin() {
    return inRecycleBin;
  }


  public void setInRecycleBin(Boolean inRecycleBin) {
    this.inRecycleBin = inRecycleBin;
  }


  public GpuVmDetail id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public GpuVmDetail hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public GpuVmDetail host(NestedHost host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedHost getHost() {
    return host;
  }


  public void setHost(NestedHost host) {
    this.host = host;
  }


  public GpuVmDetail ha(Boolean ha) {
    
    this.ha = ha;
    return this;
  }

   /**
   * Get ha
   * @return ha
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getHa() {
    return ha;
  }


  public void setHa(Boolean ha) {
    this.ha = ha;
  }


  public GpuVmDetail guestUsedSize(Long guestUsedSize) {
    
    this.guestUsedSize = guestUsedSize;
    return this;
  }

   /**
   * Get guestUsedSize
   * @return guestUsedSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGuestUsedSize() {
    return guestUsedSize;
  }


  public void setGuestUsedSize(Long guestUsedSize) {
    this.guestUsedSize = guestUsedSize;
  }


  public GpuVmDetail guestSizeUsage(Double guestSizeUsage) {
    
    this.guestSizeUsage = guestSizeUsage;
    return this;
  }

   /**
   * Get guestSizeUsage
   * @return guestSizeUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getGuestSizeUsage() {
    return guestSizeUsage;
  }


  public void setGuestSizeUsage(Double guestSizeUsage) {
    this.guestSizeUsage = guestSizeUsage;
  }


  public GpuVmDetail guestOsType(VmGuestsOperationSystem guestOsType) {
    
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


  public GpuVmDetail guestCpuModel(String guestCpuModel) {
    
    this.guestCpuModel = guestCpuModel;
    return this;
  }

   /**
   * Get guestCpuModel
   * @return guestCpuModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGuestCpuModel() {
    return guestCpuModel;
  }


  public void setGuestCpuModel(String guestCpuModel) {
    this.guestCpuModel = guestCpuModel;
  }


  public GpuVmDetail gpuDevices(List<NestedGpuDevice> gpuDevices) {
    
    this.gpuDevices = gpuDevices;
    return this;
  }

  public GpuVmDetail addGpuDevicesItem(NestedGpuDevice gpuDevicesItem) {
    if (this.gpuDevices == null) {
      this.gpuDevices = new ArrayList<NestedGpuDevice>();
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

  public List<NestedGpuDevice> getGpuDevices() {
    return gpuDevices;
  }


  public void setGpuDevices(List<NestedGpuDevice> gpuDevices) {
    this.gpuDevices = gpuDevices;
  }


  public GpuVmDetail folder(NestedVmFolder folder) {
    
    this.folder = folder;
    return this;
  }

   /**
   * Get folder
   * @return folder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedVmFolder getFolder() {
    return folder;
  }


  public void setFolder(NestedVmFolder folder) {
    this.folder = folder;
  }


  public GpuVmDetail firmware(VmFirmware firmware) {
    
    this.firmware = firmware;
    return this;
  }

   /**
   * Get firmware
   * @return firmware
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmFirmware getFirmware() {
    return firmware;
  }


  public void setFirmware(VmFirmware firmware) {
    this.firmware = firmware;
  }


  public GpuVmDetail entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
    this.entityAsyncStatus = entityAsyncStatus;
    return this;
  }

   /**
   * Get entityAsyncStatus
   * @return entityAsyncStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityAsyncStatus getEntityAsyncStatus() {
    return entityAsyncStatus;
  }


  public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    this.entityAsyncStatus = entityAsyncStatus;
  }


  public GpuVmDetail entityFilterResults(List<NestedVmEntityFilterResult> entityFilterResults) {
    
    this.entityFilterResults = entityFilterResults;
    return this;
  }

  public GpuVmDetail addEntityFilterResultsItem(NestedVmEntityFilterResult entityFilterResultsItem) {
    if (this.entityFilterResults == null) {
      this.entityFilterResults = new ArrayList<NestedVmEntityFilterResult>();
    }
    this.entityFilterResults.add(entityFilterResultsItem);
    return this;
  }

   /**
   * Get entityFilterResults
   * @return entityFilterResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVmEntityFilterResult> getEntityFilterResults() {
    return entityFilterResults;
  }


  public void setEntityFilterResults(List<NestedVmEntityFilterResult> entityFilterResults) {
    this.entityFilterResults = entityFilterResults;
  }


  public GpuVmDetail dnsServers(String dnsServers) {
    
    this.dnsServers = dnsServers;
    return this;
  }

   /**
   * Get dnsServers
   * @return dnsServers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDnsServers() {
    return dnsServers;
  }


  public void setDnsServers(String dnsServers) {
    this.dnsServers = dnsServers;
  }


  public GpuVmDetail description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GpuVmDetail deletedAt(String deletedAt) {
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeletedAt() {
    return deletedAt;
  }


  public void setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
  }


  public GpuVmDetail cpuUsage(Double cpuUsage) {
    
    this.cpuUsage = cpuUsage;
    return this;
  }

   /**
   * Get cpuUsage
   * @return cpuUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getCpuUsage() {
    return cpuUsage;
  }


  public void setCpuUsage(Double cpuUsage) {
    this.cpuUsage = cpuUsage;
  }


  public GpuVmDetail cpuModel(String cpuModel) {
    
    this.cpuModel = cpuModel;
    return this;
  }

   /**
   * Get cpuModel
   * @return cpuModel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCpuModel() {
    return cpuModel;
  }


  public void setCpuModel(String cpuModel) {
    this.cpuModel = cpuModel;
  }


  public GpuVmDetail cpu(NestedCpu cpu) {
    
    this.cpu = cpu;
    return this;
  }

   /**
   * Get cpu
   * @return cpu
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedCpu getCpu() {
    return cpu;
  }


  public void setCpu(NestedCpu cpu) {
    this.cpu = cpu;
  }


  public GpuVmDetail cluster(NestedCluster cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedCluster getCluster() {
    return cluster;
  }


  public void setCluster(NestedCluster cluster) {
    this.cluster = cluster;
  }


  public GpuVmDetail cloudInitSupported(Boolean cloudInitSupported) {
    
    this.cloudInitSupported = cloudInitSupported;
    return this;
  }

   /**
   * Get cloudInitSupported
   * @return cloudInitSupported
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCloudInitSupported() {
    return cloudInitSupported;
  }


  public void setCloudInitSupported(Boolean cloudInitSupported) {
    this.cloudInitSupported = cloudInitSupported;
  }


  public GpuVmDetail clockOffset(VmClockOffset clockOffset) {
    
    this.clockOffset = clockOffset;
    return this;
  }

   /**
   * Get clockOffset
   * @return clockOffset
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmClockOffset getClockOffset() {
    return clockOffset;
  }


  public void setClockOffset(VmClockOffset clockOffset) {
    this.clockOffset = clockOffset;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GpuVmDetail gpuVmDetail = (GpuVmDetail) o;
    return Objects.equals(this.vgpuInstanceOnVmNum, gpuVmDetail.vgpuInstanceOnVmNum) &&
        Objects.equals(this.winOpt, gpuVmDetail.winOpt) &&
        Objects.equals(this.vmUsage, gpuVmDetail.vmUsage) &&
        Objects.equals(this.vmToolsVersion, gpuVmDetail.vmToolsVersion) &&
        Objects.equals(this.vmToolsStatus, gpuVmDetail.vmToolsStatus) &&
        Objects.equals(this.vmPlacementGroup, gpuVmDetail.vmPlacementGroup) &&
        Objects.equals(this.vmNics, gpuVmDetail.vmNics) &&
        Objects.equals(this.vmDisks, gpuVmDetail.vmDisks) &&
        Objects.equals(this.videoType, gpuVmDetail.videoType) &&
        Objects.equals(this.vcpu, gpuVmDetail.vcpu) &&
        Objects.equals(this.usbDevices, gpuVmDetail.usbDevices) &&
        Objects.equals(this.uniqueSize, gpuVmDetail.uniqueSize) &&
        Objects.equals(this.status, gpuVmDetail.status) &&
        Objects.equals(this.snapshots, gpuVmDetail.snapshots) &&
        Objects.equals(this.snapshotPlan, gpuVmDetail.snapshotPlan) &&
        Objects.equals(this.size, gpuVmDetail.size) &&
        Objects.equals(this.provisionedSize, gpuVmDetail.provisionedSize) &&
        Objects.equals(this._protected, gpuVmDetail._protected) &&
        Objects.equals(this.pciNics, gpuVmDetail.pciNics) &&
        Objects.equals(this.outUninstallUsb, gpuVmDetail.outUninstallUsb) &&
        Objects.equals(this.os, gpuVmDetail.os) &&
        Objects.equals(this.originalName, gpuVmDetail.originalName) &&
        Objects.equals(this.nodeIp, gpuVmDetail.nodeIp) &&
        Objects.equals(this.nestedVirtualization, gpuVmDetail.nestedVirtualization) &&
        Objects.equals(this.name, gpuVmDetail.name) &&
        Objects.equals(this.memoryUsage, gpuVmDetail.memoryUsage) &&
        Objects.equals(this.memory, gpuVmDetail.memory) &&
        Objects.equals(this.maxIopsPolicy, gpuVmDetail.maxIopsPolicy) &&
        Objects.equals(this.maxIops, gpuVmDetail.maxIops) &&
        Objects.equals(this.maxBandwidthPolicy, gpuVmDetail.maxBandwidthPolicy) &&
        Objects.equals(this.maxBandwidth, gpuVmDetail.maxBandwidth) &&
        Objects.equals(this.logicalSizeBytes, gpuVmDetail.logicalSizeBytes) &&
        Objects.equals(this.localId, gpuVmDetail.localId) &&
        Objects.equals(this.localCreatedAt, gpuVmDetail.localCreatedAt) &&
        Objects.equals(this.lastShutdownTime, gpuVmDetail.lastShutdownTime) &&
        Objects.equals(this.labels, gpuVmDetail.labels) &&
        Objects.equals(this.kernelInfo, gpuVmDetail.kernelInfo) &&
        Objects.equals(this.isolationPolicy, gpuVmDetail.isolationPolicy) &&
        Objects.equals(this.ips, gpuVmDetail.ips) &&
        Objects.equals(this.ioPolicy, gpuVmDetail.ioPolicy) &&
        Objects.equals(this.internal, gpuVmDetail.internal) &&
        Objects.equals(this.inRecycleBin, gpuVmDetail.inRecycleBin) &&
        Objects.equals(this.id, gpuVmDetail.id) &&
        Objects.equals(this.hostname, gpuVmDetail.hostname) &&
        Objects.equals(this.host, gpuVmDetail.host) &&
        Objects.equals(this.ha, gpuVmDetail.ha) &&
        Objects.equals(this.guestUsedSize, gpuVmDetail.guestUsedSize) &&
        Objects.equals(this.guestSizeUsage, gpuVmDetail.guestSizeUsage) &&
        Objects.equals(this.guestOsType, gpuVmDetail.guestOsType) &&
        Objects.equals(this.guestCpuModel, gpuVmDetail.guestCpuModel) &&
        Objects.equals(this.gpuDevices, gpuVmDetail.gpuDevices) &&
        Objects.equals(this.folder, gpuVmDetail.folder) &&
        Objects.equals(this.firmware, gpuVmDetail.firmware) &&
        Objects.equals(this.entityAsyncStatus, gpuVmDetail.entityAsyncStatus) &&
        Objects.equals(this.entityFilterResults, gpuVmDetail.entityFilterResults) &&
        Objects.equals(this.dnsServers, gpuVmDetail.dnsServers) &&
        Objects.equals(this.description, gpuVmDetail.description) &&
        Objects.equals(this.deletedAt, gpuVmDetail.deletedAt) &&
        Objects.equals(this.cpuUsage, gpuVmDetail.cpuUsage) &&
        Objects.equals(this.cpuModel, gpuVmDetail.cpuModel) &&
        Objects.equals(this.cpu, gpuVmDetail.cpu) &&
        Objects.equals(this.cluster, gpuVmDetail.cluster) &&
        Objects.equals(this.cloudInitSupported, gpuVmDetail.cloudInitSupported) &&
        Objects.equals(this.clockOffset, gpuVmDetail.clockOffset);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(vgpuInstanceOnVmNum, winOpt, vmUsage, vmToolsVersion, vmToolsStatus, vmPlacementGroup, vmNics, vmDisks, videoType, vcpu, usbDevices, uniqueSize, status, snapshots, snapshotPlan, size, provisionedSize, _protected, pciNics, outUninstallUsb, os, originalName, nodeIp, nestedVirtualization, name, memoryUsage, memory, maxIopsPolicy, maxIops, maxBandwidthPolicy, maxBandwidth, logicalSizeBytes, localId, localCreatedAt, lastShutdownTime, labels, kernelInfo, isolationPolicy, ips, ioPolicy, internal, inRecycleBin, id, hostname, host, ha, guestUsedSize, guestSizeUsage, guestOsType, guestCpuModel, gpuDevices, folder, firmware, entityAsyncStatus, entityFilterResults, dnsServers, description, deletedAt, cpuUsage, cpuModel, cpu, cluster, cloudInitSupported, clockOffset);
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
    sb.append("class GpuVmDetail {\n");
    sb.append("    vgpuInstanceOnVmNum: ").append(toIndentedString(vgpuInstanceOnVmNum)).append("\n");
    sb.append("    winOpt: ").append(toIndentedString(winOpt)).append("\n");
    sb.append("    vmUsage: ").append(toIndentedString(vmUsage)).append("\n");
    sb.append("    vmToolsVersion: ").append(toIndentedString(vmToolsVersion)).append("\n");
    sb.append("    vmToolsStatus: ").append(toIndentedString(vmToolsStatus)).append("\n");
    sb.append("    vmPlacementGroup: ").append(toIndentedString(vmPlacementGroup)).append("\n");
    sb.append("    vmNics: ").append(toIndentedString(vmNics)).append("\n");
    sb.append("    vmDisks: ").append(toIndentedString(vmDisks)).append("\n");
    sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
    sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
    sb.append("    usbDevices: ").append(toIndentedString(usbDevices)).append("\n");
    sb.append("    uniqueSize: ").append(toIndentedString(uniqueSize)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
    sb.append("    snapshotPlan: ").append(toIndentedString(snapshotPlan)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    provisionedSize: ").append(toIndentedString(provisionedSize)).append("\n");
    sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
    sb.append("    pciNics: ").append(toIndentedString(pciNics)).append("\n");
    sb.append("    outUninstallUsb: ").append(toIndentedString(outUninstallUsb)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
    sb.append("    nodeIp: ").append(toIndentedString(nodeIp)).append("\n");
    sb.append("    nestedVirtualization: ").append(toIndentedString(nestedVirtualization)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    memoryUsage: ").append(toIndentedString(memoryUsage)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
    sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
    sb.append("    maxBandwidthPolicy: ").append(toIndentedString(maxBandwidthPolicy)).append("\n");
    sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
    sb.append("    logicalSizeBytes: ").append(toIndentedString(logicalSizeBytes)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    lastShutdownTime: ").append(toIndentedString(lastShutdownTime)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    kernelInfo: ").append(toIndentedString(kernelInfo)).append("\n");
    sb.append("    isolationPolicy: ").append(toIndentedString(isolationPolicy)).append("\n");
    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
    sb.append("    ioPolicy: ").append(toIndentedString(ioPolicy)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    inRecycleBin: ").append(toIndentedString(inRecycleBin)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
    sb.append("    guestUsedSize: ").append(toIndentedString(guestUsedSize)).append("\n");
    sb.append("    guestSizeUsage: ").append(toIndentedString(guestSizeUsage)).append("\n");
    sb.append("    guestOsType: ").append(toIndentedString(guestOsType)).append("\n");
    sb.append("    guestCpuModel: ").append(toIndentedString(guestCpuModel)).append("\n");
    sb.append("    gpuDevices: ").append(toIndentedString(gpuDevices)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    entityFilterResults: ").append(toIndentedString(entityFilterResults)).append("\n");
    sb.append("    dnsServers: ").append(toIndentedString(dnsServers)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
    sb.append("    cpuModel: ").append(toIndentedString(cpuModel)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    cloudInitSupported: ").append(toIndentedString(cloudInitSupported)).append("\n");
    sb.append("    clockOffset: ").append(toIndentedString(clockOffset)).append("\n");
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

