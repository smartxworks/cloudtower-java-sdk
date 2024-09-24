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
 * VmVolumeSnapshotCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class VmVolumeSnapshotCreationParams {
  public static final String SERIALIZED_NAME_VOLUME_ID = "volume_id";
  @SerializedName(SERIALIZED_NAME_VOLUME_ID)
  private String volumeId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public VmVolumeSnapshotCreationParams() { 
  }

  public VmVolumeSnapshotCreationParams volumeId(String volumeId) {
    
    this.volumeId = volumeId;
    return this;
  }

   /**
   * Get volumeId
   * @return volumeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVolumeId() {
    return volumeId;
  }


  public void setVolumeId(String volumeId) {
    this.volumeId = volumeId;
  }


  public VmVolumeSnapshotCreationParams description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public VmVolumeSnapshotCreationParams name(String name) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmVolumeSnapshotCreationParams vmVolumeSnapshotCreationParams = (VmVolumeSnapshotCreationParams) o;
    return Objects.equals(this.volumeId, vmVolumeSnapshotCreationParams.volumeId) &&
        Objects.equals(this.description, vmVolumeSnapshotCreationParams.description) &&
        Objects.equals(this.name, vmVolumeSnapshotCreationParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeId, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmVolumeSnapshotCreationParams {\n");
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

