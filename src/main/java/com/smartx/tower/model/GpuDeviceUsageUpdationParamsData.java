package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.GpuDeviceUsage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GpuDeviceUsageUpdationParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class GpuDeviceUsageUpdationParamsData {
  public static final String SERIALIZED_NAME_VGPU_SPEC = "vgpu_spec";
  @SerializedName(SERIALIZED_NAME_VGPU_SPEC)
  private String vgpuSpec;

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private GpuDeviceUsage usage;

  public GpuDeviceUsageUpdationParamsData() { 
  }

  public GpuDeviceUsageUpdationParamsData vgpuSpec(String vgpuSpec) {
    
    this.vgpuSpec = vgpuSpec;
    return this;
  }

   /**
   * Get vgpuSpec
   * @return vgpuSpec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVgpuSpec() {
    return vgpuSpec;
  }


  public void setVgpuSpec(String vgpuSpec) {
    this.vgpuSpec = vgpuSpec;
  }


  public GpuDeviceUsageUpdationParamsData usage(GpuDeviceUsage usage) {
    
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GpuDeviceUsage getUsage() {
    return usage;
  }


  public void setUsage(GpuDeviceUsage usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GpuDeviceUsageUpdationParamsData gpuDeviceUsageUpdationParamsData = (GpuDeviceUsageUpdationParamsData) o;
    return Objects.equals(this.vgpuSpec, gpuDeviceUsageUpdationParamsData.vgpuSpec) &&
        Objects.equals(this.usage, gpuDeviceUsageUpdationParamsData.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vgpuSpec, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GpuDeviceUsageUpdationParamsData {\n");
    sb.append("    vgpuSpec: ").append(toIndentedString(vgpuSpec)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

