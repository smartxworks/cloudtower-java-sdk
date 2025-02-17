package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.ClusterStorageInfoEcConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetClusterStorageInfoEffect
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class GetClusterStorageInfoEffect {
  public static final String SERIALIZED_NAME_EC = "ec";
  @SerializedName(SERIALIZED_NAME_EC)
  private List<ClusterStorageInfoEcConfig> ec = null;

  public static final String SERIALIZED_NAME_REPLICA = "replica";
  @SerializedName(SERIALIZED_NAME_REPLICA)
  private List<Integer> replica = null;

  public GetClusterStorageInfoEffect() { 
  }

  public GetClusterStorageInfoEffect ec(List<ClusterStorageInfoEcConfig> ec) {
    
    this.ec = ec;
    return this;
  }

  public GetClusterStorageInfoEffect addEcItem(ClusterStorageInfoEcConfig ecItem) {
    if (this.ec == null) {
      this.ec = new ArrayList<ClusterStorageInfoEcConfig>();
    }
    this.ec.add(ecItem);
    return this;
  }

   /**
   * Get ec
   * @return ec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ClusterStorageInfoEcConfig> getEc() {
    return ec;
  }


  public void setEc(List<ClusterStorageInfoEcConfig> ec) {
    this.ec = ec;
  }


  public GetClusterStorageInfoEffect replica(List<Integer> replica) {
    
    this.replica = replica;
    return this;
  }

  public GetClusterStorageInfoEffect addReplicaItem(Integer replicaItem) {
    if (this.replica == null) {
      this.replica = new ArrayList<Integer>();
    }
    this.replica.add(replicaItem);
    return this;
  }

   /**
   * Get replica
   * @return replica
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getReplica() {
    return replica;
  }


  public void setReplica(List<Integer> replica) {
    this.replica = replica;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClusterStorageInfoEffect getClusterStorageInfoEffect = (GetClusterStorageInfoEffect) o;
    return Objects.equals(this.ec, getClusterStorageInfoEffect.ec) &&
        Objects.equals(this.replica, getClusterStorageInfoEffect.replica);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ec, replica);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClusterStorageInfoEffect {\n");
    sb.append("    ec: ").append(toIndentedString(ec)).append("\n");
    sb.append("    replica: ").append(toIndentedString(replica)).append("\n");
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

