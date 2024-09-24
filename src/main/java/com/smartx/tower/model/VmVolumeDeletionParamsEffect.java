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
 * VmVolumeDeletionParamsEffect
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class VmVolumeDeletionParamsEffect {
  public static final String SERIALIZED_NAME_INCLUDE_SNAPSHOTS = "include_snapshots";
  @SerializedName(SERIALIZED_NAME_INCLUDE_SNAPSHOTS)
  private Boolean includeSnapshots;

  public VmVolumeDeletionParamsEffect() { 
  }

  public VmVolumeDeletionParamsEffect includeSnapshots(Boolean includeSnapshots) {
    
    this.includeSnapshots = includeSnapshots;
    return this;
  }

   /**
   * Get includeSnapshots
   * @return includeSnapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludeSnapshots() {
    return includeSnapshots;
  }


  public void setIncludeSnapshots(Boolean includeSnapshots) {
    this.includeSnapshots = includeSnapshots;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmVolumeDeletionParamsEffect vmVolumeDeletionParamsEffect = (VmVolumeDeletionParamsEffect) o;
    return Objects.equals(this.includeSnapshots, vmVolumeDeletionParamsEffect.includeSnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeSnapshots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmVolumeDeletionParamsEffect {\n");
    sb.append("    includeSnapshots: ").append(toIndentedString(includeSnapshots)).append("\n");
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

