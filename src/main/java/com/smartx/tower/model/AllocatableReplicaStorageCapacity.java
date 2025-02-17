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
 * AllocatableReplicaStorageCapacity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class AllocatableReplicaStorageCapacity {
  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private Double capacity;

  public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
  private Integer replicaNum;

  public AllocatableReplicaStorageCapacity() { 
  }

  public AllocatableReplicaStorageCapacity capacity(Double capacity) {
    
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * @return capacity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getCapacity() {
    return capacity;
  }


  public void setCapacity(Double capacity) {
    this.capacity = capacity;
  }


  public AllocatableReplicaStorageCapacity replicaNum(Integer replicaNum) {
    
    this.replicaNum = replicaNum;
    return this;
  }

   /**
   * Get replicaNum
   * @return replicaNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getReplicaNum() {
    return replicaNum;
  }


  public void setReplicaNum(Integer replicaNum) {
    this.replicaNum = replicaNum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocatableReplicaStorageCapacity allocatableReplicaStorageCapacity = (AllocatableReplicaStorageCapacity) o;
    return Objects.equals(this.capacity, allocatableReplicaStorageCapacity.capacity) &&
        Objects.equals(this.replicaNum, allocatableReplicaStorageCapacity.replicaNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, replicaNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocatableReplicaStorageCapacity {\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
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

