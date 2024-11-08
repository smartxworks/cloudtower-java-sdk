package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.BackupPlanExecutionStatus;
import com.smartx.tower.model.BackupPlanKeepPolicy;
import com.smartx.tower.model.BackupPlanPeriod;
import com.smartx.tower.model.BackupPlanStatus;
import com.smartx.tower.model.ConsistentType;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.NestedBackupPlanTimePoint;
import com.smartx.tower.model.NestedBackupService;
import com.smartx.tower.model.NestedBackupStoreRepository;
import com.smartx.tower.model.NestedVm;
import com.smartx.tower.model.WeekdayTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * BackupPlan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class BackupPlan {
  public static final String SERIALIZED_NAME_BACKUP_SERVICE = "backup_service";
  @SerializedName(SERIALIZED_NAME_BACKUP_SERVICE)
  private NestedBackupService backupService;

  public static final String SERIALIZED_NAME_BACKUP_STORE_REPOSITORY = "backup_store_repository";
  @SerializedName(SERIALIZED_NAME_BACKUP_STORE_REPOSITORY)
  private NestedBackupStoreRepository backupStoreRepository;

  public static final String SERIALIZED_NAME_COMPRESSION = "compression";
  @SerializedName(SERIALIZED_NAME_COMPRESSION)
  private Boolean compression;

  public static final String SERIALIZED_NAME_COMPRESSION_RATIO = "compression_ratio";
  @SerializedName(SERIALIZED_NAME_COMPRESSION_RATIO)
  private Double compressionRatio;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENABLE_WINDOW = "enable_window";
  @SerializedName(SERIALIZED_NAME_ENABLE_WINDOW)
  private Boolean enableWindow;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_FULL_INTERVAL = "full_interval";
  @SerializedName(SERIALIZED_NAME_FULL_INTERVAL)
  private Integer fullInterval;

  public static final String SERIALIZED_NAME_FULL_PERIOD = "full_period";
  @SerializedName(SERIALIZED_NAME_FULL_PERIOD)
  private BackupPlanPeriod fullPeriod;

  public static final String SERIALIZED_NAME_FULL_TIME_POINT = "full_time_point";
  @SerializedName(SERIALIZED_NAME_FULL_TIME_POINT)
  private NestedBackupPlanTimePoint fullTimePoint;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INCREMENTAL_INTERVAL = "incremental_interval";
  @SerializedName(SERIALIZED_NAME_INCREMENTAL_INTERVAL)
  private Integer incrementalInterval;

  public static final String SERIALIZED_NAME_INCREMENTAL_PERIOD = "incremental_period";
  @SerializedName(SERIALIZED_NAME_INCREMENTAL_PERIOD)
  private BackupPlanPeriod incrementalPeriod;

  public static final String SERIALIZED_NAME_INCREMENTAL_TIME_POINTS = "incremental_time_points";
  @SerializedName(SERIALIZED_NAME_INCREMENTAL_TIME_POINTS)
  private List<NestedBackupPlanTimePoint> incrementalTimePoints = new ArrayList<NestedBackupPlanTimePoint>();

  public static final String SERIALIZED_NAME_INCREMENTAL_WEEKDAYS = "incremental_weekdays";
  @SerializedName(SERIALIZED_NAME_INCREMENTAL_WEEKDAYS)
  private List<WeekdayTypeEnum> incrementalWeekdays = null;

  public static final String SERIALIZED_NAME_KEEP_POLICY = "keep_policy";
  @SerializedName(SERIALIZED_NAME_KEEP_POLICY)
  private BackupPlanKeepPolicy keepPolicy;

  public static final String SERIALIZED_NAME_KEEP_POLICY_VALUE = "keep_policy_value";
  @SerializedName(SERIALIZED_NAME_KEEP_POLICY_VALUE)
  private Integer keepPolicyValue;

  public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS = "last_execute_status";
  @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS)
  private BackupPlanExecutionStatus lastExecuteStatus;

  public static final String SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT = "last_execute_success_job_count";
  @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT)
  private Integer lastExecuteSuccessJobCount;

  public static final String SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT = "last_execute_total_job_count";
  @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT)
  private Integer lastExecuteTotalJobCount;

  public static final String SERIALIZED_NAME_LAST_EXECUTED_AT = "last_executed_at";
  @SerializedName(SERIALIZED_NAME_LAST_EXECUTED_AT)
  private String lastExecutedAt;

  public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS = "last_manual_execute_status";
  @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS)
  private BackupPlanExecutionStatus lastManualExecuteStatus;

  public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT = "last_manual_execute_success_job_count";
  @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT)
  private Integer lastManualExecuteSuccessJobCount;

  public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT = "last_manual_execute_total_job_count";
  @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT)
  private Integer lastManualExecuteTotalJobCount;

  public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT = "last_manual_executed_at";
  @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT)
  private String lastManualExecutedAt;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEXT_EXECUTE_TIME = "next_execute_time";
  @SerializedName(SERIALIZED_NAME_NEXT_EXECUTE_TIME)
  private String nextExecuteTime;

  public static final String SERIALIZED_NAME_PHYSICAL_SIZE = "physical_size";
  @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE)
  private Long physicalSize;

  public static final String SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE = "snapshot_consistent_type";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE)
  private ConsistentType snapshotConsistentType;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private BackupPlanStatus status;

  public static final String SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT = "valid_size_of_backup_object";
  @SerializedName(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT)
  private Long validSizeOfBackupObject;

  public static final String SERIALIZED_NAME_VMS = "vms";
  @SerializedName(SERIALIZED_NAME_VMS)
  private List<NestedVm> vms = null;

  public static final String SERIALIZED_NAME_WINDOW_END = "window_end";
  @SerializedName(SERIALIZED_NAME_WINDOW_END)
  private String windowEnd;

  public static final String SERIALIZED_NAME_WINDOW_START = "window_start";
  @SerializedName(SERIALIZED_NAME_WINDOW_START)
  private String windowStart;

  public BackupPlan() { 
  }

  public BackupPlan backupService(NestedBackupService backupService) {
    
    this.backupService = backupService;
    return this;
  }

   /**
   * Get backupService
   * @return backupService
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedBackupService getBackupService() {
    return backupService;
  }


  public void setBackupService(NestedBackupService backupService) {
    this.backupService = backupService;
  }


  public BackupPlan backupStoreRepository(NestedBackupStoreRepository backupStoreRepository) {
    
    this.backupStoreRepository = backupStoreRepository;
    return this;
  }

   /**
   * Get backupStoreRepository
   * @return backupStoreRepository
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedBackupStoreRepository getBackupStoreRepository() {
    return backupStoreRepository;
  }


  public void setBackupStoreRepository(NestedBackupStoreRepository backupStoreRepository) {
    this.backupStoreRepository = backupStoreRepository;
  }


  public BackupPlan compression(Boolean compression) {
    
    this.compression = compression;
    return this;
  }

   /**
   * Get compression
   * @return compression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCompression() {
    return compression;
  }


  public void setCompression(Boolean compression) {
    this.compression = compression;
  }


  public BackupPlan compressionRatio(Double compressionRatio) {
    
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


  public BackupPlan createdAt(String createdAt) {
    
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


  public BackupPlan description(String description) {
    
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


  public BackupPlan enableWindow(Boolean enableWindow) {
    
    this.enableWindow = enableWindow;
    return this;
  }

   /**
   * Get enableWindow
   * @return enableWindow
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getEnableWindow() {
    return enableWindow;
  }


  public void setEnableWindow(Boolean enableWindow) {
    this.enableWindow = enableWindow;
  }


  public BackupPlan entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public BackupPlan fullInterval(Integer fullInterval) {
    
    this.fullInterval = fullInterval;
    return this;
  }

   /**
   * Get fullInterval
   * @return fullInterval
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getFullInterval() {
    return fullInterval;
  }


  public void setFullInterval(Integer fullInterval) {
    this.fullInterval = fullInterval;
  }


  public BackupPlan fullPeriod(BackupPlanPeriod fullPeriod) {
    
    this.fullPeriod = fullPeriod;
    return this;
  }

   /**
   * Get fullPeriod
   * @return fullPeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BackupPlanPeriod getFullPeriod() {
    return fullPeriod;
  }


  public void setFullPeriod(BackupPlanPeriod fullPeriod) {
    this.fullPeriod = fullPeriod;
  }


  public BackupPlan fullTimePoint(NestedBackupPlanTimePoint fullTimePoint) {
    
    this.fullTimePoint = fullTimePoint;
    return this;
  }

   /**
   * Get fullTimePoint
   * @return fullTimePoint
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedBackupPlanTimePoint getFullTimePoint() {
    return fullTimePoint;
  }


  public void setFullTimePoint(NestedBackupPlanTimePoint fullTimePoint) {
    this.fullTimePoint = fullTimePoint;
  }


  public BackupPlan id(String id) {
    
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


  public BackupPlan incrementalInterval(Integer incrementalInterval) {
    
    this.incrementalInterval = incrementalInterval;
    return this;
  }

   /**
   * Get incrementalInterval
   * @return incrementalInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIncrementalInterval() {
    return incrementalInterval;
  }


  public void setIncrementalInterval(Integer incrementalInterval) {
    this.incrementalInterval = incrementalInterval;
  }


  public BackupPlan incrementalPeriod(BackupPlanPeriod incrementalPeriod) {
    
    this.incrementalPeriod = incrementalPeriod;
    return this;
  }

   /**
   * Get incrementalPeriod
   * @return incrementalPeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BackupPlanPeriod getIncrementalPeriod() {
    return incrementalPeriod;
  }


  public void setIncrementalPeriod(BackupPlanPeriod incrementalPeriod) {
    this.incrementalPeriod = incrementalPeriod;
  }


  public BackupPlan incrementalTimePoints(List<NestedBackupPlanTimePoint> incrementalTimePoints) {
    
    this.incrementalTimePoints = incrementalTimePoints;
    return this;
  }

  public BackupPlan addIncrementalTimePointsItem(NestedBackupPlanTimePoint incrementalTimePointsItem) {
    this.incrementalTimePoints.add(incrementalTimePointsItem);
    return this;
  }

   /**
   * Get incrementalTimePoints
   * @return incrementalTimePoints
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<NestedBackupPlanTimePoint> getIncrementalTimePoints() {
    return incrementalTimePoints;
  }


  public void setIncrementalTimePoints(List<NestedBackupPlanTimePoint> incrementalTimePoints) {
    this.incrementalTimePoints = incrementalTimePoints;
  }


  public BackupPlan incrementalWeekdays(List<WeekdayTypeEnum> incrementalWeekdays) {
    
    this.incrementalWeekdays = incrementalWeekdays;
    return this;
  }

  public BackupPlan addIncrementalWeekdaysItem(WeekdayTypeEnum incrementalWeekdaysItem) {
    if (this.incrementalWeekdays == null) {
      this.incrementalWeekdays = new ArrayList<WeekdayTypeEnum>();
    }
    this.incrementalWeekdays.add(incrementalWeekdaysItem);
    return this;
  }

   /**
   * Get incrementalWeekdays
   * @return incrementalWeekdays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<WeekdayTypeEnum> getIncrementalWeekdays() {
    return incrementalWeekdays;
  }


  public void setIncrementalWeekdays(List<WeekdayTypeEnum> incrementalWeekdays) {
    this.incrementalWeekdays = incrementalWeekdays;
  }


  public BackupPlan keepPolicy(BackupPlanKeepPolicy keepPolicy) {
    
    this.keepPolicy = keepPolicy;
    return this;
  }

   /**
   * Get keepPolicy
   * @return keepPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupPlanKeepPolicy getKeepPolicy() {
    return keepPolicy;
  }


  public void setKeepPolicy(BackupPlanKeepPolicy keepPolicy) {
    this.keepPolicy = keepPolicy;
  }


  public BackupPlan keepPolicyValue(Integer keepPolicyValue) {
    
    this.keepPolicyValue = keepPolicyValue;
    return this;
  }

   /**
   * Get keepPolicyValue
   * @return keepPolicyValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getKeepPolicyValue() {
    return keepPolicyValue;
  }


  public void setKeepPolicyValue(Integer keepPolicyValue) {
    this.keepPolicyValue = keepPolicyValue;
  }


  public BackupPlan lastExecuteStatus(BackupPlanExecutionStatus lastExecuteStatus) {
    
    this.lastExecuteStatus = lastExecuteStatus;
    return this;
  }

   /**
   * Get lastExecuteStatus
   * @return lastExecuteStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BackupPlanExecutionStatus getLastExecuteStatus() {
    return lastExecuteStatus;
  }


  public void setLastExecuteStatus(BackupPlanExecutionStatus lastExecuteStatus) {
    this.lastExecuteStatus = lastExecuteStatus;
  }


  public BackupPlan lastExecuteSuccessJobCount(Integer lastExecuteSuccessJobCount) {
    
    this.lastExecuteSuccessJobCount = lastExecuteSuccessJobCount;
    return this;
  }

   /**
   * Get lastExecuteSuccessJobCount
   * @return lastExecuteSuccessJobCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastExecuteSuccessJobCount() {
    return lastExecuteSuccessJobCount;
  }


  public void setLastExecuteSuccessJobCount(Integer lastExecuteSuccessJobCount) {
    this.lastExecuteSuccessJobCount = lastExecuteSuccessJobCount;
  }


  public BackupPlan lastExecuteTotalJobCount(Integer lastExecuteTotalJobCount) {
    
    this.lastExecuteTotalJobCount = lastExecuteTotalJobCount;
    return this;
  }

   /**
   * Get lastExecuteTotalJobCount
   * @return lastExecuteTotalJobCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastExecuteTotalJobCount() {
    return lastExecuteTotalJobCount;
  }


  public void setLastExecuteTotalJobCount(Integer lastExecuteTotalJobCount) {
    this.lastExecuteTotalJobCount = lastExecuteTotalJobCount;
  }


  public BackupPlan lastExecutedAt(String lastExecutedAt) {
    
    this.lastExecutedAt = lastExecutedAt;
    return this;
  }

   /**
   * Get lastExecutedAt
   * @return lastExecutedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastExecutedAt() {
    return lastExecutedAt;
  }


  public void setLastExecutedAt(String lastExecutedAt) {
    this.lastExecutedAt = lastExecutedAt;
  }


  public BackupPlan lastManualExecuteStatus(BackupPlanExecutionStatus lastManualExecuteStatus) {
    
    this.lastManualExecuteStatus = lastManualExecuteStatus;
    return this;
  }

   /**
   * Get lastManualExecuteStatus
   * @return lastManualExecuteStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BackupPlanExecutionStatus getLastManualExecuteStatus() {
    return lastManualExecuteStatus;
  }


  public void setLastManualExecuteStatus(BackupPlanExecutionStatus lastManualExecuteStatus) {
    this.lastManualExecuteStatus = lastManualExecuteStatus;
  }


  public BackupPlan lastManualExecuteSuccessJobCount(Integer lastManualExecuteSuccessJobCount) {
    
    this.lastManualExecuteSuccessJobCount = lastManualExecuteSuccessJobCount;
    return this;
  }

   /**
   * Get lastManualExecuteSuccessJobCount
   * @return lastManualExecuteSuccessJobCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastManualExecuteSuccessJobCount() {
    return lastManualExecuteSuccessJobCount;
  }


  public void setLastManualExecuteSuccessJobCount(Integer lastManualExecuteSuccessJobCount) {
    this.lastManualExecuteSuccessJobCount = lastManualExecuteSuccessJobCount;
  }


  public BackupPlan lastManualExecuteTotalJobCount(Integer lastManualExecuteTotalJobCount) {
    
    this.lastManualExecuteTotalJobCount = lastManualExecuteTotalJobCount;
    return this;
  }

   /**
   * Get lastManualExecuteTotalJobCount
   * @return lastManualExecuteTotalJobCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastManualExecuteTotalJobCount() {
    return lastManualExecuteTotalJobCount;
  }


  public void setLastManualExecuteTotalJobCount(Integer lastManualExecuteTotalJobCount) {
    this.lastManualExecuteTotalJobCount = lastManualExecuteTotalJobCount;
  }


  public BackupPlan lastManualExecutedAt(String lastManualExecutedAt) {
    
    this.lastManualExecutedAt = lastManualExecutedAt;
    return this;
  }

   /**
   * Get lastManualExecutedAt
   * @return lastManualExecutedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastManualExecutedAt() {
    return lastManualExecutedAt;
  }


  public void setLastManualExecutedAt(String lastManualExecutedAt) {
    this.lastManualExecutedAt = lastManualExecutedAt;
  }


  public BackupPlan name(String name) {
    
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


  public BackupPlan nextExecuteTime(String nextExecuteTime) {
    
    this.nextExecuteTime = nextExecuteTime;
    return this;
  }

   /**
   * Get nextExecuteTime
   * @return nextExecuteTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNextExecuteTime() {
    return nextExecuteTime;
  }


  public void setNextExecuteTime(String nextExecuteTime) {
    this.nextExecuteTime = nextExecuteTime;
  }


  public BackupPlan physicalSize(Long physicalSize) {
    
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


  public BackupPlan snapshotConsistentType(ConsistentType snapshotConsistentType) {
    
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


  public BackupPlan status(BackupPlanStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BackupPlanStatus getStatus() {
    return status;
  }


  public void setStatus(BackupPlanStatus status) {
    this.status = status;
  }


  public BackupPlan validSizeOfBackupObject(Long validSizeOfBackupObject) {
    
    this.validSizeOfBackupObject = validSizeOfBackupObject;
    return this;
  }

   /**
   * Get validSizeOfBackupObject
   * @return validSizeOfBackupObject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getValidSizeOfBackupObject() {
    return validSizeOfBackupObject;
  }


  public void setValidSizeOfBackupObject(Long validSizeOfBackupObject) {
    this.validSizeOfBackupObject = validSizeOfBackupObject;
  }


  public BackupPlan vms(List<NestedVm> vms) {
    
    this.vms = vms;
    return this;
  }

  public BackupPlan addVmsItem(NestedVm vmsItem) {
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


  public BackupPlan windowEnd(String windowEnd) {
    
    this.windowEnd = windowEnd;
    return this;
  }

   /**
   * Get windowEnd
   * @return windowEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWindowEnd() {
    return windowEnd;
  }


  public void setWindowEnd(String windowEnd) {
    this.windowEnd = windowEnd;
  }


  public BackupPlan windowStart(String windowStart) {
    
    this.windowStart = windowStart;
    return this;
  }

   /**
   * Get windowStart
   * @return windowStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWindowStart() {
    return windowStart;
  }


  public void setWindowStart(String windowStart) {
    this.windowStart = windowStart;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupPlan backupPlan = (BackupPlan) o;
    return Objects.equals(this.backupService, backupPlan.backupService) &&
        Objects.equals(this.backupStoreRepository, backupPlan.backupStoreRepository) &&
        Objects.equals(this.compression, backupPlan.compression) &&
        Objects.equals(this.compressionRatio, backupPlan.compressionRatio) &&
        Objects.equals(this.createdAt, backupPlan.createdAt) &&
        Objects.equals(this.description, backupPlan.description) &&
        Objects.equals(this.enableWindow, backupPlan.enableWindow) &&
        Objects.equals(this.entityAsyncStatus, backupPlan.entityAsyncStatus) &&
        Objects.equals(this.fullInterval, backupPlan.fullInterval) &&
        Objects.equals(this.fullPeriod, backupPlan.fullPeriod) &&
        Objects.equals(this.fullTimePoint, backupPlan.fullTimePoint) &&
        Objects.equals(this.id, backupPlan.id) &&
        Objects.equals(this.incrementalInterval, backupPlan.incrementalInterval) &&
        Objects.equals(this.incrementalPeriod, backupPlan.incrementalPeriod) &&
        Objects.equals(this.incrementalTimePoints, backupPlan.incrementalTimePoints) &&
        Objects.equals(this.incrementalWeekdays, backupPlan.incrementalWeekdays) &&
        Objects.equals(this.keepPolicy, backupPlan.keepPolicy) &&
        Objects.equals(this.keepPolicyValue, backupPlan.keepPolicyValue) &&
        Objects.equals(this.lastExecuteStatus, backupPlan.lastExecuteStatus) &&
        Objects.equals(this.lastExecuteSuccessJobCount, backupPlan.lastExecuteSuccessJobCount) &&
        Objects.equals(this.lastExecuteTotalJobCount, backupPlan.lastExecuteTotalJobCount) &&
        Objects.equals(this.lastExecutedAt, backupPlan.lastExecutedAt) &&
        Objects.equals(this.lastManualExecuteStatus, backupPlan.lastManualExecuteStatus) &&
        Objects.equals(this.lastManualExecuteSuccessJobCount, backupPlan.lastManualExecuteSuccessJobCount) &&
        Objects.equals(this.lastManualExecuteTotalJobCount, backupPlan.lastManualExecuteTotalJobCount) &&
        Objects.equals(this.lastManualExecutedAt, backupPlan.lastManualExecutedAt) &&
        Objects.equals(this.name, backupPlan.name) &&
        Objects.equals(this.nextExecuteTime, backupPlan.nextExecuteTime) &&
        Objects.equals(this.physicalSize, backupPlan.physicalSize) &&
        Objects.equals(this.snapshotConsistentType, backupPlan.snapshotConsistentType) &&
        Objects.equals(this.status, backupPlan.status) &&
        Objects.equals(this.validSizeOfBackupObject, backupPlan.validSizeOfBackupObject) &&
        Objects.equals(this.vms, backupPlan.vms) &&
        Objects.equals(this.windowEnd, backupPlan.windowEnd) &&
        Objects.equals(this.windowStart, backupPlan.windowStart);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupService, backupStoreRepository, compression, compressionRatio, createdAt, description, enableWindow, entityAsyncStatus, fullInterval, fullPeriod, fullTimePoint, id, incrementalInterval, incrementalPeriod, incrementalTimePoints, incrementalWeekdays, keepPolicy, keepPolicyValue, lastExecuteStatus, lastExecuteSuccessJobCount, lastExecuteTotalJobCount, lastExecutedAt, lastManualExecuteStatus, lastManualExecuteSuccessJobCount, lastManualExecuteTotalJobCount, lastManualExecutedAt, name, nextExecuteTime, physicalSize, snapshotConsistentType, status, validSizeOfBackupObject, vms, windowEnd, windowStart);
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
    sb.append("class BackupPlan {\n");
    sb.append("    backupService: ").append(toIndentedString(backupService)).append("\n");
    sb.append("    backupStoreRepository: ").append(toIndentedString(backupStoreRepository)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    compressionRatio: ").append(toIndentedString(compressionRatio)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enableWindow: ").append(toIndentedString(enableWindow)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    fullInterval: ").append(toIndentedString(fullInterval)).append("\n");
    sb.append("    fullPeriod: ").append(toIndentedString(fullPeriod)).append("\n");
    sb.append("    fullTimePoint: ").append(toIndentedString(fullTimePoint)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    incrementalInterval: ").append(toIndentedString(incrementalInterval)).append("\n");
    sb.append("    incrementalPeriod: ").append(toIndentedString(incrementalPeriod)).append("\n");
    sb.append("    incrementalTimePoints: ").append(toIndentedString(incrementalTimePoints)).append("\n");
    sb.append("    incrementalWeekdays: ").append(toIndentedString(incrementalWeekdays)).append("\n");
    sb.append("    keepPolicy: ").append(toIndentedString(keepPolicy)).append("\n");
    sb.append("    keepPolicyValue: ").append(toIndentedString(keepPolicyValue)).append("\n");
    sb.append("    lastExecuteStatus: ").append(toIndentedString(lastExecuteStatus)).append("\n");
    sb.append("    lastExecuteSuccessJobCount: ").append(toIndentedString(lastExecuteSuccessJobCount)).append("\n");
    sb.append("    lastExecuteTotalJobCount: ").append(toIndentedString(lastExecuteTotalJobCount)).append("\n");
    sb.append("    lastExecutedAt: ").append(toIndentedString(lastExecutedAt)).append("\n");
    sb.append("    lastManualExecuteStatus: ").append(toIndentedString(lastManualExecuteStatus)).append("\n");
    sb.append("    lastManualExecuteSuccessJobCount: ").append(toIndentedString(lastManualExecuteSuccessJobCount)).append("\n");
    sb.append("    lastManualExecuteTotalJobCount: ").append(toIndentedString(lastManualExecuteTotalJobCount)).append("\n");
    sb.append("    lastManualExecutedAt: ").append(toIndentedString(lastManualExecutedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nextExecuteTime: ").append(toIndentedString(nextExecuteTime)).append("\n");
    sb.append("    physicalSize: ").append(toIndentedString(physicalSize)).append("\n");
    sb.append("    snapshotConsistentType: ").append(toIndentedString(snapshotConsistentType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    validSizeOfBackupObject: ").append(toIndentedString(validSizeOfBackupObject)).append("\n");
    sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
    sb.append("    windowEnd: ").append(toIndentedString(windowEnd)).append("\n");
    sb.append("    windowStart: ").append(toIndentedString(windowStart)).append("\n");
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

