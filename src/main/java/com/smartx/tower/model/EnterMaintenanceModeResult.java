package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.ShutdownVmID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EnterMaintenanceModeResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class EnterMaintenanceModeResult {
  public static final String SERIALIZED_NAME_SHUTDOWN_VMS = "shutdownVms";
  @SerializedName(SERIALIZED_NAME_SHUTDOWN_VMS)
  private List<ShutdownVmID> shutdownVms = new ArrayList<ShutdownVmID>();

  public static final String SERIALIZED_NAME_DONE = "done";
  @SerializedName(SERIALIZED_NAME_DONE)
  private Boolean done;

  public EnterMaintenanceModeResult() { 
  }

  public EnterMaintenanceModeResult shutdownVms(List<ShutdownVmID> shutdownVms) {
    
    this.shutdownVms = shutdownVms;
    return this;
  }

  public EnterMaintenanceModeResult addShutdownVmsItem(ShutdownVmID shutdownVmsItem) {
    this.shutdownVms.add(shutdownVmsItem);
    return this;
  }

   /**
   * Get shutdownVms
   * @return shutdownVms
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ShutdownVmID> getShutdownVms() {
    return shutdownVms;
  }


  public void setShutdownVms(List<ShutdownVmID> shutdownVms) {
    this.shutdownVms = shutdownVms;
  }


  public EnterMaintenanceModeResult done(Boolean done) {
    
    this.done = done;
    return this;
  }

   /**
   * Get done
   * @return done
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getDone() {
    return done;
  }


  public void setDone(Boolean done) {
    this.done = done;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterMaintenanceModeResult enterMaintenanceModeResult = (EnterMaintenanceModeResult) o;
    return Objects.equals(this.shutdownVms, enterMaintenanceModeResult.shutdownVms) &&
        Objects.equals(this.done, enterMaintenanceModeResult.done);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shutdownVms, done);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterMaintenanceModeResult {\n");
    sb.append("    shutdownVms: ").append(toIndentedString(shutdownVms)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
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

