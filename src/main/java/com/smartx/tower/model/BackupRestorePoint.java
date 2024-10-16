package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.BackupRestorePointCreation;
import com.smartx.tower.model.BackupRestorePointType;
import com.smartx.tower.model.ConsistentType;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.NestedBackupPlan;
import com.smartx.tower.model.NestedBackupRestoreExecution;
import com.smartx.tower.model.NestedBackupTargetExecution;
import com.smartx.tower.model.NestedVm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * BackupRestorePoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class BackupRestorePoint {
  public static final String SERIALIZED_NAME_BACKUP_PLAN = "backup_plan";
  @SerializedName(SERIALIZED_NAME_BACKUP_PLAN)
  private NestedBackupPlan backupPlan;

  public static final String SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS = "backup_restore_executions";
  @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS)
  private List<NestedBackupRestoreExecution> backupRestoreExecutions = null;

  public static final String SERIALIZED_NAME_BACKUP_TARGET_EXECUTION = "backup_target_execution";
  @SerializedName(SERIALIZED_NAME_BACKUP_TARGET_EXECUTION)
  private NestedBackupTargetExecution backupTargetExecution;

  public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID = "cluster_local_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID)
  private String clusterLocalId;

  public static final String SERIALIZED_NAME_COMPRESSED = "compressed";
  @SerializedName(SERIALIZED_NAME_COMPRESSED)
  private Boolean compressed;

  public static final String SERIALIZED_NAME_COMPRESSION_RATIO = "compression_ratio";
  @SerializedName(SERIALIZED_NAME_COMPRESSION_RATIO)
  private Double compressionRatio;

  public static final String SERIALIZED_NAME_CREATION = "creation";
  @SerializedName(SERIALIZED_NAME_CREATION)
  private BackupRestorePointCreation creation;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
  private String localCreatedAt;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_LOGICAL_SIZE = "logical_size";
  @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE)
  private Long logicalSize;

  public static final String SERIALIZED_NAME_PARENT_RESTORE_POINT = "parent_restore_point";
  @SerializedName(SERIALIZED_NAME_PARENT_RESTORE_POINT)
  private String parentRestorePoint;

  public static final String SERIALIZED_NAME_PHYSICAL_SIZE = "physical_size";
  @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE)
  private Long physicalSize;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_SLICE = "slice";
  @SerializedName(SERIALIZED_NAME_SLICE)
  private String slice;

  public static final String SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE = "snapshot_consistent_type";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE)
  private ConsistentType snapshotConsistentType;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private BackupRestorePointType type;

  public static final String SERIALIZED_NAME_VALID_CAPACITY = "valid_capacity";
  @SerializedName(SERIALIZED_NAME_VALID_CAPACITY)
  private Long validCapacity;

  public static final String SERIALIZED_NAME_VALID_SIZE = "valid_size";
  @SerializedName(SERIALIZED_NAME_VALID_SIZE)
  private Long validSize;

  public static final String SERIALIZED_NAME_VM = "vm";
  @SerializedName(SERIALIZED_NAME_VM)
  private NestedVm vm;

  public static final String SERIALIZED_NAME_VM_LOCAL_ID = "vm_local_id";
  @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID)
  private String vmLocalId;

  public static final String SERIALIZED_NAME_VM_NAME = "vm_name";
  @SerializedName(SERIALIZED_NAME_VM_NAME)
  private String vmName;

  public BackupRestorePoint() { 
  }

  public BackupRestorePoint backupPlan(NestedBackupPlan backupPlan) {
    
    this.backupPlan = backupPlan;
    return this;
  }

   /**
   * Get backupPlan
   * @return backupPlan
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedBackupPlan getBackupPlan() {
    return backupPlan;
  }


  public void setBackupPlan(NestedBackupPlan backupPlan) {
    this.backupPlan = backupPlan;
  }


  public BackupRestorePoint backupRestoreExecutions(List<NestedBackupRestoreExecution> backupRestoreExecutions) {
    
    this.backupRestoreExecutions = backupRestoreExecutions;
    return this;
  }

  public BackupRestorePoint addBackupRestoreExecutionsItem(NestedBackupRestoreExecution backupRestoreExecutionsItem) {
    if (this.backupRestoreExecutions == null) {
      this.backupRestoreExecutions = new ArrayList<NestedBackupRestoreExecution>();
    }
    this.backupRestoreExecutions.add(backupRestoreExecutionsItem);
    return this;
  }

   /**
   * Get backupRestoreExecutions
   * @return backupRestoreExecutions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedBackupRestoreExecution> getBackupRestoreExecutions() {
    return backupRestoreExecutions;
  }


  public void setBackupRestoreExecutions(List<NestedBackupRestoreExecution> backupRestoreExecutions) {
    this.backupRestoreExecutions = backupRestoreExecutions;
  }


  public BackupRestorePoint backupTargetExecution(NestedBackupTargetExecution backupTargetExecution) {
    
    this.backupTargetExecution = backupTargetExecution;
    return this;
  }

   /**
   * Get backupTargetExecution
   * @return backupTargetExecution
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedBackupTargetExecution getBackupTargetExecution() {
    return backupTargetExecution;
  }


  public void setBackupTargetExecution(NestedBackupTargetExecution backupTargetExecution) {
    this.backupTargetExecution = backupTargetExecution;
  }


  public BackupRestorePoint clusterLocalId(String clusterLocalId) {
    
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


  public BackupRestorePoint compressed(Boolean compressed) {
    
    this.compressed = compressed;
    return this;
  }

   /**
   * Get compressed
   * @return compressed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCompressed() {
    return compressed;
  }


  public void setCompressed(Boolean compressed) {
    this.compressed = compressed;
  }


  public BackupRestorePoint compressionRatio(Double compressionRatio) {
    
    this.compressionRatio = compressionRatio;
    return this;
  }

   /**
   * Get compressionRatio
   * @return compressionRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getCompressionRatio() {
    return compressionRatio;
  }


  public void setCompressionRatio(Double compressionRatio) {
    this.compressionRatio = compressionRatio;
  }


  public BackupRestorePoint creation(BackupRestorePointCreation creation) {
    
    this.creation = creation;
    return this;
  }

   /**
   * Get creation
   * @return creation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupRestorePointCreation getCreation() {
    return creation;
  }


  public void setCreation(BackupRestorePointCreation creation) {
    this.creation = creation;
  }


  public BackupRestorePoint entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public BackupRestorePoint id(String id) {
    
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


  public BackupRestorePoint localCreatedAt(String localCreatedAt) {
    
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


  public BackupRestorePoint localId(String localId) {
    
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


  public BackupRestorePoint logicalSize(Long logicalSize) {
    
    this.logicalSize = logicalSize;
    return this;
  }

   /**
   * Get logicalSize
   * @return logicalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLogicalSize() {
    return logicalSize;
  }


  public void setLogicalSize(Long logicalSize) {
    this.logicalSize = logicalSize;
  }


  public BackupRestorePoint parentRestorePoint(String parentRestorePoint) {
    
    this.parentRestorePoint = parentRestorePoint;
    return this;
  }

   /**
   * Get parentRestorePoint
   * @return parentRestorePoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParentRestorePoint() {
    return parentRestorePoint;
  }


  public void setParentRestorePoint(String parentRestorePoint) {
    this.parentRestorePoint = parentRestorePoint;
  }


  public BackupRestorePoint physicalSize(Long physicalSize) {
    
    this.physicalSize = physicalSize;
    return this;
  }

   /**
   * Get physicalSize
   * @return physicalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getPhysicalSize() {
    return physicalSize;
  }


  public void setPhysicalSize(Long physicalSize) {
    this.physicalSize = physicalSize;
  }


  public BackupRestorePoint size(Long size) {
    
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


  public BackupRestorePoint slice(String slice) {
    
    this.slice = slice;
    return this;
  }

   /**
   * Get slice
   * @return slice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSlice() {
    return slice;
  }


  public void setSlice(String slice) {
    this.slice = slice;
  }


  public BackupRestorePoint snapshotConsistentType(ConsistentType snapshotConsistentType) {
    
    this.snapshotConsistentType = snapshotConsistentType;
    return this;
  }

   /**
   * Get snapshotConsistentType
   * @return snapshotConsistentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConsistentType getSnapshotConsistentType() {
    return snapshotConsistentType;
  }


  public void setSnapshotConsistentType(ConsistentType snapshotConsistentType) {
    this.snapshotConsistentType = snapshotConsistentType;
  }


  public BackupRestorePoint type(BackupRestorePointType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupRestorePointType getType() {
    return type;
  }


  public void setType(BackupRestorePointType type) {
    this.type = type;
  }


  public BackupRestorePoint validCapacity(Long validCapacity) {
    
    this.validCapacity = validCapacity;
    return this;
  }

   /**
   * Get validCapacity
   * @return validCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getValidCapacity() {
    return validCapacity;
  }


  public void setValidCapacity(Long validCapacity) {
    this.validCapacity = validCapacity;
  }


  public BackupRestorePoint validSize(Long validSize) {
    
    this.validSize = validSize;
    return this;
  }

   /**
   * Get validSize
   * @return validSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getValidSize() {
    return validSize;
  }


  public void setValidSize(Long validSize) {
    this.validSize = validSize;
  }


  public BackupRestorePoint vm(NestedVm vm) {
    
    this.vm = vm;
    return this;
  }

   /**
   * Get vm
   * @return vm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedVm getVm() {
    return vm;
  }


  public void setVm(NestedVm vm) {
    this.vm = vm;
  }


  public BackupRestorePoint vmLocalId(String vmLocalId) {
    
    this.vmLocalId = vmLocalId;
    return this;
  }

   /**
   * Get vmLocalId
   * @return vmLocalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmLocalId() {
    return vmLocalId;
  }


  public void setVmLocalId(String vmLocalId) {
    this.vmLocalId = vmLocalId;
  }


  public BackupRestorePoint vmName(String vmName) {
    
    this.vmName = vmName;
    return this;
  }

   /**
   * Get vmName
   * @return vmName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmName() {
    return vmName;
  }


  public void setVmName(String vmName) {
    this.vmName = vmName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupRestorePoint backupRestorePoint = (BackupRestorePoint) o;
    return Objects.equals(this.backupPlan, backupRestorePoint.backupPlan) &&
        Objects.equals(this.backupRestoreExecutions, backupRestorePoint.backupRestoreExecutions) &&
        Objects.equals(this.backupTargetExecution, backupRestorePoint.backupTargetExecution) &&
        Objects.equals(this.clusterLocalId, backupRestorePoint.clusterLocalId) &&
        Objects.equals(this.compressed, backupRestorePoint.compressed) &&
        Objects.equals(this.compressionRatio, backupRestorePoint.compressionRatio) &&
        Objects.equals(this.creation, backupRestorePoint.creation) &&
        Objects.equals(this.entityAsyncStatus, backupRestorePoint.entityAsyncStatus) &&
        Objects.equals(this.id, backupRestorePoint.id) &&
        Objects.equals(this.localCreatedAt, backupRestorePoint.localCreatedAt) &&
        Objects.equals(this.localId, backupRestorePoint.localId) &&
        Objects.equals(this.logicalSize, backupRestorePoint.logicalSize) &&
        Objects.equals(this.parentRestorePoint, backupRestorePoint.parentRestorePoint) &&
        Objects.equals(this.physicalSize, backupRestorePoint.physicalSize) &&
        Objects.equals(this.size, backupRestorePoint.size) &&
        Objects.equals(this.slice, backupRestorePoint.slice) &&
        Objects.equals(this.snapshotConsistentType, backupRestorePoint.snapshotConsistentType) &&
        Objects.equals(this.type, backupRestorePoint.type) &&
        Objects.equals(this.validCapacity, backupRestorePoint.validCapacity) &&
        Objects.equals(this.validSize, backupRestorePoint.validSize) &&
        Objects.equals(this.vm, backupRestorePoint.vm) &&
        Objects.equals(this.vmLocalId, backupRestorePoint.vmLocalId) &&
        Objects.equals(this.vmName, backupRestorePoint.vmName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupPlan, backupRestoreExecutions, backupTargetExecution, clusterLocalId, compressed, compressionRatio, creation, entityAsyncStatus, id, localCreatedAt, localId, logicalSize, parentRestorePoint, physicalSize, size, slice, snapshotConsistentType, type, validCapacity, validSize, vm, vmLocalId, vmName);
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
    sb.append("class BackupRestorePoint {\n");
    sb.append("    backupPlan: ").append(toIndentedString(backupPlan)).append("\n");
    sb.append("    backupRestoreExecutions: ").append(toIndentedString(backupRestoreExecutions)).append("\n");
    sb.append("    backupTargetExecution: ").append(toIndentedString(backupTargetExecution)).append("\n");
    sb.append("    clusterLocalId: ").append(toIndentedString(clusterLocalId)).append("\n");
    sb.append("    compressed: ").append(toIndentedString(compressed)).append("\n");
    sb.append("    compressionRatio: ").append(toIndentedString(compressionRatio)).append("\n");
    sb.append("    creation: ").append(toIndentedString(creation)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    logicalSize: ").append(toIndentedString(logicalSize)).append("\n");
    sb.append("    parentRestorePoint: ").append(toIndentedString(parentRestorePoint)).append("\n");
    sb.append("    physicalSize: ").append(toIndentedString(physicalSize)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    slice: ").append(toIndentedString(slice)).append("\n");
    sb.append("    snapshotConsistentType: ").append(toIndentedString(snapshotConsistentType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validCapacity: ").append(toIndentedString(validCapacity)).append("\n");
    sb.append("    validSize: ").append(toIndentedString(validSize)).append("\n");
    sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
    sb.append("    vmLocalId: ").append(toIndentedString(vmLocalId)).append("\n");
    sb.append("    vmName: ").append(toIndentedString(vmName)).append("\n");
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

