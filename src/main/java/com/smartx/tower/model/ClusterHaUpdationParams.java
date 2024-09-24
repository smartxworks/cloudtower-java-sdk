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
 * ClusterHaUpdationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class ClusterHaUpdationParams {
  public static final String SERIALIZED_NAME_HA = "ha";
  @SerializedName(SERIALIZED_NAME_HA)
  private Boolean ha;

  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private ClusterWhereInput where;

  public ClusterHaUpdationParams() { 
  }

  public ClusterHaUpdationParams ha(Boolean ha) {
    
    this.ha = ha;
    return this;
  }

   /**
   * Get ha
   * @return ha
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getHa() {
    return ha;
  }


  public void setHa(Boolean ha) {
    this.ha = ha;
  }


  public ClusterHaUpdationParams where(ClusterWhereInput where) {
    
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
    ClusterHaUpdationParams clusterHaUpdationParams = (ClusterHaUpdationParams) o;
    return Objects.equals(this.ha, clusterHaUpdationParams.ha) &&
        Objects.equals(this.where, clusterHaUpdationParams.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ha, where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterHaUpdationParams {\n");
    sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
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

