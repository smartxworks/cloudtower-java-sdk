package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.ClusterWhereInput;
import com.smartx.tower.model.ConsistencyGroupSnapshotWhereInput;
import com.smartx.tower.model.ConsistencyGroupWhereInput;
import com.smartx.tower.model.ContentLibraryImageWhereInput;
import com.smartx.tower.model.ContentLibraryVmTemplateWhereInput;
import com.smartx.tower.model.DatacenterWhereInput;
import com.smartx.tower.model.DiskWhereInput;
import com.smartx.tower.model.ElfImageWhereInput;
import com.smartx.tower.model.GpuDeviceWhereInput;
import com.smartx.tower.model.HostWhereInput;
import com.smartx.tower.model.IscsiLunSnapshotWhereInput;
import com.smartx.tower.model.IscsiLunWhereInput;
import com.smartx.tower.model.IscsiTargetWhereInput;
import com.smartx.tower.model.IsolationPolicyWhereInput;
import com.smartx.tower.model.NamespaceGroupWhereInput;
import com.smartx.tower.model.NfsExportWhereInput;
import com.smartx.tower.model.NfsInodeWhereInput;
import com.smartx.tower.model.NicWhereInput;
import com.smartx.tower.model.NvmfNamespaceSnapshotWhereInput;
import com.smartx.tower.model.NvmfNamespaceWhereInput;
import com.smartx.tower.model.NvmfSubsystemWhereInput;
import com.smartx.tower.model.SecurityPolicyWhereInput;
import com.smartx.tower.model.VdsWhereInput;
import com.smartx.tower.model.VlanWhereInput;
import com.smartx.tower.model.VmSnapshotWhereInput;
import com.smartx.tower.model.VmTemplateWhereInput;
import com.smartx.tower.model.VmVolumeSnapshotWhereInput;
import com.smartx.tower.model.VmVolumeWhereInput;
import com.smartx.tower.model.VmWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AddLabelsToResourcesParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class AddLabelsToResourcesParamsData {
  public static final String SERIALIZED_NAME_GPU_DEVICES = "gpu_devices";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICES)
  private GpuDeviceWhereInput gpuDevices;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES = "content_library_vm_templates";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES)
  private ContentLibraryVmTemplateWhereInput contentLibraryVmTemplates;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES = "content_library_images";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES)
  private ContentLibraryImageWhereInput contentLibraryImages;

  public static final String SERIALIZED_NAME_ISOLATION_POLICIES = "isolation_policies";
  @SerializedName(SERIALIZED_NAME_ISOLATION_POLICIES)
  private IsolationPolicyWhereInput isolationPolicies;

  public static final String SERIALIZED_NAME_SECURITY_POLICIES = "security_policies";
  @SerializedName(SERIALIZED_NAME_SECURITY_POLICIES)
  private SecurityPolicyWhereInput securityPolicies;

  public static final String SERIALIZED_NAME_VMS = "vms";
  @SerializedName(SERIALIZED_NAME_VMS)
  private VmWhereInput vms;

  public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS = "vm_volume_snapshots";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS)
  private VmVolumeSnapshotWhereInput vmVolumeSnapshots;

  public static final String SERIALIZED_NAME_VM_VOLUMES = "vm_volumes";
  @SerializedName(SERIALIZED_NAME_VM_VOLUMES)
  private VmVolumeWhereInput vmVolumes;

  public static final String SERIALIZED_NAME_VM_TEMPLATES = "vm_templates";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATES)
  private VmTemplateWhereInput vmTemplates;

  public static final String SERIALIZED_NAME_VM_SNAPSHOTS = "vm_snapshots";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOTS)
  private VmSnapshotWhereInput vmSnapshots;

  public static final String SERIALIZED_NAME_VLANS = "vlans";
  @SerializedName(SERIALIZED_NAME_VLANS)
  private VlanWhereInput vlans;

  public static final String SERIALIZED_NAME_VDSES = "vdses";
  @SerializedName(SERIALIZED_NAME_VDSES)
  private VdsWhereInput vdses;

  public static final String SERIALIZED_NAME_NVMF_SUBSYSTEMS = "nvmf_subsystems";
  @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEMS)
  private NvmfSubsystemWhereInput nvmfSubsystems;

  public static final String SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS = "nvmf_namespace_snapshots";
  @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS)
  private NvmfNamespaceSnapshotWhereInput nvmfNamespaceSnapshots;

  public static final String SERIALIZED_NAME_NVMF_NAMESPACES = "nvmf_namespaces";
  @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACES)
  private NvmfNamespaceWhereInput nvmfNamespaces;

  public static final String SERIALIZED_NAME_NICS = "nics";
  @SerializedName(SERIALIZED_NAME_NICS)
  private NicWhereInput nics;

  public static final String SERIALIZED_NAME_NFS_INODES = "nfs_inodes";
  @SerializedName(SERIALIZED_NAME_NFS_INODES)
  private NfsInodeWhereInput nfsInodes;

  public static final String SERIALIZED_NAME_NFS_EXPORTS = "nfs_exports";
  @SerializedName(SERIALIZED_NAME_NFS_EXPORTS)
  private NfsExportWhereInput nfsExports;

  public static final String SERIALIZED_NAME_NAMESPACE_GROUPS = "namespace_groups";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUPS)
  private NamespaceGroupWhereInput namespaceGroups;

  public static final String SERIALIZED_NAME_ISCSI_TARGETS = "iscsi_targets";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGETS)
  private IscsiTargetWhereInput iscsiTargets;

  public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS = "iscsi_lun_snapshots";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS)
  private IscsiLunSnapshotWhereInput iscsiLunSnapshots;

  public static final String SERIALIZED_NAME_ISCSI_LUNS = "iscsi_luns";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUNS)
  private IscsiLunWhereInput iscsiLuns;

  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  private HostWhereInput hosts;

  public static final String SERIALIZED_NAME_ELF_IMAGES = "elf_images";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGES)
  private ElfImageWhereInput elfImages;

  public static final String SERIALIZED_NAME_DISKS = "disks";
  @SerializedName(SERIALIZED_NAME_DISKS)
  private DiskWhereInput disks;

  public static final String SERIALIZED_NAME_DATACENTERS = "datacenters";
  @SerializedName(SERIALIZED_NAME_DATACENTERS)
  private DatacenterWhereInput datacenters;

  public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS = "consistency_group_snapshots";
  @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS)
  private ConsistencyGroupSnapshotWhereInput consistencyGroupSnapshots;

  public static final String SERIALIZED_NAME_CONSISTENCY_GROUPS = "consistency_groups";
  @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUPS)
  private ConsistencyGroupWhereInput consistencyGroups;

  public static final String SERIALIZED_NAME_CLUSTERS = "clusters";
  @SerializedName(SERIALIZED_NAME_CLUSTERS)
  private ClusterWhereInput clusters;

  public AddLabelsToResourcesParamsData() { 
  }

  public AddLabelsToResourcesParamsData gpuDevices(GpuDeviceWhereInput gpuDevices) {
    
    this.gpuDevices = gpuDevices;
    return this;
  }

   /**
   * Get gpuDevices
   * @return gpuDevices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GpuDeviceWhereInput getGpuDevices() {
    return gpuDevices;
  }


  public void setGpuDevices(GpuDeviceWhereInput gpuDevices) {
    this.gpuDevices = gpuDevices;
  }


  public AddLabelsToResourcesParamsData contentLibraryVmTemplates(ContentLibraryVmTemplateWhereInput contentLibraryVmTemplates) {
    
    this.contentLibraryVmTemplates = contentLibraryVmTemplates;
    return this;
  }

   /**
   * Get contentLibraryVmTemplates
   * @return contentLibraryVmTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContentLibraryVmTemplateWhereInput getContentLibraryVmTemplates() {
    return contentLibraryVmTemplates;
  }


  public void setContentLibraryVmTemplates(ContentLibraryVmTemplateWhereInput contentLibraryVmTemplates) {
    this.contentLibraryVmTemplates = contentLibraryVmTemplates;
  }


  public AddLabelsToResourcesParamsData contentLibraryImages(ContentLibraryImageWhereInput contentLibraryImages) {
    
    this.contentLibraryImages = contentLibraryImages;
    return this;
  }

   /**
   * Get contentLibraryImages
   * @return contentLibraryImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContentLibraryImageWhereInput getContentLibraryImages() {
    return contentLibraryImages;
  }


  public void setContentLibraryImages(ContentLibraryImageWhereInput contentLibraryImages) {
    this.contentLibraryImages = contentLibraryImages;
  }


  public AddLabelsToResourcesParamsData isolationPolicies(IsolationPolicyWhereInput isolationPolicies) {
    
    this.isolationPolicies = isolationPolicies;
    return this;
  }

   /**
   * Get isolationPolicies
   * @return isolationPolicies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IsolationPolicyWhereInput getIsolationPolicies() {
    return isolationPolicies;
  }


  public void setIsolationPolicies(IsolationPolicyWhereInput isolationPolicies) {
    this.isolationPolicies = isolationPolicies;
  }


  public AddLabelsToResourcesParamsData securityPolicies(SecurityPolicyWhereInput securityPolicies) {
    
    this.securityPolicies = securityPolicies;
    return this;
  }

   /**
   * Get securityPolicies
   * @return securityPolicies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SecurityPolicyWhereInput getSecurityPolicies() {
    return securityPolicies;
  }


  public void setSecurityPolicies(SecurityPolicyWhereInput securityPolicies) {
    this.securityPolicies = securityPolicies;
  }


  public AddLabelsToResourcesParamsData vms(VmWhereInput vms) {
    
    this.vms = vms;
    return this;
  }

   /**
   * Get vms
   * @return vms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVms() {
    return vms;
  }


  public void setVms(VmWhereInput vms) {
    this.vms = vms;
  }


  public AddLabelsToResourcesParamsData vmVolumeSnapshots(VmVolumeSnapshotWhereInput vmVolumeSnapshots) {
    
    this.vmVolumeSnapshots = vmVolumeSnapshots;
    return this;
  }

   /**
   * Get vmVolumeSnapshots
   * @return vmVolumeSnapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmVolumeSnapshotWhereInput getVmVolumeSnapshots() {
    return vmVolumeSnapshots;
  }


  public void setVmVolumeSnapshots(VmVolumeSnapshotWhereInput vmVolumeSnapshots) {
    this.vmVolumeSnapshots = vmVolumeSnapshots;
  }


  public AddLabelsToResourcesParamsData vmVolumes(VmVolumeWhereInput vmVolumes) {
    
    this.vmVolumes = vmVolumes;
    return this;
  }

   /**
   * Get vmVolumes
   * @return vmVolumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmVolumeWhereInput getVmVolumes() {
    return vmVolumes;
  }


  public void setVmVolumes(VmVolumeWhereInput vmVolumes) {
    this.vmVolumes = vmVolumes;
  }


  public AddLabelsToResourcesParamsData vmTemplates(VmTemplateWhereInput vmTemplates) {
    
    this.vmTemplates = vmTemplates;
    return this;
  }

   /**
   * Get vmTemplates
   * @return vmTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmTemplateWhereInput getVmTemplates() {
    return vmTemplates;
  }


  public void setVmTemplates(VmTemplateWhereInput vmTemplates) {
    this.vmTemplates = vmTemplates;
  }


  public AddLabelsToResourcesParamsData vmSnapshots(VmSnapshotWhereInput vmSnapshots) {
    
    this.vmSnapshots = vmSnapshots;
    return this;
  }

   /**
   * Get vmSnapshots
   * @return vmSnapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmSnapshotWhereInput getVmSnapshots() {
    return vmSnapshots;
  }


  public void setVmSnapshots(VmSnapshotWhereInput vmSnapshots) {
    this.vmSnapshots = vmSnapshots;
  }


  public AddLabelsToResourcesParamsData vlans(VlanWhereInput vlans) {
    
    this.vlans = vlans;
    return this;
  }

   /**
   * Get vlans
   * @return vlans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VlanWhereInput getVlans() {
    return vlans;
  }


  public void setVlans(VlanWhereInput vlans) {
    this.vlans = vlans;
  }


  public AddLabelsToResourcesParamsData vdses(VdsWhereInput vdses) {
    
    this.vdses = vdses;
    return this;
  }

   /**
   * Get vdses
   * @return vdses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VdsWhereInput getVdses() {
    return vdses;
  }


  public void setVdses(VdsWhereInput vdses) {
    this.vdses = vdses;
  }


  public AddLabelsToResourcesParamsData nvmfSubsystems(NvmfSubsystemWhereInput nvmfSubsystems) {
    
    this.nvmfSubsystems = nvmfSubsystems;
    return this;
  }

   /**
   * Get nvmfSubsystems
   * @return nvmfSubsystems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NvmfSubsystemWhereInput getNvmfSubsystems() {
    return nvmfSubsystems;
  }


  public void setNvmfSubsystems(NvmfSubsystemWhereInput nvmfSubsystems) {
    this.nvmfSubsystems = nvmfSubsystems;
  }


  public AddLabelsToResourcesParamsData nvmfNamespaceSnapshots(NvmfNamespaceSnapshotWhereInput nvmfNamespaceSnapshots) {
    
    this.nvmfNamespaceSnapshots = nvmfNamespaceSnapshots;
    return this;
  }

   /**
   * Get nvmfNamespaceSnapshots
   * @return nvmfNamespaceSnapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NvmfNamespaceSnapshotWhereInput getNvmfNamespaceSnapshots() {
    return nvmfNamespaceSnapshots;
  }


  public void setNvmfNamespaceSnapshots(NvmfNamespaceSnapshotWhereInput nvmfNamespaceSnapshots) {
    this.nvmfNamespaceSnapshots = nvmfNamespaceSnapshots;
  }


  public AddLabelsToResourcesParamsData nvmfNamespaces(NvmfNamespaceWhereInput nvmfNamespaces) {
    
    this.nvmfNamespaces = nvmfNamespaces;
    return this;
  }

   /**
   * Get nvmfNamespaces
   * @return nvmfNamespaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NvmfNamespaceWhereInput getNvmfNamespaces() {
    return nvmfNamespaces;
  }


  public void setNvmfNamespaces(NvmfNamespaceWhereInput nvmfNamespaces) {
    this.nvmfNamespaces = nvmfNamespaces;
  }


  public AddLabelsToResourcesParamsData nics(NicWhereInput nics) {
    
    this.nics = nics;
    return this;
  }

   /**
   * Get nics
   * @return nics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NicWhereInput getNics() {
    return nics;
  }


  public void setNics(NicWhereInput nics) {
    this.nics = nics;
  }


  public AddLabelsToResourcesParamsData nfsInodes(NfsInodeWhereInput nfsInodes) {
    
    this.nfsInodes = nfsInodes;
    return this;
  }

   /**
   * Get nfsInodes
   * @return nfsInodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NfsInodeWhereInput getNfsInodes() {
    return nfsInodes;
  }


  public void setNfsInodes(NfsInodeWhereInput nfsInodes) {
    this.nfsInodes = nfsInodes;
  }


  public AddLabelsToResourcesParamsData nfsExports(NfsExportWhereInput nfsExports) {
    
    this.nfsExports = nfsExports;
    return this;
  }

   /**
   * Get nfsExports
   * @return nfsExports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NfsExportWhereInput getNfsExports() {
    return nfsExports;
  }


  public void setNfsExports(NfsExportWhereInput nfsExports) {
    this.nfsExports = nfsExports;
  }


  public AddLabelsToResourcesParamsData namespaceGroups(NamespaceGroupWhereInput namespaceGroups) {
    
    this.namespaceGroups = namespaceGroups;
    return this;
  }

   /**
   * Get namespaceGroups
   * @return namespaceGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NamespaceGroupWhereInput getNamespaceGroups() {
    return namespaceGroups;
  }


  public void setNamespaceGroups(NamespaceGroupWhereInput namespaceGroups) {
    this.namespaceGroups = namespaceGroups;
  }


  public AddLabelsToResourcesParamsData iscsiTargets(IscsiTargetWhereInput iscsiTargets) {
    
    this.iscsiTargets = iscsiTargets;
    return this;
  }

   /**
   * Get iscsiTargets
   * @return iscsiTargets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IscsiTargetWhereInput getIscsiTargets() {
    return iscsiTargets;
  }


  public void setIscsiTargets(IscsiTargetWhereInput iscsiTargets) {
    this.iscsiTargets = iscsiTargets;
  }


  public AddLabelsToResourcesParamsData iscsiLunSnapshots(IscsiLunSnapshotWhereInput iscsiLunSnapshots) {
    
    this.iscsiLunSnapshots = iscsiLunSnapshots;
    return this;
  }

   /**
   * Get iscsiLunSnapshots
   * @return iscsiLunSnapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IscsiLunSnapshotWhereInput getIscsiLunSnapshots() {
    return iscsiLunSnapshots;
  }


  public void setIscsiLunSnapshots(IscsiLunSnapshotWhereInput iscsiLunSnapshots) {
    this.iscsiLunSnapshots = iscsiLunSnapshots;
  }


  public AddLabelsToResourcesParamsData iscsiLuns(IscsiLunWhereInput iscsiLuns) {
    
    this.iscsiLuns = iscsiLuns;
    return this;
  }

   /**
   * Get iscsiLuns
   * @return iscsiLuns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IscsiLunWhereInput getIscsiLuns() {
    return iscsiLuns;
  }


  public void setIscsiLuns(IscsiLunWhereInput iscsiLuns) {
    this.iscsiLuns = iscsiLuns;
  }


  public AddLabelsToResourcesParamsData hosts(HostWhereInput hosts) {
    
    this.hosts = hosts;
    return this;
  }

   /**
   * Get hosts
   * @return hosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostWhereInput getHosts() {
    return hosts;
  }


  public void setHosts(HostWhereInput hosts) {
    this.hosts = hosts;
  }


  public AddLabelsToResourcesParamsData elfImages(ElfImageWhereInput elfImages) {
    
    this.elfImages = elfImages;
    return this;
  }

   /**
   * Get elfImages
   * @return elfImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ElfImageWhereInput getElfImages() {
    return elfImages;
  }


  public void setElfImages(ElfImageWhereInput elfImages) {
    this.elfImages = elfImages;
  }


  public AddLabelsToResourcesParamsData disks(DiskWhereInput disks) {
    
    this.disks = disks;
    return this;
  }

   /**
   * Get disks
   * @return disks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DiskWhereInput getDisks() {
    return disks;
  }


  public void setDisks(DiskWhereInput disks) {
    this.disks = disks;
  }


  public AddLabelsToResourcesParamsData datacenters(DatacenterWhereInput datacenters) {
    
    this.datacenters = datacenters;
    return this;
  }

   /**
   * Get datacenters
   * @return datacenters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatacenterWhereInput getDatacenters() {
    return datacenters;
  }


  public void setDatacenters(DatacenterWhereInput datacenters) {
    this.datacenters = datacenters;
  }


  public AddLabelsToResourcesParamsData consistencyGroupSnapshots(ConsistencyGroupSnapshotWhereInput consistencyGroupSnapshots) {
    
    this.consistencyGroupSnapshots = consistencyGroupSnapshots;
    return this;
  }

   /**
   * Get consistencyGroupSnapshots
   * @return consistencyGroupSnapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConsistencyGroupSnapshotWhereInput getConsistencyGroupSnapshots() {
    return consistencyGroupSnapshots;
  }


  public void setConsistencyGroupSnapshots(ConsistencyGroupSnapshotWhereInput consistencyGroupSnapshots) {
    this.consistencyGroupSnapshots = consistencyGroupSnapshots;
  }


  public AddLabelsToResourcesParamsData consistencyGroups(ConsistencyGroupWhereInput consistencyGroups) {
    
    this.consistencyGroups = consistencyGroups;
    return this;
  }

   /**
   * Get consistencyGroups
   * @return consistencyGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConsistencyGroupWhereInput getConsistencyGroups() {
    return consistencyGroups;
  }


  public void setConsistencyGroups(ConsistencyGroupWhereInput consistencyGroups) {
    this.consistencyGroups = consistencyGroups;
  }


  public AddLabelsToResourcesParamsData clusters(ClusterWhereInput clusters) {
    
    this.clusters = clusters;
    return this;
  }

   /**
   * Get clusters
   * @return clusters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterWhereInput getClusters() {
    return clusters;
  }


  public void setClusters(ClusterWhereInput clusters) {
    this.clusters = clusters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddLabelsToResourcesParamsData addLabelsToResourcesParamsData = (AddLabelsToResourcesParamsData) o;
    return Objects.equals(this.gpuDevices, addLabelsToResourcesParamsData.gpuDevices) &&
        Objects.equals(this.contentLibraryVmTemplates, addLabelsToResourcesParamsData.contentLibraryVmTemplates) &&
        Objects.equals(this.contentLibraryImages, addLabelsToResourcesParamsData.contentLibraryImages) &&
        Objects.equals(this.isolationPolicies, addLabelsToResourcesParamsData.isolationPolicies) &&
        Objects.equals(this.securityPolicies, addLabelsToResourcesParamsData.securityPolicies) &&
        Objects.equals(this.vms, addLabelsToResourcesParamsData.vms) &&
        Objects.equals(this.vmVolumeSnapshots, addLabelsToResourcesParamsData.vmVolumeSnapshots) &&
        Objects.equals(this.vmVolumes, addLabelsToResourcesParamsData.vmVolumes) &&
        Objects.equals(this.vmTemplates, addLabelsToResourcesParamsData.vmTemplates) &&
        Objects.equals(this.vmSnapshots, addLabelsToResourcesParamsData.vmSnapshots) &&
        Objects.equals(this.vlans, addLabelsToResourcesParamsData.vlans) &&
        Objects.equals(this.vdses, addLabelsToResourcesParamsData.vdses) &&
        Objects.equals(this.nvmfSubsystems, addLabelsToResourcesParamsData.nvmfSubsystems) &&
        Objects.equals(this.nvmfNamespaceSnapshots, addLabelsToResourcesParamsData.nvmfNamespaceSnapshots) &&
        Objects.equals(this.nvmfNamespaces, addLabelsToResourcesParamsData.nvmfNamespaces) &&
        Objects.equals(this.nics, addLabelsToResourcesParamsData.nics) &&
        Objects.equals(this.nfsInodes, addLabelsToResourcesParamsData.nfsInodes) &&
        Objects.equals(this.nfsExports, addLabelsToResourcesParamsData.nfsExports) &&
        Objects.equals(this.namespaceGroups, addLabelsToResourcesParamsData.namespaceGroups) &&
        Objects.equals(this.iscsiTargets, addLabelsToResourcesParamsData.iscsiTargets) &&
        Objects.equals(this.iscsiLunSnapshots, addLabelsToResourcesParamsData.iscsiLunSnapshots) &&
        Objects.equals(this.iscsiLuns, addLabelsToResourcesParamsData.iscsiLuns) &&
        Objects.equals(this.hosts, addLabelsToResourcesParamsData.hosts) &&
        Objects.equals(this.elfImages, addLabelsToResourcesParamsData.elfImages) &&
        Objects.equals(this.disks, addLabelsToResourcesParamsData.disks) &&
        Objects.equals(this.datacenters, addLabelsToResourcesParamsData.datacenters) &&
        Objects.equals(this.consistencyGroupSnapshots, addLabelsToResourcesParamsData.consistencyGroupSnapshots) &&
        Objects.equals(this.consistencyGroups, addLabelsToResourcesParamsData.consistencyGroups) &&
        Objects.equals(this.clusters, addLabelsToResourcesParamsData.clusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gpuDevices, contentLibraryVmTemplates, contentLibraryImages, isolationPolicies, securityPolicies, vms, vmVolumeSnapshots, vmVolumes, vmTemplates, vmSnapshots, vlans, vdses, nvmfSubsystems, nvmfNamespaceSnapshots, nvmfNamespaces, nics, nfsInodes, nfsExports, namespaceGroups, iscsiTargets, iscsiLunSnapshots, iscsiLuns, hosts, elfImages, disks, datacenters, consistencyGroupSnapshots, consistencyGroups, clusters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddLabelsToResourcesParamsData {\n");
    sb.append("    gpuDevices: ").append(toIndentedString(gpuDevices)).append("\n");
    sb.append("    contentLibraryVmTemplates: ").append(toIndentedString(contentLibraryVmTemplates)).append("\n");
    sb.append("    contentLibraryImages: ").append(toIndentedString(contentLibraryImages)).append("\n");
    sb.append("    isolationPolicies: ").append(toIndentedString(isolationPolicies)).append("\n");
    sb.append("    securityPolicies: ").append(toIndentedString(securityPolicies)).append("\n");
    sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
    sb.append("    vmVolumeSnapshots: ").append(toIndentedString(vmVolumeSnapshots)).append("\n");
    sb.append("    vmVolumes: ").append(toIndentedString(vmVolumes)).append("\n");
    sb.append("    vmTemplates: ").append(toIndentedString(vmTemplates)).append("\n");
    sb.append("    vmSnapshots: ").append(toIndentedString(vmSnapshots)).append("\n");
    sb.append("    vlans: ").append(toIndentedString(vlans)).append("\n");
    sb.append("    vdses: ").append(toIndentedString(vdses)).append("\n");
    sb.append("    nvmfSubsystems: ").append(toIndentedString(nvmfSubsystems)).append("\n");
    sb.append("    nvmfNamespaceSnapshots: ").append(toIndentedString(nvmfNamespaceSnapshots)).append("\n");
    sb.append("    nvmfNamespaces: ").append(toIndentedString(nvmfNamespaces)).append("\n");
    sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
    sb.append("    nfsInodes: ").append(toIndentedString(nfsInodes)).append("\n");
    sb.append("    nfsExports: ").append(toIndentedString(nfsExports)).append("\n");
    sb.append("    namespaceGroups: ").append(toIndentedString(namespaceGroups)).append("\n");
    sb.append("    iscsiTargets: ").append(toIndentedString(iscsiTargets)).append("\n");
    sb.append("    iscsiLunSnapshots: ").append(toIndentedString(iscsiLunSnapshots)).append("\n");
    sb.append("    iscsiLuns: ").append(toIndentedString(iscsiLuns)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    elfImages: ").append(toIndentedString(elfImages)).append("\n");
    sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
    sb.append("    datacenters: ").append(toIndentedString(datacenters)).append("\n");
    sb.append("    consistencyGroupSnapshots: ").append(toIndentedString(consistencyGroupSnapshots)).append("\n");
    sb.append("    consistencyGroups: ").append(toIndentedString(consistencyGroups)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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

