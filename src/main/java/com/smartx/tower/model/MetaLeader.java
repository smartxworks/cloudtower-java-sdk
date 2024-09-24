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
 * MetaLeader
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class MetaLeader {
  public static final String SERIALIZED_NAME_META_LEADER = "meta_leader";
  @SerializedName(SERIALIZED_NAME_META_LEADER)
  private String metaLeader;

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;

  public MetaLeader() { 
  }

  public MetaLeader metaLeader(String metaLeader) {
    
    this.metaLeader = metaLeader;
    return this;
  }

   /**
   * Get metaLeader
   * @return metaLeader
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMetaLeader() {
    return metaLeader;
  }


  public void setMetaLeader(String metaLeader) {
    this.metaLeader = metaLeader;
  }


  public MetaLeader clusterId(String clusterId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaLeader metaLeader = (MetaLeader) o;
    return Objects.equals(this.metaLeader, metaLeader.metaLeader) &&
        Objects.equals(this.clusterId, metaLeader.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaLeader, clusterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaLeader {\n");
    sb.append("    metaLeader: ").append(toIndentedString(metaLeader)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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

