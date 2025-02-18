package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.BackupServiceNetworkType;
import com.smartx.tower.model.BackupServiceStatus;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.NestedBackupPlan;
import com.smartx.tower.model.NestedBackupServiceNetworkStatus;
import com.smartx.tower.model.NestedBackupStoreRepository;
import com.smartx.tower.model.NestedCloudTowerApplication;
import com.smartx.tower.model.NestedCluster;
import com.smartx.tower.model.NestedVm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * BackupService
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class BackupService {
  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private NestedCloudTowerApplication application;

  public static final String SERIALIZED_NAME_BACKUP_CLUSTERS = "backup_clusters";
  @SerializedName(SERIALIZED_NAME_BACKUP_CLUSTERS)
  private List<NestedCluster> backupClusters = null;

  public static final String SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY = "backup_network_gateway";
  @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY)
  private String backupNetworkGateway;

  public static final String SERIALIZED_NAME_BACKUP_NETWORK_IP = "backup_network_ip";
  @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_IP)
  private String backupNetworkIp;

  public static final String SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK = "backup_network_subnet_mask";
  @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK)
  private String backupNetworkSubnetMask;

  public static final String SERIALIZED_NAME_BACKUP_NETWORK_TYPE = "backup_network_type";
  @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_TYPE)
  private BackupServiceNetworkType backupNetworkType;

  public static final String SERIALIZED_NAME_BACKUP_NETWORK_VLAN = "backup_network_vlan";
  @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_VLAN)
  private String backupNetworkVlan;

  public static final String SERIALIZED_NAME_BACKUP_PLANS = "backup_plans";
  @SerializedName(SERIALIZED_NAME_BACKUP_PLANS)
  private List<NestedBackupPlan> backupPlans = null;

  public static final String SERIALIZED_NAME_BACKUP_RD_IOPS_MAX = "backup_rd_iops_max";
  @SerializedName(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX)
  private Long backupRdIopsMax;

  public static final String SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES = "backup_store_repositories";
  @SerializedName(SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES)
  private List<NestedBackupStoreRepository> backupStoreRepositories = null;

  public static final String SERIALIZED_NAME_BACKUP_WR_IOPS_MAX = "backup_wr_iops_max";
  @SerializedName(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX)
  private Long backupWrIopsMax;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KUBE_CONFIG = "kube_config";
  @SerializedName(SERIALIZED_NAME_KUBE_CONFIG)
  private String kubeConfig;

  public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY = "management_network_gateway";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY)
  private String managementNetworkGateway;

  public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_IP = "management_network_ip";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP)
  private String managementNetworkIp;

  public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK = "management_network_subnet_mask";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK)
  private String managementNetworkSubnetMask;

  public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN = "management_network_vlan";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN)
  private String managementNetworkVlan;

  public static final String SERIALIZED_NAME_MAX_JOB_RETRY_TIMES = "max_job_retry_times";
  @SerializedName(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES)
  private Integer maxJobRetryTimes;

  public static final String SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS = "max_parallel_backup_jobs";
  @SerializedName(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS)
  private Integer maxParallelBackupJobs;

  public static final String SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS = "max_parallel_restore_jobs";
  @SerializedName(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS)
  private Integer maxParallelRestoreJobs;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NETWORK_STATUS = "network_status";
  @SerializedName(SERIALIZED_NAME_NETWORK_STATUS)
  private List<NestedBackupServiceNetworkStatus> networkStatus = null;

  public static final String SERIALIZED_NAME_RESTORE_RD_IOPS_MAX = "restore_rd_iops_max";
  @SerializedName(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX)
  private Long restoreRdIopsMax;

  public static final String SERIALIZED_NAME_RESTORE_WR_IOPS_MAX = "restore_wr_iops_max";
  @SerializedName(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX)
  private Long restoreWrIopsMax;

  public static final String SERIALIZED_NAME_RETRY_INTERVAL = "retry_interval";
  @SerializedName(SERIALIZED_NAME_RETRY_INTERVAL)
  private Integer retryInterval;

  public static final String SERIALIZED_NAME_RUNNING_VM = "running_vm";
  @SerializedName(SERIALIZED_NAME_RUNNING_VM)
  private NestedVm runningVm;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private BackupServiceStatus status;

  public static final String SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY = "storage_network_gateway";
  @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY)
  private String storageNetworkGateway;

  public static final String SERIALIZED_NAME_STORAGE_NETWORK_IP = "storage_network_ip";
  @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_IP)
  private String storageNetworkIp;

  public static final String SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK = "storage_network_subnet_mask";
  @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK)
  private String storageNetworkSubnetMask;

  public static final String SERIALIZED_NAME_STORAGE_NETWORK_TYPE = "storage_network_type";
  @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_TYPE)
  private BackupServiceNetworkType storageNetworkType;

  public static final String SERIALIZED_NAME_STORAGE_NETWORK_VLAN = "storage_network_vlan";
  @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_VLAN)
  private String storageNetworkVlan;

  public BackupService() { 
  }

  public BackupService application(NestedCloudTowerApplication application) {
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedCloudTowerApplication getApplication() {
    return application;
  }


  public void setApplication(NestedCloudTowerApplication application) {
    this.application = application;
  }


  public BackupService backupClusters(List<NestedCluster> backupClusters) {
    
    this.backupClusters = backupClusters;
    return this;
  }

  public BackupService addBackupClustersItem(NestedCluster backupClustersItem) {
    if (this.backupClusters == null) {
      this.backupClusters = new ArrayList<NestedCluster>();
    }
    this.backupClusters.add(backupClustersItem);
    return this;
  }

   /**
   * Get backupClusters
   * @return backupClusters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedCluster> getBackupClusters() {
    return backupClusters;
  }


  public void setBackupClusters(List<NestedCluster> backupClusters) {
    this.backupClusters = backupClusters;
  }


  public BackupService backupNetworkGateway(String backupNetworkGateway) {
    
    this.backupNetworkGateway = backupNetworkGateway;
    return this;
  }

   /**
   * Get backupNetworkGateway
   * @return backupNetworkGateway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBackupNetworkGateway() {
    return backupNetworkGateway;
  }


  public void setBackupNetworkGateway(String backupNetworkGateway) {
    this.backupNetworkGateway = backupNetworkGateway;
  }


  public BackupService backupNetworkIp(String backupNetworkIp) {
    
    this.backupNetworkIp = backupNetworkIp;
    return this;
  }

   /**
   * Get backupNetworkIp
   * @return backupNetworkIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBackupNetworkIp() {
    return backupNetworkIp;
  }


  public void setBackupNetworkIp(String backupNetworkIp) {
    this.backupNetworkIp = backupNetworkIp;
  }


  public BackupService backupNetworkSubnetMask(String backupNetworkSubnetMask) {
    
    this.backupNetworkSubnetMask = backupNetworkSubnetMask;
    return this;
  }

   /**
   * Get backupNetworkSubnetMask
   * @return backupNetworkSubnetMask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBackupNetworkSubnetMask() {
    return backupNetworkSubnetMask;
  }


  public void setBackupNetworkSubnetMask(String backupNetworkSubnetMask) {
    this.backupNetworkSubnetMask = backupNetworkSubnetMask;
  }


  public BackupService backupNetworkType(BackupServiceNetworkType backupNetworkType) {
    
    this.backupNetworkType = backupNetworkType;
    return this;
  }

   /**
   * Get backupNetworkType
   * @return backupNetworkType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupServiceNetworkType getBackupNetworkType() {
    return backupNetworkType;
  }


  public void setBackupNetworkType(BackupServiceNetworkType backupNetworkType) {
    this.backupNetworkType = backupNetworkType;
  }


  public BackupService backupNetworkVlan(String backupNetworkVlan) {
    
    this.backupNetworkVlan = backupNetworkVlan;
    return this;
  }

   /**
   * Get backupNetworkVlan
   * @return backupNetworkVlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBackupNetworkVlan() {
    return backupNetworkVlan;
  }


  public void setBackupNetworkVlan(String backupNetworkVlan) {
    this.backupNetworkVlan = backupNetworkVlan;
  }


  public BackupService backupPlans(List<NestedBackupPlan> backupPlans) {
    
    this.backupPlans = backupPlans;
    return this;
  }

  public BackupService addBackupPlansItem(NestedBackupPlan backupPlansItem) {
    if (this.backupPlans == null) {
      this.backupPlans = new ArrayList<NestedBackupPlan>();
    }
    this.backupPlans.add(backupPlansItem);
    return this;
  }

   /**
   * Get backupPlans
   * @return backupPlans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedBackupPlan> getBackupPlans() {
    return backupPlans;
  }


  public void setBackupPlans(List<NestedBackupPlan> backupPlans) {
    this.backupPlans = backupPlans;
  }


  public BackupService backupRdIopsMax(Long backupRdIopsMax) {
    
    this.backupRdIopsMax = backupRdIopsMax;
    return this;
  }

   /**
   * Get backupRdIopsMax
   * @return backupRdIopsMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBackupRdIopsMax() {
    return backupRdIopsMax;
  }


  public void setBackupRdIopsMax(Long backupRdIopsMax) {
    this.backupRdIopsMax = backupRdIopsMax;
  }


  public BackupService backupStoreRepositories(List<NestedBackupStoreRepository> backupStoreRepositories) {
    
    this.backupStoreRepositories = backupStoreRepositories;
    return this;
  }

  public BackupService addBackupStoreRepositoriesItem(NestedBackupStoreRepository backupStoreRepositoriesItem) {
    if (this.backupStoreRepositories == null) {
      this.backupStoreRepositories = new ArrayList<NestedBackupStoreRepository>();
    }
    this.backupStoreRepositories.add(backupStoreRepositoriesItem);
    return this;
  }

   /**
   * Get backupStoreRepositories
   * @return backupStoreRepositories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedBackupStoreRepository> getBackupStoreRepositories() {
    return backupStoreRepositories;
  }


  public void setBackupStoreRepositories(List<NestedBackupStoreRepository> backupStoreRepositories) {
    this.backupStoreRepositories = backupStoreRepositories;
  }


  public BackupService backupWrIopsMax(Long backupWrIopsMax) {
    
    this.backupWrIopsMax = backupWrIopsMax;
    return this;
  }

   /**
   * Get backupWrIopsMax
   * @return backupWrIopsMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBackupWrIopsMax() {
    return backupWrIopsMax;
  }


  public void setBackupWrIopsMax(Long backupWrIopsMax) {
    this.backupWrIopsMax = backupWrIopsMax;
  }


  public BackupService description(String description) {
    
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


  public BackupService entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public BackupService id(String id) {
    
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


  public BackupService kubeConfig(String kubeConfig) {
    
    this.kubeConfig = kubeConfig;
    return this;
  }

   /**
   * Get kubeConfig
   * @return kubeConfig
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getKubeConfig() {
    return kubeConfig;
  }


  public void setKubeConfig(String kubeConfig) {
    this.kubeConfig = kubeConfig;
  }


  public BackupService managementNetworkGateway(String managementNetworkGateway) {
    
    this.managementNetworkGateway = managementNetworkGateway;
    return this;
  }

   /**
   * Get managementNetworkGateway
   * @return managementNetworkGateway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagementNetworkGateway() {
    return managementNetworkGateway;
  }


  public void setManagementNetworkGateway(String managementNetworkGateway) {
    this.managementNetworkGateway = managementNetworkGateway;
  }


  public BackupService managementNetworkIp(String managementNetworkIp) {
    
    this.managementNetworkIp = managementNetworkIp;
    return this;
  }

   /**
   * Get managementNetworkIp
   * @return managementNetworkIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagementNetworkIp() {
    return managementNetworkIp;
  }


  public void setManagementNetworkIp(String managementNetworkIp) {
    this.managementNetworkIp = managementNetworkIp;
  }


  public BackupService managementNetworkSubnetMask(String managementNetworkSubnetMask) {
    
    this.managementNetworkSubnetMask = managementNetworkSubnetMask;
    return this;
  }

   /**
   * Get managementNetworkSubnetMask
   * @return managementNetworkSubnetMask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagementNetworkSubnetMask() {
    return managementNetworkSubnetMask;
  }


  public void setManagementNetworkSubnetMask(String managementNetworkSubnetMask) {
    this.managementNetworkSubnetMask = managementNetworkSubnetMask;
  }


  public BackupService managementNetworkVlan(String managementNetworkVlan) {
    
    this.managementNetworkVlan = managementNetworkVlan;
    return this;
  }

   /**
   * Get managementNetworkVlan
   * @return managementNetworkVlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagementNetworkVlan() {
    return managementNetworkVlan;
  }


  public void setManagementNetworkVlan(String managementNetworkVlan) {
    this.managementNetworkVlan = managementNetworkVlan;
  }


  public BackupService maxJobRetryTimes(Integer maxJobRetryTimes) {
    
    this.maxJobRetryTimes = maxJobRetryTimes;
    return this;
  }

   /**
   * Get maxJobRetryTimes
   * @return maxJobRetryTimes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxJobRetryTimes() {
    return maxJobRetryTimes;
  }


  public void setMaxJobRetryTimes(Integer maxJobRetryTimes) {
    this.maxJobRetryTimes = maxJobRetryTimes;
  }


  public BackupService maxParallelBackupJobs(Integer maxParallelBackupJobs) {
    
    this.maxParallelBackupJobs = maxParallelBackupJobs;
    return this;
  }

   /**
   * Get maxParallelBackupJobs
   * @return maxParallelBackupJobs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxParallelBackupJobs() {
    return maxParallelBackupJobs;
  }


  public void setMaxParallelBackupJobs(Integer maxParallelBackupJobs) {
    this.maxParallelBackupJobs = maxParallelBackupJobs;
  }


  public BackupService maxParallelRestoreJobs(Integer maxParallelRestoreJobs) {
    
    this.maxParallelRestoreJobs = maxParallelRestoreJobs;
    return this;
  }

   /**
   * Get maxParallelRestoreJobs
   * @return maxParallelRestoreJobs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxParallelRestoreJobs() {
    return maxParallelRestoreJobs;
  }


  public void setMaxParallelRestoreJobs(Integer maxParallelRestoreJobs) {
    this.maxParallelRestoreJobs = maxParallelRestoreJobs;
  }


  public BackupService name(String name) {
    
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


  public BackupService networkStatus(List<NestedBackupServiceNetworkStatus> networkStatus) {
    
    this.networkStatus = networkStatus;
    return this;
  }

  public BackupService addNetworkStatusItem(NestedBackupServiceNetworkStatus networkStatusItem) {
    if (this.networkStatus == null) {
      this.networkStatus = new ArrayList<NestedBackupServiceNetworkStatus>();
    }
    this.networkStatus.add(networkStatusItem);
    return this;
  }

   /**
   * Get networkStatus
   * @return networkStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedBackupServiceNetworkStatus> getNetworkStatus() {
    return networkStatus;
  }


  public void setNetworkStatus(List<NestedBackupServiceNetworkStatus> networkStatus) {
    this.networkStatus = networkStatus;
  }


  public BackupService restoreRdIopsMax(Long restoreRdIopsMax) {
    
    this.restoreRdIopsMax = restoreRdIopsMax;
    return this;
  }

   /**
   * Get restoreRdIopsMax
   * @return restoreRdIopsMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRestoreRdIopsMax() {
    return restoreRdIopsMax;
  }


  public void setRestoreRdIopsMax(Long restoreRdIopsMax) {
    this.restoreRdIopsMax = restoreRdIopsMax;
  }


  public BackupService restoreWrIopsMax(Long restoreWrIopsMax) {
    
    this.restoreWrIopsMax = restoreWrIopsMax;
    return this;
  }

   /**
   * Get restoreWrIopsMax
   * @return restoreWrIopsMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRestoreWrIopsMax() {
    return restoreWrIopsMax;
  }


  public void setRestoreWrIopsMax(Long restoreWrIopsMax) {
    this.restoreWrIopsMax = restoreWrIopsMax;
  }


  public BackupService retryInterval(Integer retryInterval) {
    
    this.retryInterval = retryInterval;
    return this;
  }

   /**
   * Get retryInterval
   * @return retryInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRetryInterval() {
    return retryInterval;
  }


  public void setRetryInterval(Integer retryInterval) {
    this.retryInterval = retryInterval;
  }


  public BackupService runningVm(NestedVm runningVm) {
    
    this.runningVm = runningVm;
    return this;
  }

   /**
   * Get runningVm
   * @return runningVm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedVm getRunningVm() {
    return runningVm;
  }


  public void setRunningVm(NestedVm runningVm) {
    this.runningVm = runningVm;
  }


  public BackupService status(BackupServiceStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupServiceStatus getStatus() {
    return status;
  }


  public void setStatus(BackupServiceStatus status) {
    this.status = status;
  }


  public BackupService storageNetworkGateway(String storageNetworkGateway) {
    
    this.storageNetworkGateway = storageNetworkGateway;
    return this;
  }

   /**
   * Get storageNetworkGateway
   * @return storageNetworkGateway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStorageNetworkGateway() {
    return storageNetworkGateway;
  }


  public void setStorageNetworkGateway(String storageNetworkGateway) {
    this.storageNetworkGateway = storageNetworkGateway;
  }


  public BackupService storageNetworkIp(String storageNetworkIp) {
    
    this.storageNetworkIp = storageNetworkIp;
    return this;
  }

   /**
   * Get storageNetworkIp
   * @return storageNetworkIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStorageNetworkIp() {
    return storageNetworkIp;
  }


  public void setStorageNetworkIp(String storageNetworkIp) {
    this.storageNetworkIp = storageNetworkIp;
  }


  public BackupService storageNetworkSubnetMask(String storageNetworkSubnetMask) {
    
    this.storageNetworkSubnetMask = storageNetworkSubnetMask;
    return this;
  }

   /**
   * Get storageNetworkSubnetMask
   * @return storageNetworkSubnetMask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStorageNetworkSubnetMask() {
    return storageNetworkSubnetMask;
  }


  public void setStorageNetworkSubnetMask(String storageNetworkSubnetMask) {
    this.storageNetworkSubnetMask = storageNetworkSubnetMask;
  }


  public BackupService storageNetworkType(BackupServiceNetworkType storageNetworkType) {
    
    this.storageNetworkType = storageNetworkType;
    return this;
  }

   /**
   * Get storageNetworkType
   * @return storageNetworkType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupServiceNetworkType getStorageNetworkType() {
    return storageNetworkType;
  }


  public void setStorageNetworkType(BackupServiceNetworkType storageNetworkType) {
    this.storageNetworkType = storageNetworkType;
  }


  public BackupService storageNetworkVlan(String storageNetworkVlan) {
    
    this.storageNetworkVlan = storageNetworkVlan;
    return this;
  }

   /**
   * Get storageNetworkVlan
   * @return storageNetworkVlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStorageNetworkVlan() {
    return storageNetworkVlan;
  }


  public void setStorageNetworkVlan(String storageNetworkVlan) {
    this.storageNetworkVlan = storageNetworkVlan;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupService backupService = (BackupService) o;
    return Objects.equals(this.application, backupService.application) &&
        Objects.equals(this.backupClusters, backupService.backupClusters) &&
        Objects.equals(this.backupNetworkGateway, backupService.backupNetworkGateway) &&
        Objects.equals(this.backupNetworkIp, backupService.backupNetworkIp) &&
        Objects.equals(this.backupNetworkSubnetMask, backupService.backupNetworkSubnetMask) &&
        Objects.equals(this.backupNetworkType, backupService.backupNetworkType) &&
        Objects.equals(this.backupNetworkVlan, backupService.backupNetworkVlan) &&
        Objects.equals(this.backupPlans, backupService.backupPlans) &&
        Objects.equals(this.backupRdIopsMax, backupService.backupRdIopsMax) &&
        Objects.equals(this.backupStoreRepositories, backupService.backupStoreRepositories) &&
        Objects.equals(this.backupWrIopsMax, backupService.backupWrIopsMax) &&
        Objects.equals(this.description, backupService.description) &&
        Objects.equals(this.entityAsyncStatus, backupService.entityAsyncStatus) &&
        Objects.equals(this.id, backupService.id) &&
        Objects.equals(this.kubeConfig, backupService.kubeConfig) &&
        Objects.equals(this.managementNetworkGateway, backupService.managementNetworkGateway) &&
        Objects.equals(this.managementNetworkIp, backupService.managementNetworkIp) &&
        Objects.equals(this.managementNetworkSubnetMask, backupService.managementNetworkSubnetMask) &&
        Objects.equals(this.managementNetworkVlan, backupService.managementNetworkVlan) &&
        Objects.equals(this.maxJobRetryTimes, backupService.maxJobRetryTimes) &&
        Objects.equals(this.maxParallelBackupJobs, backupService.maxParallelBackupJobs) &&
        Objects.equals(this.maxParallelRestoreJobs, backupService.maxParallelRestoreJobs) &&
        Objects.equals(this.name, backupService.name) &&
        Objects.equals(this.networkStatus, backupService.networkStatus) &&
        Objects.equals(this.restoreRdIopsMax, backupService.restoreRdIopsMax) &&
        Objects.equals(this.restoreWrIopsMax, backupService.restoreWrIopsMax) &&
        Objects.equals(this.retryInterval, backupService.retryInterval) &&
        Objects.equals(this.runningVm, backupService.runningVm) &&
        Objects.equals(this.status, backupService.status) &&
        Objects.equals(this.storageNetworkGateway, backupService.storageNetworkGateway) &&
        Objects.equals(this.storageNetworkIp, backupService.storageNetworkIp) &&
        Objects.equals(this.storageNetworkSubnetMask, backupService.storageNetworkSubnetMask) &&
        Objects.equals(this.storageNetworkType, backupService.storageNetworkType) &&
        Objects.equals(this.storageNetworkVlan, backupService.storageNetworkVlan);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, backupClusters, backupNetworkGateway, backupNetworkIp, backupNetworkSubnetMask, backupNetworkType, backupNetworkVlan, backupPlans, backupRdIopsMax, backupStoreRepositories, backupWrIopsMax, description, entityAsyncStatus, id, kubeConfig, managementNetworkGateway, managementNetworkIp, managementNetworkSubnetMask, managementNetworkVlan, maxJobRetryTimes, maxParallelBackupJobs, maxParallelRestoreJobs, name, networkStatus, restoreRdIopsMax, restoreWrIopsMax, retryInterval, runningVm, status, storageNetworkGateway, storageNetworkIp, storageNetworkSubnetMask, storageNetworkType, storageNetworkVlan);
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
    sb.append("class BackupService {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    backupClusters: ").append(toIndentedString(backupClusters)).append("\n");
    sb.append("    backupNetworkGateway: ").append(toIndentedString(backupNetworkGateway)).append("\n");
    sb.append("    backupNetworkIp: ").append(toIndentedString(backupNetworkIp)).append("\n");
    sb.append("    backupNetworkSubnetMask: ").append(toIndentedString(backupNetworkSubnetMask)).append("\n");
    sb.append("    backupNetworkType: ").append(toIndentedString(backupNetworkType)).append("\n");
    sb.append("    backupNetworkVlan: ").append(toIndentedString(backupNetworkVlan)).append("\n");
    sb.append("    backupPlans: ").append(toIndentedString(backupPlans)).append("\n");
    sb.append("    backupRdIopsMax: ").append(toIndentedString(backupRdIopsMax)).append("\n");
    sb.append("    backupStoreRepositories: ").append(toIndentedString(backupStoreRepositories)).append("\n");
    sb.append("    backupWrIopsMax: ").append(toIndentedString(backupWrIopsMax)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kubeConfig: ").append(toIndentedString(kubeConfig)).append("\n");
    sb.append("    managementNetworkGateway: ").append(toIndentedString(managementNetworkGateway)).append("\n");
    sb.append("    managementNetworkIp: ").append(toIndentedString(managementNetworkIp)).append("\n");
    sb.append("    managementNetworkSubnetMask: ").append(toIndentedString(managementNetworkSubnetMask)).append("\n");
    sb.append("    managementNetworkVlan: ").append(toIndentedString(managementNetworkVlan)).append("\n");
    sb.append("    maxJobRetryTimes: ").append(toIndentedString(maxJobRetryTimes)).append("\n");
    sb.append("    maxParallelBackupJobs: ").append(toIndentedString(maxParallelBackupJobs)).append("\n");
    sb.append("    maxParallelRestoreJobs: ").append(toIndentedString(maxParallelRestoreJobs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    networkStatus: ").append(toIndentedString(networkStatus)).append("\n");
    sb.append("    restoreRdIopsMax: ").append(toIndentedString(restoreRdIopsMax)).append("\n");
    sb.append("    restoreWrIopsMax: ").append(toIndentedString(restoreWrIopsMax)).append("\n");
    sb.append("    retryInterval: ").append(toIndentedString(retryInterval)).append("\n");
    sb.append("    runningVm: ").append(toIndentedString(runningVm)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    storageNetworkGateway: ").append(toIndentedString(storageNetworkGateway)).append("\n");
    sb.append("    storageNetworkIp: ").append(toIndentedString(storageNetworkIp)).append("\n");
    sb.append("    storageNetworkSubnetMask: ").append(toIndentedString(storageNetworkSubnetMask)).append("\n");
    sb.append("    storageNetworkType: ").append(toIndentedString(storageNetworkType)).append("\n");
    sb.append("    storageNetworkVlan: ").append(toIndentedString(storageNetworkVlan)).append("\n");
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

