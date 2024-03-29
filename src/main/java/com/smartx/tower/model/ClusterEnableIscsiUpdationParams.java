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
 * ClusterEnableIscsiUpdationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ClusterEnableIscsiUpdationParams {
  public static final String SERIALIZED_NAME_ENABLE_ISCSI = "enable_iscsi";
  @SerializedName(SERIALIZED_NAME_ENABLE_ISCSI)
  private Boolean enableIscsi;

  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private ClusterWhereInput where;

  public ClusterEnableIscsiUpdationParams() { 
  }

  public ClusterEnableIscsiUpdationParams enableIscsi(Boolean enableIscsi) {
    
    this.enableIscsi = enableIscsi;
    return this;
  }

   /**
   * Get enableIscsi
   * @return enableIscsi
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getEnableIscsi() {
    return enableIscsi;
  }


  public void setEnableIscsi(Boolean enableIscsi) {
    this.enableIscsi = enableIscsi;
  }


  public ClusterEnableIscsiUpdationParams where(ClusterWhereInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ClusterWhereInput getWhere() {
    return where;
  }


  public void setWhere(ClusterWhereInput where) {
    this.where = where;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterEnableIscsiUpdationParams clusterEnableIscsiUpdationParams = (ClusterEnableIscsiUpdationParams) o;
    return Objects.equals(this.enableIscsi, clusterEnableIscsiUpdationParams.enableIscsi) &&
        Objects.equals(this.where, clusterEnableIscsiUpdationParams.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableIscsi, where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterEnableIscsiUpdationParams {\n");
    sb.append("    enableIscsi: ").append(toIndentedString(enableIscsi)).append("\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
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

