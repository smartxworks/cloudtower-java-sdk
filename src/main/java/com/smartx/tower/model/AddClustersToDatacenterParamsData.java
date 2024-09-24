package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.ClusterWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AddClustersToDatacenterParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class AddClustersToDatacenterParamsData {
  public static final String SERIALIZED_NAME_CLUSTERS = "clusters";
  @SerializedName(SERIALIZED_NAME_CLUSTERS)
  private ClusterWhereInput clusters;

  public AddClustersToDatacenterParamsData() { 
  }

  public AddClustersToDatacenterParamsData clusters(ClusterWhereInput clusters) {
    
    this.clusters = clusters;
    return this;
  }

   /**
   * Get clusters
   * @return clusters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterWhereInput getClusters() {
    return clusters;
  }


  public void setClusters(ClusterWhereInput clusters) {
    this.clusters = clusters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddClustersToDatacenterParamsData addClustersToDatacenterParamsData = (AddClustersToDatacenterParamsData) o;
    return Objects.equals(this.clusters, addClustersToDatacenterParamsData.clusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddClustersToDatacenterParamsData {\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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

