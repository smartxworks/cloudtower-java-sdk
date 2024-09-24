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
 * SnapshotGroupCloneParam
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class SnapshotGroupCloneParam {
  public static final String SERIALIZED_NAME_FROM_SOURCE_VM_ID = "from_source_vm_id";
  @SerializedName(SERIALIZED_NAME_FROM_SOURCE_VM_ID)
  private String fromSourceVmId;

  public static final String SERIALIZED_NAME_TO_CLONED_VM_NAME = "to_cloned_vm_name";
  @SerializedName(SERIALIZED_NAME_TO_CLONED_VM_NAME)
  private String toClonedVmName;

  public SnapshotGroupCloneParam() { 
  }

  public SnapshotGroupCloneParam fromSourceVmId(String fromSourceVmId) {
    
    this.fromSourceVmId = fromSourceVmId;
    return this;
  }

   /**
   * Get fromSourceVmId
   * @return fromSourceVmId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFromSourceVmId() {
    return fromSourceVmId;
  }


  public void setFromSourceVmId(String fromSourceVmId) {
    this.fromSourceVmId = fromSourceVmId;
  }


  public SnapshotGroupCloneParam toClonedVmName(String toClonedVmName) {
    
    this.toClonedVmName = toClonedVmName;
    return this;
  }

   /**
   * Get toClonedVmName
   * @return toClonedVmName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getToClonedVmName() {
    return toClonedVmName;
  }


  public void setToClonedVmName(String toClonedVmName) {
    this.toClonedVmName = toClonedVmName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotGroupCloneParam snapshotGroupCloneParam = (SnapshotGroupCloneParam) o;
    return Objects.equals(this.fromSourceVmId, snapshotGroupCloneParam.fromSourceVmId) &&
        Objects.equals(this.toClonedVmName, snapshotGroupCloneParam.toClonedVmName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromSourceVmId, toClonedVmName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotGroupCloneParam {\n");
    sb.append("    fromSourceVmId: ").append(toIndentedString(fromSourceVmId)).append("\n");
    sb.append("    toClonedVmName: ").append(toIndentedString(toClonedVmName)).append("\n");
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

