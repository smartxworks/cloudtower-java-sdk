package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NestedCluster;
import com.smartx.tower.model.NestedConsistencyGroup;
import com.smartx.tower.model.NestedConsistencyGroupSnapshot;
import com.smartx.tower.model.NestedContentLibraryImage;
import com.smartx.tower.model.NestedContentLibraryVmTemplate;
import com.smartx.tower.model.NestedDatacenter;
import com.smartx.tower.model.NestedDisk;
import com.smartx.tower.model.NestedElfImage;
import com.smartx.tower.model.NestedGpuDevice;
import com.smartx.tower.model.NestedHost;
import com.smartx.tower.model.NestedIscsiLun;
import com.smartx.tower.model.NestedIscsiLunSnapshot;
import com.smartx.tower.model.NestedIscsiTarget;
import com.smartx.tower.model.NestedIsolationPolicy;
import com.smartx.tower.model.NestedNamespaceGroup;
import com.smartx.tower.model.NestedNfsExport;
import com.smartx.tower.model.NestedNfsInode;
import com.smartx.tower.model.NestedNic;
import com.smartx.tower.model.NestedNvmfNamespace;
import com.smartx.tower.model.NestedNvmfNamespaceSnapshot;
import com.smartx.tower.model.NestedNvmfSubsystem;
import com.smartx.tower.model.NestedSecurityPolicy;
import com.smartx.tower.model.NestedVds;
import com.smartx.tower.model.NestedVlan;
import com.smartx.tower.model.NestedVm;
import com.smartx.tower.model.NestedVmSnapshot;
import com.smartx.tower.model.NestedVmTemplate;
import com.smartx.tower.model.NestedVmVolume;
import com.smartx.tower.model.NestedVmVolumeSnapshot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Label
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class Label {
  public static final String SERIALIZED_NAME_CLUSTER_NUM = "cluster_num";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NUM)
  private Integer clusterNum;

  public static final String SERIALIZED_NAME_CLUSTERS = "clusters";
  @SerializedName(SERIALIZED_NAME_CLUSTERS)
  private List<NestedCluster> clusters = null;

  public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_NUM = "consistency_group_num";
  @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM)
  private Integer consistencyGroupNum;

  public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM = "consistency_group_snapshot_num";
  @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM)
  private Integer consistencyGroupSnapshotNum;

  public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS = "consistency_group_snapshots";
  @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS)
  private List<NestedConsistencyGroupSnapshot> consistencyGroupSnapshots = null;

  public static final String SERIALIZED_NAME_CONSISTENCY_GROUPS = "consistency_groups";
  @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUPS)
  private List<NestedConsistencyGroup> consistencyGroups = null;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM = "content_library_image_num";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM)
  private Integer contentLibraryImageNum;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES = "content_library_images";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES)
  private List<NestedContentLibraryImage> contentLibraryImages = null;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM = "content_library_vm_template_num";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM)
  private Integer contentLibraryVmTemplateNum;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES = "content_library_vm_templates";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES)
  private List<NestedContentLibraryVmTemplate> contentLibraryVmTemplates = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DATACENTER_NUM = "datacenter_num";
  @SerializedName(SERIALIZED_NAME_DATACENTER_NUM)
  private Integer datacenterNum;

  public static final String SERIALIZED_NAME_DATACENTERS = "datacenters";
  @SerializedName(SERIALIZED_NAME_DATACENTERS)
  private List<NestedDatacenter> datacenters = null;

  public static final String SERIALIZED_NAME_DISK_NUM = "disk_num";
  @SerializedName(SERIALIZED_NAME_DISK_NUM)
  private Integer diskNum;

  public static final String SERIALIZED_NAME_DISKS = "disks";
  @SerializedName(SERIALIZED_NAME_DISKS)
  private List<NestedDisk> disks = null;

  public static final String SERIALIZED_NAME_ELF_IMAGE_NUM = "elf_image_num";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGE_NUM)
  private Integer elfImageNum;

  public static final String SERIALIZED_NAME_ELF_IMAGES = "elf_images";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGES)
  private List<NestedElfImage> elfImages = null;

  public static final String SERIALIZED_NAME_GPU_DEVICE_NUM = "gpu_device_num";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICE_NUM)
  private Integer gpuDeviceNum;

  public static final String SERIALIZED_NAME_GPU_DEVICES = "gpu_devices";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICES)
  private List<NestedGpuDevice> gpuDevices = null;

  public static final String SERIALIZED_NAME_HOST_NUM = "host_num";
  @SerializedName(SERIALIZED_NAME_HOST_NUM)
  private Integer hostNum;

  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  private List<NestedHost> hosts = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ISCSI_LUN_NUM = "iscsi_lun_num";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_NUM)
  private Integer iscsiLunNum;

  public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM = "iscsi_lun_snapshot_num";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM)
  private Integer iscsiLunSnapshotNum;

  public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS = "iscsi_lun_snapshots";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS)
  private List<NestedIscsiLunSnapshot> iscsiLunSnapshots = null;

  public static final String SERIALIZED_NAME_ISCSI_LUNS = "iscsi_luns";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUNS)
  private List<NestedIscsiLun> iscsiLuns = null;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_NUM = "iscsi_target_num";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_NUM)
  private Integer iscsiTargetNum;

  public static final String SERIALIZED_NAME_ISCSI_TARGETS = "iscsi_targets";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGETS)
  private List<NestedIscsiTarget> iscsiTargets = null;

  public static final String SERIALIZED_NAME_ISOLATION_POLICIES = "isolation_policies";
  @SerializedName(SERIALIZED_NAME_ISOLATION_POLICIES)
  private List<NestedIsolationPolicy> isolationPolicies = null;

  public static final String SERIALIZED_NAME_ISOLATION_POLICY_NUM = "isolation_policy_num";
  @SerializedName(SERIALIZED_NAME_ISOLATION_POLICY_NUM)
  private Integer isolationPolicyNum;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAMESPACE_GROUP_NUM = "namespace_group_num";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUP_NUM)
  private Integer namespaceGroupNum;

  public static final String SERIALIZED_NAME_NAMESPACE_GROUPS = "namespace_groups";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUPS)
  private List<NestedNamespaceGroup> namespaceGroups = null;

  public static final String SERIALIZED_NAME_NFS_EXPORT_NUM = "nfs_export_num";
  @SerializedName(SERIALIZED_NAME_NFS_EXPORT_NUM)
  private Integer nfsExportNum;

  public static final String SERIALIZED_NAME_NFS_EXPORTS = "nfs_exports";
  @SerializedName(SERIALIZED_NAME_NFS_EXPORTS)
  private List<NestedNfsExport> nfsExports = null;

  public static final String SERIALIZED_NAME_NFS_INODE_NUM = "nfs_inode_num";
  @SerializedName(SERIALIZED_NAME_NFS_INODE_NUM)
  private Integer nfsInodeNum;

  public static final String SERIALIZED_NAME_NFS_INODES = "nfs_inodes";
  @SerializedName(SERIALIZED_NAME_NFS_INODES)
  private List<NestedNfsInode> nfsInodes = null;

  public static final String SERIALIZED_NAME_NIC_NUM = "nic_num";
  @SerializedName(SERIALIZED_NAME_NIC_NUM)
  private Integer nicNum;

  public static final String SERIALIZED_NAME_NICS = "nics";
  @SerializedName(SERIALIZED_NAME_NICS)
  private List<NestedNic> nics = null;

  public static final String SERIALIZED_NAME_NVMF_NAMESPACE_NUM = "nvmf_namespace_num";
  @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_NUM)
  private Integer nvmfNamespaceNum;

  public static final String SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM = "nvmf_namespace_snapshot_num";
  @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM)
  private Integer nvmfNamespaceSnapshotNum;

  public static final String SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS = "nvmf_namespace_snapshots";
  @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS)
  private List<NestedNvmfNamespaceSnapshot> nvmfNamespaceSnapshots = null;

  public static final String SERIALIZED_NAME_NVMF_NAMESPACES = "nvmf_namespaces";
  @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACES)
  private List<NestedNvmfNamespace> nvmfNamespaces = null;

  public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM = "nvmf_subsystem_num";
  @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM)
  private Integer nvmfSubsystemNum;

  public static final String SERIALIZED_NAME_NVMF_SUBSYSTEMS = "nvmf_subsystems";
  @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEMS)
  private List<NestedNvmfSubsystem> nvmfSubsystems = null;

  public static final String SERIALIZED_NAME_SECURITY_POLICIES = "security_policies";
  @SerializedName(SERIALIZED_NAME_SECURITY_POLICIES)
  private List<NestedSecurityPolicy> securityPolicies = null;

  public static final String SERIALIZED_NAME_SECURITY_POLICY_NUM = "security_policy_num";
  @SerializedName(SERIALIZED_NAME_SECURITY_POLICY_NUM)
  private Integer securityPolicyNum;

  public static final String SERIALIZED_NAME_SYSTEM_VLAN_NUM = "system_vlan_num";
  @SerializedName(SERIALIZED_NAME_SYSTEM_VLAN_NUM)
  private Integer systemVlanNum;

  public static final String SERIALIZED_NAME_TOTAL_NUM = "total_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM)
  private Integer totalNum;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VDS_NUM = "vds_num";
  @SerializedName(SERIALIZED_NAME_VDS_NUM)
  private Integer vdsNum;

  public static final String SERIALIZED_NAME_VDSES = "vdses";
  @SerializedName(SERIALIZED_NAME_VDSES)
  private List<NestedVds> vdses = null;

  public static final String SERIALIZED_NAME_VLANS = "vlans";
  @SerializedName(SERIALIZED_NAME_VLANS)
  private List<NestedVlan> vlans = null;

  public static final String SERIALIZED_NAME_VM_NUM = "vm_num";
  @SerializedName(SERIALIZED_NAME_VM_NUM)
  private Integer vmNum;

  public static final String SERIALIZED_NAME_VM_SNAPSHOT_NUM = "vm_snapshot_num";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOT_NUM)
  private Integer vmSnapshotNum;

  public static final String SERIALIZED_NAME_VM_SNAPSHOTS = "vm_snapshots";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOTS)
  private List<NestedVmSnapshot> vmSnapshots = null;

  public static final String SERIALIZED_NAME_VM_TEMPLATE_NUM = "vm_template_num";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_NUM)
  private Integer vmTemplateNum;

  public static final String SERIALIZED_NAME_VM_TEMPLATES = "vm_templates";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATES)
  private List<NestedVmTemplate> vmTemplates = null;

  public static final String SERIALIZED_NAME_VM_VLAN_NUM = "vm_vlan_num";
  @SerializedName(SERIALIZED_NAME_VM_VLAN_NUM)
  private Integer vmVlanNum;

  public static final String SERIALIZED_NAME_VM_VOLUME_NUM = "vm_volume_num";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_NUM)
  private Integer vmVolumeNum;

  public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM = "vm_volume_snapshot_num";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM)
  private Integer vmVolumeSnapshotNum;

  public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS = "vm_volume_snapshots";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS)
  private List<NestedVmVolumeSnapshot> vmVolumeSnapshots = null;

  public static final String SERIALIZED_NAME_VM_VOLUMES = "vm_volumes";
  @SerializedName(SERIALIZED_NAME_VM_VOLUMES)
  private List<NestedVmVolume> vmVolumes = null;

  public static final String SERIALIZED_NAME_VMS = "vms";
  @SerializedName(SERIALIZED_NAME_VMS)
  private List<NestedVm> vms = null;

  public Label() { 
  }

  public Label clusterNum(Integer clusterNum) {
    
    this.clusterNum = clusterNum;
    return this;
  }

   /**
   * Get clusterNum
   * @return clusterNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getClusterNum() {
    return clusterNum;
  }


  public void setClusterNum(Integer clusterNum) {
    this.clusterNum = clusterNum;
  }


  public Label clusters(List<NestedCluster> clusters) {
    
    this.clusters = clusters;
    return this;
  }

  public Label addClustersItem(NestedCluster clustersItem) {
    if (this.clusters == null) {
      this.clusters = new ArrayList<NestedCluster>();
    }
    this.clusters.add(clustersItem);
    return this;
  }

   /**
   * Get clusters
   * @return clusters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedCluster> getClusters() {
    return clusters;
  }


  public void setClusters(List<NestedCluster> clusters) {
    this.clusters = clusters;
  }


  public Label consistencyGroupNum(Integer consistencyGroupNum) {
    
    this.consistencyGroupNum = consistencyGroupNum;
    return this;
  }

   /**
   * Get consistencyGroupNum
   * @return consistencyGroupNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getConsistencyGroupNum() {
    return consistencyGroupNum;
  }


  public void setConsistencyGroupNum(Integer consistencyGroupNum) {
    this.consistencyGroupNum = consistencyGroupNum;
  }


  public Label consistencyGroupSnapshotNum(Integer consistencyGroupSnapshotNum) {
    
    this.consistencyGroupSnapshotNum = consistencyGroupSnapshotNum;
    return this;
  }

   /**
   * Get consistencyGroupSnapshotNum
   * @return consistencyGroupSnapshotNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getConsistencyGroupSnapshotNum() {
    return consistencyGroupSnapshotNum;
  }


  public void setConsistencyGroupSnapshotNum(Integer consistencyGroupSnapshotNum) {
    this.consistencyGroupSnapshotNum = consistencyGroupSnapshotNum;
  }


  public Label consistencyGroupSnapshots(List<NestedConsistencyGroupSnapshot> consistencyGroupSnapshots) {
    
    this.consistencyGroupSnapshots = consistencyGroupSnapshots;
    return this;
  }

  public Label addConsistencyGroupSnapshotsItem(NestedConsistencyGroupSnapshot consistencyGroupSnapshotsItem) {
    if (this.consistencyGroupSnapshots == null) {
      this.consistencyGroupSnapshots = new ArrayList<NestedConsistencyGroupSnapshot>();
    }
    this.consistencyGroupSnapshots.add(consistencyGroupSnapshotsItem);
    return this;
  }

   /**
   * Get consistencyGroupSnapshots
   * @return consistencyGroupSnapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedConsistencyGroupSnapshot> getConsistencyGroupSnapshots() {
    return consistencyGroupSnapshots;
  }


  public void setConsistencyGroupSnapshots(List<NestedConsistencyGroupSnapshot> consistencyGroupSnapshots) {
    this.consistencyGroupSnapshots = consistencyGroupSnapshots;
  }


  public Label consistencyGroups(List<NestedConsistencyGroup> consistencyGroups) {
    
    this.consistencyGroups = consistencyGroups;
    return this;
  }

  public Label addConsistencyGroupsItem(NestedConsistencyGroup consistencyGroupsItem) {
    if (this.consistencyGroups == null) {
      this.consistencyGroups = new ArrayList<NestedConsistencyGroup>();
    }
    this.consistencyGroups.add(consistencyGroupsItem);
    return this;
  }

   /**
   * Get consistencyGroups
   * @return consistencyGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedConsistencyGroup> getConsistencyGroups() {
    return consistencyGroups;
  }


  public void setConsistencyGroups(List<NestedConsistencyGroup> consistencyGroups) {
    this.consistencyGroups = consistencyGroups;
  }


  public Label contentLibraryImageNum(Integer contentLibraryImageNum) {
    
    this.contentLibraryImageNum = contentLibraryImageNum;
    return this;
  }

   /**
   * Get contentLibraryImageNum
   * @return contentLibraryImageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getContentLibraryImageNum() {
    return contentLibraryImageNum;
  }


  public void setContentLibraryImageNum(Integer contentLibraryImageNum) {
    this.contentLibraryImageNum = contentLibraryImageNum;
  }


  public Label contentLibraryImages(List<NestedContentLibraryImage> contentLibraryImages) {
    
    this.contentLibraryImages = contentLibraryImages;
    return this;
  }

  public Label addContentLibraryImagesItem(NestedContentLibraryImage contentLibraryImagesItem) {
    if (this.contentLibraryImages == null) {
      this.contentLibraryImages = new ArrayList<NestedContentLibraryImage>();
    }
    this.contentLibraryImages.add(contentLibraryImagesItem);
    return this;
  }

   /**
   * Get contentLibraryImages
   * @return contentLibraryImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedContentLibraryImage> getContentLibraryImages() {
    return contentLibraryImages;
  }


  public void setContentLibraryImages(List<NestedContentLibraryImage> contentLibraryImages) {
    this.contentLibraryImages = contentLibraryImages;
  }


  public Label contentLibraryVmTemplateNum(Integer contentLibraryVmTemplateNum) {
    
    this.contentLibraryVmTemplateNum = contentLibraryVmTemplateNum;
    return this;
  }

   /**
   * Get contentLibraryVmTemplateNum
   * @return contentLibraryVmTemplateNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getContentLibraryVmTemplateNum() {
    return contentLibraryVmTemplateNum;
  }


  public void setContentLibraryVmTemplateNum(Integer contentLibraryVmTemplateNum) {
    this.contentLibraryVmTemplateNum = contentLibraryVmTemplateNum;
  }


  public Label contentLibraryVmTemplates(List<NestedContentLibraryVmTemplate> contentLibraryVmTemplates) {
    
    this.contentLibraryVmTemplates = contentLibraryVmTemplates;
    return this;
  }

  public Label addContentLibraryVmTemplatesItem(NestedContentLibraryVmTemplate contentLibraryVmTemplatesItem) {
    if (this.contentLibraryVmTemplates == null) {
      this.contentLibraryVmTemplates = new ArrayList<NestedContentLibraryVmTemplate>();
    }
    this.contentLibraryVmTemplates.add(contentLibraryVmTemplatesItem);
    return this;
  }

   /**
   * Get contentLibraryVmTemplates
   * @return contentLibraryVmTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedContentLibraryVmTemplate> getContentLibraryVmTemplates() {
    return contentLibraryVmTemplates;
  }


  public void setContentLibraryVmTemplates(List<NestedContentLibraryVmTemplate> contentLibraryVmTemplates) {
    this.contentLibraryVmTemplates = contentLibraryVmTemplates;
  }


  public Label createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public Label datacenterNum(Integer datacenterNum) {
    
    this.datacenterNum = datacenterNum;
    return this;
  }

   /**
   * Get datacenterNum
   * @return datacenterNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDatacenterNum() {
    return datacenterNum;
  }


  public void setDatacenterNum(Integer datacenterNum) {
    this.datacenterNum = datacenterNum;
  }


  public Label datacenters(List<NestedDatacenter> datacenters) {
    
    this.datacenters = datacenters;
    return this;
  }

  public Label addDatacentersItem(NestedDatacenter datacentersItem) {
    if (this.datacenters == null) {
      this.datacenters = new ArrayList<NestedDatacenter>();
    }
    this.datacenters.add(datacentersItem);
    return this;
  }

   /**
   * Get datacenters
   * @return datacenters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedDatacenter> getDatacenters() {
    return datacenters;
  }


  public void setDatacenters(List<NestedDatacenter> datacenters) {
    this.datacenters = datacenters;
  }


  public Label diskNum(Integer diskNum) {
    
    this.diskNum = diskNum;
    return this;
  }

   /**
   * Get diskNum
   * @return diskNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDiskNum() {
    return diskNum;
  }


  public void setDiskNum(Integer diskNum) {
    this.diskNum = diskNum;
  }


  public Label disks(List<NestedDisk> disks) {
    
    this.disks = disks;
    return this;
  }

  public Label addDisksItem(NestedDisk disksItem) {
    if (this.disks == null) {
      this.disks = new ArrayList<NestedDisk>();
    }
    this.disks.add(disksItem);
    return this;
  }

   /**
   * Get disks
   * @return disks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedDisk> getDisks() {
    return disks;
  }


  public void setDisks(List<NestedDisk> disks) {
    this.disks = disks;
  }


  public Label elfImageNum(Integer elfImageNum) {
    
    this.elfImageNum = elfImageNum;
    return this;
  }

   /**
   * Get elfImageNum
   * @return elfImageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getElfImageNum() {
    return elfImageNum;
  }


  public void setElfImageNum(Integer elfImageNum) {
    this.elfImageNum = elfImageNum;
  }


  public Label elfImages(List<NestedElfImage> elfImages) {
    
    this.elfImages = elfImages;
    return this;
  }

  public Label addElfImagesItem(NestedElfImage elfImagesItem) {
    if (this.elfImages == null) {
      this.elfImages = new ArrayList<NestedElfImage>();
    }
    this.elfImages.add(elfImagesItem);
    return this;
  }

   /**
   * Get elfImages
   * @return elfImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedElfImage> getElfImages() {
    return elfImages;
  }


  public void setElfImages(List<NestedElfImage> elfImages) {
    this.elfImages = elfImages;
  }


  public Label gpuDeviceNum(Integer gpuDeviceNum) {
    
    this.gpuDeviceNum = gpuDeviceNum;
    return this;
  }

   /**
   * Get gpuDeviceNum
   * @return gpuDeviceNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGpuDeviceNum() {
    return gpuDeviceNum;
  }


  public void setGpuDeviceNum(Integer gpuDeviceNum) {
    this.gpuDeviceNum = gpuDeviceNum;
  }


  public Label gpuDevices(List<NestedGpuDevice> gpuDevices) {
    
    this.gpuDevices = gpuDevices;
    return this;
  }

  public Label addGpuDevicesItem(NestedGpuDevice gpuDevicesItem) {
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


  public Label hostNum(Integer hostNum) {
    
    this.hostNum = hostNum;
    return this;
  }

   /**
   * Get hostNum
   * @return hostNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHostNum() {
    return hostNum;
  }


  public void setHostNum(Integer hostNum) {
    this.hostNum = hostNum;
  }


  public Label hosts(List<NestedHost> hosts) {
    
    this.hosts = hosts;
    return this;
  }

  public Label addHostsItem(NestedHost hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<NestedHost>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

   /**
   * Get hosts
   * @return hosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedHost> getHosts() {
    return hosts;
  }


  public void setHosts(List<NestedHost> hosts) {
    this.hosts = hosts;
  }


  public Label id(String id) {
    
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


  public Label iscsiLunNum(Integer iscsiLunNum) {
    
    this.iscsiLunNum = iscsiLunNum;
    return this;
  }

   /**
   * Get iscsiLunNum
   * @return iscsiLunNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiLunNum() {
    return iscsiLunNum;
  }


  public void setIscsiLunNum(Integer iscsiLunNum) {
    this.iscsiLunNum = iscsiLunNum;
  }


  public Label iscsiLunSnapshotNum(Integer iscsiLunSnapshotNum) {
    
    this.iscsiLunSnapshotNum = iscsiLunSnapshotNum;
    return this;
  }

   /**
   * Get iscsiLunSnapshotNum
   * @return iscsiLunSnapshotNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiLunSnapshotNum() {
    return iscsiLunSnapshotNum;
  }


  public void setIscsiLunSnapshotNum(Integer iscsiLunSnapshotNum) {
    this.iscsiLunSnapshotNum = iscsiLunSnapshotNum;
  }


  public Label iscsiLunSnapshots(List<NestedIscsiLunSnapshot> iscsiLunSnapshots) {
    
    this.iscsiLunSnapshots = iscsiLunSnapshots;
    return this;
  }

  public Label addIscsiLunSnapshotsItem(NestedIscsiLunSnapshot iscsiLunSnapshotsItem) {
    if (this.iscsiLunSnapshots == null) {
      this.iscsiLunSnapshots = new ArrayList<NestedIscsiLunSnapshot>();
    }
    this.iscsiLunSnapshots.add(iscsiLunSnapshotsItem);
    return this;
  }

   /**
   * Get iscsiLunSnapshots
   * @return iscsiLunSnapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedIscsiLunSnapshot> getIscsiLunSnapshots() {
    return iscsiLunSnapshots;
  }


  public void setIscsiLunSnapshots(List<NestedIscsiLunSnapshot> iscsiLunSnapshots) {
    this.iscsiLunSnapshots = iscsiLunSnapshots;
  }


  public Label iscsiLuns(List<NestedIscsiLun> iscsiLuns) {
    
    this.iscsiLuns = iscsiLuns;
    return this;
  }

  public Label addIscsiLunsItem(NestedIscsiLun iscsiLunsItem) {
    if (this.iscsiLuns == null) {
      this.iscsiLuns = new ArrayList<NestedIscsiLun>();
    }
    this.iscsiLuns.add(iscsiLunsItem);
    return this;
  }

   /**
   * Get iscsiLuns
   * @return iscsiLuns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedIscsiLun> getIscsiLuns() {
    return iscsiLuns;
  }


  public void setIscsiLuns(List<NestedIscsiLun> iscsiLuns) {
    this.iscsiLuns = iscsiLuns;
  }


  public Label iscsiTargetNum(Integer iscsiTargetNum) {
    
    this.iscsiTargetNum = iscsiTargetNum;
    return this;
  }

   /**
   * Get iscsiTargetNum
   * @return iscsiTargetNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiTargetNum() {
    return iscsiTargetNum;
  }


  public void setIscsiTargetNum(Integer iscsiTargetNum) {
    this.iscsiTargetNum = iscsiTargetNum;
  }


  public Label iscsiTargets(List<NestedIscsiTarget> iscsiTargets) {
    
    this.iscsiTargets = iscsiTargets;
    return this;
  }

  public Label addIscsiTargetsItem(NestedIscsiTarget iscsiTargetsItem) {
    if (this.iscsiTargets == null) {
      this.iscsiTargets = new ArrayList<NestedIscsiTarget>();
    }
    this.iscsiTargets.add(iscsiTargetsItem);
    return this;
  }

   /**
   * Get iscsiTargets
   * @return iscsiTargets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedIscsiTarget> getIscsiTargets() {
    return iscsiTargets;
  }


  public void setIscsiTargets(List<NestedIscsiTarget> iscsiTargets) {
    this.iscsiTargets = iscsiTargets;
  }


  public Label isolationPolicies(List<NestedIsolationPolicy> isolationPolicies) {
    
    this.isolationPolicies = isolationPolicies;
    return this;
  }

  public Label addIsolationPoliciesItem(NestedIsolationPolicy isolationPoliciesItem) {
    if (this.isolationPolicies == null) {
      this.isolationPolicies = new ArrayList<NestedIsolationPolicy>();
    }
    this.isolationPolicies.add(isolationPoliciesItem);
    return this;
  }

   /**
   * Get isolationPolicies
   * @return isolationPolicies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedIsolationPolicy> getIsolationPolicies() {
    return isolationPolicies;
  }


  public void setIsolationPolicies(List<NestedIsolationPolicy> isolationPolicies) {
    this.isolationPolicies = isolationPolicies;
  }


  public Label isolationPolicyNum(Integer isolationPolicyNum) {
    
    this.isolationPolicyNum = isolationPolicyNum;
    return this;
  }

   /**
   * Get isolationPolicyNum
   * @return isolationPolicyNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIsolationPolicyNum() {
    return isolationPolicyNum;
  }


  public void setIsolationPolicyNum(Integer isolationPolicyNum) {
    this.isolationPolicyNum = isolationPolicyNum;
  }


  public Label key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public Label namespaceGroupNum(Integer namespaceGroupNum) {
    
    this.namespaceGroupNum = namespaceGroupNum;
    return this;
  }

   /**
   * Get namespaceGroupNum
   * @return namespaceGroupNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNamespaceGroupNum() {
    return namespaceGroupNum;
  }


  public void setNamespaceGroupNum(Integer namespaceGroupNum) {
    this.namespaceGroupNum = namespaceGroupNum;
  }


  public Label namespaceGroups(List<NestedNamespaceGroup> namespaceGroups) {
    
    this.namespaceGroups = namespaceGroups;
    return this;
  }

  public Label addNamespaceGroupsItem(NestedNamespaceGroup namespaceGroupsItem) {
    if (this.namespaceGroups == null) {
      this.namespaceGroups = new ArrayList<NestedNamespaceGroup>();
    }
    this.namespaceGroups.add(namespaceGroupsItem);
    return this;
  }

   /**
   * Get namespaceGroups
   * @return namespaceGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedNamespaceGroup> getNamespaceGroups() {
    return namespaceGroups;
  }


  public void setNamespaceGroups(List<NestedNamespaceGroup> namespaceGroups) {
    this.namespaceGroups = namespaceGroups;
  }


  public Label nfsExportNum(Integer nfsExportNum) {
    
    this.nfsExportNum = nfsExportNum;
    return this;
  }

   /**
   * Get nfsExportNum
   * @return nfsExportNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNfsExportNum() {
    return nfsExportNum;
  }


  public void setNfsExportNum(Integer nfsExportNum) {
    this.nfsExportNum = nfsExportNum;
  }


  public Label nfsExports(List<NestedNfsExport> nfsExports) {
    
    this.nfsExports = nfsExports;
    return this;
  }

  public Label addNfsExportsItem(NestedNfsExport nfsExportsItem) {
    if (this.nfsExports == null) {
      this.nfsExports = new ArrayList<NestedNfsExport>();
    }
    this.nfsExports.add(nfsExportsItem);
    return this;
  }

   /**
   * Get nfsExports
   * @return nfsExports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedNfsExport> getNfsExports() {
    return nfsExports;
  }


  public void setNfsExports(List<NestedNfsExport> nfsExports) {
    this.nfsExports = nfsExports;
  }


  public Label nfsInodeNum(Integer nfsInodeNum) {
    
    this.nfsInodeNum = nfsInodeNum;
    return this;
  }

   /**
   * Get nfsInodeNum
   * @return nfsInodeNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNfsInodeNum() {
    return nfsInodeNum;
  }


  public void setNfsInodeNum(Integer nfsInodeNum) {
    this.nfsInodeNum = nfsInodeNum;
  }


  public Label nfsInodes(List<NestedNfsInode> nfsInodes) {
    
    this.nfsInodes = nfsInodes;
    return this;
  }

  public Label addNfsInodesItem(NestedNfsInode nfsInodesItem) {
    if (this.nfsInodes == null) {
      this.nfsInodes = new ArrayList<NestedNfsInode>();
    }
    this.nfsInodes.add(nfsInodesItem);
    return this;
  }

   /**
   * Get nfsInodes
   * @return nfsInodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedNfsInode> getNfsInodes() {
    return nfsInodes;
  }


  public void setNfsInodes(List<NestedNfsInode> nfsInodes) {
    this.nfsInodes = nfsInodes;
  }


  public Label nicNum(Integer nicNum) {
    
    this.nicNum = nicNum;
    return this;
  }

   /**
   * Get nicNum
   * @return nicNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNicNum() {
    return nicNum;
  }


  public void setNicNum(Integer nicNum) {
    this.nicNum = nicNum;
  }


  public Label nics(List<NestedNic> nics) {
    
    this.nics = nics;
    return this;
  }

  public Label addNicsItem(NestedNic nicsItem) {
    if (this.nics == null) {
      this.nics = new ArrayList<NestedNic>();
    }
    this.nics.add(nicsItem);
    return this;
  }

   /**
   * Get nics
   * @return nics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedNic> getNics() {
    return nics;
  }


  public void setNics(List<NestedNic> nics) {
    this.nics = nics;
  }


  public Label nvmfNamespaceNum(Integer nvmfNamespaceNum) {
    
    this.nvmfNamespaceNum = nvmfNamespaceNum;
    return this;
  }

   /**
   * Get nvmfNamespaceNum
   * @return nvmfNamespaceNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNvmfNamespaceNum() {
    return nvmfNamespaceNum;
  }


  public void setNvmfNamespaceNum(Integer nvmfNamespaceNum) {
    this.nvmfNamespaceNum = nvmfNamespaceNum;
  }


  public Label nvmfNamespaceSnapshotNum(Integer nvmfNamespaceSnapshotNum) {
    
    this.nvmfNamespaceSnapshotNum = nvmfNamespaceSnapshotNum;
    return this;
  }

   /**
   * Get nvmfNamespaceSnapshotNum
   * @return nvmfNamespaceSnapshotNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNvmfNamespaceSnapshotNum() {
    return nvmfNamespaceSnapshotNum;
  }


  public void setNvmfNamespaceSnapshotNum(Integer nvmfNamespaceSnapshotNum) {
    this.nvmfNamespaceSnapshotNum = nvmfNamespaceSnapshotNum;
  }


  public Label nvmfNamespaceSnapshots(List<NestedNvmfNamespaceSnapshot> nvmfNamespaceSnapshots) {
    
    this.nvmfNamespaceSnapshots = nvmfNamespaceSnapshots;
    return this;
  }

  public Label addNvmfNamespaceSnapshotsItem(NestedNvmfNamespaceSnapshot nvmfNamespaceSnapshotsItem) {
    if (this.nvmfNamespaceSnapshots == null) {
      this.nvmfNamespaceSnapshots = new ArrayList<NestedNvmfNamespaceSnapshot>();
    }
    this.nvmfNamespaceSnapshots.add(nvmfNamespaceSnapshotsItem);
    return this;
  }

   /**
   * Get nvmfNamespaceSnapshots
   * @return nvmfNamespaceSnapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedNvmfNamespaceSnapshot> getNvmfNamespaceSnapshots() {
    return nvmfNamespaceSnapshots;
  }


  public void setNvmfNamespaceSnapshots(List<NestedNvmfNamespaceSnapshot> nvmfNamespaceSnapshots) {
    this.nvmfNamespaceSnapshots = nvmfNamespaceSnapshots;
  }


  public Label nvmfNamespaces(List<NestedNvmfNamespace> nvmfNamespaces) {
    
    this.nvmfNamespaces = nvmfNamespaces;
    return this;
  }

  public Label addNvmfNamespacesItem(NestedNvmfNamespace nvmfNamespacesItem) {
    if (this.nvmfNamespaces == null) {
      this.nvmfNamespaces = new ArrayList<NestedNvmfNamespace>();
    }
    this.nvmfNamespaces.add(nvmfNamespacesItem);
    return this;
  }

   /**
   * Get nvmfNamespaces
   * @return nvmfNamespaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedNvmfNamespace> getNvmfNamespaces() {
    return nvmfNamespaces;
  }


  public void setNvmfNamespaces(List<NestedNvmfNamespace> nvmfNamespaces) {
    this.nvmfNamespaces = nvmfNamespaces;
  }


  public Label nvmfSubsystemNum(Integer nvmfSubsystemNum) {
    
    this.nvmfSubsystemNum = nvmfSubsystemNum;
    return this;
  }

   /**
   * Get nvmfSubsystemNum
   * @return nvmfSubsystemNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNvmfSubsystemNum() {
    return nvmfSubsystemNum;
  }


  public void setNvmfSubsystemNum(Integer nvmfSubsystemNum) {
    this.nvmfSubsystemNum = nvmfSubsystemNum;
  }


  public Label nvmfSubsystems(List<NestedNvmfSubsystem> nvmfSubsystems) {
    
    this.nvmfSubsystems = nvmfSubsystems;
    return this;
  }

  public Label addNvmfSubsystemsItem(NestedNvmfSubsystem nvmfSubsystemsItem) {
    if (this.nvmfSubsystems == null) {
      this.nvmfSubsystems = new ArrayList<NestedNvmfSubsystem>();
    }
    this.nvmfSubsystems.add(nvmfSubsystemsItem);
    return this;
  }

   /**
   * Get nvmfSubsystems
   * @return nvmfSubsystems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedNvmfSubsystem> getNvmfSubsystems() {
    return nvmfSubsystems;
  }


  public void setNvmfSubsystems(List<NestedNvmfSubsystem> nvmfSubsystems) {
    this.nvmfSubsystems = nvmfSubsystems;
  }


  public Label securityPolicies(List<NestedSecurityPolicy> securityPolicies) {
    
    this.securityPolicies = securityPolicies;
    return this;
  }

  public Label addSecurityPoliciesItem(NestedSecurityPolicy securityPoliciesItem) {
    if (this.securityPolicies == null) {
      this.securityPolicies = new ArrayList<NestedSecurityPolicy>();
    }
    this.securityPolicies.add(securityPoliciesItem);
    return this;
  }

   /**
   * Get securityPolicies
   * @return securityPolicies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedSecurityPolicy> getSecurityPolicies() {
    return securityPolicies;
  }


  public void setSecurityPolicies(List<NestedSecurityPolicy> securityPolicies) {
    this.securityPolicies = securityPolicies;
  }


  public Label securityPolicyNum(Integer securityPolicyNum) {
    
    this.securityPolicyNum = securityPolicyNum;
    return this;
  }

   /**
   * Get securityPolicyNum
   * @return securityPolicyNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSecurityPolicyNum() {
    return securityPolicyNum;
  }


  public void setSecurityPolicyNum(Integer securityPolicyNum) {
    this.securityPolicyNum = securityPolicyNum;
  }


  public Label systemVlanNum(Integer systemVlanNum) {
    
    this.systemVlanNum = systemVlanNum;
    return this;
  }

   /**
   * Get systemVlanNum
   * @return systemVlanNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSystemVlanNum() {
    return systemVlanNum;
  }


  public void setSystemVlanNum(Integer systemVlanNum) {
    this.systemVlanNum = systemVlanNum;
  }


  public Label totalNum(Integer totalNum) {
    
    this.totalNum = totalNum;
    return this;
  }

   /**
   * Get totalNum
   * @return totalNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalNum() {
    return totalNum;
  }


  public void setTotalNum(Integer totalNum) {
    this.totalNum = totalNum;
  }


  public Label value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public Label vdsNum(Integer vdsNum) {
    
    this.vdsNum = vdsNum;
    return this;
  }

   /**
   * Get vdsNum
   * @return vdsNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVdsNum() {
    return vdsNum;
  }


  public void setVdsNum(Integer vdsNum) {
    this.vdsNum = vdsNum;
  }


  public Label vdses(List<NestedVds> vdses) {
    
    this.vdses = vdses;
    return this;
  }

  public Label addVdsesItem(NestedVds vdsesItem) {
    if (this.vdses == null) {
      this.vdses = new ArrayList<NestedVds>();
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

  public List<NestedVds> getVdses() {
    return vdses;
  }


  public void setVdses(List<NestedVds> vdses) {
    this.vdses = vdses;
  }


  public Label vlans(List<NestedVlan> vlans) {
    
    this.vlans = vlans;
    return this;
  }

  public Label addVlansItem(NestedVlan vlansItem) {
    if (this.vlans == null) {
      this.vlans = new ArrayList<NestedVlan>();
    }
    this.vlans.add(vlansItem);
    return this;
  }

   /**
   * Get vlans
   * @return vlans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVlan> getVlans() {
    return vlans;
  }


  public void setVlans(List<NestedVlan> vlans) {
    this.vlans = vlans;
  }


  public Label vmNum(Integer vmNum) {
    
    this.vmNum = vmNum;
    return this;
  }

   /**
   * Get vmNum
   * @return vmNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmNum() {
    return vmNum;
  }


  public void setVmNum(Integer vmNum) {
    this.vmNum = vmNum;
  }


  public Label vmSnapshotNum(Integer vmSnapshotNum) {
    
    this.vmSnapshotNum = vmSnapshotNum;
    return this;
  }

   /**
   * Get vmSnapshotNum
   * @return vmSnapshotNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmSnapshotNum() {
    return vmSnapshotNum;
  }


  public void setVmSnapshotNum(Integer vmSnapshotNum) {
    this.vmSnapshotNum = vmSnapshotNum;
  }


  public Label vmSnapshots(List<NestedVmSnapshot> vmSnapshots) {
    
    this.vmSnapshots = vmSnapshots;
    return this;
  }

  public Label addVmSnapshotsItem(NestedVmSnapshot vmSnapshotsItem) {
    if (this.vmSnapshots == null) {
      this.vmSnapshots = new ArrayList<NestedVmSnapshot>();
    }
    this.vmSnapshots.add(vmSnapshotsItem);
    return this;
  }

   /**
   * Get vmSnapshots
   * @return vmSnapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVmSnapshot> getVmSnapshots() {
    return vmSnapshots;
  }


  public void setVmSnapshots(List<NestedVmSnapshot> vmSnapshots) {
    this.vmSnapshots = vmSnapshots;
  }


  public Label vmTemplateNum(Integer vmTemplateNum) {
    
    this.vmTemplateNum = vmTemplateNum;
    return this;
  }

   /**
   * Get vmTemplateNum
   * @return vmTemplateNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmTemplateNum() {
    return vmTemplateNum;
  }


  public void setVmTemplateNum(Integer vmTemplateNum) {
    this.vmTemplateNum = vmTemplateNum;
  }


  public Label vmTemplates(List<NestedVmTemplate> vmTemplates) {
    
    this.vmTemplates = vmTemplates;
    return this;
  }

  public Label addVmTemplatesItem(NestedVmTemplate vmTemplatesItem) {
    if (this.vmTemplates == null) {
      this.vmTemplates = new ArrayList<NestedVmTemplate>();
    }
    this.vmTemplates.add(vmTemplatesItem);
    return this;
  }

   /**
   * Get vmTemplates
   * @return vmTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVmTemplate> getVmTemplates() {
    return vmTemplates;
  }


  public void setVmTemplates(List<NestedVmTemplate> vmTemplates) {
    this.vmTemplates = vmTemplates;
  }


  public Label vmVlanNum(Integer vmVlanNum) {
    
    this.vmVlanNum = vmVlanNum;
    return this;
  }

   /**
   * Get vmVlanNum
   * @return vmVlanNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVlanNum() {
    return vmVlanNum;
  }


  public void setVmVlanNum(Integer vmVlanNum) {
    this.vmVlanNum = vmVlanNum;
  }


  public Label vmVolumeNum(Integer vmVolumeNum) {
    
    this.vmVolumeNum = vmVolumeNum;
    return this;
  }

   /**
   * Get vmVolumeNum
   * @return vmVolumeNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVolumeNum() {
    return vmVolumeNum;
  }


  public void setVmVolumeNum(Integer vmVolumeNum) {
    this.vmVolumeNum = vmVolumeNum;
  }


  public Label vmVolumeSnapshotNum(Integer vmVolumeSnapshotNum) {
    
    this.vmVolumeSnapshotNum = vmVolumeSnapshotNum;
    return this;
  }

   /**
   * Get vmVolumeSnapshotNum
   * @return vmVolumeSnapshotNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVolumeSnapshotNum() {
    return vmVolumeSnapshotNum;
  }


  public void setVmVolumeSnapshotNum(Integer vmVolumeSnapshotNum) {
    this.vmVolumeSnapshotNum = vmVolumeSnapshotNum;
  }


  public Label vmVolumeSnapshots(List<NestedVmVolumeSnapshot> vmVolumeSnapshots) {
    
    this.vmVolumeSnapshots = vmVolumeSnapshots;
    return this;
  }

  public Label addVmVolumeSnapshotsItem(NestedVmVolumeSnapshot vmVolumeSnapshotsItem) {
    if (this.vmVolumeSnapshots == null) {
      this.vmVolumeSnapshots = new ArrayList<NestedVmVolumeSnapshot>();
    }
    this.vmVolumeSnapshots.add(vmVolumeSnapshotsItem);
    return this;
  }

   /**
   * Get vmVolumeSnapshots
   * @return vmVolumeSnapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVmVolumeSnapshot> getVmVolumeSnapshots() {
    return vmVolumeSnapshots;
  }


  public void setVmVolumeSnapshots(List<NestedVmVolumeSnapshot> vmVolumeSnapshots) {
    this.vmVolumeSnapshots = vmVolumeSnapshots;
  }


  public Label vmVolumes(List<NestedVmVolume> vmVolumes) {
    
    this.vmVolumes = vmVolumes;
    return this;
  }

  public Label addVmVolumesItem(NestedVmVolume vmVolumesItem) {
    if (this.vmVolumes == null) {
      this.vmVolumes = new ArrayList<NestedVmVolume>();
    }
    this.vmVolumes.add(vmVolumesItem);
    return this;
  }

   /**
   * Get vmVolumes
   * @return vmVolumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVmVolume> getVmVolumes() {
    return vmVolumes;
  }


  public void setVmVolumes(List<NestedVmVolume> vmVolumes) {
    this.vmVolumes = vmVolumes;
  }


  public Label vms(List<NestedVm> vms) {
    
    this.vms = vms;
    return this;
  }

  public Label addVmsItem(NestedVm vmsItem) {
    if (this.vms == null) {
      this.vms = new ArrayList<NestedVm>();
    }
    this.vms.add(vmsItem);
    return this;
  }

   /**
   * Get vms
   * @return vms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVm> getVms() {
    return vms;
  }


  public void setVms(List<NestedVm> vms) {
    this.vms = vms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Label label = (Label) o;
    return Objects.equals(this.clusterNum, label.clusterNum) &&
        Objects.equals(this.clusters, label.clusters) &&
        Objects.equals(this.consistencyGroupNum, label.consistencyGroupNum) &&
        Objects.equals(this.consistencyGroupSnapshotNum, label.consistencyGroupSnapshotNum) &&
        Objects.equals(this.consistencyGroupSnapshots, label.consistencyGroupSnapshots) &&
        Objects.equals(this.consistencyGroups, label.consistencyGroups) &&
        Objects.equals(this.contentLibraryImageNum, label.contentLibraryImageNum) &&
        Objects.equals(this.contentLibraryImages, label.contentLibraryImages) &&
        Objects.equals(this.contentLibraryVmTemplateNum, label.contentLibraryVmTemplateNum) &&
        Objects.equals(this.contentLibraryVmTemplates, label.contentLibraryVmTemplates) &&
        Objects.equals(this.createdAt, label.createdAt) &&
        Objects.equals(this.datacenterNum, label.datacenterNum) &&
        Objects.equals(this.datacenters, label.datacenters) &&
        Objects.equals(this.diskNum, label.diskNum) &&
        Objects.equals(this.disks, label.disks) &&
        Objects.equals(this.elfImageNum, label.elfImageNum) &&
        Objects.equals(this.elfImages, label.elfImages) &&
        Objects.equals(this.gpuDeviceNum, label.gpuDeviceNum) &&
        Objects.equals(this.gpuDevices, label.gpuDevices) &&
        Objects.equals(this.hostNum, label.hostNum) &&
        Objects.equals(this.hosts, label.hosts) &&
        Objects.equals(this.id, label.id) &&
        Objects.equals(this.iscsiLunNum, label.iscsiLunNum) &&
        Objects.equals(this.iscsiLunSnapshotNum, label.iscsiLunSnapshotNum) &&
        Objects.equals(this.iscsiLunSnapshots, label.iscsiLunSnapshots) &&
        Objects.equals(this.iscsiLuns, label.iscsiLuns) &&
        Objects.equals(this.iscsiTargetNum, label.iscsiTargetNum) &&
        Objects.equals(this.iscsiTargets, label.iscsiTargets) &&
        Objects.equals(this.isolationPolicies, label.isolationPolicies) &&
        Objects.equals(this.isolationPolicyNum, label.isolationPolicyNum) &&
        Objects.equals(this.key, label.key) &&
        Objects.equals(this.namespaceGroupNum, label.namespaceGroupNum) &&
        Objects.equals(this.namespaceGroups, label.namespaceGroups) &&
        Objects.equals(this.nfsExportNum, label.nfsExportNum) &&
        Objects.equals(this.nfsExports, label.nfsExports) &&
        Objects.equals(this.nfsInodeNum, label.nfsInodeNum) &&
        Objects.equals(this.nfsInodes, label.nfsInodes) &&
        Objects.equals(this.nicNum, label.nicNum) &&
        Objects.equals(this.nics, label.nics) &&
        Objects.equals(this.nvmfNamespaceNum, label.nvmfNamespaceNum) &&
        Objects.equals(this.nvmfNamespaceSnapshotNum, label.nvmfNamespaceSnapshotNum) &&
        Objects.equals(this.nvmfNamespaceSnapshots, label.nvmfNamespaceSnapshots) &&
        Objects.equals(this.nvmfNamespaces, label.nvmfNamespaces) &&
        Objects.equals(this.nvmfSubsystemNum, label.nvmfSubsystemNum) &&
        Objects.equals(this.nvmfSubsystems, label.nvmfSubsystems) &&
        Objects.equals(this.securityPolicies, label.securityPolicies) &&
        Objects.equals(this.securityPolicyNum, label.securityPolicyNum) &&
        Objects.equals(this.systemVlanNum, label.systemVlanNum) &&
        Objects.equals(this.totalNum, label.totalNum) &&
        Objects.equals(this.value, label.value) &&
        Objects.equals(this.vdsNum, label.vdsNum) &&
        Objects.equals(this.vdses, label.vdses) &&
        Objects.equals(this.vlans, label.vlans) &&
        Objects.equals(this.vmNum, label.vmNum) &&
        Objects.equals(this.vmSnapshotNum, label.vmSnapshotNum) &&
        Objects.equals(this.vmSnapshots, label.vmSnapshots) &&
        Objects.equals(this.vmTemplateNum, label.vmTemplateNum) &&
        Objects.equals(this.vmTemplates, label.vmTemplates) &&
        Objects.equals(this.vmVlanNum, label.vmVlanNum) &&
        Objects.equals(this.vmVolumeNum, label.vmVolumeNum) &&
        Objects.equals(this.vmVolumeSnapshotNum, label.vmVolumeSnapshotNum) &&
        Objects.equals(this.vmVolumeSnapshots, label.vmVolumeSnapshots) &&
        Objects.equals(this.vmVolumes, label.vmVolumes) &&
        Objects.equals(this.vms, label.vms);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterNum, clusters, consistencyGroupNum, consistencyGroupSnapshotNum, consistencyGroupSnapshots, consistencyGroups, contentLibraryImageNum, contentLibraryImages, contentLibraryVmTemplateNum, contentLibraryVmTemplates, createdAt, datacenterNum, datacenters, diskNum, disks, elfImageNum, elfImages, gpuDeviceNum, gpuDevices, hostNum, hosts, id, iscsiLunNum, iscsiLunSnapshotNum, iscsiLunSnapshots, iscsiLuns, iscsiTargetNum, iscsiTargets, isolationPolicies, isolationPolicyNum, key, namespaceGroupNum, namespaceGroups, nfsExportNum, nfsExports, nfsInodeNum, nfsInodes, nicNum, nics, nvmfNamespaceNum, nvmfNamespaceSnapshotNum, nvmfNamespaceSnapshots, nvmfNamespaces, nvmfSubsystemNum, nvmfSubsystems, securityPolicies, securityPolicyNum, systemVlanNum, totalNum, value, vdsNum, vdses, vlans, vmNum, vmSnapshotNum, vmSnapshots, vmTemplateNum, vmTemplates, vmVlanNum, vmVolumeNum, vmVolumeSnapshotNum, vmVolumeSnapshots, vmVolumes, vms);
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
    sb.append("class Label {\n");
    sb.append("    clusterNum: ").append(toIndentedString(clusterNum)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    consistencyGroupNum: ").append(toIndentedString(consistencyGroupNum)).append("\n");
    sb.append("    consistencyGroupSnapshotNum: ").append(toIndentedString(consistencyGroupSnapshotNum)).append("\n");
    sb.append("    consistencyGroupSnapshots: ").append(toIndentedString(consistencyGroupSnapshots)).append("\n");
    sb.append("    consistencyGroups: ").append(toIndentedString(consistencyGroups)).append("\n");
    sb.append("    contentLibraryImageNum: ").append(toIndentedString(contentLibraryImageNum)).append("\n");
    sb.append("    contentLibraryImages: ").append(toIndentedString(contentLibraryImages)).append("\n");
    sb.append("    contentLibraryVmTemplateNum: ").append(toIndentedString(contentLibraryVmTemplateNum)).append("\n");
    sb.append("    contentLibraryVmTemplates: ").append(toIndentedString(contentLibraryVmTemplates)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    datacenterNum: ").append(toIndentedString(datacenterNum)).append("\n");
    sb.append("    datacenters: ").append(toIndentedString(datacenters)).append("\n");
    sb.append("    diskNum: ").append(toIndentedString(diskNum)).append("\n");
    sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
    sb.append("    elfImageNum: ").append(toIndentedString(elfImageNum)).append("\n");
    sb.append("    elfImages: ").append(toIndentedString(elfImages)).append("\n");
    sb.append("    gpuDeviceNum: ").append(toIndentedString(gpuDeviceNum)).append("\n");
    sb.append("    gpuDevices: ").append(toIndentedString(gpuDevices)).append("\n");
    sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iscsiLunNum: ").append(toIndentedString(iscsiLunNum)).append("\n");
    sb.append("    iscsiLunSnapshotNum: ").append(toIndentedString(iscsiLunSnapshotNum)).append("\n");
    sb.append("    iscsiLunSnapshots: ").append(toIndentedString(iscsiLunSnapshots)).append("\n");
    sb.append("    iscsiLuns: ").append(toIndentedString(iscsiLuns)).append("\n");
    sb.append("    iscsiTargetNum: ").append(toIndentedString(iscsiTargetNum)).append("\n");
    sb.append("    iscsiTargets: ").append(toIndentedString(iscsiTargets)).append("\n");
    sb.append("    isolationPolicies: ").append(toIndentedString(isolationPolicies)).append("\n");
    sb.append("    isolationPolicyNum: ").append(toIndentedString(isolationPolicyNum)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    namespaceGroupNum: ").append(toIndentedString(namespaceGroupNum)).append("\n");
    sb.append("    namespaceGroups: ").append(toIndentedString(namespaceGroups)).append("\n");
    sb.append("    nfsExportNum: ").append(toIndentedString(nfsExportNum)).append("\n");
    sb.append("    nfsExports: ").append(toIndentedString(nfsExports)).append("\n");
    sb.append("    nfsInodeNum: ").append(toIndentedString(nfsInodeNum)).append("\n");
    sb.append("    nfsInodes: ").append(toIndentedString(nfsInodes)).append("\n");
    sb.append("    nicNum: ").append(toIndentedString(nicNum)).append("\n");
    sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
    sb.append("    nvmfNamespaceNum: ").append(toIndentedString(nvmfNamespaceNum)).append("\n");
    sb.append("    nvmfNamespaceSnapshotNum: ").append(toIndentedString(nvmfNamespaceSnapshotNum)).append("\n");
    sb.append("    nvmfNamespaceSnapshots: ").append(toIndentedString(nvmfNamespaceSnapshots)).append("\n");
    sb.append("    nvmfNamespaces: ").append(toIndentedString(nvmfNamespaces)).append("\n");
    sb.append("    nvmfSubsystemNum: ").append(toIndentedString(nvmfSubsystemNum)).append("\n");
    sb.append("    nvmfSubsystems: ").append(toIndentedString(nvmfSubsystems)).append("\n");
    sb.append("    securityPolicies: ").append(toIndentedString(securityPolicies)).append("\n");
    sb.append("    securityPolicyNum: ").append(toIndentedString(securityPolicyNum)).append("\n");
    sb.append("    systemVlanNum: ").append(toIndentedString(systemVlanNum)).append("\n");
    sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    vdsNum: ").append(toIndentedString(vdsNum)).append("\n");
    sb.append("    vdses: ").append(toIndentedString(vdses)).append("\n");
    sb.append("    vlans: ").append(toIndentedString(vlans)).append("\n");
    sb.append("    vmNum: ").append(toIndentedString(vmNum)).append("\n");
    sb.append("    vmSnapshotNum: ").append(toIndentedString(vmSnapshotNum)).append("\n");
    sb.append("    vmSnapshots: ").append(toIndentedString(vmSnapshots)).append("\n");
    sb.append("    vmTemplateNum: ").append(toIndentedString(vmTemplateNum)).append("\n");
    sb.append("    vmTemplates: ").append(toIndentedString(vmTemplates)).append("\n");
    sb.append("    vmVlanNum: ").append(toIndentedString(vmVlanNum)).append("\n");
    sb.append("    vmVolumeNum: ").append(toIndentedString(vmVolumeNum)).append("\n");
    sb.append("    vmVolumeSnapshotNum: ").append(toIndentedString(vmVolumeSnapshotNum)).append("\n");
    sb.append("    vmVolumeSnapshots: ").append(toIndentedString(vmVolumeSnapshots)).append("\n");
    sb.append("    vmVolumes: ").append(toIndentedString(vmVolumes)).append("\n");
    sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
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

