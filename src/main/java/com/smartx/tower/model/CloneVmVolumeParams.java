package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.CloneVmVolumeParamsData;
import com.smartx.tower.model.VmVolumeWhereUniqueInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CloneVmVolumeParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class CloneVmVolumeParams {
  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private VmVolumeWhereUniqueInput where;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private CloneVmVolumeParamsData data;

  public CloneVmVolumeParams() { 
  }

  public CloneVmVolumeParams where(VmVolumeWhereUniqueInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmVolumeWhereUniqueInput getWhere() {
    return where;
  }


  public void setWhere(VmVolumeWhereUniqueInput where) {
    this.where = where;
  }


  public CloneVmVolumeParams data(CloneVmVolumeParamsData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CloneVmVolumeParamsData getData() {
    return data;
  }


  public void setData(CloneVmVolumeParamsData data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloneVmVolumeParams cloneVmVolumeParams = (CloneVmVolumeParams) o;
    return Objects.equals(this.where, cloneVmVolumeParams.where) &&
        Objects.equals(this.data, cloneVmVolumeParams.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(where, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloneVmVolumeParams {\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

