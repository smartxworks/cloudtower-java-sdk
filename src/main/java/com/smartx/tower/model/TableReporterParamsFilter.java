package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.GetAlertsRequestBody;
import com.smartx.tower.model.GetClustersRequestBody;
import com.smartx.tower.model.GetConsistencyGroupsRequestBody;
import com.smartx.tower.model.GetContentLibraryImagesRequestBody;
import com.smartx.tower.model.GetContentLibraryVmTemplatesRequestBody;
import com.smartx.tower.model.GetDatacentersRequestBody;
import com.smartx.tower.model.GetDisksRequestBody;
import com.smartx.tower.model.GetElfDataStoresRequestBody;
import com.smartx.tower.model.GetElfImagesRequestBody;
import com.smartx.tower.model.GetEntityFiltersRequestBody;
import com.smartx.tower.model.GetGlobalAlertRulesRequestBody;
import com.smartx.tower.model.GetHostsRequestBody;
import com.smartx.tower.model.GetIscsiConnectionsRequestBody;
import com.smartx.tower.model.GetIscsiLunSnapshotsRequestBody;
import com.smartx.tower.model.GetIscsiLunsRequestBody;
import com.smartx.tower.model.GetIscsiTargetsRequestBody;
import com.smartx.tower.model.GetNamespaceGroupsRequestBody;
import com.smartx.tower.model.GetNfsExportsRequestBody;
import com.smartx.tower.model.GetNicsRequestBody;
import com.smartx.tower.model.GetNvmfNamespaceSnapshotsRequestBody;
import com.smartx.tower.model.GetNvmfNamespacesRequestBody;
import com.smartx.tower.model.GetNvmfSubsystemsRequestBody;
import com.smartx.tower.model.GetSnapshotPlansRequestBody;
import com.smartx.tower.model.GetSystemAuditLogsRequestBody;
import com.smartx.tower.model.GetTasksRequestBody;
import com.smartx.tower.model.GetUsbDevicesRequestBody;
import com.smartx.tower.model.GetUserAuditLogsRequestBody;
import com.smartx.tower.model.GetUsersRequestBody;
import com.smartx.tower.model.GetVdsesRequestBody;
import com.smartx.tower.model.GetVlansRequestBody;
import com.smartx.tower.model.GetVmPlacementGroupsRequestBody;
import com.smartx.tower.model.GetVmTemplatesRequestBody;
import com.smartx.tower.model.GetVmVolumesRequestBody;
import com.smartx.tower.model.GetVmsRequestBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TableReporterParamsFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class TableReporterParamsFilter {
  public static final String SERIALIZED_NAME_NVMF_SUBSYSTEMS = "nvmfSubsystems";
  @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEMS)
  private GetNvmfSubsystemsRequestBody nvmfSubsystems;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES = "contentLibraryVmTemplates";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES)
  private GetContentLibraryVmTemplatesRequestBody contentLibraryVmTemplates;

  public static final String SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS = "nvmfNamespaceSnapshots";
  @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS)
  private GetNvmfNamespaceSnapshotsRequestBody nvmfNamespaceSnapshots;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES = "contentLibraryImages";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES)
  private GetContentLibraryImagesRequestBody contentLibraryImages;

  public static final String SERIALIZED_NAME_NVMF_NAMESPACES = "nvmfNamespaces";
  @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACES)
  private GetNvmfNamespacesRequestBody nvmfNamespaces;

  public static final String SERIALIZED_NAME_NAMESPACE_GROUPS = "namespaceGroups";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUPS)
  private GetNamespaceGroupsRequestBody namespaceGroups;

  public static final String SERIALIZED_NAME_ISCSI_LUNS = "iscsiLuns";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUNS)
  private GetIscsiLunsRequestBody iscsiLuns;

  public static final String SERIALIZED_NAME_TASKS = "tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private GetTasksRequestBody tasks;

  public static final String SERIALIZED_NAME_USER_AUDIT_LOGS = "userAuditLogs";
  @SerializedName(SERIALIZED_NAME_USER_AUDIT_LOGS)
  private GetUserAuditLogsRequestBody userAuditLogs;

  public static final String SERIALIZED_NAME_SYSTEM_AUDIT_LOGS = "systemAuditLogs";
  @SerializedName(SERIALIZED_NAME_SYSTEM_AUDIT_LOGS)
  private GetSystemAuditLogsRequestBody systemAuditLogs;

  public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS = "iscsiLunSnapshots";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS)
  private GetIscsiLunSnapshotsRequestBody iscsiLunSnapshots;

  public static final String SERIALIZED_NAME_ISCSI_CONNECTIONS = "iscsiConnections";
  @SerializedName(SERIALIZED_NAME_ISCSI_CONNECTIONS)
  private GetIscsiConnectionsRequestBody iscsiConnections;

  public static final String SERIALIZED_NAME_CONSISTENCY_GROUPS = "consistencyGroups";
  @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUPS)
  private GetConsistencyGroupsRequestBody consistencyGroups;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private GetUsersRequestBody users;

  public static final String SERIALIZED_NAME_VM_ENTITY_FILTERS = "vmEntityFilters";
  @SerializedName(SERIALIZED_NAME_VM_ENTITY_FILTERS)
  private GetEntityFiltersRequestBody vmEntityFilters;

  public static final String SERIALIZED_NAME_SNAPSHOT_PLANS = "snapshotPlans";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_PLANS)
  private GetSnapshotPlansRequestBody snapshotPlans;

  public static final String SERIALIZED_NAME_GLOBAL_ALERT_RULES = "globalAlertRules";
  @SerializedName(SERIALIZED_NAME_GLOBAL_ALERT_RULES)
  private GetGlobalAlertRulesRequestBody globalAlertRules;

  public static final String SERIALIZED_NAME_ALERTS = "alerts";
  @SerializedName(SERIALIZED_NAME_ALERTS)
  private GetAlertsRequestBody alerts;

  public static final String SERIALIZED_NAME_VM_PLACEMENT_GROUPS = "vmPlacementGroups";
  @SerializedName(SERIALIZED_NAME_VM_PLACEMENT_GROUPS)
  private GetVmPlacementGroupsRequestBody vmPlacementGroups;

  public static final String SERIALIZED_NAME_VM_TEMPLATES = "vmTemplates";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATES)
  private GetVmTemplatesRequestBody vmTemplates;

  public static final String SERIALIZED_NAME_ELF_IMAGES = "elfImages";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGES)
  private GetElfImagesRequestBody elfImages;

  public static final String SERIALIZED_NAME_VM_VOLUMES = "vmVolumes";
  @SerializedName(SERIALIZED_NAME_VM_VOLUMES)
  private GetVmVolumesRequestBody vmVolumes;

  public static final String SERIALIZED_NAME_VLANS = "vlans";
  @SerializedName(SERIALIZED_NAME_VLANS)
  private GetVlansRequestBody vlans;

  public static final String SERIALIZED_NAME_DISKS = "disks";
  @SerializedName(SERIALIZED_NAME_DISKS)
  private GetDisksRequestBody disks;

  public static final String SERIALIZED_NAME_VDSES = "vdses";
  @SerializedName(SERIALIZED_NAME_VDSES)
  private GetVdsesRequestBody vdses;

  public static final String SERIALIZED_NAME_ELF_DATA_STORES = "elfDataStores";
  @SerializedName(SERIALIZED_NAME_ELF_DATA_STORES)
  private GetElfDataStoresRequestBody elfDataStores;

  public static final String SERIALIZED_NAME_VMS = "vms";
  @SerializedName(SERIALIZED_NAME_VMS)
  private GetVmsRequestBody vms;

  public static final String SERIALIZED_NAME_NFS_EXPORTS = "nfsExports";
  @SerializedName(SERIALIZED_NAME_NFS_EXPORTS)
  private GetNfsExportsRequestBody nfsExports;

  public static final String SERIALIZED_NAME_ISCSI_TARGETS = "iscsiTargets";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGETS)
  private GetIscsiTargetsRequestBody iscsiTargets;

  public static final String SERIALIZED_NAME_USB_DEVICES = "usbDevices";
  @SerializedName(SERIALIZED_NAME_USB_DEVICES)
  private GetUsbDevicesRequestBody usbDevices;

  public static final String SERIALIZED_NAME_NICS = "nics";
  @SerializedName(SERIALIZED_NAME_NICS)
  private GetNicsRequestBody nics;

  public static final String SERIALIZED_NAME_CLUSTERS = "clusters";
  @SerializedName(SERIALIZED_NAME_CLUSTERS)
  private GetClustersRequestBody clusters;

  public static final String SERIALIZED_NAME_DATACENTERS = "datacenters";
  @SerializedName(SERIALIZED_NAME_DATACENTERS)
  private GetDatacentersRequestBody datacenters;

  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  private GetHostsRequestBody hosts;

  public TableReporterParamsFilter() { 
  }

  public TableReporterParamsFilter nvmfSubsystems(GetNvmfSubsystemsRequestBody nvmfSubsystems) {
    
    this.nvmfSubsystems = nvmfSubsystems;
    return this;
  }

   /**
   * Get nvmfSubsystems
   * @return nvmfSubsystems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetNvmfSubsystemsRequestBody getNvmfSubsystems() {
    return nvmfSubsystems;
  }


  public void setNvmfSubsystems(GetNvmfSubsystemsRequestBody nvmfSubsystems) {
    this.nvmfSubsystems = nvmfSubsystems;
  }


  public TableReporterParamsFilter contentLibraryVmTemplates(GetContentLibraryVmTemplatesRequestBody contentLibraryVmTemplates) {
    
    this.contentLibraryVmTemplates = contentLibraryVmTemplates;
    return this;
  }

   /**
   * Get contentLibraryVmTemplates
   * @return contentLibraryVmTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetContentLibraryVmTemplatesRequestBody getContentLibraryVmTemplates() {
    return contentLibraryVmTemplates;
  }


  public void setContentLibraryVmTemplates(GetContentLibraryVmTemplatesRequestBody contentLibraryVmTemplates) {
    this.contentLibraryVmTemplates = contentLibraryVmTemplates;
  }


  public TableReporterParamsFilter nvmfNamespaceSnapshots(GetNvmfNamespaceSnapshotsRequestBody nvmfNamespaceSnapshots) {
    
    this.nvmfNamespaceSnapshots = nvmfNamespaceSnapshots;
    return this;
  }

   /**
   * Get nvmfNamespaceSnapshots
   * @return nvmfNamespaceSnapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetNvmfNamespaceSnapshotsRequestBody getNvmfNamespaceSnapshots() {
    return nvmfNamespaceSnapshots;
  }


  public void setNvmfNamespaceSnapshots(GetNvmfNamespaceSnapshotsRequestBody nvmfNamespaceSnapshots) {
    this.nvmfNamespaceSnapshots = nvmfNamespaceSnapshots;
  }


  public TableReporterParamsFilter contentLibraryImages(GetContentLibraryImagesRequestBody contentLibraryImages) {
    
    this.contentLibraryImages = contentLibraryImages;
    return this;
  }

   /**
   * Get contentLibraryImages
   * @return contentLibraryImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetContentLibraryImagesRequestBody getContentLibraryImages() {
    return contentLibraryImages;
  }


  public void setContentLibraryImages(GetContentLibraryImagesRequestBody contentLibraryImages) {
    this.contentLibraryImages = contentLibraryImages;
  }


  public TableReporterParamsFilter nvmfNamespaces(GetNvmfNamespacesRequestBody nvmfNamespaces) {
    
    this.nvmfNamespaces = nvmfNamespaces;
    return this;
  }

   /**
   * Get nvmfNamespaces
   * @return nvmfNamespaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetNvmfNamespacesRequestBody getNvmfNamespaces() {
    return nvmfNamespaces;
  }


  public void setNvmfNamespaces(GetNvmfNamespacesRequestBody nvmfNamespaces) {
    this.nvmfNamespaces = nvmfNamespaces;
  }


  public TableReporterParamsFilter namespaceGroups(GetNamespaceGroupsRequestBody namespaceGroups) {
    
    this.namespaceGroups = namespaceGroups;
    return this;
  }

   /**
   * Get namespaceGroups
   * @return namespaceGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetNamespaceGroupsRequestBody getNamespaceGroups() {
    return namespaceGroups;
  }


  public void setNamespaceGroups(GetNamespaceGroupsRequestBody namespaceGroups) {
    this.namespaceGroups = namespaceGroups;
  }


  public TableReporterParamsFilter iscsiLuns(GetIscsiLunsRequestBody iscsiLuns) {
    
    this.iscsiLuns = iscsiLuns;
    return this;
  }

   /**
   * Get iscsiLuns
   * @return iscsiLuns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetIscsiLunsRequestBody getIscsiLuns() {
    return iscsiLuns;
  }


  public void setIscsiLuns(GetIscsiLunsRequestBody iscsiLuns) {
    this.iscsiLuns = iscsiLuns;
  }


  public TableReporterParamsFilter tasks(GetTasksRequestBody tasks) {
    
    this.tasks = tasks;
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetTasksRequestBody getTasks() {
    return tasks;
  }


  public void setTasks(GetTasksRequestBody tasks) {
    this.tasks = tasks;
  }


  public TableReporterParamsFilter userAuditLogs(GetUserAuditLogsRequestBody userAuditLogs) {
    
    this.userAuditLogs = userAuditLogs;
    return this;
  }

   /**
   * Get userAuditLogs
   * @return userAuditLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetUserAuditLogsRequestBody getUserAuditLogs() {
    return userAuditLogs;
  }


  public void setUserAuditLogs(GetUserAuditLogsRequestBody userAuditLogs) {
    this.userAuditLogs = userAuditLogs;
  }


  public TableReporterParamsFilter systemAuditLogs(GetSystemAuditLogsRequestBody systemAuditLogs) {
    
    this.systemAuditLogs = systemAuditLogs;
    return this;
  }

   /**
   * Get systemAuditLogs
   * @return systemAuditLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSystemAuditLogsRequestBody getSystemAuditLogs() {
    return systemAuditLogs;
  }


  public void setSystemAuditLogs(GetSystemAuditLogsRequestBody systemAuditLogs) {
    this.systemAuditLogs = systemAuditLogs;
  }


  public TableReporterParamsFilter iscsiLunSnapshots(GetIscsiLunSnapshotsRequestBody iscsiLunSnapshots) {
    
    this.iscsiLunSnapshots = iscsiLunSnapshots;
    return this;
  }

   /**
   * Get iscsiLunSnapshots
   * @return iscsiLunSnapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetIscsiLunSnapshotsRequestBody getIscsiLunSnapshots() {
    return iscsiLunSnapshots;
  }


  public void setIscsiLunSnapshots(GetIscsiLunSnapshotsRequestBody iscsiLunSnapshots) {
    this.iscsiLunSnapshots = iscsiLunSnapshots;
  }


  public TableReporterParamsFilter iscsiConnections(GetIscsiConnectionsRequestBody iscsiConnections) {
    
    this.iscsiConnections = iscsiConnections;
    return this;
  }

   /**
   * Get iscsiConnections
   * @return iscsiConnections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetIscsiConnectionsRequestBody getIscsiConnections() {
    return iscsiConnections;
  }


  public void setIscsiConnections(GetIscsiConnectionsRequestBody iscsiConnections) {
    this.iscsiConnections = iscsiConnections;
  }


  public TableReporterParamsFilter consistencyGroups(GetConsistencyGroupsRequestBody consistencyGroups) {
    
    this.consistencyGroups = consistencyGroups;
    return this;
  }

   /**
   * Get consistencyGroups
   * @return consistencyGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetConsistencyGroupsRequestBody getConsistencyGroups() {
    return consistencyGroups;
  }


  public void setConsistencyGroups(GetConsistencyGroupsRequestBody consistencyGroups) {
    this.consistencyGroups = consistencyGroups;
  }


  public TableReporterParamsFilter users(GetUsersRequestBody users) {
    
    this.users = users;
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetUsersRequestBody getUsers() {
    return users;
  }


  public void setUsers(GetUsersRequestBody users) {
    this.users = users;
  }


  public TableReporterParamsFilter vmEntityFilters(GetEntityFiltersRequestBody vmEntityFilters) {
    
    this.vmEntityFilters = vmEntityFilters;
    return this;
  }

   /**
   * Get vmEntityFilters
   * @return vmEntityFilters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetEntityFiltersRequestBody getVmEntityFilters() {
    return vmEntityFilters;
  }


  public void setVmEntityFilters(GetEntityFiltersRequestBody vmEntityFilters) {
    this.vmEntityFilters = vmEntityFilters;
  }


  public TableReporterParamsFilter snapshotPlans(GetSnapshotPlansRequestBody snapshotPlans) {
    
    this.snapshotPlans = snapshotPlans;
    return this;
  }

   /**
   * Get snapshotPlans
   * @return snapshotPlans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSnapshotPlansRequestBody getSnapshotPlans() {
    return snapshotPlans;
  }


  public void setSnapshotPlans(GetSnapshotPlansRequestBody snapshotPlans) {
    this.snapshotPlans = snapshotPlans;
  }


  public TableReporterParamsFilter globalAlertRules(GetGlobalAlertRulesRequestBody globalAlertRules) {
    
    this.globalAlertRules = globalAlertRules;
    return this;
  }

   /**
   * Get globalAlertRules
   * @return globalAlertRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetGlobalAlertRulesRequestBody getGlobalAlertRules() {
    return globalAlertRules;
  }


  public void setGlobalAlertRules(GetGlobalAlertRulesRequestBody globalAlertRules) {
    this.globalAlertRules = globalAlertRules;
  }


  public TableReporterParamsFilter alerts(GetAlertsRequestBody alerts) {
    
    this.alerts = alerts;
    return this;
  }

   /**
   * Get alerts
   * @return alerts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAlertsRequestBody getAlerts() {
    return alerts;
  }


  public void setAlerts(GetAlertsRequestBody alerts) {
    this.alerts = alerts;
  }


  public TableReporterParamsFilter vmPlacementGroups(GetVmPlacementGroupsRequestBody vmPlacementGroups) {
    
    this.vmPlacementGroups = vmPlacementGroups;
    return this;
  }

   /**
   * Get vmPlacementGroups
   * @return vmPlacementGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetVmPlacementGroupsRequestBody getVmPlacementGroups() {
    return vmPlacementGroups;
  }


  public void setVmPlacementGroups(GetVmPlacementGroupsRequestBody vmPlacementGroups) {
    this.vmPlacementGroups = vmPlacementGroups;
  }


  public TableReporterParamsFilter vmTemplates(GetVmTemplatesRequestBody vmTemplates) {
    
    this.vmTemplates = vmTemplates;
    return this;
  }

   /**
   * Get vmTemplates
   * @return vmTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetVmTemplatesRequestBody getVmTemplates() {
    return vmTemplates;
  }


  public void setVmTemplates(GetVmTemplatesRequestBody vmTemplates) {
    this.vmTemplates = vmTemplates;
  }


  public TableReporterParamsFilter elfImages(GetElfImagesRequestBody elfImages) {
    
    this.elfImages = elfImages;
    return this;
  }

   /**
   * Get elfImages
   * @return elfImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetElfImagesRequestBody getElfImages() {
    return elfImages;
  }


  public void setElfImages(GetElfImagesRequestBody elfImages) {
    this.elfImages = elfImages;
  }


  public TableReporterParamsFilter vmVolumes(GetVmVolumesRequestBody vmVolumes) {
    
    this.vmVolumes = vmVolumes;
    return this;
  }

   /**
   * Get vmVolumes
   * @return vmVolumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetVmVolumesRequestBody getVmVolumes() {
    return vmVolumes;
  }


  public void setVmVolumes(GetVmVolumesRequestBody vmVolumes) {
    this.vmVolumes = vmVolumes;
  }


  public TableReporterParamsFilter vlans(GetVlansRequestBody vlans) {
    
    this.vlans = vlans;
    return this;
  }

   /**
   * Get vlans
   * @return vlans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetVlansRequestBody getVlans() {
    return vlans;
  }


  public void setVlans(GetVlansRequestBody vlans) {
    this.vlans = vlans;
  }


  public TableReporterParamsFilter disks(GetDisksRequestBody disks) {
    
    this.disks = disks;
    return this;
  }

   /**
   * Get disks
   * @return disks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetDisksRequestBody getDisks() {
    return disks;
  }


  public void setDisks(GetDisksRequestBody disks) {
    this.disks = disks;
  }


  public TableReporterParamsFilter vdses(GetVdsesRequestBody vdses) {
    
    this.vdses = vdses;
    return this;
  }

   /**
   * Get vdses
   * @return vdses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetVdsesRequestBody getVdses() {
    return vdses;
  }


  public void setVdses(GetVdsesRequestBody vdses) {
    this.vdses = vdses;
  }


  public TableReporterParamsFilter elfDataStores(GetElfDataStoresRequestBody elfDataStores) {
    
    this.elfDataStores = elfDataStores;
    return this;
  }

   /**
   * Get elfDataStores
   * @return elfDataStores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetElfDataStoresRequestBody getElfDataStores() {
    return elfDataStores;
  }


  public void setElfDataStores(GetElfDataStoresRequestBody elfDataStores) {
    this.elfDataStores = elfDataStores;
  }


  public TableReporterParamsFilter vms(GetVmsRequestBody vms) {
    
    this.vms = vms;
    return this;
  }

   /**
   * Get vms
   * @return vms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetVmsRequestBody getVms() {
    return vms;
  }


  public void setVms(GetVmsRequestBody vms) {
    this.vms = vms;
  }


  public TableReporterParamsFilter nfsExports(GetNfsExportsRequestBody nfsExports) {
    
    this.nfsExports = nfsExports;
    return this;
  }

   /**
   * Get nfsExports
   * @return nfsExports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetNfsExportsRequestBody getNfsExports() {
    return nfsExports;
  }


  public void setNfsExports(GetNfsExportsRequestBody nfsExports) {
    this.nfsExports = nfsExports;
  }


  public TableReporterParamsFilter iscsiTargets(GetIscsiTargetsRequestBody iscsiTargets) {
    
    this.iscsiTargets = iscsiTargets;
    return this;
  }

   /**
   * Get iscsiTargets
   * @return iscsiTargets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetIscsiTargetsRequestBody getIscsiTargets() {
    return iscsiTargets;
  }


  public void setIscsiTargets(GetIscsiTargetsRequestBody iscsiTargets) {
    this.iscsiTargets = iscsiTargets;
  }


  public TableReporterParamsFilter usbDevices(GetUsbDevicesRequestBody usbDevices) {
    
    this.usbDevices = usbDevices;
    return this;
  }

   /**
   * Get usbDevices
   * @return usbDevices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetUsbDevicesRequestBody getUsbDevices() {
    return usbDevices;
  }


  public void setUsbDevices(GetUsbDevicesRequestBody usbDevices) {
    this.usbDevices = usbDevices;
  }


  public TableReporterParamsFilter nics(GetNicsRequestBody nics) {
    
    this.nics = nics;
    return this;
  }

   /**
   * Get nics
   * @return nics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetNicsRequestBody getNics() {
    return nics;
  }


  public void setNics(GetNicsRequestBody nics) {
    this.nics = nics;
  }


  public TableReporterParamsFilter clusters(GetClustersRequestBody clusters) {
    
    this.clusters = clusters;
    return this;
  }

   /**
   * Get clusters
   * @return clusters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetClustersRequestBody getClusters() {
    return clusters;
  }


  public void setClusters(GetClustersRequestBody clusters) {
    this.clusters = clusters;
  }


  public TableReporterParamsFilter datacenters(GetDatacentersRequestBody datacenters) {
    
    this.datacenters = datacenters;
    return this;
  }

   /**
   * Get datacenters
   * @return datacenters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetDatacentersRequestBody getDatacenters() {
    return datacenters;
  }


  public void setDatacenters(GetDatacentersRequestBody datacenters) {
    this.datacenters = datacenters;
  }


  public TableReporterParamsFilter hosts(GetHostsRequestBody hosts) {
    
    this.hosts = hosts;
    return this;
  }

   /**
   * Get hosts
   * @return hosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetHostsRequestBody getHosts() {
    return hosts;
  }


  public void setHosts(GetHostsRequestBody hosts) {
    this.hosts = hosts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableReporterParamsFilter tableReporterParamsFilter = (TableReporterParamsFilter) o;
    return Objects.equals(this.nvmfSubsystems, tableReporterParamsFilter.nvmfSubsystems) &&
        Objects.equals(this.contentLibraryVmTemplates, tableReporterParamsFilter.contentLibraryVmTemplates) &&
        Objects.equals(this.nvmfNamespaceSnapshots, tableReporterParamsFilter.nvmfNamespaceSnapshots) &&
        Objects.equals(this.contentLibraryImages, tableReporterParamsFilter.contentLibraryImages) &&
        Objects.equals(this.nvmfNamespaces, tableReporterParamsFilter.nvmfNamespaces) &&
        Objects.equals(this.namespaceGroups, tableReporterParamsFilter.namespaceGroups) &&
        Objects.equals(this.iscsiLuns, tableReporterParamsFilter.iscsiLuns) &&
        Objects.equals(this.tasks, tableReporterParamsFilter.tasks) &&
        Objects.equals(this.userAuditLogs, tableReporterParamsFilter.userAuditLogs) &&
        Objects.equals(this.systemAuditLogs, tableReporterParamsFilter.systemAuditLogs) &&
        Objects.equals(this.iscsiLunSnapshots, tableReporterParamsFilter.iscsiLunSnapshots) &&
        Objects.equals(this.iscsiConnections, tableReporterParamsFilter.iscsiConnections) &&
        Objects.equals(this.consistencyGroups, tableReporterParamsFilter.consistencyGroups) &&
        Objects.equals(this.users, tableReporterParamsFilter.users) &&
        Objects.equals(this.vmEntityFilters, tableReporterParamsFilter.vmEntityFilters) &&
        Objects.equals(this.snapshotPlans, tableReporterParamsFilter.snapshotPlans) &&
        Objects.equals(this.globalAlertRules, tableReporterParamsFilter.globalAlertRules) &&
        Objects.equals(this.alerts, tableReporterParamsFilter.alerts) &&
        Objects.equals(this.vmPlacementGroups, tableReporterParamsFilter.vmPlacementGroups) &&
        Objects.equals(this.vmTemplates, tableReporterParamsFilter.vmTemplates) &&
        Objects.equals(this.elfImages, tableReporterParamsFilter.elfImages) &&
        Objects.equals(this.vmVolumes, tableReporterParamsFilter.vmVolumes) &&
        Objects.equals(this.vlans, tableReporterParamsFilter.vlans) &&
        Objects.equals(this.disks, tableReporterParamsFilter.disks) &&
        Objects.equals(this.vdses, tableReporterParamsFilter.vdses) &&
        Objects.equals(this.elfDataStores, tableReporterParamsFilter.elfDataStores) &&
        Objects.equals(this.vms, tableReporterParamsFilter.vms) &&
        Objects.equals(this.nfsExports, tableReporterParamsFilter.nfsExports) &&
        Objects.equals(this.iscsiTargets, tableReporterParamsFilter.iscsiTargets) &&
        Objects.equals(this.usbDevices, tableReporterParamsFilter.usbDevices) &&
        Objects.equals(this.nics, tableReporterParamsFilter.nics) &&
        Objects.equals(this.clusters, tableReporterParamsFilter.clusters) &&
        Objects.equals(this.datacenters, tableReporterParamsFilter.datacenters) &&
        Objects.equals(this.hosts, tableReporterParamsFilter.hosts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nvmfSubsystems, contentLibraryVmTemplates, nvmfNamespaceSnapshots, contentLibraryImages, nvmfNamespaces, namespaceGroups, iscsiLuns, tasks, userAuditLogs, systemAuditLogs, iscsiLunSnapshots, iscsiConnections, consistencyGroups, users, vmEntityFilters, snapshotPlans, globalAlertRules, alerts, vmPlacementGroups, vmTemplates, elfImages, vmVolumes, vlans, disks, vdses, elfDataStores, vms, nfsExports, iscsiTargets, usbDevices, nics, clusters, datacenters, hosts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableReporterParamsFilter {\n");
    sb.append("    nvmfSubsystems: ").append(toIndentedString(nvmfSubsystems)).append("\n");
    sb.append("    contentLibraryVmTemplates: ").append(toIndentedString(contentLibraryVmTemplates)).append("\n");
    sb.append("    nvmfNamespaceSnapshots: ").append(toIndentedString(nvmfNamespaceSnapshots)).append("\n");
    sb.append("    contentLibraryImages: ").append(toIndentedString(contentLibraryImages)).append("\n");
    sb.append("    nvmfNamespaces: ").append(toIndentedString(nvmfNamespaces)).append("\n");
    sb.append("    namespaceGroups: ").append(toIndentedString(namespaceGroups)).append("\n");
    sb.append("    iscsiLuns: ").append(toIndentedString(iscsiLuns)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    userAuditLogs: ").append(toIndentedString(userAuditLogs)).append("\n");
    sb.append("    systemAuditLogs: ").append(toIndentedString(systemAuditLogs)).append("\n");
    sb.append("    iscsiLunSnapshots: ").append(toIndentedString(iscsiLunSnapshots)).append("\n");
    sb.append("    iscsiConnections: ").append(toIndentedString(iscsiConnections)).append("\n");
    sb.append("    consistencyGroups: ").append(toIndentedString(consistencyGroups)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    vmEntityFilters: ").append(toIndentedString(vmEntityFilters)).append("\n");
    sb.append("    snapshotPlans: ").append(toIndentedString(snapshotPlans)).append("\n");
    sb.append("    globalAlertRules: ").append(toIndentedString(globalAlertRules)).append("\n");
    sb.append("    alerts: ").append(toIndentedString(alerts)).append("\n");
    sb.append("    vmPlacementGroups: ").append(toIndentedString(vmPlacementGroups)).append("\n");
    sb.append("    vmTemplates: ").append(toIndentedString(vmTemplates)).append("\n");
    sb.append("    elfImages: ").append(toIndentedString(elfImages)).append("\n");
    sb.append("    vmVolumes: ").append(toIndentedString(vmVolumes)).append("\n");
    sb.append("    vlans: ").append(toIndentedString(vlans)).append("\n");
    sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
    sb.append("    vdses: ").append(toIndentedString(vdses)).append("\n");
    sb.append("    elfDataStores: ").append(toIndentedString(elfDataStores)).append("\n");
    sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
    sb.append("    nfsExports: ").append(toIndentedString(nfsExports)).append("\n");
    sb.append("    iscsiTargets: ").append(toIndentedString(iscsiTargets)).append("\n");
    sb.append("    usbDevices: ").append(toIndentedString(usbDevices)).append("\n");
    sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    datacenters: ").append(toIndentedString(datacenters)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
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

