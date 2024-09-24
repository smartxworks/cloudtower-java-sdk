package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.ClusterWhereUniqueInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LogServiceConfigsInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class LogServiceConfigsInput {
  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private ClusterWhereUniqueInput cluster;

  public LogServiceConfigsInput() { 
  }

  public LogServiceConfigsInput cluster(ClusterWhereUniqueInput cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ClusterWhereUniqueInput getCluster() {
    return cluster;
  }


  public void setCluster(ClusterWhereUniqueInput cluster) {
    this.cluster = cluster;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogServiceConfigsInput logServiceConfigsInput = (LogServiceConfigsInput) o;
    return Objects.equals(this.cluster, logServiceConfigsInput.cluster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogServiceConfigsInput {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
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

