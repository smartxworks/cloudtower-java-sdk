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
 * NestedBackupRestoreExecutionNetworkMapping
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NestedBackupRestoreExecutionNetworkMapping {
  public static final String SERIALIZED_NAME_DST_VLAN_ID = "dst_vlan_id";
  @SerializedName(SERIALIZED_NAME_DST_VLAN_ID)
  private String dstVlanId;

  public static final String SERIALIZED_NAME_SRC_VLAN_ID = "src_vlan_id";
  @SerializedName(SERIALIZED_NAME_SRC_VLAN_ID)
  private String srcVlanId;

  public NestedBackupRestoreExecutionNetworkMapping() { 
  }

  public NestedBackupRestoreExecutionNetworkMapping dstVlanId(String dstVlanId) {
    
    this.dstVlanId = dstVlanId;
    return this;
  }

   /**
   * Get dstVlanId
   * @return dstVlanId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDstVlanId() {
    return dstVlanId;
  }


  public void setDstVlanId(String dstVlanId) {
    this.dstVlanId = dstVlanId;
  }


  public NestedBackupRestoreExecutionNetworkMapping srcVlanId(String srcVlanId) {
    
    this.srcVlanId = srcVlanId;
    return this;
  }

   /**
   * Get srcVlanId
   * @return srcVlanId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSrcVlanId() {
    return srcVlanId;
  }


  public void setSrcVlanId(String srcVlanId) {
    this.srcVlanId = srcVlanId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedBackupRestoreExecutionNetworkMapping nestedBackupRestoreExecutionNetworkMapping = (NestedBackupRestoreExecutionNetworkMapping) o;
    return Objects.equals(this.dstVlanId, nestedBackupRestoreExecutionNetworkMapping.dstVlanId) &&
        Objects.equals(this.srcVlanId, nestedBackupRestoreExecutionNetworkMapping.srcVlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dstVlanId, srcVlanId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedBackupRestoreExecutionNetworkMapping {\n");
    sb.append("    dstVlanId: ").append(toIndentedString(dstVlanId)).append("\n");
    sb.append("    srcVlanId: ").append(toIndentedString(srcVlanId)).append("\n");
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

