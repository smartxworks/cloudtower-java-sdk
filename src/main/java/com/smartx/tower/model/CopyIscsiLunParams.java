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
 * CopyIscsiLunParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class CopyIscsiLunParams {
  public static final String SERIALIZED_NAME_DEST_ISCSI_TARGET_ID = "dest_iscsi_target_id";
  @SerializedName(SERIALIZED_NAME_DEST_ISCSI_TARGET_ID)
  private String destIscsiTargetId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SRC_LUN_ID = "src_lun_id";
  @SerializedName(SERIALIZED_NAME_SRC_LUN_ID)
  private String srcLunId;

  public CopyIscsiLunParams() { 
  }

  public CopyIscsiLunParams destIscsiTargetId(String destIscsiTargetId) {
    
    this.destIscsiTargetId = destIscsiTargetId;
    return this;
  }

   /**
   * Get destIscsiTargetId
   * @return destIscsiTargetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDestIscsiTargetId() {
    return destIscsiTargetId;
  }


  public void setDestIscsiTargetId(String destIscsiTargetId) {
    this.destIscsiTargetId = destIscsiTargetId;
  }


  public CopyIscsiLunParams name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CopyIscsiLunParams srcLunId(String srcLunId) {
    
    this.srcLunId = srcLunId;
    return this;
  }

   /**
   * Get srcLunId
   * @return srcLunId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSrcLunId() {
    return srcLunId;
  }


  public void setSrcLunId(String srcLunId) {
    this.srcLunId = srcLunId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopyIscsiLunParams copyIscsiLunParams = (CopyIscsiLunParams) o;
    return Objects.equals(this.destIscsiTargetId, copyIscsiLunParams.destIscsiTargetId) &&
        Objects.equals(this.name, copyIscsiLunParams.name) &&
        Objects.equals(this.srcLunId, copyIscsiLunParams.srcLunId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destIscsiTargetId, name, srcLunId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopyIscsiLunParams {\n");
    sb.append("    destIscsiTargetId: ").append(toIndentedString(destIscsiTargetId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    srcLunId: ").append(toIndentedString(srcLunId)).append("\n");
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

