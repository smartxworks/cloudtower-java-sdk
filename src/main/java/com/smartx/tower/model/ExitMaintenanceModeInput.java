package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ExitMaintenanceModeInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class ExitMaintenanceModeInput {
  public static final String SERIALIZED_NAME_POWERON_VMS = "poweron_vms";
  @SerializedName(SERIALIZED_NAME_POWERON_VMS)
  private List<String> poweronVms = null;

  public static final String SERIALIZED_NAME_OFFLINE_MIGRATE_BACK_VMS = "offline_migrate_back_vms";
  @SerializedName(SERIALIZED_NAME_OFFLINE_MIGRATE_BACK_VMS)
  private List<String> offlineMigrateBackVms = null;

  public static final String SERIALIZED_NAME_LIVE_MIGRATE_BACK_VMS = "live_migrate_back_vms";
  @SerializedName(SERIALIZED_NAME_LIVE_MIGRATE_BACK_VMS)
  private List<String> liveMigrateBackVms = null;

  public ExitMaintenanceModeInput() { 
  }

  public ExitMaintenanceModeInput poweronVms(List<String> poweronVms) {
    
    this.poweronVms = poweronVms;
    return this;
  }

  public ExitMaintenanceModeInput addPoweronVmsItem(String poweronVmsItem) {
    if (this.poweronVms == null) {
      this.poweronVms = new ArrayList<String>();
    }
    this.poweronVms.add(poweronVmsItem);
    return this;
  }

   /**
   * Get poweronVms
   * @return poweronVms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPoweronVms() {
    return poweronVms;
  }


  public void setPoweronVms(List<String> poweronVms) {
    this.poweronVms = poweronVms;
  }


  public ExitMaintenanceModeInput offlineMigrateBackVms(List<String> offlineMigrateBackVms) {
    
    this.offlineMigrateBackVms = offlineMigrateBackVms;
    return this;
  }

  public ExitMaintenanceModeInput addOfflineMigrateBackVmsItem(String offlineMigrateBackVmsItem) {
    if (this.offlineMigrateBackVms == null) {
      this.offlineMigrateBackVms = new ArrayList<String>();
    }
    this.offlineMigrateBackVms.add(offlineMigrateBackVmsItem);
    return this;
  }

   /**
   * Get offlineMigrateBackVms
   * @return offlineMigrateBackVms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getOfflineMigrateBackVms() {
    return offlineMigrateBackVms;
  }


  public void setOfflineMigrateBackVms(List<String> offlineMigrateBackVms) {
    this.offlineMigrateBackVms = offlineMigrateBackVms;
  }


  public ExitMaintenanceModeInput liveMigrateBackVms(List<String> liveMigrateBackVms) {
    
    this.liveMigrateBackVms = liveMigrateBackVms;
    return this;
  }

  public ExitMaintenanceModeInput addLiveMigrateBackVmsItem(String liveMigrateBackVmsItem) {
    if (this.liveMigrateBackVms == null) {
      this.liveMigrateBackVms = new ArrayList<String>();
    }
    this.liveMigrateBackVms.add(liveMigrateBackVmsItem);
    return this;
  }

   /**
   * Get liveMigrateBackVms
   * @return liveMigrateBackVms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLiveMigrateBackVms() {
    return liveMigrateBackVms;
  }


  public void setLiveMigrateBackVms(List<String> liveMigrateBackVms) {
    this.liveMigrateBackVms = liveMigrateBackVms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExitMaintenanceModeInput exitMaintenanceModeInput = (ExitMaintenanceModeInput) o;
    return Objects.equals(this.poweronVms, exitMaintenanceModeInput.poweronVms) &&
        Objects.equals(this.offlineMigrateBackVms, exitMaintenanceModeInput.offlineMigrateBackVms) &&
        Objects.equals(this.liveMigrateBackVms, exitMaintenanceModeInput.liveMigrateBackVms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poweronVms, offlineMigrateBackVms, liveMigrateBackVms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExitMaintenanceModeInput {\n");
    sb.append("    poweronVms: ").append(toIndentedString(poweronVms)).append("\n");
    sb.append("    offlineMigrateBackVms: ").append(toIndentedString(offlineMigrateBackVms)).append("\n");
    sb.append("    liveMigrateBackVms: ").append(toIndentedString(liveMigrateBackVms)).append("\n");
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

