package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.MaintenanceModeVmInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ExitMaintenanceModeResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class ExitMaintenanceModeResult {
  public static final String SERIALIZED_NAME_OFFLINE_MIGRATE_VMS = "offlineMigrateVms";
  @SerializedName(SERIALIZED_NAME_OFFLINE_MIGRATE_VMS)
  private List<MaintenanceModeVmInfo> offlineMigrateVms = new ArrayList<MaintenanceModeVmInfo>();

  public static final String SERIALIZED_NAME_LIVE_MIGRATE_VMS = "liveMigrateVms";
  @SerializedName(SERIALIZED_NAME_LIVE_MIGRATE_VMS)
  private List<MaintenanceModeVmInfo> liveMigrateVms = new ArrayList<MaintenanceModeVmInfo>();

  public static final String SERIALIZED_NAME_SHUT_DOWN_VMS = "shutDownVms";
  @SerializedName(SERIALIZED_NAME_SHUT_DOWN_VMS)
  private List<MaintenanceModeVmInfo> shutDownVms = new ArrayList<MaintenanceModeVmInfo>();

  public ExitMaintenanceModeResult() { 
  }

  public ExitMaintenanceModeResult offlineMigrateVms(List<MaintenanceModeVmInfo> offlineMigrateVms) {
    
    this.offlineMigrateVms = offlineMigrateVms;
    return this;
  }

  public ExitMaintenanceModeResult addOfflineMigrateVmsItem(MaintenanceModeVmInfo offlineMigrateVmsItem) {
    this.offlineMigrateVms.add(offlineMigrateVmsItem);
    return this;
  }

   /**
   * Get offlineMigrateVms
   * @return offlineMigrateVms
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<MaintenanceModeVmInfo> getOfflineMigrateVms() {
    return offlineMigrateVms;
  }


  public void setOfflineMigrateVms(List<MaintenanceModeVmInfo> offlineMigrateVms) {
    this.offlineMigrateVms = offlineMigrateVms;
  }


  public ExitMaintenanceModeResult liveMigrateVms(List<MaintenanceModeVmInfo> liveMigrateVms) {
    
    this.liveMigrateVms = liveMigrateVms;
    return this;
  }

  public ExitMaintenanceModeResult addLiveMigrateVmsItem(MaintenanceModeVmInfo liveMigrateVmsItem) {
    this.liveMigrateVms.add(liveMigrateVmsItem);
    return this;
  }

   /**
   * Get liveMigrateVms
   * @return liveMigrateVms
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<MaintenanceModeVmInfo> getLiveMigrateVms() {
    return liveMigrateVms;
  }


  public void setLiveMigrateVms(List<MaintenanceModeVmInfo> liveMigrateVms) {
    this.liveMigrateVms = liveMigrateVms;
  }


  public ExitMaintenanceModeResult shutDownVms(List<MaintenanceModeVmInfo> shutDownVms) {
    
    this.shutDownVms = shutDownVms;
    return this;
  }

  public ExitMaintenanceModeResult addShutDownVmsItem(MaintenanceModeVmInfo shutDownVmsItem) {
    this.shutDownVms.add(shutDownVmsItem);
    return this;
  }

   /**
   * Get shutDownVms
   * @return shutDownVms
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<MaintenanceModeVmInfo> getShutDownVms() {
    return shutDownVms;
  }


  public void setShutDownVms(List<MaintenanceModeVmInfo> shutDownVms) {
    this.shutDownVms = shutDownVms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExitMaintenanceModeResult exitMaintenanceModeResult = (ExitMaintenanceModeResult) o;
    return Objects.equals(this.offlineMigrateVms, exitMaintenanceModeResult.offlineMigrateVms) &&
        Objects.equals(this.liveMigrateVms, exitMaintenanceModeResult.liveMigrateVms) &&
        Objects.equals(this.shutDownVms, exitMaintenanceModeResult.shutDownVms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offlineMigrateVms, liveMigrateVms, shutDownVms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExitMaintenanceModeResult {\n");
    sb.append("    offlineMigrateVms: ").append(toIndentedString(offlineMigrateVms)).append("\n");
    sb.append("    liveMigrateVms: ").append(toIndentedString(liveMigrateVms)).append("\n");
    sb.append("    shutDownVms: ").append(toIndentedString(shutDownVms)).append("\n");
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

