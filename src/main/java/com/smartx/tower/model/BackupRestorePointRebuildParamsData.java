package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.BackupRestoreExecutionNetworkMapping;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BackupRestorePointRebuildParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class BackupRestorePointRebuildParamsData {
  public static final String SERIALIZED_NAME_REBUILD_NETWORK_MAPPING = "rebuild_network_mapping";
  @SerializedName(SERIALIZED_NAME_REBUILD_NETWORK_MAPPING)
  private List<BackupRestoreExecutionNetworkMapping> rebuildNetworkMapping = new ArrayList<BackupRestoreExecutionNetworkMapping>();

  public static final String SERIALIZED_NAME_REBUILD_TARGET_HOST_ID = "rebuild_target_host_id";
  @SerializedName(SERIALIZED_NAME_REBUILD_TARGET_HOST_ID)
  private String rebuildTargetHostId;

  public static final String SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_ID = "rebuild_target_cluster_id";
  @SerializedName(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_ID)
  private String rebuildTargetClusterId;

  public static final String SERIALIZED_NAME_REBUILD_NAME = "rebuild_name";
  @SerializedName(SERIALIZED_NAME_REBUILD_NAME)
  private String rebuildName;

  public static final String SERIALIZED_NAME_STARTUP_AFTER_RESTORE = "startup_after_restore";
  @SerializedName(SERIALIZED_NAME_STARTUP_AFTER_RESTORE)
  private Boolean startupAfterRestore;

  public BackupRestorePointRebuildParamsData() { 
  }

  public BackupRestorePointRebuildParamsData rebuildNetworkMapping(List<BackupRestoreExecutionNetworkMapping> rebuildNetworkMapping) {
    
    this.rebuildNetworkMapping = rebuildNetworkMapping;
    return this;
  }

  public BackupRestorePointRebuildParamsData addRebuildNetworkMappingItem(BackupRestoreExecutionNetworkMapping rebuildNetworkMappingItem) {
    this.rebuildNetworkMapping.add(rebuildNetworkMappingItem);
    return this;
  }

   /**
   * Get rebuildNetworkMapping
   * @return rebuildNetworkMapping
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<BackupRestoreExecutionNetworkMapping> getRebuildNetworkMapping() {
    return rebuildNetworkMapping;
  }


  public void setRebuildNetworkMapping(List<BackupRestoreExecutionNetworkMapping> rebuildNetworkMapping) {
    this.rebuildNetworkMapping = rebuildNetworkMapping;
  }


  public BackupRestorePointRebuildParamsData rebuildTargetHostId(String rebuildTargetHostId) {
    
    this.rebuildTargetHostId = rebuildTargetHostId;
    return this;
  }

   /**
   * Get rebuildTargetHostId
   * @return rebuildTargetHostId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getRebuildTargetHostId() {
    return rebuildTargetHostId;
  }


  public void setRebuildTargetHostId(String rebuildTargetHostId) {
    this.rebuildTargetHostId = rebuildTargetHostId;
  }


  public BackupRestorePointRebuildParamsData rebuildTargetClusterId(String rebuildTargetClusterId) {
    
    this.rebuildTargetClusterId = rebuildTargetClusterId;
    return this;
  }

   /**
   * Get rebuildTargetClusterId
   * @return rebuildTargetClusterId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getRebuildTargetClusterId() {
    return rebuildTargetClusterId;
  }


  public void setRebuildTargetClusterId(String rebuildTargetClusterId) {
    this.rebuildTargetClusterId = rebuildTargetClusterId;
  }


  public BackupRestorePointRebuildParamsData rebuildName(String rebuildName) {
    
    this.rebuildName = rebuildName;
    return this;
  }

   /**
   * Get rebuildName
   * @return rebuildName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getRebuildName() {
    return rebuildName;
  }


  public void setRebuildName(String rebuildName) {
    this.rebuildName = rebuildName;
  }


  public BackupRestorePointRebuildParamsData startupAfterRestore(Boolean startupAfterRestore) {
    
    this.startupAfterRestore = startupAfterRestore;
    return this;
  }

   /**
   * Get startupAfterRestore
   * @return startupAfterRestore
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getStartupAfterRestore() {
    return startupAfterRestore;
  }


  public void setStartupAfterRestore(Boolean startupAfterRestore) {
    this.startupAfterRestore = startupAfterRestore;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupRestorePointRebuildParamsData backupRestorePointRebuildParamsData = (BackupRestorePointRebuildParamsData) o;
    return Objects.equals(this.rebuildNetworkMapping, backupRestorePointRebuildParamsData.rebuildNetworkMapping) &&
        Objects.equals(this.rebuildTargetHostId, backupRestorePointRebuildParamsData.rebuildTargetHostId) &&
        Objects.equals(this.rebuildTargetClusterId, backupRestorePointRebuildParamsData.rebuildTargetClusterId) &&
        Objects.equals(this.rebuildName, backupRestorePointRebuildParamsData.rebuildName) &&
        Objects.equals(this.startupAfterRestore, backupRestorePointRebuildParamsData.startupAfterRestore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rebuildNetworkMapping, rebuildTargetHostId, rebuildTargetClusterId, rebuildName, startupAfterRestore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupRestorePointRebuildParamsData {\n");
    sb.append("    rebuildNetworkMapping: ").append(toIndentedString(rebuildNetworkMapping)).append("\n");
    sb.append("    rebuildTargetHostId: ").append(toIndentedString(rebuildTargetHostId)).append("\n");
    sb.append("    rebuildTargetClusterId: ").append(toIndentedString(rebuildTargetClusterId)).append("\n");
    sb.append("    rebuildName: ").append(toIndentedString(rebuildName)).append("\n");
    sb.append("    startupAfterRestore: ").append(toIndentedString(startupAfterRestore)).append("\n");
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

