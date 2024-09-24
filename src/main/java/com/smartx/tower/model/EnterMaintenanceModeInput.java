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
 * EnterMaintenanceModeInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class EnterMaintenanceModeInput {
  public static final String SERIALIZED_NAME_SHUTDOWN_VMS = "shutdown_vms";
  @SerializedName(SERIALIZED_NAME_SHUTDOWN_VMS)
  private List<String> shutdownVms = null;

  public EnterMaintenanceModeInput() { 
  }

  public EnterMaintenanceModeInput shutdownVms(List<String> shutdownVms) {
    
    this.shutdownVms = shutdownVms;
    return this;
  }

  public EnterMaintenanceModeInput addShutdownVmsItem(String shutdownVmsItem) {
    if (this.shutdownVms == null) {
      this.shutdownVms = new ArrayList<String>();
    }
    this.shutdownVms.add(shutdownVmsItem);
    return this;
  }

   /**
   * Get shutdownVms
   * @return shutdownVms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getShutdownVms() {
    return shutdownVms;
  }


  public void setShutdownVms(List<String> shutdownVms) {
    this.shutdownVms = shutdownVms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterMaintenanceModeInput enterMaintenanceModeInput = (EnterMaintenanceModeInput) o;
    return Objects.equals(this.shutdownVms, enterMaintenanceModeInput.shutdownVms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shutdownVms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterMaintenanceModeInput {\n");
    sb.append("    shutdownVms: ").append(toIndentedString(shutdownVms)).append("\n");
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

