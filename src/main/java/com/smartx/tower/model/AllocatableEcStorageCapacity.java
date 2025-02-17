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
 * AllocatableEcStorageCapacity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class AllocatableEcStorageCapacity {
  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private Double capacity;

  public static final String SERIALIZED_NAME_M = "m";
  @SerializedName(SERIALIZED_NAME_M)
  private Integer m;

  public static final String SERIALIZED_NAME_K = "k";
  @SerializedName(SERIALIZED_NAME_K)
  private Integer k;

  public AllocatableEcStorageCapacity() { 
  }

  public AllocatableEcStorageCapacity capacity(Double capacity) {
    
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


  public AllocatableEcStorageCapacity m(Integer m) {
    
    this.m = m;
    return this;
  }

   /**
   * Get m
   * @return m
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getM() {
    return m;
  }


  public void setM(Integer m) {
    this.m = m;
  }


  public AllocatableEcStorageCapacity k(Integer k) {
    
    this.k = k;
    return this;
  }

   /**
   * Get k
   * @return k
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getK() {
    return k;
  }


  public void setK(Integer k) {
    this.k = k;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocatableEcStorageCapacity allocatableEcStorageCapacity = (AllocatableEcStorageCapacity) o;
    return Objects.equals(this.capacity, allocatableEcStorageCapacity.capacity) &&
        Objects.equals(this.m, allocatableEcStorageCapacity.m) &&
        Objects.equals(this.k, allocatableEcStorageCapacity.k);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, m, k);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocatableEcStorageCapacity {\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    m: ").append(toIndentedString(m)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
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

