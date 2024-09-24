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

/**
 * ShutdownVmID
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class ShutdownVmID {
  public static final String SERIALIZED_NAME_VM_UUID = "vm_uuid";
  @SerializedName(SERIALIZED_NAME_VM_UUID)
  private String vmUuid;

  public ShutdownVmID() { 
  }

  public ShutdownVmID vmUuid(String vmUuid) {
    
    this.vmUuid = vmUuid;
    return this;
  }

   /**
   * Get vmUuid
   * @return vmUuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVmUuid() {
    return vmUuid;
  }


  public void setVmUuid(String vmUuid) {
    this.vmUuid = vmUuid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShutdownVmID shutdownVmID = (ShutdownVmID) o;
    return Objects.equals(this.vmUuid, shutdownVmID.vmUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShutdownVmID {\n");
    sb.append("    vmUuid: ").append(toIndentedString(vmUuid)).append("\n");
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

