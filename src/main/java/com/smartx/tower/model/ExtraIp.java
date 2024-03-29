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
 * ExtraIp
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ExtraIp {
  public static final String SERIALIZED_NAME_MANAGEMENT_IP = "management_ip";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP)
  private String managementIp;

  public static final String SERIALIZED_NAME_HOST_ID = "host_id";
  @SerializedName(SERIALIZED_NAME_HOST_ID)
  private String hostId;

  public ExtraIp() { 
  }

  public ExtraIp managementIp(String managementIp) {
    
    this.managementIp = managementIp;
    return this;
  }

   /**
   * Get managementIp
   * @return managementIp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getManagementIp() {
    return managementIp;
  }


  public void setManagementIp(String managementIp) {
    this.managementIp = managementIp;
  }


  public ExtraIp hostId(String hostId) {
    
    this.hostId = hostId;
    return this;
  }

   /**
   * Get hostId
   * @return hostId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getHostId() {
    return hostId;
  }


  public void setHostId(String hostId) {
    this.hostId = hostId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtraIp extraIp = (ExtraIp) o;
    return Objects.equals(this.managementIp, extraIp.managementIp) &&
        Objects.equals(this.hostId, extraIp.hostId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementIp, hostId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraIp {\n");
    sb.append("    managementIp: ").append(toIndentedString(managementIp)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
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

