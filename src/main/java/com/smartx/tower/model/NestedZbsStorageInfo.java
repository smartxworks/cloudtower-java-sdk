package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NestedSnapshotInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NestedZbsStorageInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NestedZbsStorageInfo {
  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;

  public static final String SERIALIZED_NAME_SNAPSHOT_INFO = "snapshot_info";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_INFO)
  private List<NestedSnapshotInfo> snapshotInfo = null;

  public NestedZbsStorageInfo() { 
  }

  public NestedZbsStorageInfo clusterId(String clusterId) {
    
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getClusterId() {
    return clusterId;
  }


  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }


  public NestedZbsStorageInfo snapshotInfo(List<NestedSnapshotInfo> snapshotInfo) {
    
    this.snapshotInfo = snapshotInfo;
    return this;
  }

  public NestedZbsStorageInfo addSnapshotInfoItem(NestedSnapshotInfo snapshotInfoItem) {
    if (this.snapshotInfo == null) {
      this.snapshotInfo = new ArrayList<NestedSnapshotInfo>();
    }
    this.snapshotInfo.add(snapshotInfoItem);
    return this;
  }

   /**
   * Get snapshotInfo
   * @return snapshotInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedSnapshotInfo> getSnapshotInfo() {
    return snapshotInfo;
  }


  public void setSnapshotInfo(List<NestedSnapshotInfo> snapshotInfo) {
    this.snapshotInfo = snapshotInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedZbsStorageInfo nestedZbsStorageInfo = (NestedZbsStorageInfo) o;
    return Objects.equals(this.clusterId, nestedZbsStorageInfo.clusterId) &&
        Objects.equals(this.snapshotInfo, nestedZbsStorageInfo.snapshotInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, snapshotInfo);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedZbsStorageInfo {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    snapshotInfo: ").append(toIndentedString(snapshotInfo)).append("\n");
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

