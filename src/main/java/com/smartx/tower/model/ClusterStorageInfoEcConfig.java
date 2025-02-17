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
 * ClusterStorageInfoEcConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ClusterStorageInfoEcConfig {
  public static final String SERIALIZED_NAME_M = "m";
  @SerializedName(SERIALIZED_NAME_M)
  private Integer m;

  public static final String SERIALIZED_NAME_K = "k";
  @SerializedName(SERIALIZED_NAME_K)
  private Integer k;

  public ClusterStorageInfoEcConfig() { 
  }

  public ClusterStorageInfoEcConfig m(Integer m) {
    
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


  public ClusterStorageInfoEcConfig k(Integer k) {
    
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
    ClusterStorageInfoEcConfig clusterStorageInfoEcConfig = (ClusterStorageInfoEcConfig) o;
    return Objects.equals(this.m, clusterStorageInfoEcConfig.m) &&
        Objects.equals(this.k, clusterStorageInfoEcConfig.k);
  }

  @Override
  public int hashCode() {
    return Objects.hash(m, k);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterStorageInfoEcConfig {\n");
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

