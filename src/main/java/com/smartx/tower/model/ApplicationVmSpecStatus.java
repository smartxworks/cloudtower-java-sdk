package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.VmStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApplicationVmSpecStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ApplicationVmSpecStatus {
  public static final String SERIALIZED_NAME_VM_IPS = "vmIps";
  @SerializedName(SERIALIZED_NAME_VM_IPS)
  private List<String> vmIps = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private VmStatus message;

  public ApplicationVmSpecStatus() { 
  }

  public ApplicationVmSpecStatus vmIps(List<String> vmIps) {
    
    this.vmIps = vmIps;
    return this;
  }

  public ApplicationVmSpecStatus addVmIpsItem(String vmIpsItem) {
    if (this.vmIps == null) {
      this.vmIps = new ArrayList<String>();
    }
    this.vmIps.add(vmIpsItem);
    return this;
  }

   /**
   * Get vmIps
   * @return vmIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getVmIps() {
    return vmIps;
  }


  public void setVmIps(List<String> vmIps) {
    this.vmIps = vmIps;
  }


  public ApplicationVmSpecStatus message(VmStatus message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmStatus getMessage() {
    return message;
  }


  public void setMessage(VmStatus message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationVmSpecStatus applicationVmSpecStatus = (ApplicationVmSpecStatus) o;
    return Objects.equals(this.vmIps, applicationVmSpecStatus.vmIps) &&
        Objects.equals(this.message, applicationVmSpecStatus.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmIps, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationVmSpecStatus {\n");
    sb.append("    vmIps: ").append(toIndentedString(vmIps)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

