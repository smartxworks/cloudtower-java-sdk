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
 * ConsistencyGroupDeletionParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ConsistencyGroupDeletionParamsData {
  public static final String SERIALIZED_NAME_REMAIN_VOLUME_SNAPSHOT = "remain_volume_snapshot";
  @SerializedName(SERIALIZED_NAME_REMAIN_VOLUME_SNAPSHOT)
  private Boolean remainVolumeSnapshot;

  public ConsistencyGroupDeletionParamsData() { 
  }

  public ConsistencyGroupDeletionParamsData remainVolumeSnapshot(Boolean remainVolumeSnapshot) {
    
    this.remainVolumeSnapshot = remainVolumeSnapshot;
    return this;
  }

   /**
   * Get remainVolumeSnapshot
   * @return remainVolumeSnapshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRemainVolumeSnapshot() {
    return remainVolumeSnapshot;
  }


  public void setRemainVolumeSnapshot(Boolean remainVolumeSnapshot) {
    this.remainVolumeSnapshot = remainVolumeSnapshot;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsistencyGroupDeletionParamsData consistencyGroupDeletionParamsData = (ConsistencyGroupDeletionParamsData) o;
    return Objects.equals(this.remainVolumeSnapshot, consistencyGroupDeletionParamsData.remainVolumeSnapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remainVolumeSnapshot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsistencyGroupDeletionParamsData {\n");
    sb.append("    remainVolumeSnapshot: ").append(toIndentedString(remainVolumeSnapshot)).append("\n");
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

