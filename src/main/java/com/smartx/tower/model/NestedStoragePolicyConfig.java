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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NestedStoragePolicyConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NestedStoragePolicyConfig {
  public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
  private Integer replicaNum;

  public static final String SERIALIZED_NAME_THIN_PROVISION = "thin_provision";
  @SerializedName(SERIALIZED_NAME_THIN_PROVISION)
  private Boolean thinProvision;

  public NestedStoragePolicyConfig() { 
  }

  public NestedStoragePolicyConfig replicaNum(Integer replicaNum) {
    
    this.replicaNum = replicaNum;
    return this;
  }

   /**
   * Get replicaNum
   * @return replicaNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReplicaNum() {
    return replicaNum;
  }


  public void setReplicaNum(Integer replicaNum) {
    this.replicaNum = replicaNum;
  }


  public NestedStoragePolicyConfig thinProvision(Boolean thinProvision) {
    
    this.thinProvision = thinProvision;
    return this;
  }

   /**
   * Get thinProvision
   * @return thinProvision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getThinProvision() {
    return thinProvision;
  }


  public void setThinProvision(Boolean thinProvision) {
    this.thinProvision = thinProvision;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedStoragePolicyConfig nestedStoragePolicyConfig = (NestedStoragePolicyConfig) o;
    return Objects.equals(this.replicaNum, nestedStoragePolicyConfig.replicaNum) &&
        Objects.equals(this.thinProvision, nestedStoragePolicyConfig.thinProvision);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicaNum, thinProvision);
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
    sb.append("class NestedStoragePolicyConfig {\n");
    sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
    sb.append("    thinProvision: ").append(toIndentedString(thinProvision)).append("\n");
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

