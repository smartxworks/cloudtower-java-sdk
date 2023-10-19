package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.GpuDeviceDescriptionUpdationParamsData;
import com.smartx.tower.model.GpuDeviceWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GpuDeviceDescriptionUpdationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class GpuDeviceDescriptionUpdationParams {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private GpuDeviceDescriptionUpdationParamsData data;

  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private GpuDeviceWhereInput where;

  public GpuDeviceDescriptionUpdationParams() { 
  }

  public GpuDeviceDescriptionUpdationParams data(GpuDeviceDescriptionUpdationParamsData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GpuDeviceDescriptionUpdationParamsData getData() {
    return data;
  }


  public void setData(GpuDeviceDescriptionUpdationParamsData data) {
    this.data = data;
  }


  public GpuDeviceDescriptionUpdationParams where(GpuDeviceWhereInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GpuDeviceWhereInput getWhere() {
    return where;
  }


  public void setWhere(GpuDeviceWhereInput where) {
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
    GpuDeviceDescriptionUpdationParams gpuDeviceDescriptionUpdationParams = (GpuDeviceDescriptionUpdationParams) o;
    return Objects.equals(this.data, gpuDeviceDescriptionUpdationParams.data) &&
        Objects.equals(this.where, gpuDeviceDescriptionUpdationParams.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GpuDeviceDescriptionUpdationParams {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

