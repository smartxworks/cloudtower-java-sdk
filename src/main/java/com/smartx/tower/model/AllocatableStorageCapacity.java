package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.AllocatableEcStorageCapacity;
import com.smartx.tower.model.AllocatableReplicaStorageCapacity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AllocatableStorageCapacity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class AllocatableStorageCapacity {
  public static final String SERIALIZED_NAME_EC = "ec";
  @SerializedName(SERIALIZED_NAME_EC)
  private List<AllocatableEcStorageCapacity> ec = null;

  public static final String SERIALIZED_NAME_REPLICA = "replica";
  @SerializedName(SERIALIZED_NAME_REPLICA)
  private List<AllocatableReplicaStorageCapacity> replica = null;

  public AllocatableStorageCapacity() { 
  }

  public AllocatableStorageCapacity ec(List<AllocatableEcStorageCapacity> ec) {
    
    this.ec = ec;
    return this;
  }

  public AllocatableStorageCapacity addEcItem(AllocatableEcStorageCapacity ecItem) {
    if (this.ec == null) {
      this.ec = new ArrayList<AllocatableEcStorageCapacity>();
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

  public List<AllocatableEcStorageCapacity> getEc() {
    return ec;
  }


  public void setEc(List<AllocatableEcStorageCapacity> ec) {
    this.ec = ec;
  }


  public AllocatableStorageCapacity replica(List<AllocatableReplicaStorageCapacity> replica) {
    
    this.replica = replica;
    return this;
  }

  public AllocatableStorageCapacity addReplicaItem(AllocatableReplicaStorageCapacity replicaItem) {
    if (this.replica == null) {
      this.replica = new ArrayList<AllocatableReplicaStorageCapacity>();
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

  public List<AllocatableReplicaStorageCapacity> getReplica() {
    return replica;
  }


  public void setReplica(List<AllocatableReplicaStorageCapacity> replica) {
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
    AllocatableStorageCapacity allocatableStorageCapacity = (AllocatableStorageCapacity) o;
    return Objects.equals(this.ec, allocatableStorageCapacity.ec) &&
        Objects.equals(this.replica, allocatableStorageCapacity.replica);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ec, replica);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocatableStorageCapacity {\n");
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

