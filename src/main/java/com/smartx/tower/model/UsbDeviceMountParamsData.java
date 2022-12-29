package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.VmWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UsbDeviceMountParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class UsbDeviceMountParamsData {
  public static final String SERIALIZED_NAME_VMS = "vms";
  @SerializedName(SERIALIZED_NAME_VMS)
  private VmWhereInput vms;

  public static final String SERIALIZED_NAME_VM_ID = "vm_id";
  @SerializedName(SERIALIZED_NAME_VM_ID)
  private String vmId;

  public UsbDeviceMountParamsData() { 
  }

  public UsbDeviceMountParamsData vms(VmWhereInput vms) {
    
    this.vms = vms;
    return this;
  }

   /**
   * Get vms
   * @return vms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVms() {
    return vms;
  }


  public void setVms(VmWhereInput vms) {
    this.vms = vms;
  }


  public UsbDeviceMountParamsData vmId(String vmId) {
    
    this.vmId = vmId;
    return this;
  }

   /**
   * Get vmId
   * @return vmId
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmId() {
    return vmId;
  }


  public void setVmId(String vmId) {
    this.vmId = vmId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsbDeviceMountParamsData usbDeviceMountParamsData = (UsbDeviceMountParamsData) o;
    return Objects.equals(this.vms, usbDeviceMountParamsData.vms) &&
        Objects.equals(this.vmId, usbDeviceMountParamsData.vmId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vms, vmId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsbDeviceMountParamsData {\n");
    sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
    sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
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

