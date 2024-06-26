package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.NestedConsistencyGroup;
import com.smartx.tower.model.NestedLabel;
import com.smartx.tower.model.NestedNamespaceGroup;
import com.smartx.tower.model.NestedNvmfSubsystem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NvmfNamespace
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NvmfNamespace {
  public static final String SERIALIZED_NAME_ASSIGNED_SIZE = "assigned_size";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE)
  private Long assignedSize;

  public static final String SERIALIZED_NAME_BPS = "bps";
  @SerializedName(SERIALIZED_NAME_BPS)
  private Long bps;

  public static final String SERIALIZED_NAME_BPS_MAX = "bps_max";
  @SerializedName(SERIALIZED_NAME_BPS_MAX)
  private Long bpsMax;

  public static final String SERIALIZED_NAME_BPS_MAX_LENGTH = "bps_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH)
  private Long bpsMaxLength;

  public static final String SERIALIZED_NAME_BPS_RD = "bps_rd";
  @SerializedName(SERIALIZED_NAME_BPS_RD)
  private Long bpsRd;

  public static final String SERIALIZED_NAME_BPS_RD_MAX = "bps_rd_max";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX)
  private Long bpsRdMax;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH = "bps_rd_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH)
  private Long bpsRdMaxLength;

  public static final String SERIALIZED_NAME_BPS_WR = "bps_wr";
  @SerializedName(SERIALIZED_NAME_BPS_WR)
  private Long bpsWr;

  public static final String SERIALIZED_NAME_BPS_WR_MAX = "bps_wr_max";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX)
  private Long bpsWrMax;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH = "bps_wr_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH)
  private Long bpsWrMaxLength;

  public static final String SERIALIZED_NAME_CONSISTENCY_GROUP = "consistency_group";
  @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP)
  private NestedConsistencyGroup consistencyGroup;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IO_SIZE = "io_size";
  @SerializedName(SERIALIZED_NAME_IO_SIZE)
  private Long ioSize;

  public static final String SERIALIZED_NAME_IOPS = "iops";
  @SerializedName(SERIALIZED_NAME_IOPS)
  private Long iops;

  public static final String SERIALIZED_NAME_IOPS_MAX = "iops_max";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX)
  private Long iopsMax;

  public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH = "iops_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH)
  private Long iopsMaxLength;

  public static final String SERIALIZED_NAME_IOPS_RD = "iops_rd";
  @SerializedName(SERIALIZED_NAME_IOPS_RD)
  private Long iopsRd;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX = "iops_rd_max";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX)
  private Long iopsRdMax;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH = "iops_rd_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH)
  private Long iopsRdMaxLength;

  public static final String SERIALIZED_NAME_IOPS_WR = "iops_wr";
  @SerializedName(SERIALIZED_NAME_IOPS_WR)
  private Long iopsWr;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX = "iops_wr_max";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX)
  private Long iopsWrMax;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH = "iops_wr_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH)
  private Long iopsWrMaxLength;

  public static final String SERIALIZED_NAME_IS_SHARED = "is_shared";
  @SerializedName(SERIALIZED_NAME_IS_SHARED)
  private Boolean isShared;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<NestedLabel> labels = null;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
  private String localCreatedAt;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE_GROUP = "namespace_group";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUP)
  private NestedNamespaceGroup namespaceGroup;

  public static final String SERIALIZED_NAME_NAMESPACE_ID = "namespace_id";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_ID)
  private Integer namespaceId;

  public static final String SERIALIZED_NAME_NQN_WHITELIST = "nqn_whitelist";
  @SerializedName(SERIALIZED_NAME_NQN_WHITELIST)
  private String nqnWhitelist;

  public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM = "nvmf_subsystem";
  @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM)
  private NestedNvmfSubsystem nvmfSubsystem;

  public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
  private Integer replicaNum;

  public static final String SERIALIZED_NAME_SHARED_SIZE = "shared_size";
  @SerializedName(SERIALIZED_NAME_SHARED_SIZE)
  private Long sharedSize;

  public static final String SERIALIZED_NAME_SNAPSHOT_NUM = "snapshot_num";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_NUM)
  private Integer snapshotNum;

  public static final String SERIALIZED_NAME_STRIPE_NUM = "stripe_num";
  @SerializedName(SERIALIZED_NAME_STRIPE_NUM)
  private Integer stripeNum;

  public static final String SERIALIZED_NAME_STRIPE_SIZE = "stripe_size";
  @SerializedName(SERIALIZED_NAME_STRIPE_SIZE)
  private Long stripeSize;

  public static final String SERIALIZED_NAME_THIN_PROVISION = "thin_provision";
  @SerializedName(SERIALIZED_NAME_THIN_PROVISION)
  private Boolean thinProvision;

  public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE = "unique_logical_size";
  @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE)
  private Double uniqueLogicalSize;

  public static final String SERIALIZED_NAME_UNIQUE_SIZE = "unique_size";
  @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
  private Long uniqueSize;

  public static final String SERIALIZED_NAME_ZBS_VOLUME_ID = "zbs_volume_id";
  @SerializedName(SERIALIZED_NAME_ZBS_VOLUME_ID)
  private String zbsVolumeId;

  public NvmfNamespace() { 
  }

  public NvmfNamespace assignedSize(Long assignedSize) {
    
    this.assignedSize = assignedSize;
    return this;
  }

   /**
   * Get assignedSize
   * @return assignedSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getAssignedSize() {
    return assignedSize;
  }


  public void setAssignedSize(Long assignedSize) {
    this.assignedSize = assignedSize;
  }


  public NvmfNamespace bps(Long bps) {
    
    this.bps = bps;
    return this;
  }

   /**
   * Get bps
   * @return bps
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getBps() {
    return bps;
  }


  public void setBps(Long bps) {
    this.bps = bps;
  }


  public NvmfNamespace bpsMax(Long bpsMax) {
    
    this.bpsMax = bpsMax;
    return this;
  }

   /**
   * Get bpsMax
   * @return bpsMax
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getBpsMax() {
    return bpsMax;
  }


  public void setBpsMax(Long bpsMax) {
    this.bpsMax = bpsMax;
  }


  public NvmfNamespace bpsMaxLength(Long bpsMaxLength) {
    
    this.bpsMaxLength = bpsMaxLength;
    return this;
  }

   /**
   * Get bpsMaxLength
   * @return bpsMaxLength
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getBpsMaxLength() {
    return bpsMaxLength;
  }


  public void setBpsMaxLength(Long bpsMaxLength) {
    this.bpsMaxLength = bpsMaxLength;
  }


  public NvmfNamespace bpsRd(Long bpsRd) {
    
    this.bpsRd = bpsRd;
    return this;
  }

   /**
   * Get bpsRd
   * @return bpsRd
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getBpsRd() {
    return bpsRd;
  }


  public void setBpsRd(Long bpsRd) {
    this.bpsRd = bpsRd;
  }


  public NvmfNamespace bpsRdMax(Long bpsRdMax) {
    
    this.bpsRdMax = bpsRdMax;
    return this;
  }

   /**
   * Get bpsRdMax
   * @return bpsRdMax
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getBpsRdMax() {
    return bpsRdMax;
  }


  public void setBpsRdMax(Long bpsRdMax) {
    this.bpsRdMax = bpsRdMax;
  }


  public NvmfNamespace bpsRdMaxLength(Long bpsRdMaxLength) {
    
    this.bpsRdMaxLength = bpsRdMaxLength;
    return this;
  }

   /**
   * Get bpsRdMaxLength
   * @return bpsRdMaxLength
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getBpsRdMaxLength() {
    return bpsRdMaxLength;
  }


  public void setBpsRdMaxLength(Long bpsRdMaxLength) {
    this.bpsRdMaxLength = bpsRdMaxLength;
  }


  public NvmfNamespace bpsWr(Long bpsWr) {
    
    this.bpsWr = bpsWr;
    return this;
  }

   /**
   * Get bpsWr
   * @return bpsWr
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getBpsWr() {
    return bpsWr;
  }


  public void setBpsWr(Long bpsWr) {
    this.bpsWr = bpsWr;
  }


  public NvmfNamespace bpsWrMax(Long bpsWrMax) {
    
    this.bpsWrMax = bpsWrMax;
    return this;
  }

   /**
   * Get bpsWrMax
   * @return bpsWrMax
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getBpsWrMax() {
    return bpsWrMax;
  }


  public void setBpsWrMax(Long bpsWrMax) {
    this.bpsWrMax = bpsWrMax;
  }


  public NvmfNamespace bpsWrMaxLength(Long bpsWrMaxLength) {
    
    this.bpsWrMaxLength = bpsWrMaxLength;
    return this;
  }

   /**
   * Get bpsWrMaxLength
   * @return bpsWrMaxLength
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getBpsWrMaxLength() {
    return bpsWrMaxLength;
  }


  public void setBpsWrMaxLength(Long bpsWrMaxLength) {
    this.bpsWrMaxLength = bpsWrMaxLength;
  }


  public NvmfNamespace consistencyGroup(NestedConsistencyGroup consistencyGroup) {
    
    this.consistencyGroup = consistencyGroup;
    return this;
  }

   /**
   * Get consistencyGroup
   * @return consistencyGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedConsistencyGroup getConsistencyGroup() {
    return consistencyGroup;
  }


  public void setConsistencyGroup(NestedConsistencyGroup consistencyGroup) {
    this.consistencyGroup = consistencyGroup;
  }


  public NvmfNamespace entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public NvmfNamespace id(String id) {
    
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


  public NvmfNamespace ioSize(Long ioSize) {
    
    this.ioSize = ioSize;
    return this;
  }

   /**
   * Get ioSize
   * @return ioSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getIoSize() {
    return ioSize;
  }


  public void setIoSize(Long ioSize) {
    this.ioSize = ioSize;
  }


  public NvmfNamespace iops(Long iops) {
    
    this.iops = iops;
    return this;
  }

   /**
   * Get iops
   * @return iops
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getIops() {
    return iops;
  }


  public void setIops(Long iops) {
    this.iops = iops;
  }


  public NvmfNamespace iopsMax(Long iopsMax) {
    
    this.iopsMax = iopsMax;
    return this;
  }

   /**
   * Get iopsMax
   * @return iopsMax
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getIopsMax() {
    return iopsMax;
  }


  public void setIopsMax(Long iopsMax) {
    this.iopsMax = iopsMax;
  }


  public NvmfNamespace iopsMaxLength(Long iopsMaxLength) {
    
    this.iopsMaxLength = iopsMaxLength;
    return this;
  }

   /**
   * Get iopsMaxLength
   * @return iopsMaxLength
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getIopsMaxLength() {
    return iopsMaxLength;
  }


  public void setIopsMaxLength(Long iopsMaxLength) {
    this.iopsMaxLength = iopsMaxLength;
  }


  public NvmfNamespace iopsRd(Long iopsRd) {
    
    this.iopsRd = iopsRd;
    return this;
  }

   /**
   * Get iopsRd
   * @return iopsRd
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getIopsRd() {
    return iopsRd;
  }


  public void setIopsRd(Long iopsRd) {
    this.iopsRd = iopsRd;
  }


  public NvmfNamespace iopsRdMax(Long iopsRdMax) {
    
    this.iopsRdMax = iopsRdMax;
    return this;
  }

   /**
   * Get iopsRdMax
   * @return iopsRdMax
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getIopsRdMax() {
    return iopsRdMax;
  }


  public void setIopsRdMax(Long iopsRdMax) {
    this.iopsRdMax = iopsRdMax;
  }


  public NvmfNamespace iopsRdMaxLength(Long iopsRdMaxLength) {
    
    this.iopsRdMaxLength = iopsRdMaxLength;
    return this;
  }

   /**
   * Get iopsRdMaxLength
   * @return iopsRdMaxLength
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getIopsRdMaxLength() {
    return iopsRdMaxLength;
  }


  public void setIopsRdMaxLength(Long iopsRdMaxLength) {
    this.iopsRdMaxLength = iopsRdMaxLength;
  }


  public NvmfNamespace iopsWr(Long iopsWr) {
    
    this.iopsWr = iopsWr;
    return this;
  }

   /**
   * Get iopsWr
   * @return iopsWr
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getIopsWr() {
    return iopsWr;
  }


  public void setIopsWr(Long iopsWr) {
    this.iopsWr = iopsWr;
  }


  public NvmfNamespace iopsWrMax(Long iopsWrMax) {
    
    this.iopsWrMax = iopsWrMax;
    return this;
  }

   /**
   * Get iopsWrMax
   * @return iopsWrMax
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getIopsWrMax() {
    return iopsWrMax;
  }


  public void setIopsWrMax(Long iopsWrMax) {
    this.iopsWrMax = iopsWrMax;
  }


  public NvmfNamespace iopsWrMaxLength(Long iopsWrMaxLength) {
    
    this.iopsWrMaxLength = iopsWrMaxLength;
    return this;
  }

   /**
   * Get iopsWrMaxLength
   * @return iopsWrMaxLength
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getIopsWrMaxLength() {
    return iopsWrMaxLength;
  }


  public void setIopsWrMaxLength(Long iopsWrMaxLength) {
    this.iopsWrMaxLength = iopsWrMaxLength;
  }


  public NvmfNamespace isShared(Boolean isShared) {
    
    this.isShared = isShared;
    return this;
  }

   /**
   * Get isShared
   * @return isShared
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsShared() {
    return isShared;
  }


  public void setIsShared(Boolean isShared) {
    this.isShared = isShared;
  }


  public NvmfNamespace labels(List<NestedLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public NvmfNamespace addLabelsItem(NestedLabel labelsItem) {
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


  public NvmfNamespace localCreatedAt(String localCreatedAt) {
    
    this.localCreatedAt = localCreatedAt;
    return this;
  }

   /**
   * Get localCreatedAt
   * @return localCreatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocalCreatedAt() {
    return localCreatedAt;
  }


  public void setLocalCreatedAt(String localCreatedAt) {
    this.localCreatedAt = localCreatedAt;
  }


  public NvmfNamespace localId(String localId) {
    
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


  public NvmfNamespace name(String name) {
    
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


  public NvmfNamespace namespaceGroup(NestedNamespaceGroup namespaceGroup) {
    
    this.namespaceGroup = namespaceGroup;
    return this;
  }

   /**
   * Get namespaceGroup
   * @return namespaceGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedNamespaceGroup getNamespaceGroup() {
    return namespaceGroup;
  }


  public void setNamespaceGroup(NestedNamespaceGroup namespaceGroup) {
    this.namespaceGroup = namespaceGroup;
  }


  public NvmfNamespace namespaceId(Integer namespaceId) {
    
    this.namespaceId = namespaceId;
    return this;
  }

   /**
   * Get namespaceId
   * @return namespaceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getNamespaceId() {
    return namespaceId;
  }


  public void setNamespaceId(Integer namespaceId) {
    this.namespaceId = namespaceId;
  }


  public NvmfNamespace nqnWhitelist(String nqnWhitelist) {
    
    this.nqnWhitelist = nqnWhitelist;
    return this;
  }

   /**
   * Get nqnWhitelist
   * @return nqnWhitelist
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNqnWhitelist() {
    return nqnWhitelist;
  }


  public void setNqnWhitelist(String nqnWhitelist) {
    this.nqnWhitelist = nqnWhitelist;
  }


  public NvmfNamespace nvmfSubsystem(NestedNvmfSubsystem nvmfSubsystem) {
    
    this.nvmfSubsystem = nvmfSubsystem;
    return this;
  }

   /**
   * Get nvmfSubsystem
   * @return nvmfSubsystem
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedNvmfSubsystem getNvmfSubsystem() {
    return nvmfSubsystem;
  }


  public void setNvmfSubsystem(NestedNvmfSubsystem nvmfSubsystem) {
    this.nvmfSubsystem = nvmfSubsystem;
  }


  public NvmfNamespace replicaNum(Integer replicaNum) {
    
    this.replicaNum = replicaNum;
    return this;
  }

   /**
   * Get replicaNum
   * @return replicaNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getReplicaNum() {
    return replicaNum;
  }


  public void setReplicaNum(Integer replicaNum) {
    this.replicaNum = replicaNum;
  }


  public NvmfNamespace sharedSize(Long sharedSize) {
    
    this.sharedSize = sharedSize;
    return this;
  }

   /**
   * Get sharedSize
   * @return sharedSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getSharedSize() {
    return sharedSize;
  }


  public void setSharedSize(Long sharedSize) {
    this.sharedSize = sharedSize;
  }


  public NvmfNamespace snapshotNum(Integer snapshotNum) {
    
    this.snapshotNum = snapshotNum;
    return this;
  }

   /**
   * Get snapshotNum
   * @return snapshotNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSnapshotNum() {
    return snapshotNum;
  }


  public void setSnapshotNum(Integer snapshotNum) {
    this.snapshotNum = snapshotNum;
  }


  public NvmfNamespace stripeNum(Integer stripeNum) {
    
    this.stripeNum = stripeNum;
    return this;
  }

   /**
   * Get stripeNum
   * @return stripeNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getStripeNum() {
    return stripeNum;
  }


  public void setStripeNum(Integer stripeNum) {
    this.stripeNum = stripeNum;
  }


  public NvmfNamespace stripeSize(Long stripeSize) {
    
    this.stripeSize = stripeSize;
    return this;
  }

   /**
   * Get stripeSize
   * @return stripeSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getStripeSize() {
    return stripeSize;
  }


  public void setStripeSize(Long stripeSize) {
    this.stripeSize = stripeSize;
  }


  public NvmfNamespace thinProvision(Boolean thinProvision) {
    
    this.thinProvision = thinProvision;
    return this;
  }

   /**
   * Get thinProvision
   * @return thinProvision
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getThinProvision() {
    return thinProvision;
  }


  public void setThinProvision(Boolean thinProvision) {
    this.thinProvision = thinProvision;
  }


  public NvmfNamespace uniqueLogicalSize(Double uniqueLogicalSize) {
    
    this.uniqueLogicalSize = uniqueLogicalSize;
    return this;
  }

   /**
   * Get uniqueLogicalSize
   * @return uniqueLogicalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUniqueLogicalSize() {
    return uniqueLogicalSize;
  }


  public void setUniqueLogicalSize(Double uniqueLogicalSize) {
    this.uniqueLogicalSize = uniqueLogicalSize;
  }


  public NvmfNamespace uniqueSize(Long uniqueSize) {
    
    this.uniqueSize = uniqueSize;
    return this;
  }

   /**
   * Get uniqueSize
   * @return uniqueSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getUniqueSize() {
    return uniqueSize;
  }


  public void setUniqueSize(Long uniqueSize) {
    this.uniqueSize = uniqueSize;
  }


  public NvmfNamespace zbsVolumeId(String zbsVolumeId) {
    
    this.zbsVolumeId = zbsVolumeId;
    return this;
  }

   /**
   * Get zbsVolumeId
   * @return zbsVolumeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getZbsVolumeId() {
    return zbsVolumeId;
  }


  public void setZbsVolumeId(String zbsVolumeId) {
    this.zbsVolumeId = zbsVolumeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NvmfNamespace nvmfNamespace = (NvmfNamespace) o;
    return Objects.equals(this.assignedSize, nvmfNamespace.assignedSize) &&
        Objects.equals(this.bps, nvmfNamespace.bps) &&
        Objects.equals(this.bpsMax, nvmfNamespace.bpsMax) &&
        Objects.equals(this.bpsMaxLength, nvmfNamespace.bpsMaxLength) &&
        Objects.equals(this.bpsRd, nvmfNamespace.bpsRd) &&
        Objects.equals(this.bpsRdMax, nvmfNamespace.bpsRdMax) &&
        Objects.equals(this.bpsRdMaxLength, nvmfNamespace.bpsRdMaxLength) &&
        Objects.equals(this.bpsWr, nvmfNamespace.bpsWr) &&
        Objects.equals(this.bpsWrMax, nvmfNamespace.bpsWrMax) &&
        Objects.equals(this.bpsWrMaxLength, nvmfNamespace.bpsWrMaxLength) &&
        Objects.equals(this.consistencyGroup, nvmfNamespace.consistencyGroup) &&
        Objects.equals(this.entityAsyncStatus, nvmfNamespace.entityAsyncStatus) &&
        Objects.equals(this.id, nvmfNamespace.id) &&
        Objects.equals(this.ioSize, nvmfNamespace.ioSize) &&
        Objects.equals(this.iops, nvmfNamespace.iops) &&
        Objects.equals(this.iopsMax, nvmfNamespace.iopsMax) &&
        Objects.equals(this.iopsMaxLength, nvmfNamespace.iopsMaxLength) &&
        Objects.equals(this.iopsRd, nvmfNamespace.iopsRd) &&
        Objects.equals(this.iopsRdMax, nvmfNamespace.iopsRdMax) &&
        Objects.equals(this.iopsRdMaxLength, nvmfNamespace.iopsRdMaxLength) &&
        Objects.equals(this.iopsWr, nvmfNamespace.iopsWr) &&
        Objects.equals(this.iopsWrMax, nvmfNamespace.iopsWrMax) &&
        Objects.equals(this.iopsWrMaxLength, nvmfNamespace.iopsWrMaxLength) &&
        Objects.equals(this.isShared, nvmfNamespace.isShared) &&
        Objects.equals(this.labels, nvmfNamespace.labels) &&
        Objects.equals(this.localCreatedAt, nvmfNamespace.localCreatedAt) &&
        Objects.equals(this.localId, nvmfNamespace.localId) &&
        Objects.equals(this.name, nvmfNamespace.name) &&
        Objects.equals(this.namespaceGroup, nvmfNamespace.namespaceGroup) &&
        Objects.equals(this.namespaceId, nvmfNamespace.namespaceId) &&
        Objects.equals(this.nqnWhitelist, nvmfNamespace.nqnWhitelist) &&
        Objects.equals(this.nvmfSubsystem, nvmfNamespace.nvmfSubsystem) &&
        Objects.equals(this.replicaNum, nvmfNamespace.replicaNum) &&
        Objects.equals(this.sharedSize, nvmfNamespace.sharedSize) &&
        Objects.equals(this.snapshotNum, nvmfNamespace.snapshotNum) &&
        Objects.equals(this.stripeNum, nvmfNamespace.stripeNum) &&
        Objects.equals(this.stripeSize, nvmfNamespace.stripeSize) &&
        Objects.equals(this.thinProvision, nvmfNamespace.thinProvision) &&
        Objects.equals(this.uniqueLogicalSize, nvmfNamespace.uniqueLogicalSize) &&
        Objects.equals(this.uniqueSize, nvmfNamespace.uniqueSize) &&
        Objects.equals(this.zbsVolumeId, nvmfNamespace.zbsVolumeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedSize, bps, bpsMax, bpsMaxLength, bpsRd, bpsRdMax, bpsRdMaxLength, bpsWr, bpsWrMax, bpsWrMaxLength, consistencyGroup, entityAsyncStatus, id, ioSize, iops, iopsMax, iopsMaxLength, iopsRd, iopsRdMax, iopsRdMaxLength, iopsWr, iopsWrMax, iopsWrMaxLength, isShared, labels, localCreatedAt, localId, name, namespaceGroup, namespaceId, nqnWhitelist, nvmfSubsystem, replicaNum, sharedSize, snapshotNum, stripeNum, stripeSize, thinProvision, uniqueLogicalSize, uniqueSize, zbsVolumeId);
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
    sb.append("class NvmfNamespace {\n");
    sb.append("    assignedSize: ").append(toIndentedString(assignedSize)).append("\n");
    sb.append("    bps: ").append(toIndentedString(bps)).append("\n");
    sb.append("    bpsMax: ").append(toIndentedString(bpsMax)).append("\n");
    sb.append("    bpsMaxLength: ").append(toIndentedString(bpsMaxLength)).append("\n");
    sb.append("    bpsRd: ").append(toIndentedString(bpsRd)).append("\n");
    sb.append("    bpsRdMax: ").append(toIndentedString(bpsRdMax)).append("\n");
    sb.append("    bpsRdMaxLength: ").append(toIndentedString(bpsRdMaxLength)).append("\n");
    sb.append("    bpsWr: ").append(toIndentedString(bpsWr)).append("\n");
    sb.append("    bpsWrMax: ").append(toIndentedString(bpsWrMax)).append("\n");
    sb.append("    bpsWrMaxLength: ").append(toIndentedString(bpsWrMaxLength)).append("\n");
    sb.append("    consistencyGroup: ").append(toIndentedString(consistencyGroup)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ioSize: ").append(toIndentedString(ioSize)).append("\n");
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    iopsMax: ").append(toIndentedString(iopsMax)).append("\n");
    sb.append("    iopsMaxLength: ").append(toIndentedString(iopsMaxLength)).append("\n");
    sb.append("    iopsRd: ").append(toIndentedString(iopsRd)).append("\n");
    sb.append("    iopsRdMax: ").append(toIndentedString(iopsRdMax)).append("\n");
    sb.append("    iopsRdMaxLength: ").append(toIndentedString(iopsRdMaxLength)).append("\n");
    sb.append("    iopsWr: ").append(toIndentedString(iopsWr)).append("\n");
    sb.append("    iopsWrMax: ").append(toIndentedString(iopsWrMax)).append("\n");
    sb.append("    iopsWrMaxLength: ").append(toIndentedString(iopsWrMaxLength)).append("\n");
    sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaceGroup: ").append(toIndentedString(namespaceGroup)).append("\n");
    sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
    sb.append("    nqnWhitelist: ").append(toIndentedString(nqnWhitelist)).append("\n");
    sb.append("    nvmfSubsystem: ").append(toIndentedString(nvmfSubsystem)).append("\n");
    sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
    sb.append("    sharedSize: ").append(toIndentedString(sharedSize)).append("\n");
    sb.append("    snapshotNum: ").append(toIndentedString(snapshotNum)).append("\n");
    sb.append("    stripeNum: ").append(toIndentedString(stripeNum)).append("\n");
    sb.append("    stripeSize: ").append(toIndentedString(stripeSize)).append("\n");
    sb.append("    thinProvision: ").append(toIndentedString(thinProvision)).append("\n");
    sb.append("    uniqueLogicalSize: ").append(toIndentedString(uniqueLogicalSize)).append("\n");
    sb.append("    uniqueSize: ").append(toIndentedString(uniqueSize)).append("\n");
    sb.append("    zbsVolumeId: ").append(toIndentedString(zbsVolumeId)).append("\n");
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

