package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.MaintenanceModeVerify;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * MaintenanceModeVmInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class MaintenanceModeVmInfo {
  public static final String SERIALIZED_NAME_VM_UUID = "vm_uuid";
  @SerializedName(SERIALIZED_NAME_VM_UUID)
  private String vmUuid;

  public static final String SERIALIZED_NAME_VM_STATE = "vm_state";
  @SerializedName(SERIALIZED_NAME_VM_STATE)
  private String vmState;

  public static final String SERIALIZED_NAME_VM_NAME = "vm_name";
  @SerializedName(SERIALIZED_NAME_VM_NAME)
  private String vmName;

  public static final String SERIALIZED_NAME_VM_HA = "vm_ha";
  @SerializedName(SERIALIZED_NAME_VM_HA)
  private Boolean vmHa;

  public static final String SERIALIZED_NAME_VERIFY = "verify";
  @SerializedName(SERIALIZED_NAME_VERIFY)
  private MaintenanceModeVerify verify;

  public static final String SERIALIZED_NAME_TARGET_HOST_NAME = "target_host_name";
  @SerializedName(SERIALIZED_NAME_TARGET_HOST_NAME)
  private String targetHostName;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public MaintenanceModeVmInfo() { 
  }

  public MaintenanceModeVmInfo vmUuid(String vmUuid) {
    
    this.vmUuid = vmUuid;
    return this;
  }

   /**
   * Get vmUuid
   * @return vmUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmUuid() {
    return vmUuid;
  }


  public void setVmUuid(String vmUuid) {
    this.vmUuid = vmUuid;
  }


  public MaintenanceModeVmInfo vmState(String vmState) {
    
    this.vmState = vmState;
    return this;
  }

   /**
   * Get vmState
   * @return vmState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmState() {
    return vmState;
  }


  public void setVmState(String vmState) {
    this.vmState = vmState;
  }


  public MaintenanceModeVmInfo vmName(String vmName) {
    
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


  public MaintenanceModeVmInfo vmHa(Boolean vmHa) {
    
    this.vmHa = vmHa;
    return this;
  }

   /**
   * Get vmHa
   * @return vmHa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVmHa() {
    return vmHa;
  }


  public void setVmHa(Boolean vmHa) {
    this.vmHa = vmHa;
  }


  public MaintenanceModeVmInfo verify(MaintenanceModeVerify verify) {
    
    this.verify = verify;
    return this;
  }

   /**
   * Get verify
   * @return verify
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MaintenanceModeVerify getVerify() {
    return verify;
  }


  public void setVerify(MaintenanceModeVerify verify) {
    this.verify = verify;
  }


  public MaintenanceModeVmInfo targetHostName(String targetHostName) {
    
    this.targetHostName = targetHostName;
    return this;
  }

   /**
   * Get targetHostName
   * @return targetHostName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTargetHostName() {
    return targetHostName;
  }


  public void setTargetHostName(String targetHostName) {
    this.targetHostName = targetHostName;
  }


  public MaintenanceModeVmInfo state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenanceModeVmInfo maintenanceModeVmInfo = (MaintenanceModeVmInfo) o;
    return Objects.equals(this.vmUuid, maintenanceModeVmInfo.vmUuid) &&
        Objects.equals(this.vmState, maintenanceModeVmInfo.vmState) &&
        Objects.equals(this.vmName, maintenanceModeVmInfo.vmName) &&
        Objects.equals(this.vmHa, maintenanceModeVmInfo.vmHa) &&
        Objects.equals(this.verify, maintenanceModeVmInfo.verify) &&
        Objects.equals(this.targetHostName, maintenanceModeVmInfo.targetHostName) &&
        Objects.equals(this.state, maintenanceModeVmInfo.state);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmUuid, vmState, vmName, vmHa, verify, targetHostName, state);
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
    sb.append("class MaintenanceModeVmInfo {\n");
    sb.append("    vmUuid: ").append(toIndentedString(vmUuid)).append("\n");
    sb.append("    vmState: ").append(toIndentedString(vmState)).append("\n");
    sb.append("    vmName: ").append(toIndentedString(vmName)).append("\n");
    sb.append("    vmHa: ").append(toIndentedString(vmHa)).append("\n");
    sb.append("    verify: ").append(toIndentedString(verify)).append("\n");
    sb.append("    targetHostName: ").append(toIndentedString(targetHostName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

