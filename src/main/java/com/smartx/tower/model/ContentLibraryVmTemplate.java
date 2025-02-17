package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.Architecture;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.NestedCluster;
import com.smartx.tower.model.NestedContentLibraryVmTemplateDisk;
import com.smartx.tower.model.NestedContentLibraryVmTemplateNic;
import com.smartx.tower.model.NestedCpu;
import com.smartx.tower.model.NestedLabel;
import com.smartx.tower.model.NestedTemplateConfig;
import com.smartx.tower.model.NestedVmTemplate;
import com.smartx.tower.model.NestedZbsStorageInfo;
import com.smartx.tower.model.VmClockOffset;
import com.smartx.tower.model.VmDiskIoPolicy;
import com.smartx.tower.model.VmDiskIoRestrictType;
import com.smartx.tower.model.VmFirmware;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ContentLibraryVmTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ContentLibraryVmTemplate {
  public static final String SERIALIZED_NAME_ARCHITECTURE = "architecture";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
  private Architecture architecture;

  public static final String SERIALIZED_NAME_CLOCK_OFFSET = "clock_offset";
  @SerializedName(SERIALIZED_NAME_CLOCK_OFFSET)
  private VmClockOffset clockOffset;

  public static final String SERIALIZED_NAME_CLOUD_INIT_SUPPORTED = "cloud_init_supported";
  @SerializedName(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED)
  private Boolean cloudInitSupported;

  public static final String SERIALIZED_NAME_CLUSTERS = "clusters";
  @SerializedName(SERIALIZED_NAME_CLUSTERS)
  private List<NestedCluster> clusters = null;

  public static final String SERIALIZED_NAME_CPU = "cpu";
  @SerializedName(SERIALIZED_NAME_CPU)
  private NestedCpu cpu;

  public static final String SERIALIZED_NAME_CPU_MODEL = "cpu_model";
  @SerializedName(SERIALIZED_NAME_CPU_MODEL)
  private String cpuModel;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_FIRMWARE = "firmware";
  @SerializedName(SERIALIZED_NAME_FIRMWARE)
  private VmFirmware firmware;

  public static final String SERIALIZED_NAME_HA = "ha";
  @SerializedName(SERIALIZED_NAME_HA)
  private Boolean ha;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IO_POLICY = "io_policy";
  @SerializedName(SERIALIZED_NAME_IO_POLICY)
  private VmDiskIoPolicy ioPolicy;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<NestedLabel> labels = null;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH = "max_bandwidth";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH)
  private Long maxBandwidth;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY = "max_bandwidth_policy";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY)
  private VmDiskIoRestrictType maxBandwidthPolicy;

  public static final String SERIALIZED_NAME_MAX_IOPS = "max_iops";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS)
  private Integer maxIops;

  public static final String SERIALIZED_NAME_MAX_IOPS_POLICY = "max_iops_policy";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY)
  private VmDiskIoRestrictType maxIopsPolicy;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private Long memory;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private String os;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_TEMPLATE_CONFIG = "template_config";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_CONFIG)
  private NestedTemplateConfig templateConfig;

  public static final String SERIALIZED_NAME_VCPU = "vcpu";
  @SerializedName(SERIALIZED_NAME_VCPU)
  private Integer vcpu;

  public static final String SERIALIZED_NAME_VIDEO_TYPE = "video_type";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE)
  private String videoType;

  public static final String SERIALIZED_NAME_VM_DISKS = "vm_disks";
  @SerializedName(SERIALIZED_NAME_VM_DISKS)
  private List<NestedContentLibraryVmTemplateDisk> vmDisks = null;

  public static final String SERIALIZED_NAME_VM_NICS = "vm_nics";
  @SerializedName(SERIALIZED_NAME_VM_NICS)
  private List<NestedContentLibraryVmTemplateNic> vmNics = null;

  public static final String SERIALIZED_NAME_VM_TEMPLATE_UUIDS = "vm_template_uuids";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_UUIDS)
  private List<String> vmTemplateUuids = new ArrayList<String>();

  public static final String SERIALIZED_NAME_VM_TEMPLATES = "vm_templates";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATES)
  private List<NestedVmTemplate> vmTemplates = null;

  public static final String SERIALIZED_NAME_WIN_OPT = "win_opt";
  @SerializedName(SERIALIZED_NAME_WIN_OPT)
  private Boolean winOpt;

  public static final String SERIALIZED_NAME_ZBS_STORAGE_INFO = "zbs_storage_info";
  @SerializedName(SERIALIZED_NAME_ZBS_STORAGE_INFO)
  private List<NestedZbsStorageInfo> zbsStorageInfo = null;

  public ContentLibraryVmTemplate() { 
  }

  public ContentLibraryVmTemplate architecture(Architecture architecture) {
    
    this.architecture = architecture;
    return this;
  }

   /**
   * Get architecture
   * @return architecture
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Architecture getArchitecture() {
    return architecture;
  }


  public void setArchitecture(Architecture architecture) {
    this.architecture = architecture;
  }


  public ContentLibraryVmTemplate clockOffset(VmClockOffset clockOffset) {
    
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


  public ContentLibraryVmTemplate cloudInitSupported(Boolean cloudInitSupported) {
    
    this.cloudInitSupported = cloudInitSupported;
    return this;
  }

   /**
   * Get cloudInitSupported
   * @return cloudInitSupported
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getCloudInitSupported() {
    return cloudInitSupported;
  }


  public void setCloudInitSupported(Boolean cloudInitSupported) {
    this.cloudInitSupported = cloudInitSupported;
  }


  public ContentLibraryVmTemplate clusters(List<NestedCluster> clusters) {
    
    this.clusters = clusters;
    return this;
  }

  public ContentLibraryVmTemplate addClustersItem(NestedCluster clustersItem) {
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


  public ContentLibraryVmTemplate cpu(NestedCpu cpu) {
    
    this.cpu = cpu;
    return this;
  }

   /**
   * Get cpu
   * @return cpu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedCpu getCpu() {
    return cpu;
  }


  public void setCpu(NestedCpu cpu) {
    this.cpu = cpu;
  }


  public ContentLibraryVmTemplate cpuModel(String cpuModel) {
    
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


  public ContentLibraryVmTemplate createdAt(String createdAt) {
    
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


  public ContentLibraryVmTemplate description(String description) {
    
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


  public ContentLibraryVmTemplate entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public ContentLibraryVmTemplate firmware(VmFirmware firmware) {
    
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


  public ContentLibraryVmTemplate ha(Boolean ha) {
    
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


  public ContentLibraryVmTemplate id(String id) {
    
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


  public ContentLibraryVmTemplate ioPolicy(VmDiskIoPolicy ioPolicy) {
    
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


  public ContentLibraryVmTemplate labels(List<NestedLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public ContentLibraryVmTemplate addLabelsItem(NestedLabel labelsItem) {
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


  public ContentLibraryVmTemplate maxBandwidth(Long maxBandwidth) {
    
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


  public ContentLibraryVmTemplate maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
    
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


  public ContentLibraryVmTemplate maxIops(Integer maxIops) {
    
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


  public ContentLibraryVmTemplate maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
    
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


  public ContentLibraryVmTemplate memory(Long memory) {
    
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


  public ContentLibraryVmTemplate name(String name) {
    
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


  public ContentLibraryVmTemplate os(String os) {
    
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


  public ContentLibraryVmTemplate size(Long size) {
    
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


  public ContentLibraryVmTemplate templateConfig(NestedTemplateConfig templateConfig) {
    
    this.templateConfig = templateConfig;
    return this;
  }

   /**
   * Get templateConfig
   * @return templateConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedTemplateConfig getTemplateConfig() {
    return templateConfig;
  }


  public void setTemplateConfig(NestedTemplateConfig templateConfig) {
    this.templateConfig = templateConfig;
  }


  public ContentLibraryVmTemplate vcpu(Integer vcpu) {
    
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


  public ContentLibraryVmTemplate videoType(String videoType) {
    
    this.videoType = videoType;
    return this;
  }

   /**
   * Get videoType
   * @return videoType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVideoType() {
    return videoType;
  }


  public void setVideoType(String videoType) {
    this.videoType = videoType;
  }


  public ContentLibraryVmTemplate vmDisks(List<NestedContentLibraryVmTemplateDisk> vmDisks) {
    
    this.vmDisks = vmDisks;
    return this;
  }

  public ContentLibraryVmTemplate addVmDisksItem(NestedContentLibraryVmTemplateDisk vmDisksItem) {
    if (this.vmDisks == null) {
      this.vmDisks = new ArrayList<NestedContentLibraryVmTemplateDisk>();
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

  public List<NestedContentLibraryVmTemplateDisk> getVmDisks() {
    return vmDisks;
  }


  public void setVmDisks(List<NestedContentLibraryVmTemplateDisk> vmDisks) {
    this.vmDisks = vmDisks;
  }


  public ContentLibraryVmTemplate vmNics(List<NestedContentLibraryVmTemplateNic> vmNics) {
    
    this.vmNics = vmNics;
    return this;
  }

  public ContentLibraryVmTemplate addVmNicsItem(NestedContentLibraryVmTemplateNic vmNicsItem) {
    if (this.vmNics == null) {
      this.vmNics = new ArrayList<NestedContentLibraryVmTemplateNic>();
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

  public List<NestedContentLibraryVmTemplateNic> getVmNics() {
    return vmNics;
  }


  public void setVmNics(List<NestedContentLibraryVmTemplateNic> vmNics) {
    this.vmNics = vmNics;
  }


  public ContentLibraryVmTemplate vmTemplateUuids(List<String> vmTemplateUuids) {
    
    this.vmTemplateUuids = vmTemplateUuids;
    return this;
  }

  public ContentLibraryVmTemplate addVmTemplateUuidsItem(String vmTemplateUuidsItem) {
    this.vmTemplateUuids.add(vmTemplateUuidsItem);
    return this;
  }

   /**
   * Get vmTemplateUuids
   * @return vmTemplateUuids
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getVmTemplateUuids() {
    return vmTemplateUuids;
  }


  public void setVmTemplateUuids(List<String> vmTemplateUuids) {
    this.vmTemplateUuids = vmTemplateUuids;
  }


  public ContentLibraryVmTemplate vmTemplates(List<NestedVmTemplate> vmTemplates) {
    
    this.vmTemplates = vmTemplates;
    return this;
  }

  public ContentLibraryVmTemplate addVmTemplatesItem(NestedVmTemplate vmTemplatesItem) {
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


  public ContentLibraryVmTemplate winOpt(Boolean winOpt) {
    
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


  public ContentLibraryVmTemplate zbsStorageInfo(List<NestedZbsStorageInfo> zbsStorageInfo) {
    
    this.zbsStorageInfo = zbsStorageInfo;
    return this;
  }

  public ContentLibraryVmTemplate addZbsStorageInfoItem(NestedZbsStorageInfo zbsStorageInfoItem) {
    if (this.zbsStorageInfo == null) {
      this.zbsStorageInfo = new ArrayList<NestedZbsStorageInfo>();
    }
    this.zbsStorageInfo.add(zbsStorageInfoItem);
    return this;
  }

   /**
   * Get zbsStorageInfo
   * @return zbsStorageInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedZbsStorageInfo> getZbsStorageInfo() {
    return zbsStorageInfo;
  }


  public void setZbsStorageInfo(List<NestedZbsStorageInfo> zbsStorageInfo) {
    this.zbsStorageInfo = zbsStorageInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentLibraryVmTemplate contentLibraryVmTemplate = (ContentLibraryVmTemplate) o;
    return Objects.equals(this.architecture, contentLibraryVmTemplate.architecture) &&
        Objects.equals(this.clockOffset, contentLibraryVmTemplate.clockOffset) &&
        Objects.equals(this.cloudInitSupported, contentLibraryVmTemplate.cloudInitSupported) &&
        Objects.equals(this.clusters, contentLibraryVmTemplate.clusters) &&
        Objects.equals(this.cpu, contentLibraryVmTemplate.cpu) &&
        Objects.equals(this.cpuModel, contentLibraryVmTemplate.cpuModel) &&
        Objects.equals(this.createdAt, contentLibraryVmTemplate.createdAt) &&
        Objects.equals(this.description, contentLibraryVmTemplate.description) &&
        Objects.equals(this.entityAsyncStatus, contentLibraryVmTemplate.entityAsyncStatus) &&
        Objects.equals(this.firmware, contentLibraryVmTemplate.firmware) &&
        Objects.equals(this.ha, contentLibraryVmTemplate.ha) &&
        Objects.equals(this.id, contentLibraryVmTemplate.id) &&
        Objects.equals(this.ioPolicy, contentLibraryVmTemplate.ioPolicy) &&
        Objects.equals(this.labels, contentLibraryVmTemplate.labels) &&
        Objects.equals(this.maxBandwidth, contentLibraryVmTemplate.maxBandwidth) &&
        Objects.equals(this.maxBandwidthPolicy, contentLibraryVmTemplate.maxBandwidthPolicy) &&
        Objects.equals(this.maxIops, contentLibraryVmTemplate.maxIops) &&
        Objects.equals(this.maxIopsPolicy, contentLibraryVmTemplate.maxIopsPolicy) &&
        Objects.equals(this.memory, contentLibraryVmTemplate.memory) &&
        Objects.equals(this.name, contentLibraryVmTemplate.name) &&
        Objects.equals(this.os, contentLibraryVmTemplate.os) &&
        Objects.equals(this.size, contentLibraryVmTemplate.size) &&
        Objects.equals(this.templateConfig, contentLibraryVmTemplate.templateConfig) &&
        Objects.equals(this.vcpu, contentLibraryVmTemplate.vcpu) &&
        Objects.equals(this.videoType, contentLibraryVmTemplate.videoType) &&
        Objects.equals(this.vmDisks, contentLibraryVmTemplate.vmDisks) &&
        Objects.equals(this.vmNics, contentLibraryVmTemplate.vmNics) &&
        Objects.equals(this.vmTemplateUuids, contentLibraryVmTemplate.vmTemplateUuids) &&
        Objects.equals(this.vmTemplates, contentLibraryVmTemplate.vmTemplates) &&
        Objects.equals(this.winOpt, contentLibraryVmTemplate.winOpt) &&
        Objects.equals(this.zbsStorageInfo, contentLibraryVmTemplate.zbsStorageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, clockOffset, cloudInitSupported, clusters, cpu, cpuModel, createdAt, description, entityAsyncStatus, firmware, ha, id, ioPolicy, labels, maxBandwidth, maxBandwidthPolicy, maxIops, maxIopsPolicy, memory, name, os, size, templateConfig, vcpu, videoType, vmDisks, vmNics, vmTemplateUuids, vmTemplates, winOpt, zbsStorageInfo);
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
    sb.append("class ContentLibraryVmTemplate {\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    clockOffset: ").append(toIndentedString(clockOffset)).append("\n");
    sb.append("    cloudInitSupported: ").append(toIndentedString(cloudInitSupported)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    cpuModel: ").append(toIndentedString(cpuModel)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ioPolicy: ").append(toIndentedString(ioPolicy)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
    sb.append("    maxBandwidthPolicy: ").append(toIndentedString(maxBandwidthPolicy)).append("\n");
    sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
    sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    templateConfig: ").append(toIndentedString(templateConfig)).append("\n");
    sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
    sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
    sb.append("    vmDisks: ").append(toIndentedString(vmDisks)).append("\n");
    sb.append("    vmNics: ").append(toIndentedString(vmNics)).append("\n");
    sb.append("    vmTemplateUuids: ").append(toIndentedString(vmTemplateUuids)).append("\n");
    sb.append("    vmTemplates: ").append(toIndentedString(vmTemplates)).append("\n");
    sb.append("    winOpt: ").append(toIndentedString(winOpt)).append("\n");
    sb.append("    zbsStorageInfo: ").append(toIndentedString(zbsStorageInfo)).append("\n");
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

